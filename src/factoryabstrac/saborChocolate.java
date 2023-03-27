package factoryabstrac;

/**
 *
 * @author ramir
 */
public class saborChocolate implements productoSaborizante{


    @Override
    public String informacion() {
        return "Sabor a chocolate";
    }

    @Override
    public void crearSaborizante() {
        try {
            System.out.println("se procesa el cacao para obterner el chocolate");
            Thread.sleep(2000);
            System.out.println("Sabor a chocolate listo");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }  
        
    }
    
}
