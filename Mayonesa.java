/**
 * Clase para modelar el Mayonesa de los ingredientes de baguettes de WaySub
 * implementa <code>bagutte<code>
 * Funge como caso recursivo para decorator
 */
public class Mayonesa extends Ingredientes{

  /**
   * Constructor de la clase
   * @param Baguette Objeto que implemente baguette
   */
  public Mayonesa(Baguette baguette){
    this.baguette = baguette;
  }  

  /**
   * Devuelve el precio base de la Mayonesa
   * @return double Precio de la mayonesa junto con la baguette contenida
   */
  @Override public double getPrecio(){
    return this.baguette.getPrecio() + 40.0;
  }  

  /**
   * Devuelve un string con la descricion de la mayonesa y la baguette contenida
   * @return String string de la descripcion de la Mayonesa y su baguette
   */
  @Override public String getDescripcion(){
    return this.baguette.getDescripcion() + ", Mayonesa: 40.0";
  }
}
