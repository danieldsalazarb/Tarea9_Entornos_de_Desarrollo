package figurasgeometricas;

/**
 * Class Circulo
 */
public class Circulo extends Conica {

  //
  // Fields
  //

  public String Color;
  public float Diametro;
  
  //
  // Constructors
  //
  public Circulo (String Nombre, String Color, float CoordenadaCentroX, float CoordenadaCentroY, float Diametro) {
    super(Nombre, Color, CoordenadaCentroX, CoordenadaCentroY);
    this.Color = Color;
    this.Diametro = Diametro;
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
   * Set the value of Diametro
   * @param newVar the new value of Diametro
   */
  public void setDiametro (float newVar) {
    Diametro = newVar;
  }

  /**
   * Get the value of Diametro
   * @return the value of Diametro
   */
  public float getDiametro () {
    return Diametro;
  }

  //
  // Other methods
  //

}
