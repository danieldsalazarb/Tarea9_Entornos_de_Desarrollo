package excavacionarqueologica;

import java.util.*;


/**
 * Class ObjetoArqueologico
 */
public class ObjetoArqueologico {

  //
  // Fields
  //

  public String codigo;
  public String datacion;
  public String descripcion;
  public String material;
  public Dimensiones dimensiones;

  // Relacion entre Excavacion y ObjetoArqueologico
  // Relacion entre ObjetoArqueologico y CondicionObjeto
  
  //
  // Constructors
  //
  public ObjetoArqueologico ( String codigo, String datacion, String descripcion, String material, Dimensiones dimensiones) {
    this.codigo = codigo;
    this.datacion = datacion;
    this.descripcion = descripcion;
    this.material = material;
    this.dimensiones = dimensiones;
  }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of codigo
   * @param newVar the new value of codigo
   */
  public void setCodigo (String newVar) {
    codigo = newVar;
  }

  /**
   * Get the value of codigo
   * @return the value of codigo
   */
  public String getCodigo () {
    return codigo;
  }

  /**
   * Set the value of datacion
   * @param newVar the new value of datacion
   */
  public void setDatacion (String newVar) {
    datacion = newVar;
  }

  /**
   * Get the value of datacion
   * @return the value of datacion
   */
  public String getDatacion () {
    return datacion;
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

  /**
   * Set the value of material
   * @param newVar the new value of material
   */
  public void setMaterial (String newVar) {
    material = newVar;
  }

  /**
   * Get the value of material
   * @return the value of material
   */
  public String getMaterial () {
    return material;
  }

  /**
   * Set the value of dimensiones
   * @param newVar the new value of dimensiones
   */
  public void setDimensiones (Dimensiones newVar) {
    dimensiones = newVar;
  }

  /**
   * Get the value of dimensiones
   * @return the value of dimensiones
   */
  public Dimensiones getDimensiones () {
    return dimensiones;
  }

  //
  // Other methods
  //

}
