
package Modelo;

public class Círculo {
    private double radio;
    private double area;
    private double perimetro;

    public Círculo() {
    }

    public Círculo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }
    
    
}
