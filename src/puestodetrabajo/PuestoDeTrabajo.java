package puestodetrabajo;

import java.util.*;


/**
 * Class PuestoDeTrabajo
 */
public class PuestoDeTrabajo {

  //
  // Fields
  //

  public String nombre;
  public String fechaInicio;
  public String fechaFin;
  public float salario;
  public String nivel;
  
  //
  // Constructors
  //

  public PuestoDeTrabajo(String nombre, String fechaInicio, String fechaFin, float salario, String nivel) {
    this.nombre = nombre;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.salario = salario;
    this.nivel = nivel;
  }

  ;
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of fechaInicio
   * @param newVar the new value of fechaInicio
   */
  public void setFechaInicio (String newVar) {
    fechaInicio = newVar;
  }

  /**
   * Get the value of fechaInicio
   * @return the value of fechaInicio
   */
  public String getFechaInicio () {
    return fechaInicio;
  }

  /**
   * Set the value of fechaFin
   * @param newVar the new value of fechaFin
   */
  public void setFechaFin (String newVar) {
    fechaFin = newVar;
  }

  /**
   * Get the value of fechaFin
   * @return the value of fechaFin
   */
  public String getFechaFin () {
    return fechaFin;
  }

  /**
   * Set the value of salario
   * @param newVar the new value of salario
   */
  public void setSalario (float newVar) {
    salario = newVar;
  }

  /**
   * Get the value of salario
   * @return the value of salario
   */
  public float getSalario () {
    return salario;
  }

  /**
   * Set the value of nivel
   * @param newVar the new value of nivel
   */
  public void setNivel (String newVar) {
    nivel = newVar;
  }

  /**
   * Get the value of nivel
   * @return the value of nivel
   */
  public String getNivel () {
    return nivel;
  }

  //
  // Other methods
  //

}
