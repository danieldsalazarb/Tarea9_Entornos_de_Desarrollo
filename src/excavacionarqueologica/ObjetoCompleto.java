package excavacionarqueologica;

import excavacionarqueologica.Dimensiones;

/**
 * Class ObjetoCompleto
 */
public class ObjetoCompleto extends ObjetoArqueologico {

  //
  // Fields
  //

  public String uso;
  
  //
  // Constructors
  //
  public ObjetoCompleto (String codigo, String datacion, String descripcion, String material, Dimensiones dimensiones, String uso) {
    super(codigo, datacion, descripcion, material, dimensiones);
    this.uso = uso;
  }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of uso
   * @param newVar the new value of uso
   */
  public void setUso (String newVar) {
    uso = newVar;
  }

  /**
   * Get the value of uso
   * @return the value of uso
   */
  public String getUso () {
    return uso;
  }

  //
  // Other methods
  //

}
