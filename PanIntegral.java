/**
 * Clase para modelar el Pan Integral de las baguettes de WaySub
 * implementa <code>bagutte<code>
 * Funge como caso base para la recursion de decorator
 */
public class PanIntegral implements Baguette{

  /**
   *Devuelve el precio base del pan
   */
  @Override public double getPrecio(){
    return 30.0;
  }  

  /**
   * Método que regresa la descripción del pan integral para la baguette.
   * @return String Descripción del pan integral.
   */
  @Override public String getDescripcion(){
    return "Pan integral para aquellos que creen que van a bajar de peso por usarlo en lugar de pan blanco: 30.0";
  }
  
  /**
   * Método que regresa en el ticket la descripción del pan integral para la baguette y su precio.
   * @return String Descripción del pan integral y precio.
   */
  @Override public String getTicketCompra(){
    return this.getDescripcion() + " \n Precio total: " + this.getPrecio();
  }
}
