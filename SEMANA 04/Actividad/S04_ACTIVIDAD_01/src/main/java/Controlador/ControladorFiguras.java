
package Controlador;

import Modelo.Cuadrado;
import Modelo.Círculo;
import Modelo.Rectángulo;
import Modelo.Triángulo;
import Vista.VistaCirculo;
import Vista.VistaCuadrado;
import Vista.VistaFiguras;
import Vista.VistaRectangulo;
import Vista.VistaTriangulo;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorFiguras {
    private final VistaFiguras vistaFiguras;
    private final VistaCuadrado vistaCua;
    private final VistaCirculo vistaCir;
    private final VistaRectangulo vistaRec;
    private final VistaTriangulo vistaTri;
    private final Cuadrado cua;    
    private final Círculo cir;    
    private final Rectángulo rec;    
    private final Triángulo tri;    

    
    //CUADRADO

    public ControladorFiguras(VistaFiguras vistaFiguras, VistaCuadrado vistaCua, VistaCirculo vistaCir, VistaRectangulo vistaRec, VistaTriangulo vistaTri, Cuadrado cua, Círculo cir, Rectángulo rec, Triángulo tri) {
        this.vistaFiguras = vistaFiguras;
        this.vistaCua = vistaCua;
        this.vistaCir = vistaCir;
        this.vistaRec = vistaRec;
        this.vistaTri = vistaTri;
        this.cua = cua;
        this.cir = cir;
        this.rec = rec;
        this.tri = tri;
        
        this.vistaFiguras.agregarCuadradoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCua();
            }            
        });
        
        this.vistaFiguras.agregarCirculoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCir();
            }            
        });
        
        this.vistaFiguras.agregarRectanguloListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarRec();
            }            
        });
        
        this.vistaFiguras.agregarTrianguloListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTri();
            }            
        });
    }
    
    //CUADRADO
    public void mostrarCua(){
        vistaCua.setVisible(true);
        
        this.vistaCua.agregarCalcularListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaCua.valCalcular();
                vistaCua.setSize(new Dimension(370,300));
                calcularCua();
            }                     
        });
        
        this.vistaCua.agregarNuevoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaCua.valNuevo();
                vistaCua.setSize(new Dimension(370,170));
                nuevoCua();
            }
        });
        
        this.vistaCua.agregarSalirListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salirCua();
            }
        });
    }
    public void calcularCua(){
        double lado = vistaCua.obtenerLado();

        if (Double.isNaN(lado)) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            vistaCua.valNuevo();
            vistaCua.setSize(new Dimension(370,170));
            return;
        }

        cua.setLado(lado);
        double area = cua.calcularArea();
        double perimetro = cua.calcularPerimetro();
        vistaCua.mostrarResultados(area, perimetro);
    }
    
    public void nuevoCua(){
        vistaCua.limpiarCampos();
    }
    
    public void salirCua(){        
        vistaCua.dispose();
    }
    
    //CIRCULO
    public void mostrarCir(){
        vistaCir.setVisible(true);
        
        this.vistaCir.agregarCalcularListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaCir.valCalcular();
                vistaCir.setSize(new Dimension(370,300));
                calcularCir();
            }                     
        });
        
        this.vistaCir.agregarNuevoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaCir.valNuevo();
                vistaCir.setSize(new Dimension(370,170));
                nuevoCir();
            }
        });
        
        this.vistaCir.agregarSalirListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salirCir();
            }
        });
    }
    public void calcularCir(){
        double radio = vistaCir.obtenerRadio();

        if (Double.isNaN(radio)) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            vistaCir.valNuevo();
            vistaCir.setSize(new Dimension(370,170));
            return;            
        }

        cir.setRadio(radio);
        double area = cir.calcularArea();
        double perimetro = cir.calcularPerimetro();
        vistaCir.mostrarResultados(area, perimetro);
    }
    
    public void nuevoCir(){
        vistaCir.limpiarCampos();
    }
    
    public void salirCir(){
        vistaCir.dispose();
    }
    
    //RECTANGULO
    public void mostrarRec(){
        vistaRec.setVisible(true);
        
        this.vistaRec.agregarCalcularListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaRec.valCalcular();
                vistaRec.setSize(new Dimension(370,300));
                calcularRec();
            }                     
        });
        
        this.vistaRec.agregarNuevoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaRec.valNuevo();
                vistaRec.setSize(new Dimension(370,200));
                nuevoRec();
            }
        });
        
        this.vistaRec.agregarSalirListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salirRec();
            }
        });
    }
    public void calcularRec(){
        double base = vistaRec.obtenerBase();
        double altura = vistaRec.obtenerAltura();

        // Verificar ambos campos
        if (Double.isNaN(base) && Double.isNaN(altura)) {
            JOptionPane.showMessageDialog(null, "Ingrese valores en base y altura", "Error", JOptionPane.ERROR_MESSAGE);
            vistaRec.valNuevo();
            vistaRec.setSize(new Dimension(370,200));
            return;
        } else if (Double.isNaN(base)) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en la base", "Error", JOptionPane.ERROR_MESSAGE);
            vistaRec.valNuevo();
            vistaRec.setSize(new Dimension(370,200));
            return;
        } else if (Double.isNaN(altura)) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en la altura", "Error", JOptionPane.ERROR_MESSAGE);
            vistaRec.valNuevo();
            vistaRec.setSize(new Dimension(370,200));
            return;
        }

        rec.setBase(base);
        rec.setAltura(altura);
        double area = rec.calcularArea();
        double perimetro = rec.calcularPerímetro();
        vistaRec.mostrarResultados(area, perimetro);
    }
    
    public void nuevoRec(){
        vistaRec.limpiarCampos();
    }
    
    public void salirRec(){        
        vistaRec.dispose();
    }
    
    //TRIANGULO
    public void mostrarTri(){
        vistaTri.setVisible(true);
        
        this.vistaTri.agregarCalcularListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaTri.valCalcular();
                vistaTri.setSize(new Dimension(370,315));
                calcularTri();
            }                     
        });
        
        this.vistaTri.agregarNuevoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaTri.valNuevo();
                vistaTri.setSize(new Dimension(370,215));
                nuevoTri();
            }
        });
        
        this.vistaTri.agregarSalirListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salirTri();
            }
        });
    }
    
    public void calcularTri(){
        double lado1 = vistaTri.obtenerLado1();
        double lado2 = vistaTri.obtenerLado2();
        double lado3 = vistaTri.obtenerLado3();

        // Verificar cada lado individualmente
        if (Double.isNaN(lado1)) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en el lado 1", "Error", JOptionPane.ERROR_MESSAGE);
            vistaTri.valNuevo();
            vistaTri.setSize(new Dimension(370,215));
            return;
        }

        if (Double.isNaN(lado2)) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en el lado 2", "Error", JOptionPane.ERROR_MESSAGE);
            vistaTri.valNuevo();
            vistaTri.setSize(new Dimension(370,215));
            return;
        }

        if (Double.isNaN(lado3)) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en el lado 3", "Error", JOptionPane.ERROR_MESSAGE);
            vistaTri.valNuevo();
            vistaTri.setSize(new Dimension(370,215));
            return;
        }

        tri.setLado1(lado1);
        tri.setLado2(lado2);
        tri.setLado3(lado3);
        double area = tri.calcularArea();
        double perimetro = tri.calcularPerimetro();
        vistaTri.mostrarResultados(area, perimetro);
    }
    
    public void nuevoTri(){
        vistaTri.limpiarCampos();
    }
    
    public void salirTri(){        
        vistaTri.dispose();
    }
    
    
    
    
    

    
    
    
    
}
