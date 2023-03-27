package factoryabstrac;


/**
 *
 * @author ramir
 */
public class lecheCoco implements productoLeche{
    
    @Override
    public String getDatos() {
        return "Leche de coco";
    }

    @Override
    public void crearProductoLeche() {
        try {
            System.out.println("Pelando los cocos...");
            Thread.sleep(2000);
            System.out.println("Leche de coco lista");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
