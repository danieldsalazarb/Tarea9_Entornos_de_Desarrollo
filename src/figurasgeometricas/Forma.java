package figurasgeometricas;

/**
 * Class Forma
 */
public class Forma extends Punto {

  //
  // Fields
  //

  public String Color;
  public String Nombre;
  
  //
  // Constructors
  //
  public Forma (String Nombre, String Color, float CoordenadaX, float CoordenadaY) {
    super(CoordenadaX, CoordenadaY);
    this.Color = Color;
    this.Nombre = Nombre;
  } //
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
   * Set the value of Nombre
   * @param newVar the new value of Nombre
   */
  public void setNombre (String newVar) {
    Nombre = newVar;
  }

  /**
   * Get the value of Nombre
   * @return the value of Nombre
   */
  public String getNombre () {
    return Nombre;
  }

  //
  // Other methods
  //

}
