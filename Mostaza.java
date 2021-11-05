/**
 * Clase para modelar el Mostaza de los ingredientes de baguettes de WaySub
 * implementa <code>bagutte<code>
 * Funge como caso recursivo para decorator
 */
public class Mostaza extends Ingredientes{

  /**
   * Constructor de la clase
   * @param Baguette Objeto que implemente baguette
   */
  public Mostaza(Baguette baguette){
    this.baguette = baguette;
  }  

  /**
   *Devuelve el precio base de la Mostaza
   */
  @Override public double getPrecio(){
    return this.baguette.getPrecio() + 40.0;
  }  

  /**
   * Devuelve un string con la descricion de la mostaza y la baguette contenida
   * @return String string de la descripcion de la mostaza
   */
  @Override public String getDescripcion(){
    return this.baguette.getDescripcion() + ", Mostaza: 40.0";
  }
  
}
