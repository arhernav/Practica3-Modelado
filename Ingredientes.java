/**
 * Clase abstracta que va a extender a Baguette y aplica el patrón Decorator.
 * Va a contener todos los ingredientes de la baguette.
 */
public abstract class Ingredientes implements Baguette{
  
  /* Baguette que va a ser preparada al gusto del cliente */
  public Baguette baguette;
}