package figurasgeometricas;

/**
 * Class Punto
 */
public class Punto {

  //
  // Fields
  //

  public float CoordenadaX;
  public float CoordenadaY;
  
  //
  // Constructors
  //
  public Punto (float CoordenadaX, float CoordenadaY) {
    this.CoordenadaX = CoordenadaX;
    this.CoordenadaY = CoordenadaY;
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of CoordenadaX
   * @param newVar the new value of CoordenadaX
   */
  public void setCoordenadaX (float newVar) {
    CoordenadaX = newVar;
  }

  /**
   * Get the value of CoordenadaX
   * @return the value of CoordenadaX
   */
  public float getCoordenadaX () {
    return CoordenadaX;
  }

  /**
   * Set the value of CoordenadaY
   * @param newVar the new value of CoordenadaY
   */
  public void setCoordenadaY (float newVar) {
    CoordenadaY = newVar;
  }

  /**
   * Get the value of CoordenadaY
   * @return the value of CoordenadaY
   */
  public float getCoordenadaY () {
    return CoordenadaY;
  }

  //
  // Other methods
  //

}
