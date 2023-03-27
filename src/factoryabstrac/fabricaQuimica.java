package factoryabstrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ramir
 */
public class fabricaQuimica implements factoryAbstrac{

    private productoLeche leche;
    private productoSaborizante sabor;
    
    @Override
    public void crearProductos() {
        String seleccion;
        System.out.println("Estamos creando tu bebida");
        leche = new lecheVaca();
        leche.crearProductoLeche();
        System.out.println("Elija el sabor para su malteada: \n"
                          +"1. Chocolate \n"
                          +"2. Café");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.print("Ingresa tu seleccón: ");
            seleccion = br.readLine();
            System.out.println("Ahora extraemos el sabor");
            if("1".equals(seleccion)){
                sabor = new saborChocolate();
                sabor.crearSaborizante();
            }else{
                sabor = new saborCafe();
                sabor.crearSaborizante();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
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
