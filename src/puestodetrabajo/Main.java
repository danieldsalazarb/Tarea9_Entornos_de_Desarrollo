package puestodetrabajo;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Daniel David","Salazar", "Bastardo", "20-07-1987", "hombre", "Y7268687B");
        PuestoDeTrabajo puestoDeTrabajo1 = new PuestoDeTrabajo("Jefe de Departamento", "16-06-2012", "18-08-2018", 1400, "Senior");
        PuestoDeTrabajo puestoDeTrabajo2 = new PuestoDeTrabajo("Director General", "19-08-2018", "12-03-2023", 2400, "Principiante");

        System.out.println("Empleado: "+persona1.getNombre()+" "+persona1.getApellido1()+" "+persona1.getApellido2()+"\nIdentificador: "+persona1.getNif()+"\nSexo: "+persona1.getSexo()+"\nFecha de nacimiento: "+persona1.getFechaNacimiento());
        System.out.println("Primer puesto de trabajo: "+puestoDeTrabajo1.getNombre()+" "+puestoDeTrabajo1.getNivel()+" desde "+puestoDeTrabajo1.getFechaInicio()+" hasta "+puestoDeTrabajo1.getFechaFin());
        System.out.println("Segundo puesto de trabajo: " +puestoDeTrabajo2.getNombre()+" "+puestoDeTrabajo2.getNivel()+" desde "+puestoDeTrabajo2.getFechaInicio()+" hasta "+puestoDeTrabajo2.getFechaFin());
    }
}
