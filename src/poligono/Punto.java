package poligono;

import java.util.*;


/**
 * Class Punto
 */
public class Punto {

  //
  // Fields
  //

  public int X;
  public int Y;
  
  //
  // Constructors
  //
  public Punto (int X, int Y) {
    this.X = X;
    this.Y = Y;
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of X
   * @param newVar the new value of X
   */
  public void setX (int newVar) {
    X = newVar;
  }

  /**
   * Get the value of X
   * @return the value of X
   */
  public int getX () {
    return X;
  }

  /**
   * Set the value of Y
   * @param newVar the new value of Y
   */
  public void setY (int newVar) {
    Y = newVar;
  }

  /**
   * Get the value of Y
   * @return the value of Y
   */
  public int getY () {
    return Y;
  }

  //
  // Other methods
  //

}
