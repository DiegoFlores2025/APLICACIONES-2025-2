
package Modelo;

public class Rectángulo {
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Rectángulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectángulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }    
    
    public double calcularArea(){
        return base * altura;
    }
    
    public double calcularPerímetro(){
        return 2*(base + altura);
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }
    
    
}
