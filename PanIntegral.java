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
   *
   */
  @Override public String getDescripcion(){
    return "Pan integral para aquellos que creen que van a bajar de peso por usarlo en lugar de pan blanco";
  }

  @Override public String getTicketCompra(){
    return this.getPrecio() + "/n" + this.getDescripcion();
  }
}
