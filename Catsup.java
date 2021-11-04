/**
 * Clase que va a ser llamada sólo si el cliente quiere catsup en su baguette.
 * Forma parte de la implementación del patrón Decorator.
 */
public class Catsup extends Ingredientes implements Baguette{
  
  /**
   * Método constructor que recibe una baguette para añadirle captsup.
   */
  private Catsup(Baguette baguette){
    this.baguette = baguette;
  }
  
  /**
   * Método que devuelve el precio de lo que contiene la baguette más el precio del catsup.
   * @return double Precio de la baguette con catsup.
   */
  private double getPrecio(){
    return baguette.getPrecio() + 0.83;
  }
  
  /**
   * Método que regresa la descripción de lo que contiene la baguette más el captsup.
   * @return String Descripción de la baguette con catsup.
   */
  private String getDescripcion(){
    return baguette.getDescripcion() + ", catsup";
  }
  
  /**
   * Método que regresa en el ticket la descripción de la baguette con catsup y su precio.
   * @return String Descripción de la baguette con catsup y precio.
   */
  private String getTicketCompra(){
    return baguette.getDescripcion() + " " + baguette.getPrecio();
  }
}