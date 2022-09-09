/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author dafer
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Instancia de ejemplos de singleton
         */
        Instancia ejemplo= Instancia.getInstancia();
        ejemplo.numero=3;
        System.out.println(ejemplo.numero);
        Instancia ejemplo2= Instancia.getInstancia();
        System.out.println(ejemplo2.numero);
        Instancia ejemplo3= Instancia.getInstancia();
        System.out.println(ejemplo3.numero);
    }
    
}
