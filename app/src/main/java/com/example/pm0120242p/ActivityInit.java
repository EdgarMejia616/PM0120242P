package com.example.pm0120242p;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import Configuracion.SQLiteConexion;
import Configuracion.Trans;

public class ActivityInit extends AppCompatActivity {
    EditText Nombres, Apellidos, Edad, Correo;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_init);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Nombres = findViewById(R.id.Nombres);
        Apellidos = findViewById(R.id.Apellidos);
        Edad = findViewById(R.id.Edad);
        Correo = findViewById(R.id.Correo);
        btnIngresar = findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Agregar();
            }
        });
    }

    private void Agregar() {
        try {
            SQLiteConexion conexion = new SQLiteConexion(this, Trans.DBname, null, Trans.Version);
            SQLiteDatabase db = conexion.getWritableDatabase();

            ContentValues valores = new ContentValues();
            valores.put(Trans.Nombres, Nombres.getText().toString());
            valores.put(Trans.Apellidos, Apellidos.getText().toString());
            valores.put(Trans.Edad, Edad.getText().toString());
            valores.put(Trans.Correo, Correo.getText().toString());

            long resultado = db.insert(Trans.TablePersonas, null, valores);

            if (resultado == -1) {
                Toast.makeText(getApplicationContext(), "Error al ingresar el registro", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), "Registro ingresado con éxito, ID: " + resultado, Toast.LENGTH_LONG).show();
            }

            db.close();
        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), "Error: " + ex.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
