
package MainLogin;

import Controlador.ControladorLogin;
import Modelo.UsuarioDAO;
import Vista.VistaLogin;

public class MainLogin {

    public static void main(String[] args) {

        UsuarioDAO modeloDAO = new UsuarioDAO();

        VistaLogin vistaLogin = new VistaLogin();

        ControladorLogin controlador = new ControladorLogin(vistaLogin, modeloDAO);

        vistaLogin.setVisible(true);// Docente: D101 / 123, Alumno: A202 / 456
    }
}
