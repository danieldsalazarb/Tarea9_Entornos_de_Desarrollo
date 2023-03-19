package proyecto;

import java.util.*;


/**
 * Class Lugar
 */
public class Lugar extends Localidad {

  //
  // Fields
  //

  public int numeroIdentificador;
  public String direccion;

  public Proyecto proyecto;

  // Relacion entre Proyecto y Lugar
  
  //
  // Constructors
  //
  public Lugar (int numeroIdentificador, String direccion, String nombreLocalidad, String nombreProvincia) {
    super(nombreLocalidad,nombreProvincia);
    this.numeroIdentificador = numeroIdentificador;
    this.direccion = direccion;
  }

  public Lugar (int numeroIdentificador, String direccion, String nombreLocalidad, String nombreProvincia, Proyecto proyecto) {
    super(nombreLocalidad,nombreProvincia);
    this.numeroIdentificador = numeroIdentificador;
    this.direccion = direccion;
    this.proyecto = proyecto;
  }

  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of numeroIdentificador
   * @param newVar the new value of numeroIdentificador
   */
  public void setNumeroIdentificador (int newVar) {
    numeroIdentificador = newVar;
  }

  /**
   * Get the value of numeroIdentificador
   * @return the value of numeroIdentificador
   */
  public int getNumeroIdentificador () {
    return numeroIdentificador;
  }

  /**
   * Set the value of direccion
   * @param newVar the new value of direccion
   */
  public void setDireccion (String newVar) {
    direccion = newVar;
  }

  /**
   * Get the value of direccion
   * @return the value of direccion
   */
  public String getDireccion () {
    return direccion;
  }

  //
  // Other methods
  //

}
