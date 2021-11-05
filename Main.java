/**
 * Clase que modela el uso del patrón Decorator y Adapter.
 */

public class Main{

    /**
     *Metodo para poder elegir el tipo de pan de la baguette mas facilmente
     */
  public static Baguette escogerPan(){
    System.out.println("1.- Pan integral");
    System.out.println("2.- Pan blanco/engordante");
    int opcionElegidaB = 3;
    boolean opcionValidaB = false;
    do{
      if(escaner.hasNextInt()){
        opcionElegida = escaner.nextInt();
          if(opcionElegida <= 2){
            opcionValida = true;
          }
      }else{    
        escaner.nextLine();
        System.out.println("Recuerda que debes de ingresar solo un digito y este debe de concordar con alguna de las opciones del menu de arriba");
      }
    }while(!opcionValidaB);

    switch(opcionElegidaB){
    case 1:
	return new PanIntegral();
	break;
    case 2:
	return new PanEngordante();
	break;
    default:
	return new PanEngordante();
    }  
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
	  Baguette baguette = escogerPan();
	  
	break;

      //Opcion de Pizza
      case 2:
        System.out.println();
        System.out.println(menuDonCangrejo);
        Scanner escaner= new Scanner(System.in);
        indice = escaner.nextInt();
        System.out.println(menoDonCangrejo[indice].getTicketCompra());
        System.out.println();
        break;
      case 3:
        System.out.println();
        finalizarPrograma = true;
        System.out.println();
        break;
      case 4:
        System.out.println();
        
        System.out.println();
        break;
      default: 
        break;
    }
  }
}    

