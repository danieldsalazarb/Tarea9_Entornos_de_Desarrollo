package proyecto;

/**
 * Class Localidad
 */
public class Localidad extends Provincia {

  //
  // Fields
  //

  public String nombreLocalidad;
  
  //
  // Constructors
  //
  public Localidad (String nombreLocalidad, String nombreProvincia) {
    super(nombreProvincia);
    this.nombreLocalidad = nombreLocalidad;
  }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombreLocalidad
   * @param newVar the new value of nombreLocalidad
   */
  public void setNombreLocalidad (String newVar) {
    nombreLocalidad = newVar;
  }

  /**
   * Get the value of nombreLocalidad
   * @return the value of nombreLocalidad
   */
  public String getNombreLocalidad () {
    return nombreLocalidad;
  }

  //
  // Other methods
  //

}
