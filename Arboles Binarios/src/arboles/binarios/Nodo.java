/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles.binarios;

/**
 *
 * @author dafer
 */
public class Nodo {
    
    public int dato;
    public Nodo izq;
    public Nodo der;

    public Nodo(int dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }
    
    
}
