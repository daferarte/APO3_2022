/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosmatrices;

/**
 *
 * @author dafer
 */
public class ArreglosMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String datos[] = new String[50000];
        datos[0] = "hola";
        datos[1] = "como";
        datos[2] = "estan";
        System.out.println(datos.length);
        for(int i=0; i<datos.length; i++){
            if(datos[i] != null)
                System.out.println(datos[i]);
        }
    }
    
}
