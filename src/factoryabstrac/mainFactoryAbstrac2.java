package factoryabstrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ramir
 */
public class mainFactoryAbstrac2 {

    public static void main(String[] args) throws InterruptedException {
        String seleccion;
        System.out.println("Que tipo de malteada quiere");
        System.out.println("1. Con sabores naturales \n"
                          +"2. Con sabores artificiales");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.print("Ingresa tu seleccón: ");
            seleccion = br.readLine();
            if("1".equals(seleccion)){
                //creacion de malteadas con sabores naturales
                System.out.println("-----Fabrica Natural-----");
                //se crea el objeto que llamará la fabrica que las produce
                factoryAbstrac miFabrica1 = new fabricaNatural();
                //mediante el objeto se llama al método que las creará 
                miFabrica1.crearProductos();
                /*se muestran las posibles combinaciones para que el cliente elija
                y posteriormente se finalice la creación y se muestre la combinación elegida*/
                productoLeche miLeche1 = miFabrica1.getProductoLeche();
                productoSaborizante miSabor1 = miFabrica1.getProductoSabor();
                System.out.println("Su malteada ya esta lista, es de: "+ miLeche1.getDatos()+" y " + miSabor1.informacion());
            }else{
                //creacion de malteadas con sabores artificiales
                System.out.println("-----Fabrica quimica-----");
                //se crea el objeto que llamará la fabrica que las produce
                factoryAbstrac miFabrica = new fabricaQuimica();
                //mediante el objeto se llama al método que las creará 
                miFabrica.crearProductos();
                /*se muestran las posibles combinaciones para que el cliente elija
                y posteriormente se finalice la creación y se muestre la combinación elegida*/
                productoLeche miLeche = miFabrica.getProductoLeche();
                productoSaborizante miSabor = miFabrica.getProductoSabor();
                System.out.println("Mezclando ingredientes...");
                Thread.sleep(2000);
                System.out.println("Su malteada ya esta lista, es de: "+ miLeche.getDatos()+" con " + miSabor.informacion());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }    
    }   
}
