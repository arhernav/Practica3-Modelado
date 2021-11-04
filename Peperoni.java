/**
 * Clase que va a ser llamada sólo si el cliente quiere catsup en su baguette.
 * Forma parte de la implementación del patrón Decorator.
 */
public class Peperoni extends Ingredientes implements Baguette{
  
  /**
   * Método constructor que recibe una baguette para añadirle peperoni.
   */
  private Peperoni(Baguette baguette){
    this.baguette = baguette;
  }
  
  /**
   * Método que devuelve el precio de lo que contiene la baguette más el precio del peperoni.
   * @return double Precio de la baguette con peperoni.
   */
  private double getPrecio(){
    return baguette.getPrecio() + 3.21;
  }
  
  /**
   * Método que regresa la descripción de lo que contiene la baguette más el peperoni.
   * @return String Descripción de la baguette con peperoni.
   */
  private String getDescripcion(){
    return baguette.getDescripcion() + ", peperoni";
  }
  
  /**
   * Método que regresa en el ticket la descripción de la baguette con peperoni y su precio.
   * @return String Descripción de la baguette con peperoni y precio.
   */
  private String getTicketCompra(){
    return baguette.getDescripcion() + " " + baguette.getPrecio();
  }
}