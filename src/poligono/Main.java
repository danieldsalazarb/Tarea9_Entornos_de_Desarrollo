package poligono;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Construyendo el cuadrado

        Punto pt1 = new Punto(-10, 10);
        Punto pt2 = new Punto(10, 10);
        Punto pt3 = new Punto(-10, -10);
        Punto pt4 = new Punto(10, -10);

        // Construyendo un triángulo

        Punto pt5 = new Punto(0, 5);
        Punto pt6 = new Punto(-5, 0);
        Punto pt7 = new Punto(5, 0);

        // Generando el ArrayList con los puntos

        ArrayList<Punto> puntos = new ArrayList();
        puntos.add(pt1);
        puntos.add(pt2);
        puntos.add(pt3);
        puntos.add(pt4);
        puntos.add(pt5);
        puntos.add(pt6);
        puntos.add(pt7);


        System.out.println("El cuadrado esta formado por los siguientes puntos en el plano cartesiano: "+"\nPunto 1: "+"("+pt1.X+","+pt1.Y+")"
                +"\nPunto 2: "+"("+pt2.X+","+pt2.Y+")"+"\nPunto 3: "+"("+pt3.X+","+pt3.Y+")"+"\nPunto 4: "+"("+pt4.X+","+pt4.Y+")");


        System.out.println("\nEl triángulo esta formado por los siguientes puntos en el plano cartesiano: "+"\nPunto 5: "+"("+pt5.X+","+pt5.Y+")"
                +"\nPunto 6: "+"("+pt6.X+","+pt6.Y+")"+"\nPunto 7: "+"("+pt7.X+","+pt7.Y+")");


    }
}
