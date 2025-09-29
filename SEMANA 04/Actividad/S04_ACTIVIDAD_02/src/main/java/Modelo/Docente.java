package Modelo;

/**
 * Modelo específico para el usuario Docente.
 * Hereda las propiedades base de Usuario.
 * Por ahora no tiene propiedades adicionales, pero es útil para diferenciar en el código.
 */
public class Docente extends Usuario {

    // Constructor: llama al constructor de la clase padre (Usuario)
    public Docente(String codigo, String contrasena, String nombreCompleto) {
        // Establecemos el tipo de usuario como "DOCENTE" automáticamente
        super(codigo, contrasena, nombreCompleto, "DOCENTE");
    }

    // En el futuro podrías añadir métodos o atributos específicos del docente aquí.
}
