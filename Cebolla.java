/**
 * Clase que va a ser llamada sólo si el cliente quiere cebolla en su baguette.
 * Forma parte de la implementación del patrón Decorator.
 */
public class Cebolla extends Ingredientes implements Baguette{
  
  /**
   * Método constructor que recibe una baguette para añadirle cebolla.
   */
  private Cebolla(Baguette baguette){
    this.baguette = baguette;
  }
  
  /**
   * Método que devuelve el precio de lo que contiene la baguette más el precio de la cebolla.
   * @return double Precio de la baguette con cebolla.
   */
  private double getPrecio(){
    return baguette.getPrecio() + 2.21;
  }
  
  /**
   * Método que regresa la descripción de lo que contiene la baguette más la cebolla.
   * @return String Descripción de la baguette con cebolla.
   */
  private String getDescripcion(){
    return baguette.getDescripcion() + ", cebolla";
  }
  
    /**
   * Método que regresa en el ticket la descripción de la baguette con cebolla y su precio.
   * @return String Descripción de la baguette con cebolla y precio.
   */
  private String getTicketCompra(){
    return baguette.getDescripcion() + " " + baguette.getPrecio();
  }
}