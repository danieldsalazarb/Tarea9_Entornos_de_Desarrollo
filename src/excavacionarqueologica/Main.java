package excavacionarqueologica;

public class Main {
    public static void main(String[] args) {

        SitioArqueologico sitioArqueologico1 = new SitioArqueologico ("Almeria");

        Excavacion excavacion1 = new Excavacion ("20-07-2023", "25-07-2024", sitioArqueologico1);

        Dimensiones dimensiones1 = new Dimensiones (10.5F, 5.5F, 7.5F);

        ObjetoCompleto objetoArquelogicoCompleto1 = new ObjetoCompleto( "AL1", "1000 A.C", "Caballo", "Madera", dimensiones1, "Decoración");

        System.out.println("\nSitio de la excavación : "+excavacion1.nombre.nombre+"\nFecha de inicio: "+excavacion1.fechaInicio+"\nFecha de fin: "+excavacion1.fechaFin+
                "\nObjeto encontrado: "+objetoArquelogicoCompleto1.descripcion+" de "+objetoArquelogicoCompleto1.material+"\nDatación: "+objetoArquelogicoCompleto1.datacion+"\nCódigo asignado: "+objetoArquelogicoCompleto1.codigo+
                "\nDimensiones: "+objetoArquelogicoCompleto1.dimensiones.alto+"cm Alto, "+objetoArquelogicoCompleto1.dimensiones.ancho+"cm Ancho, "+objetoArquelogicoCompleto1.dimensiones.largo+"cm Largo"+"\nUso aparente: "+objetoArquelogicoCompleto1.uso);

    }
}
