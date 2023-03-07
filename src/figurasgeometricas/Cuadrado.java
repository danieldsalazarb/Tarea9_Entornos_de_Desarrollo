package figurasgeometricas;

/**
 * Class Cuadrado
 */
public class Cuadrado extends Cuadrilatero {

  //
  // Fields
  //

  public String Color;
  public float Longitud;
  public float Alto;
  
  //
  // Constructors
  //
  public Cuadrado (String Nombre, String Color, float CoordenadaX, float CoordenadaY, float Longitud, float Alto) {
    super(Nombre, Color, CoordenadaX, CoordenadaY, Longitud, Alto);
    this.Color = Color;
    this.Longitud = Longitud;
    this.Alto = Longitud;
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Color
   * @param newVar the new value of Color
   */
  public void setColor (String newVar) {
    Color = newVar;
  }

  /**
   * Get the value of Color
   * @return the value of Color
   */
  public String getColor () {
    return Color;
  }

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
