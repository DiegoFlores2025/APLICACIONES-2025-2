
package com.s04_actividad_01;

import Controlador.ControladorFiguras;
import Modelo.Cuadrado;
import Modelo.Círculo;
import Modelo.Rectángulo;
import Modelo.Triángulo;
import Vista.VistaCirculo;
import Vista.VistaCuadrado;
import Vista.VistaFiguras;
import Vista.VistaRectangulo;
import Vista.VistaTriangulo;

public class S04_ACTIVIDAD_01 {

    public static void main(String[] args) {
        Cuadrado cua = new Cuadrado();
        Círculo cir = new Círculo();
        Rectángulo rec = new Rectángulo();
        Triángulo tri = new Triángulo();
        VistaCuadrado vistaCua = new VistaCuadrado();
        VistaCirculo vistaCir = new VistaCirculo();
        VistaRectangulo vistaRec = new VistaRectangulo();
        VistaTriangulo vistaTri = new VistaTriangulo();
        VistaFiguras vistaFiguras = new VistaFiguras();
        ControladorFiguras controlador = new ControladorFiguras(vistaFiguras, vistaCua, vistaCir, vistaRec, vistaTri, cua, cir, rec, tri);
        vistaFiguras.setVisible(true);
    }
}
