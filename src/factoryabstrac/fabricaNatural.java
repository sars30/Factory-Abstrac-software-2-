package factoryabstrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramir
 */
public class fabricaNatural implements factoryAbstrac{
    
    private productoLeche leche;
    private productoSaborizante sabor;
    
    @Override
    public void crearProductos() {
        String seleccion;
        System.out.println("Estamos creando tu bebida");
        System.out.println("Elija el tipo de leche para su malteada: \n"
                          +"1. Almendras \n"
                          +"2. coco \n"
                          +"3. Natural");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.print("Ingresa tu seleccón: ");
            seleccion = br.readLine();
            if("1".equals(seleccion)){
                leche = new lecheAlmendras();
                leche.crearProductoLeche();
            }else if("2".equals(seleccion)){
                leche = new lecheCoco();
                leche.crearProductoLeche();
            }else{
                leche = new lecheVaca();
                leche.crearProductoLeche();
            }
            System.out.println("Ahora prepararemos el sabor");
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        sabor = new saborVainilla();
        sabor.crearSaborizante();
    }

    @Override
    public productoLeche getProductoLeche() {
        return leche;
    }

    @Override
    public productoSaborizante getProductoSabor() {
        return sabor;
    }
        
}
