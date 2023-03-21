package excavacionarqueologica;

import java.util.*;


/**
 * Class Excavacion
 */
public class Excavacion {

  //
  // Fields
  //

  public String fechaInicio;
  public String fechaFin;

  public SitioArqueologico nombre;

  public ArrayList<ObjetoArqueologico> objetosArqueologicos = new ArrayList();

  // Relacion entre Excavacion y SitioArqueologico
  // Relacion entre Excavacion y ObjetoArqueologico
  
  //
  // Constructors
  //
  public Excavacion (String fechaInicio, String fechaFin, SitioArqueologico nombre) {
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.nombre = nombre;
  }

  public Excavacion (String fechaInicio, String fechaFin, SitioArqueologico nombre, ArrayList<ObjetoArqueologico> objetosArqueologicos){
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.nombre = nombre;
    this.objetosArqueologicos = objetosArqueologicos;
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

  //
  // Other methods
  //

}
