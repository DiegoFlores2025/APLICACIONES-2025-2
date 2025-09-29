
package Modelo;

public class Triángulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private double area;
    private double perimetro;

    public Triángulo(double lado1, double lado2, double lado3) {
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("Los lados ingresados no forman un triángulo válido.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triángulo() {
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    public double calcularPerimetro(){        
        return lado1 + lado2 + lado3;
    }
    
    public double calcularArea(){
        double s = (this.lado1+this.lado2+this.lado3)/2.0;
        double areaCalculada = s * (s-this.lado1)*(s-this.lado2)*(s-this.lado3);
        return Math.sqrt(areaCalculada);
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }
    
    
}
