package figurasgeometricas;

/**
 * Class figurasgeometricas.elipse
 */
public class Elipse {

  //
  // Fields
  //

  private String color;
  private float semiejemayor;
  private float semiejemenor;
  
  //
  // Constructors
  //

  public Elipse(String color, float semiejemayor, float semiejemenor) {
    this.color = color;
    this.semiejemayor = semiejemayor;
    this.semiejemenor = semiejemenor;
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
   * Set the value of semiejemayor
   * @param newVar the new value of semiejemayor
   */
  public void setSemiejemayor (float newVar) {
    semiejemayor = newVar;
  }

  /**
   * Get the value of semiejemayor
   * @return the value of semiejemayor
   */
  public float getSemiejemayor () {
    return semiejemayor;
  }

  /**
   * Set the value of semiejemenor
   * @param newVar the new value of semiejemenor
   */
  public void setSemiejemenor (float newVar) {
    semiejemenor = newVar;
  }

  /**
   * Get the value of semiejemenor
   * @return the value of semiejemenor
   */
  public float getSemiejemenor () {
    return semiejemenor;
  }

  //
  // Other methods
  //

}
