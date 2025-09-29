
package Controlador;

import Vista.VistaLogin;
import Vista.VistaRegistro;
import Modelo.UsuarioDAO;
import Modelo.Docente;
import Modelo.Alumno;
import Modelo.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * Controlador que gestiona la interacción entre la VistaRegistro y el Modelo (UsuarioDAO).
 */
public class ControladorRegistro {
    private final VistaRegistro vistaRegistro;
    private final VistaLogin vistaLogin; // Necesitamos el login para volver
    private final UsuarioDAO modeloDAO;

    public ControladorRegistro(VistaRegistro vistaRegistro, VistaLogin vistaLogin, UsuarioDAO modeloDAO) {
        this.vistaRegistro = vistaRegistro;
        this.vistaLogin = vistaLogin;
        this.modeloDAO = modeloDAO;
        
        // Asignación de Listeners
        this.vistaRegistro.agregarConfirmarListener(new ConfirmarRegistroListener());
        this.vistaRegistro.agregarVolverseListener(new VolverListener());
    }
    
    // Clase interna para manejar el botón "Confirmar"
    private class ConfirmarRegistroListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String codigo = vistaRegistro.obtenerUsuarioNuevo();
            String nombre = vistaRegistro.obtenerNombreNuevo(); // Usar el nuevo método del nombre
            String contrasena = vistaRegistro.obtenerContrasenaNueva();
            String rol = vistaRegistro.obtenerRolNuevo();

            // 1. Validar campos vacíos
            if (codigo.isEmpty() || nombre.isEmpty() || contrasena.isEmpty()) {
                vistaRegistro.mostrarMensaje(
                    "Todos los campos (Código, Nombre y Contraseña) son obligatorios.", 
                    "Error de Registro", 
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            
            // 2. Validar que el código no exista
            if (modeloDAO.existeCodigo(codigo)) {
                vistaRegistro.mostrarMensaje(
                    "El código de usuario '" + codigo + "' ya está en uso. Intente con otro.", 
                    "Código Duplicado", 
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            
            // 3. Crear el nuevo objeto Usuario (Docente o Alumno)
            Usuario nuevoUsuario = null;
            if ("DOCENTE".equals(rol)) {
                nuevoUsuario = new Docente(codigo, contrasena, nombre);
            } else if ("ALUMNO".equals(rol)) {
                nuevoUsuario = new Alumno(codigo, contrasena, nombre);
            }
            
            // 4. Registrar en el Modelo
            if (nuevoUsuario != null && modeloDAO.registrarUsuario(nuevoUsuario)) {
                vistaRegistro.mostrarMensaje(
                    "¡Registro exitoso!\nAhora puede iniciar sesión como " + rol + " con el código: " + codigo, 
                    "Éxito", 
                    JOptionPane.INFORMATION_MESSAGE
                );
                vistaRegistro.limpiarCampos();
                vistaRegistro.dispose();
                vistaLogin.setVisible(true);
            } else {
                vistaRegistro.mostrarMensaje(
                    "Ocurrió un error inesperado al intentar registrar el usuario.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }       
    }
    
    // Clase interna para manejar el botón "Volver"
    private class VolverListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Regresar al login
            vistaRegistro.dispose(); // Cierra la ventana de registro
            vistaLogin.setVisible(true); // Muestra la ventana de login
            vistaLogin.limpiarCampos();
        }
    }
}
