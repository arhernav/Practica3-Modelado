/**
 * Clase para modelar el Pollo de los ingredientes de baguettes de WaySub
 * implementa <code>bagutte<code>
 * Funge como caso recursivo para decorator
 */
public class Pollo extends Ingredientes{

  /**
   * Constructor de la clase
   * @param Baguette Objeto que implemente baguette
   */
  public Pollo(Baguette baguette){
    this.baguette = baguette;
  }  

  /**
   * Devuelve el precio base del pollo sumado al precio de la baguette contenida
   * @return double Suma del precio del pollo con la baguette contenida
   */
  @Override protected double getPrecio(){
      return this.baguette.getPrecio() + 40.0;
  }  

  /**
   * Devuelve un string con la descricion del pollo
   * @return String string de la descripcion del pollo
   */
  @Override protected String getDescripcion(){
    return this.baguette.getDescripcion() + "Pollo";
  }
    
}
