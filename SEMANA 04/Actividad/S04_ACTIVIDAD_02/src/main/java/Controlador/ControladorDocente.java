
package Controlador;

import Vista.VistaDocente;
import Vista.VistaLogin;
import Modelo.ConversorMedidas;
import Modelo.Docente;
import Modelo.UsuarioDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Controlador para la VistaDocente.
 * Maneja la lógica de conversión de medidas y el cierre de sesión.
 */
public class ControladorDocente {
    private VistaDocente vistaDocente;
    private UsuarioDAO modeloDAO;
    private ConversorMedidas conversor;
    private Docente docenteActual; // Necesitamos saber qué docente inició sesión

    public ControladorDocente(VistaDocente vistaDocente, UsuarioDAO modeloDAO, Docente docenteActual) {
        this.vistaDocente = vistaDocente;
        this.modeloDAO = modeloDAO;
        this.docenteActual = docenteActual;
        this.conversor = new ConversorMedidas(); // Instancia del Modelo de Negocio
        
        // 1. Mostrar el nombre del docente inmediatamente
        this.vistaDocente.setNombreDocente(docenteActual.getNombreCompleto());
        
        // 2. Conectar Listeners
        this.vistaDocente.agregarRealizarConversionListener(new ConversionListener());
        this.vistaDocente.agregarCerrarSesionListener(new CerrarSesionListener());
        
        // 3. Hacer visible la ventana
        this.vistaDocente.setVisible(true);
    }

    // --- Listeners Internos ---
    
    class ConversionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String valorStr = vistaDocente.obtenerValor();
            String origen = vistaDocente.obtenerOrigen();
            String destino = vistaDocente.obtenerDestino();
            
            try {
                // 1. Realizar la conversión usando el modelo de negocio
                double resultado = conversor.convertir(valorStr, origen, destino);
                
                // 2. Formatear el resultado a dos decimales
                // Usamos "0.00" para asegurar al menos dos decimales si el resultado es entero
                DecimalFormat df = new DecimalFormat("#.##"); 
                String resultadoFormateado = df.format(resultado);
                
                // 3. Mostrar el resultado en la vista
                vistaDocente.setResultado(resultadoFormateado);
                
                // TODO: Aquí se implementará la lógica para guardar el historial
                
            } catch (IllegalArgumentException ex) {
                // Mostrar error si la entrada es inválida (ej. texto en valor)
                vistaDocente.mostrarMensaje(ex.getMessage(), "Error de Conversión", JOptionPane.ERROR_MESSAGE);
                vistaDocente.setResultado(""); // Limpiar resultado si hay error
            } catch (Exception ex) {
                vistaDocente.mostrarMensaje("Ocurrió un error inesperado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    class CerrarSesionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // 1. Ocultar la vista actual
            vistaDocente.setVisible(false);
            
            // 2. Crear e iniciar la VistaLogin
            VistaLogin vistaLogin = new VistaLogin();
            // Reutilizamos el UsuarioDAO existente
            new ControladorLogin(vistaLogin, modeloDAO); 
            // La ventana actual puede ser eliminada
            vistaLogin.setVisible(true);
        }
    }
}
