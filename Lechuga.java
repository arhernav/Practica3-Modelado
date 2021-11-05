/**
 * Clase que va a ser llamada sólo si el cliente quiere lechuga en su baguette.
 * Forma parte de la implementación del patrón Decorator.
 */
public class Lechuga extends Ingredientes implements Baguette{
  
  /**
   * Método constructor que recibe una baguette para añadirle lechuga.
   */
  public Lechuga(Baguette baguette){
    this.baguette = baguette;
  }
  
  /**
   * Método que devuelve el precio de lo que contiene la baguette más el precio de la lechuga.
   * @return double Precio de la baguette con lechuga.
   */
  @Override public double getPrecio(){
    return baguette.getPrecio() + 1.45;
  }
  
  /**
   * Método que regresa la descripción de lo que contiene la baguette más la lechuga.
   * @return String Descripción de la baguette con lechuga.
   */
  @Override public String getDescripcion(){
    return baguette.getDescripcion() + ", lechuga";
  }
  
  
  /**
   * Método que regresa en el ticket la descripción de la baguette con lechuga y su precio.
   * @return String Descripción de la baguette con lechuga y precio.
   */
  @Override public String getTicketCompra(){
    return baguette.getDescripcion() + " " + baguette.getPrecio();
  }
}
