package factoryabstrac;

/**
 *
 * @author ramir
 */
public class saborVainilla implements productoSaborizante{
    
    @Override
    public void crearSaborizante() {
        try {
            System.out.println("Se extraen las vainas");
            Thread.sleep(2000);
            System.out.println("Sabor a vainilla listo");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }        
    }

    @Override
    public String informacion() {
        return "Extracto de vainilla";
    }
    
}
