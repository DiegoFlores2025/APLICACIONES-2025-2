package Modelo;

/**
 * Clase base para todos los usuarios del sistema (Docente y Alumno).
 * Contiene información de autenticación común.
 */
public class Usuario {
    private String codigo; // Podría ser DNI, ID, o un código único de usuario
    private String contrasena; // Contraseña para el acceso
    private String nombreCompleto;
    private String tipoUsuario; // Puede ser "DOCENTE" o "ALUMNO"

    // Constructor
    public Usuario(String codigo, String contrasena, String nombreCompleto, String tipoUsuario) {
        this.codigo = codigo;
        this.contrasena = contrasena;
        this.nombreCompleto = nombreCompleto;
        this.tipoUsuario = tipoUsuario;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}