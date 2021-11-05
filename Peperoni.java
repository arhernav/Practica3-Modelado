/**
 * Clase que va a ser llamada sólo si el cliente quiere catsup en su baguette.
 * Forma parte de la implementación del patrón Decorator.
 */
public class Peperoni extends Ingredientes{
  
  /**
   * Método constructor que recibe una baguette para añadirle peperoni.
   */
  public Peperoni(Baguette baguette){
    this.baguette = baguette;
  }
  
  /**
   * Método que devuelve el precio de lo que contiene la baguette más el precio del peperoni.
   * @return double Precio de la baguette con peperoni.
   */
  public double getPrecio(){
    return baguette.getPrecio() + 3.21;
  }
  
  /**
   * Método que regresa la descripción de lo que contiene la baguette más el peperoni.
   * @return String Descripción de la baguette con peperoni.
   */
  public String getDescripcion(){
    return baguette.getDescripcion() + ", Peperoni: 3.21";
  }
}
