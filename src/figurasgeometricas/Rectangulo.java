package figurasgeometricas;

/**
 * Class figurasgeometricas.Rectangulo
 */
public class Rectangulo {

  //
  // Fields
  //

  private String color;
  private float largo;
  private float alto;
  
  //
  // Constructors
  //

  public Rectangulo(String color, float largo, float alto) {
    this.color = color;
    this.largo = largo;
    this.alto = alto;
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of color
   * @param newVar the new value of color
   */
  public void setColor (String newVar) {
    color = newVar;
  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
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

  //
  // Other methods
  //

}
