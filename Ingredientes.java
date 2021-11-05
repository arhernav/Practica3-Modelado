/**
 * Clase abstracta que va a extender a Baguette y aplica el patrón Decorator.
 * Va a contener todos los ingredientes de la baguette.
 */
public abstract class Ingredientes implements Baguette{
  
  /* Baguette que va a ser preparada al gusto del cliente */
  public Baguette baguette;

  /**
   * Metodo para obtener el ticket de compra de la baguette
   * @return String Ticket de compra de la baguette
   */
  @Override public String getTicketCompra(){
    return this.getDescripcion() + " \n Precio total: " + this.getPrecio();
  }
}