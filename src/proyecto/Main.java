package proyecto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Lugar lugar1 = new Lugar(1, "Calle Calzada de Castro, 50, 1-12", "Almería", "Almería");
        Lugar lugar2 = new Lugar(2, "Calle Javier Sanz, 15", "Almería", "Almería");


        Empleado empleado1 = new Empleado("Daniel David", "Salazar", "Bastardo", "Desarrollador Web");
        Empleado empleado2 = new Empleado("Francisco Antonio", "Bastardo", "Marcano", "Consultor");
        Empleado empleado3 = new Empleado("Sandra", "Aveledo", "Rubio", "Diseñador Web");

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);

        Proyecto proyecto1 = new Proyecto("03-03-2023", "20-07-2023", "Proyecto Java", empleados, lugar1);
        Proyecto proyecto2 = new Proyecto("16-01-2023", "25-07-1987", "Proyecto Umbrello", lugar2);

        System.out.println("Descripción: "+proyecto1.descripcion+"\nFecha de inicio: " +proyecto1.fechaInicio+ "\nFecha de fin: " +proyecto1.fechaFin+ "\nEmpleado asignado 1: "+empleado1.nombre+" "+empleado1.apellido1+" "+empleado1.apellido2+"\nRol asignado: "+empleado1.rolAsignado+
                "\nEmpleado asignado 2: "+empleado2.nombre+" "+empleado2.apellido1+" "+empleado2.apellido2+"\nRol asignado: "+empleado2.rolAsignado+"\nLugar: "+lugar1.direccion+" "+lugar1.nombreLocalidad+", "+lugar1.nombreProvincia+"\nLugar id: "+lugar1.numeroIdentificador);

        System.out.println("\nEmpleados sin proyecto asignado: "+empleado3.nombre+" "+empleado3.apellido1+" "+empleado3.apellido2+"\nRol asignado: "+empleado3.rolAsignado);

        System.out.println("\nDescripción: "+proyecto2.descripcion+"\nFecha de inicio: " +proyecto2.fechaInicio+ "\nFecha de fin: " +proyecto2.fechaFin+"\nLugar: "+lugar2.direccion+" "+lugar2.nombreLocalidad+", "+lugar2.nombreProvincia+"\nLugar id: "+lugar2.numeroIdentificador);
    }
}
