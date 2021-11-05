/**
 * Clase para modelar la Pizza de Don Cangrejo, la cual es la mejor para ti y para mi
 */
public class PizzaDonCangrejo{

    /*Precio de la pizza*/
    double precio;
    /*Descripcion de la pizza*/
    String descripcion;
    /*Tipo de queso en la pizza*/
    String queso;
    /*Tipo de carne de la pizza*/
    String carne;
    /*Tipo de masa de la pizza*/
    String masa;

    
  /**
   * Constructor de la clase
   * @param double Precio Precio de la pizza
   * @param double Precio Precio de la pizza
   * @param String Descripcion Descripcion de la pizza
   * @param String queso Tipo de Queso que lleva la pizza
   * @param String carne Tipo de carne que llev la pizza
   * @param String masa Tipo de masa que lleva la pizza
   */  
  public PizzaDonCangrejo(double precio, String descripcion, String queso, String carne, String masa){
      this.precio = precio;
      this.descripcion = descripcion;
      this.queso = queso;
      this.carne = carne;
      this.masa = masa;
  }

    /**
     * Regresa el tipo de queso de la pizza
     * @return String Tipo de queso de la pizza
     */
    public String getQueso(){
 return this.queso;
    }

  /**
   * Regresa el tipo de carne de la pizza
   * @return String Tipo de carne de la pizza
   */
  public String getCarne(){
    return this.carne;
  }

  /**
   * Regresa el tipo de masa de la pizza
   * @return String Tipo de masa de la pizza
   */
  public String getMasa(){
    return this.masa;
  }

  /**
   * Metodo toString de la pizza
   * @return String Representacion en cadena de la pizza
   */
  @Override public String toString(){
      return this.descripcion;
  }
}
