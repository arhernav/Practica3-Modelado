/**
 * Clase que implementa a Baguette.
 * Inicia la preparación de la baguette.
 */
public class PanEngordante implements Baguette{
  
  /**
   * Método que devuelve el precio del pan para la baguette.
   * @return double Precio del pan.
   */
  @Override
  public double getPrecio(){
    return 8.37;
  }
  
  /**
   * Método que regresa la descripción del pan para la baguette.
   * @return String Descripción del pan engordante.
   */
  @Override
  public String getDescripcion(){
    return "Pan engordante: 8.37"; 
  }
  
  /**
   * Método que regresa en el ticket la descripción del pan engordante para la baguette y su precio.
   * @return String Descripción del pan engordante y precio.
   */
  @Override
  public String getTicketCompra(){
    return getDescripcion() + " " + getPrecio(); 
  }
}
