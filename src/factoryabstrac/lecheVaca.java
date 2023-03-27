package factoryabstrac;

/**
 *
 * @author ramir
 */
public class lecheVaca implements productoLeche{

    @Override
    public String getDatos() {
        return "Leche de vaca pasteurizada";
    }

    @Override
    public void crearProductoLeche() {
        try {
            System.out.println("Ordeñar la vaca en la granja y pasteurizar la leche...");
            Thread.sleep(2000);
            System.out.println("Leche de vaca pasteurizada y lista");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
}
