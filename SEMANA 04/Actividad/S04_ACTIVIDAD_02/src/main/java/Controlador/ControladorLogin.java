package Controlador;

import Modelo.Alumno;
import Modelo.Docente;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Vista.VistaLogin;
import Vista.VistaRegistro;
import Vista.VistaDocente; // Importar la VistaDocente
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorLogin {
    private final VistaLogin vistaLogin;
    private final UsuarioDAO modeloDAO;    
    
    // Declaramos la VistaRegistro a nivel de clase para controlarla
    private VistaRegistro vistaRegistro;    

    public ControladorLogin(VistaLogin vistaLogin, UsuarioDAO modeloDAO) {
        this.vistaLogin = vistaLogin;
        this.modeloDAO = modeloDAO;
        
        // Asignación de Listeners a los botones
        this.vistaLogin.agregarInicioSesionListener(new IniciarSesionListener());
        this.vistaLogin.agregarRegistrarseListener(new RegistrarseListener());
    }
    
    // Clase interna para manejar el evento del botón "Iniciar Sesión"
    private class IniciarSesionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String codigo = vistaLogin.obtenerUsuario();
            String contrasena = vistaLogin.obtenerContrasena();

            // 1. Verificar campos vacíos
            if (codigo.isEmpty() || contrasena.isEmpty()) {
                vistaLogin.mostrarMensaje(
                    "Por favor, ingrese su código de usuario y contraseña.",    
                    "Datos Faltantes",    
                    JOptionPane.WARNING_MESSAGE
                );
                return;
            }
                
            // 2. Autenticar usando el Modelo (UsuarioDAO)
            Usuario usuarioAutenticado = modeloDAO.autenticar(codigo, contrasena);

            if (usuarioAutenticado != null) {
                // Autenticación exitosa
                vistaLogin.mostrarMensaje(
                    "Bienvenido, " + usuarioAutenticado.getNombreCompleto()+ "! (" + usuarioAutenticado.getTipoUsuario() + ")",    
                    "Inicio de Sesión Exitoso",    
                    JOptionPane.INFORMATION_MESSAGE
                );
                
                vistaLogin.limpiarCampos();
                vistaLogin.dispose(); // Cierra la ventana de Login
                
                // 3. Determinar el tipo de usuario y abrir la vista correspondiente
                if (usuarioAutenticado instanceof Docente) {
                    // Abrir Vista Docente e inyectar el controlador y el modelo
                    VistaDocente vistaDocente = new VistaDocente();
                    // Pasamos el Docente autenticado al nuevo controlador
                    new ControladorDocente(vistaDocente, modeloDAO, (Docente) usuarioAutenticado); 
                    
                } else if (usuarioAutenticado instanceof Alumno) {
                    // TODO: Abrir Vista Alumno
                    vistaLogin.mostrarMensaje(
                        "Tipo Alumno, ¡a visualizar los resultados!",    
                        "Redireccionando...",    
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    // Aquí se instanciaría: new ControladorAlumno(new VistaAlumno(), modeloDAO, (Alumno) usuarioAutenticado);
                }
                
            } else {
                // Autenticación fallida
                vistaLogin.mostrarMensaje(
                    "Código o contraseña incorrectos. Inténtelo de nuevo.",    
                    "Error de Autenticación",    
                    JOptionPane.ERROR_MESSAGE
                );
                vistaLogin.limpiarCampos();
            }
        }        
    }
    
    // Clase interna para manejar el evento del botón "Registrarse"
    private class RegistrarseListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Instanciar la VistaRegistro si no existe
            if (vistaRegistro == null) {
                vistaRegistro = new VistaRegistro();
                // Creamos el ControladorRegistro y lo conectamos
                new ControladorRegistro(vistaRegistro, vistaLogin, modeloDAO);
            }
            
            vistaLogin.setVisible(false); // Oculta la vista de login
            vistaRegistro.setVisible(true); // Muestra la vista de registro
        }
    }
}
