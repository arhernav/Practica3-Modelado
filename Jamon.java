/**
 * Clase para modelar el Jamon de los ingredientes de baguettes de WaySub
 * implementa <code>bagutte<code>
 * Funge como caso recursivo para decorator
 */
public class Jamon extends Ingredientes{

  /**
   * Constructor de la clase
   * @param Baguette Objeto que implemente baguette
   */
  public Jamon(Baguette baguette){
    this.baguette = baguette;
  }  

  /**
   * Devuelve el precio base del jamon
   * @return Suma del precio base del jamon y de la baguette contenido
   */
  @Override public double getPrecio(){
      return this.baguette.getPrecio() + 40.0;
  }  

  /**
   * Devuelve un string con la descricion del jamon y la baguette contenida
   * @return String string de la descripcion del jamon
   */
  @Override public String getDescripcion(){
    return this.baguette.getDescripcion() + ", Jamon";
  }
    
}
