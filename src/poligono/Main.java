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

        ArrayList<Punto> ptoscuadrado = new ArrayList();
        ptoscuadrado.add(pt1);
        ptoscuadrado.add(pt2);
        ptoscuadrado.add(pt3);
        ptoscuadrado.add(pt4);

        ArrayList<Punto> ptostriangulo = new ArrayList();
        ptostriangulo.add(pt5);
        ptostriangulo.add(pt6);
        ptostriangulo.add(pt7);

        Poligono cuadrado = new Poligono(ptoscuadrado);

        Poligono triangulo = new Poligono(ptostriangulo);


        System.out.println("El cuadrado esta formado por los siguientes puntos en el plano cartesiano: "+"\nPunto 1: "+"("+cuadrado.puntos.get(0).X+","+cuadrado.puntos.get(0).Y+")"
                +"\nPunto 2: "+"("+cuadrado.puntos.get(1).X+","+cuadrado.puntos.get(1).Y+")"+"\nPunto 3: "+"("+cuadrado.puntos.get(2).X+","+cuadrado.puntos.get(2).X+")"+"\nPunto 4: "+"("+cuadrado.puntos.get(3).X+","+cuadrado.puntos.get(3).Y+")");


        System.out.println("\nEl triángulo esta formado por los siguientes puntos en el plano cartesiano: "+"\nPunto 5: "+"("+triangulo.puntos.get(0).X+","+triangulo.puntos.get(0).Y+")"
                +"\nPunto 6: "+"("+triangulo.puntos.get(1).X+","+triangulo.puntos.get(1).Y+")"+"\nPunto 7: "+"("+triangulo.puntos.get(2).X+","+triangulo.puntos.get(2).Y+")");


    }
}
