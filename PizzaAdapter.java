/**
 * Clase adapter para poder ver las pizzas como baguettes
 */
public class PizzaAdapter implements Baguette{

  /* Pizza que es envuelta por el adaptador */
  PizzaDonCangrejo pizza;

  /**
   * Método constructor que recibe una pizza que se adapta a baguette.
   */
  public PizzaAdapter(PizzaDonCangrejo pizza){
    this.pizza = pizza;
  }
  /**
   * Devuelve el precio de la pizza adaptada
   * @return 
   */  
  @Override public double getPrecio(){
      return this.pizza.precio;
  }

  /**
   * Devuelve la descripcion de la pizza envuelta de la misma forma que una baguette
   * @return String Descripcion de la pizza
   */
  @Override public String getDescripcion(){
    return this.pizza.getMasa() + ", " + this.pizza.getQueso() + ", " + this.pizza.getCarne(); 
  }

  /**
   * Devuelve la descripción de la pizza y su precio en el ticket.
   * @return String Ticket de la compra.
   */
  @Override public String getTicketCompra(){
    return this.getDescripcion() + "\n Precio total: " + this.pizza.precio;
  }
}
