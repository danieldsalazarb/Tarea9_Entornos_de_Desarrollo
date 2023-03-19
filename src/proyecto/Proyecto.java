package proyecto;

import java.util.*;


/**
 * Class Proyecto
 */
public class Proyecto {

  //
  // Fields
  //

  public String fechaInicio;
  public String fechaFin;
  public String descripcion;

  public ArrayList<Empleado> empleados = new ArrayList();

  public Lugar lugar;

  // Relacion entre Proyecto y Empleado
  // Relacion entre Proyecto y Lugar

  //
  // Constructors
  //
  public Proyecto (String fechaInicio, String fechaFin, String descripcion, ArrayList<Empleado> empleados, Lugar lugar) {
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.descripcion = descripcion;
    this.empleados = empleados;
    this.lugar = lugar;
  }

  public Proyecto(String fechaInicio, String fechaFin, String descripcion, Lugar lugar) {
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.descripcion = descripcion;
    this.lugar = lugar;
  }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

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
   * Set the value of descripcion
   * @param newVar the new value of descripcion
   */
  public void setDescripcion (String newVar) {
    descripcion = newVar;
  }

  /**
   * Get the value of descripcion
   * @return the value of descripcion
   */
  public String getDescripcion () {
    return descripcion;
  }

  //
  // Other methods
  //

}
