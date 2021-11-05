/**
 * Interfaz para modelar el comportamiento de una baguette
 */
public interface Baguette{

  /**
   * Devuelve el precio de la baguette
   * @return double Precio de la baguette
   */
  public double getPrecio();

  /**
   * Devuelve la descripcion de la baguette
   * @return String Descripcion de la baguette
   */    
  public String getDescripcion();
    
  /**
   * Devuelve el ticket de compra de la baguette
   * @return String Ticket de compra de la baguette
   */
  public String getTicketCompra();
}
