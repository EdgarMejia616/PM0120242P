package Configuracion;

public class Personas {
    private Integer id;
    private String Nombres;
    private String Apellidos;
    private Integer Edad;
    private String Correo;
    private String foto;

    public Personas(Integer id, String nombres, String apellidos, Integer edad, String correo, String foto) {
        this.id = id;
        Nombres = nombres;
        Apellidos = apellidos;
        Edad = edad;
        Correo = correo;
        this.foto = foto;
    }

    public Personas() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}

