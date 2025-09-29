package modelo;

/**
 * Modelo para almacenar los datos de una conversión de medida.
 * Esto representa la información que el docente manipula.
 */
public class Conversion {
    private double valorInicial;
    private double valorConvertido;
    private String unidadInicial; // Ejemplo: "KM", "M"
    private String unidadFinal;   // Ejemplo: "M", "CM", "MM"
    private String descripcion;   // Descripción del propósito de esta conversión

    // Constructor
    public Conversion(double valorInicial, String unidadInicial, String unidadFinal, String descripcion) {
        this.valorInicial = valorInicial;
        this.unidadInicial = unidadInicial;
        this.unidadFinal = unidadFinal;
        this.descripcion = descripcion;
        this.valorConvertido = 0.0; // Se calculará en el Controlador
    }

    // Getters y Setters
    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    // El Controlador será el encargado de establecer este valor
    public void setValorConvertido(double valorConvertido) {
        this.valorConvertido = valorConvertido;
    }

    public String getUnidadInicial() {
        return unidadInicial;
    }

    public void setUnidadInicial(String unidadInicial) {
        this.unidadInicial = unidadInicial;
    }

    public String getUnidadFinal() {
        return unidadFinal;
    }

    public void setUnidadFinal(String unidadFinal) {
        this.unidadFinal = unidadFinal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
