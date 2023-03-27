package factoryabstrac;

/**
 *
 * @author ramir
 */
public class lecheAlmendras implements productoLeche{

    @Override
    public String getDatos() {
        return "Leche organica de almendras";
    }

    @Override
    public void crearProductoLeche() {
        
        try {
            System.out.println("Procesando las almendras...");
            Thread.sleep(2000);
            System.out.println("Leche de almendras lista");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
    }

}
