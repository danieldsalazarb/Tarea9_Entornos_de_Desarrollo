package excavacionarqueologica;

import java.util.*;


/**
 * Class SitioArqueologico
 */
public class SitioArqueologico {

  //
  // Fields
  //

  public String nombre;

  public ArrayList<Excavacion> excavaciones = new ArrayList();

    // Relacion entre Excavacion y SitioArqueologico
  
  //
  // Constructors
  //
  public SitioArqueologico (String nombre) {
    this.nombre = nombre;
  }

  public SitioArqueologico (String nombre, ArrayList<Excavacion> excavaciones){
    this.nombre = nombre;
    this.excavaciones = excavaciones;
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

  //
  // Other methods
  //

}
