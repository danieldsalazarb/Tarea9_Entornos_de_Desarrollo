package figurasgeometricas;

/**
 * Class Cuadrilatero
 */
public class Cuadrilatero extends Forma {

  //
  // Fields
  //

  public float Longitud;
  public float Alto;
  
  //
  // Constructors
  //
  public Cuadrilatero (String Nombre, String Color, float CoordenadaX, float CoordenadaY, float Longitud, float Alto) {
    super(Nombre, Color, CoordenadaX, CoordenadaY);
    this.Longitud = Longitud;
    this.Alto = Alto;
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Longitud
   * @param newVar the new value of Longitud
   */
  public void setLongitud (float newVar) {
    Longitud = newVar;
  }

  /**
   * Get the value of Longitud
   * @return the value of Longitud
   */
  public float getLongitud () {
    return Longitud;
  }

  /**
   * Set the value of Alto
   * @param newVar the new value of Alto
   */
  public void setAlto (float newVar) {
    Alto = newVar;
  }

  /**
   * Get the value of Alto
   * @return the value of Alto
   */
  public float getAlto () {
    return Alto;
  }

  //
  // Other methods
  //

}