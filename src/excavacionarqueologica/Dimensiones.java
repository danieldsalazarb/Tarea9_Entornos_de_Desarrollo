package excavacionarqueologica;

/**
 * Class Dimensiones
 */
public class Dimensiones {

  //
  // Fields
  //

  public float alto;
  public float ancho;
  public float largo;
  
  //
  // Constructors
  //
  public Dimensiones (float alto, float ancho, float largo) {
    this.alto = alto;
    this.ancho = ancho;
    this.largo = largo;
  }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of alto
   * @param newVar the new value of alto
   */
  public void setAlto (float newVar) {
    alto = newVar;
  }

  /**
   * Get the value of alto
   * @return the value of alto
   */
  public float getAlto () {
    return alto;
  }

  /**
   * Set the value of ancho
   * @param newVar the new value of ancho
   */
  public void setAncho (float newVar) {
    ancho = newVar;
  }

  /**
   * Get the value of ancho
   * @return the value of ancho
   */
  public float getAncho () {
    return ancho;
  }

  /**
   * Set the value of largo
   * @param newVar the new value of largo
   */
  public void setLargo (float newVar) {
    largo = newVar;
  }

  /**
   * Get the value of largo
   * @return the value of largo
   */
  public float getLargo () {
    return largo;
  }

  //
  // Other methods
  //

}
