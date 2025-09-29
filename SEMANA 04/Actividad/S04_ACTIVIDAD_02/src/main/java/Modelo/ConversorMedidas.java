
package Modelo;

import java.util.HashMap;
import java.util.Map;

public class ConversorMedidas {
    // Mapa de factores de conversión: Unidad -> Factor para convertir a Metros (m)
    private static final Map<String, Double> FACTORES_A_METROS = new HashMap<>();
    
    static {
        // 1 Metro (m) es la unidad base (factor 1.0)
        FACTORES_A_METROS.put("Metro", 1.0);
        
        // Milímetro (mm): 1 m = 1000 mm  => Factor para pasar mm a m es 1/1000
        FACTORES_A_METROS.put("Milímetro", 0.001); 
        
        // Centímetro (cm): 1 m = 100 cm => Factor para pasar cm a m es 1/100
        FACTORES_A_METROS.put("Centímetro", 0.01);
        
        // Kilómetro (km): 1 km = 1000 m => Factor para pasar km a m es 1000
        FACTORES_A_METROS.put("Kilometro", 1000.0);
    }
    
    /**
     * Realiza la conversión de un valor de una unidad de origen a una unidad de destino.
     * @param valor El valor numérico a convertir.
     * @param unidadOrigen La unidad de la cual se convierte (ej: "Milímetro").
     * @param unidadDestino La unidad a la cual se convierte (ej: "Kilometro").
     * @return El resultado de la conversión en la unidad destino.
     * @throws IllegalArgumentException Si la unidad no es válida o el valor no es numérico.
     */
    public double convertir(String valor, String unidadOrigen, String unidadDestino) throws IllegalArgumentException {
        double valorNumerico;
        
        // 1. Validar y parsear el valor
        try {
            valorNumerico = Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("El valor a convertir debe ser un número válido.");
        }
        
        // 2. Obtener factores
        Double factorOrigen = FACTORES_A_METROS.get(unidadOrigen);
        Double factorDestino = FACTORES_A_METROS.get(unidadDestino);
        
        if (factorOrigen == null || factorDestino == null) {
            throw new IllegalArgumentException("Unidad de origen o destino no reconocida.");
        }
        
        // 3. Conversión: Origen -> Metros -> Destino
        
        // Paso A: Convertir el valor de la unidad de origen a la unidad base (Metros)
        double valorEnMetros = valorNumerico * factorOrigen;
        
        // Paso B: Convertir el valor de Metros a la unidad de destino
        // Se divide por el factor, ya que el factor indica cuántos metros son esa unidad.
        // Ej: Para ir de m a mm, dividimos por 0.001 (que es igual a multiplicar por 1000)
        double resultado = valorEnMetros / factorDestino;
        
        return resultado;
    }
}
