package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Data Access Object (DAO) para manejar el acceso a los datos de los usuarios.
 * Simula una base de datos con usuarios precargados y permite el registro.
 */
public class UsuarioDAO {

    // Lista estática para almacenar todos los usuarios precargados y registrados
    // Ahora no es final para que el método de registro pueda añadir nuevos usuarios.
    private static List<Usuario> listaUsuarios = new ArrayList<>();

    // Bloque estático para inicializar los usuarios al cargar la clase
    static {
        // 1. DOCENTE (Predefinido)
        // Código: D101, Contraseña: 123
        Docente docente = new Docente("D101", "123", "Prof. María López");
        listaUsuarios.add(docente);

        // 2. ALUMNO (Predefinido)
        // Código: A202, Contraseña: 456
        Alumno alumno = new Alumno("A202", "456", "Juan Pérez");
        listaUsuarios.add(alumno);
        
        System.out.println("Usuarios precargados: " + listaUsuarios.size());
    }

    /**
     * Intenta autenticar a un usuario con un código y contraseña.
     * @param codigo El código de usuario (ID).
     * @param contrasena La contraseña ingresada.
     * @return El objeto Usuario si la autenticación es exitosa, o null si falla.
     */
    public Usuario autenticar(String codigo, String contrasena) {
        for (Usuario u : listaUsuarios) {
            // Se utiliza equalsIgnoreCase para hacer la búsqueda de código insensible a mayúsculas/minúsculas
            if (u.getCodigo().equalsIgnoreCase(codigo) && u.getContrasena().equals(contrasena)) {
                return u; // Autenticación exitosa
            }
        }
        return null; // Autenticación fallida
    }
    
    /**
     * Verifica si un código de usuario ya existe en el sistema.
     * @param codigo El código de usuario a verificar.
     * @return true si el código ya está registrado, false en caso contrario.
     */
    public boolean existeCodigo(String codigo) {
        for (Usuario u : listaUsuarios) {
            if (u.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Agrega un nuevo usuario a la lista.
     * El Controlador será el encargado de crear la instancia de Docente o Alumno
     * y validar que el código no exista antes de llamar a este método.
     * @param nuevoUsuario El objeto Usuario (Docente o Alumno) a registrar.
     * @return true si el registro fue exitoso.
     */
    public boolean registrarUsuario(Usuario nuevoUsuario) {
        if (!existeCodigo(nuevoUsuario.getCodigo())) {
            listaUsuarios.add(nuevoUsuario);
            System.out.println("Nuevo usuario registrado: " + nuevoUsuario.getCodigo() + " (" + nuevoUsuario.getTipoUsuario() + ")");
            return true;
        }
        return false;
    }

    /**
     * Retorna la lista completa de usuarios (útil para el Controlador).
     */
    public List<Usuario> obtenerTodos() {
        return new ArrayList<>(listaUsuarios); // Devolvemos una copia para proteger la lista original
    }
}
