package Configuracion;

import com.google.android.material.tabs.TabLayout;

public class Trans {
    // Version Database
    public static final int Version = 1;
    //Nombre de la base de datos
    public static final String DBname= "PM012P";
//tabla personas
    public static final String TablePersonas= "personas";
    //propiedades
    public static final String id = "id";
    public static final String Nombres = "Nombres";
    public static final String Apellidos = "Apellidos";
    public static final String Edad = "Edad";
    public static final String Correo = "Correo";
    public static final String foto = "foto";

    //DDL Create

    public static final String CreateTablePersonas = "CREATE TABLE " + TablePersonas + " ( " +
            id + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            Nombres + " TEXT, " +
            Apellidos + " TEXT, " +
            Edad + " INTEGER, " +
            Correo + " TEXT, " +
            foto + " TEXT)";

    public static final String SelectAllPerson = "Select * From " + TablePersonas;

    public static final String DropTablePersonas = "DROP TABLE IF EXISTS " + TablePersonas;

}
