package figurasgeometricas;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo("negro", 4);

        Rectangulo rectangulo = new Rectangulo("naranja", 5, 4);

        Cuadrado cuadrado = new Cuadrado("azul", 4);

        Elipse elipse = new Elipse("amarillo", 7, 5);

        System.out.println("El circulo es de color: " + circulo.getColor() + " y su diámetro es de: " + circulo.getDiametro());

        System.out.println("El rectángulo es de color: " + rectangulo.getColor() + ", su alto es de: " + rectangulo.getAlto() + " y su largo es de: " + rectangulo.getLargo());

        System.out.println("El cuadrado es de color: " + cuadrado.getColor() + " y su lado es de: " + cuadrado.getLado());

        System.out.println("La elipse es de color: " + elipse.getColor() + ", su semieje mayor es de: " + elipse.getSemiejemayor() + " y su semieje menor es de: " + elipse.getSemiejemenor());
    }
}