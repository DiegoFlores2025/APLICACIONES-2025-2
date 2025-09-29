package Modelo;

/**
 * Modelo específico para el usuario Alumno.
 * Hereda las propiedades base de Usuario.
 * Por ahora no tiene propiedades adicionales.
 */
public class Alumno extends Usuario {

    // Constructor: llama al constructor de la clase padre (Usuario)
    public Alumno(String codigo, String contrasena, String nombreCompleto) {
        // Establecemos el tipo de usuario como "ALUMNO" automáticamente
        super(codigo, contrasena, nombreCompleto, "ALUMNO");
    }

    // En el futuro podrías añadir métodos o atributos específicos del alumno aquí.
}

