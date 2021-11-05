import java.util.Scanner;
/**
 * Clase que modela el uso del patrón Decorator y Adapter.
 */

public class Main{
  /**
   * Metodo para poder elegir el tipo de pan de la baguette mas facilmente
   * @return Devuelve el pan elegido por medio de el escanner
   */
  public static Baguette escogerPan(){
    Baguette baguette = null;
    System.out.println("1.- Pan integral");
    System.out.println("2.- Pan blanco/engordante");
    int opcionElegidaB = 3;
    boolean opcionValidaB = false;
    Scanner escaner = new Scanner(System.in);
    do{
      if(escaner.hasNextInt()){
        opcionElegidaB = escaner.nextInt();
        if(opcionElegidaB <= 2){
          opcionValidaB = true;
        }
      }else{    
        escaner.nextLine();
        System.out.println("Recuerda que debes de ingresar solo un digito y este debe de concordar con alguna de las opciones del menu de arriba");
      }
    }while(!opcionValidaB);
    
    switch(opcionElegidaB){
      case 1:
        baguette = new PanIntegral();
        break;
      case 2:
        baguette = new PanEngordante();
        break;
      default:
        break;
    }
    return baguette;
  }

  /**
   * Metodo para agregar ingredientes
   * Capaz de agregar ingredientes hasta que el cliente diga lo contrario
   * @param Baguette Baguette base para comenzar a agregar ingredientes
   * @return Baguette Baguette tuneada con los ingredientes pedidos
   */
  public static Baguette agregarIngredientes(Baguette baguetteRecibida){
    Baguette baguetteTuneada = baguetteRecibida;
    boolean baguetteTerminada = false;
    Scanner escaner = new Scanner(System.in);
    //Submenu interactivo para agregar ingredientes
    do{
      System.out.println("Elija el ingrediente que quiere agregar");
      System.out.println("1.- Pollo");
      System.out.println("2.- Jamon");
      System.out.println("3.- Jitomate");
      System.out.println("4.- Mostaza");
      System.out.println("5.- Mayonesa ");
      System.out.println("6.- Peperoni");
      System.out.println("7.- Lechuga");
      System.out.println("8.- Cebolla");
      System.out.println("9.- Catsup");
      System.out.println("10.- Dejar de agregar ingredientes"); 
      int opcionElegidaI = 11;
      boolean opcionValidaI = false;
      do{
        if(escaner.hasNextInt()){
          opcionElegidaI = escaner.nextInt();
          if(opcionElegidaI <= 10){
            opcionValidaI = true;
          }
        }else{    
          escaner.nextLine();
          System.out.println("Recuerda que debes de ingresar solo un digito y este debe de concordar con alguna de las opciones del menu de arriba");
        }
      }while(!opcionValidaI);
      
      switch(opcionElegidaI){
        case 1:
          baguetteTuneada = new Pollo(baguetteTuneada);
          break;
        case 2:
          baguetteTuneada = new Jamon(baguetteTuneada);
          break;
        case 3:
          baguetteTuneada = new Jitomate(baguetteTuneada);
          break;
        case 4:
          baguetteTuneada = new Mostaza(baguetteTuneada);
          break;
        case 5:
          baguetteTuneada = new Mayonesa(baguetteTuneada);
          break;
        case 6:
          baguetteTuneada = new Peperoni(baguetteTuneada);
          break;
        case 7:
          baguetteTuneada = new Lechuga(baguetteTuneada);
          break;
        case 8:
          baguetteTuneada = new Cebolla(baguetteTuneada);
          break;
        case 9:
          baguetteTuneada = new Catsup(baguetteTuneada);
          break;
        case 10:
          baguetteTerminada = true;
          break;
      }
    }while(!baguetteTerminada); //Fin del submenu interactivo para agregar ingredientes
    return baguetteTuneada;
  }

  /**
   * Metodo para recibir entradas desde la terminal que debi de haber escrito desde un inicio
   * @param int numero de opciones
   * @param int entrada del usuairio que sea menor o igual al numero de opciones
   */
  public static int entrada(int opciones){
    int opcionElegida = opciones + 1;
    boolean opcionValida = false;
    Scanner escaner = new Scanner(System.in);
    do{
      if(escaner.hasNextInt()){
        opcionElegida = escaner.nextInt();
        if(opcionElegida <= opciones && opcionElegida >= 0){
          opcionValida = true;
        }
      }else{    
        escaner.nextLine();
        System.out.println("Recuerda que debes de ingresar solo un digito y este debe de concordar con alguna de las opciones del menu de arriba");
      }
    }while(!opcionValida);
    return opcionElegida;
  }
  
  public static void main(String[] args){
    
    // Empieza la preparación de la hamburguesa.
    
    PizzaDonCangrejo [] menuDonCangrejo = new PizzaDonCangrejo[5];
    menuDonCangrejo [0] = new PizzaDonCangrejo(30.45, "Pizza básica", "Queso chedar", "Jamón", "Masa delgada");
    menuDonCangrejo [1] = new PizzaDonCangrejo(37.99, "Pizza mediana", "Queso chedar", "Salchicha", "Masa delgada");
    menuDonCangrejo [2] = new PizzaDonCangrejo(40.21, "Pizza grande", "Queso manchego", "Sachicha", "Masa gruesa");
    menuDonCangrejo [3] = new PizzaDonCangrejo(49.10, "Pizza extragrande", "Queso manchego", "Pollo", "Masa gruesa");
    menuDonCangrejo [4] = new PizzaDonCangrejo(58.44, "Pizza familiar", "Queso chedar", "Pollo", "Masa grande");
    
    /*Comienzo de la ejecucion del programa*/
    System.out.println("Bienvenid@ a WaySub!!!");
    boolean finalizarPrograma = false;
    
    //Comienzo del menu interactivo
    while(!finalizarPrograma){
 
    //Declaracion de  objetos necesarios para el menu
    int opcionElegida = 4;
    Scanner escaner = new Scanner(System.in);
    boolean opcionValida = false;

    //Opciones para seleccionar
    System.out.println("Por favor ingrese el tipo de comida que desea: ");
    System.out.println("1.- Baguette");
    System.out.println("2.- Pizza");
    System.out.println("3.- Finalizar el programa");
    System.out.println("Ingrese el digito de la opcion que quiere");
      
    //Seleccion de opcion
    do{
      if(escaner.hasNextInt()){
        opcionElegida = escaner.nextInt();
        if(opcionElegida <= 3){
          opcionValida = true;
        }
      }else{    
        escaner.nextLine();
        System.out.println("Recuerda que debes de ingresar solo un digito y este debe de concordar con alguna de las opciones del menu de arriba");
      }
    }while(!opcionValida);

    //Ejecucion de la opcion seleccionada
    switch(opcionElegida){
 
      //Opcion de baguette
      case 1:
        System.out.println("Por favor eliga su tipo de pan: \n");
        Baguette baguette = escogerPan();
        System.out.println("Eliga todos los ingredientes que guste: \n");
        baguette = agregarIngredientes(baguette);
        System.out.println("\nSu ticket de compra es: \n");
        System.out.println(baguette.getTicketCompra());
        System.out.println();
        break;
        
        //Opcion de Pizza
      case 2:
        System.out.println("Seleccione su pizza del menu");
        for(int i = 0; i < menuDonCangrejo.length; i++){
          System.out.println(i + ".-" + menuDonCangrejo[i]);
        }
        PizzaDonCangrejo pizza = menuDonCangrejo[entrada(menuDonCangrejo.length)];
        Baguette baguettePizza = new PizzaAdapter(pizza);
        System.out.println("\nSu ticket de compra es: \n");
        System.out.println(baguettePizza.getTicketCompra());
        System.out.println();
        break;
      case 3:
        System.out.println();
        finalizarPrograma = true;
        System.out.println();
        break;
      default: 
        break;
    }
  }
}