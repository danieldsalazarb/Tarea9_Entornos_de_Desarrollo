package figurasgeometricas;

/**
 * Class Elipse
 */
public class Elipse extends Conica {

  //
  // Fields
  //

  public String Color;
  public float SemiEjeMayor;
  public float SemiEjeMenor;
  
  //
  // Constructors
  //
  public Elipse (String Nombre, String Color, float CoordenadaCentroX, float CoordenadaCentroY, float SemiEjeMayor, float SemiEjeMenor) {
    super(Nombre, Color, CoordenadaCentroX, CoordenadaCentroY);
    this.Color = Color;
    this.SemiEjeMayor = SemiEjeMayor;
    this.SemiEjeMenor = SemiEjeMenor;
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
   * Set the value of SemiEjeMayor
   * @param newVar the new value of SemiEjeMayor
   */
  public void setSemiEjeMayor (float newVar) {
    SemiEjeMayor = newVar;
  }

  /**
   * Get the value of SemiEjeMayor
   * @return the value of SemiEjeMayor
   */
  public float getSemiEjeMayor () {
    return SemiEjeMayor;
  }

  /**
   * Set the value of SemiEjeMenor
   * @param newVar the new value of SemiEjeMenor
   */
  public void setSemiEjeMenor (float newVar) {
    SemiEjeMenor = newVar;
  }

  /**
   * Get the value of SemiEjeMenor
   * @return the value of SemiEjeMenor
   */
  public float getSemiEjeMenor () {
    return SemiEjeMenor;
  }

  //
  // Other methods
  //

}
