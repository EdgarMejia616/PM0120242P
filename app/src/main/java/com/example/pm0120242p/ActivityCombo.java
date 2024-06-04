package com.example.pm0120242p;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import Configuracion.Personas;
import Configuracion.SQLiteConexion;
import Configuracion.Trans;

public class ActivityCombo extends AppCompatActivity {

    SQLiteConexion conexion;
    Spinner combopersonas;
    EditText Nombres,Apellidos,Correo;
    ArrayList<Personas> lista;
    ArrayList<String>Arreglo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_combo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        conexion = new SQLiteConexion(this, Trans.DBname, null, Trans.Version);
        combopersonas = (Spinner) findViewById(R.id.spinner);
        Nombres = (EditText) findViewById(R.id.cbnombre);
        Apellidos = (EditText) findViewById(R.id.cbapellido);
        Correo = (EditText) findViewById(R.id.cbcorreo);

        ObtenerInfo();

    }

    private void ObtenerInfo() {

    }
}