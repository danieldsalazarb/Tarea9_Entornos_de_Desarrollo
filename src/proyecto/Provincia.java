package proyecto;

/**
 * Class Provincia
 */
public class Provincia {

  //
  // Fields
  //

  public String nombreProvincia;
  
  //
  // Constructors
  //
  public Provincia (String nombreProvincia) {
    this.nombreProvincia = nombreProvincia;
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombreProvincia
   * @param newVar the new value of nombreProvincia
   */
  public void setNombreProvincia (String newVar) {
    nombreProvincia = newVar;
  }

  /**
   * Get the value of nombreProvincia
   * @return the value of nombreProvincia
   */
  public String getNombreProvincia () {
    return nombreProvincia;
  }

  //
  // Other methods
  //

}
