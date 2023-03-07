package figurasgeometricas;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo("circulo", "negro", 2, 3, 4);

        System.out.println("Figura : " + circulo.getNombre() + "\nColor: " +circulo.getColor() + " \nCoordenada x: " +circulo.getCoordenadaX()+ "\nCoordenada y: " +circulo.getCoordenadaY() + "\nDiámetro: " +circulo.getDiametro());


    }
}