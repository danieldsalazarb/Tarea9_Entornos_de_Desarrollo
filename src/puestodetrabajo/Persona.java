package puestodetrabajo;

import java.util.*;


/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  public String nombre;
  public String apellido1;
  public String apellido2;
  public String fechaNacimiento;
  public String sexo;
  public String nif;
  
  //
  // Constructors
  //
  public Persona(String nombre, String apellido1, String apellido2, String fechaNacimiento, String sexo, String nif){
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.fechaNacimiento = fechaNacimiento;
    this.sexo = sexo;
    this.nif = nif;
  } ;
  
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
   * Set the value of fechaNacimiento
   * @param newVar the new value of fechaNacimiento
   */
  public void setFechaNacimiento (String newVar) {
    fechaNacimiento = newVar;
  }

  /**
   * Get the value of fechaNacimiento
   * @return the value of fechaNacimiento
   */
  public String getFechaNacimiento () {
    return fechaNacimiento;
  }

  /**
   * Set the value of sexo
   * @param newVar the new value of sexo
   */
  public void setSexo (String newVar) {
    sexo = newVar;
  }

  /**
   * Get the value of sexo
   * @return the value of sexo
   */
  public String getSexo () {
    return sexo;
  }

  /**
   * Set the value of nif
   * @param newVar the new value of nif
   */
  public void setNif (String newVar) {
    nif = newVar;
  }

  /**
   * Get the value of nif
   * @return the value of nif
   */
  public String getNif () {
    return nif;
  }

  //
  // Other methods
  //

}
