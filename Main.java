/**
 * Clase que modela el uso del patrón Decorator y Adapter.
 */

public class Main{
  
  public static void main(String[] args){
    
    // Empieza la preparación de la hamburguesa.
    
    Baguette baguette = new PanIntegral();
    System.out.println(baguette.getTicketCompra());
    baguette = new Pollo(baguette);
    System.out.println(baguette.getTicketCompra());
  }    
}
