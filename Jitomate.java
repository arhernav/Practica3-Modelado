/**
 * Clase para modelar el jitomate de los ingredientes de baguettes de WaySub
 * implementa <code>bagutte<code>
 * Funge como caso recursivo para decorator
 */
public class Jitomate extends Ingredientes{

  /**
   * Constructor de la clase
   * @param Baguette Objeto que implemente baguette
   */
  public Jitomate(Baguette baguette){
    this.baguette = baguette;
  }  

  /**
   * Devuelve el precio base del Jitomate con el de la baguette contenida
   * @return double Suma del precio base del jitomate con el precio de la baguette contenida
   */
  @Override public double getPrecio(){
      return this.baguette.getPrecio() + 40.0;
  }  

  /**
   * Devuelve un string con la descricion del Jitomate y la baguette contenida
   * @return String string de la descripcion del Jitomate y su bagguete
   */
  @Override public String getDescripcion(){
    return this.baguette.getDescripcion() + ", Jamon";
  }
    
}
