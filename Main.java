public class Main{
  public static void main(String[] args){
    Baguette baguette = new PanIntegral();
    System.out.println(baguette.getTicketCompra());
    baguette = new Pollo(baguette);
    System.out.println(baguette.getTicketCompra());
    
  }    
}
