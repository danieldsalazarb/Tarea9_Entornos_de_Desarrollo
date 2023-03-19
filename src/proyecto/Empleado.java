package proyecto;

import java.util.*;


/**
 * Class Empleado
 */
public class Empleado {

  //
  // Fields
  //

  public String nombre;
  public String apellido1;
  public String apellido2;
  public String rolAsignado;

  // Relacion entre Proyecto y Empleado
  
  //
  // Constructors
  //
  public Empleado (String nombre, String apellido1, String apellido2, String rolAsignado) {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.rolAsignado = rolAsignado;
  }
  
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
   * Set the value of apellido1
   * @param newVar the new value of apellido1
   */
  public void setApellido1 (String newVar) {
    apellido1 = newVar;
  }

  /**
   * Get the value of apellido1
   * @return the value of apellido1
   */
  public String getApellido1 () {
    return apellido1;
  }

  /**
   * Set the value of apellido2
   * @param newVar the new value of apellido2
   */
  public void setApellido2 (String newVar) {
    apellido2 = newVar;
  }

  /**
   * Get the value of apellido2
   * @return the value of apellido2
   */
  public String getApellido2 () {
    return apellido2;
  }

  /**
   * Set the value of rolAsignado
   * @param newVar the new value of rolAsignado
   */
  public void setRolAsignado (String newVar) {
    rolAsignado = newVar;
  }

  /**
   * Get the value of rolAsignado
   * @return the value of rolAsignado
   */
  public String getRolAsignado () {
    return rolAsignado;
  }

  //
  // Other methods
  //

}
