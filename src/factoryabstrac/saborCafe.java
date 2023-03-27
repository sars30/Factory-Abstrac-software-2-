/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryabstrac;

/**
 *
 * @author ramir
 */
public class saborCafe implements productoSaborizante{
    
    @Override
    public void crearSaborizante() {
        try {
            System.out.println("Se procesa el café");
            Thread.sleep(2000);
            System.out.println("Dulce de café listo");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }        
    }

    @Override
    public String informacion() {
        return "Dulce de café";
    }
    
}
