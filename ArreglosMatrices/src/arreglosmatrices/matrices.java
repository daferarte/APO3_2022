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
public class matrices {
    String datos[][] = new String[5][5];

    public matrices() {
        for(int i = 0; i<5;i++)
            for(int j = 0; j<5;j++)
                datos[i][j]=""+Math.random()*100;
    }
    
    public void mostrarMatriz(){
        for(int i = 0; i<5;i++)
            for(int j = 0; j<5;j++)
                System.out.println(datos[i][j]);
    }
    
    
}
