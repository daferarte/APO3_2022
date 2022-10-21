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
public class ArbolBinario {
    public Nodo raiz = null;

    public ArbolBinario() {
        this.raiz = null;
    }
    
    public void InsertarHoja(int dato){
        Nodo nuevo = new Nodo(dato);
        if(raiz == null){
            raiz=nuevo;
        }else{
            Nodo auxiliar = raiz;
            
            while(auxiliar != null){
                if(nuevo.dato < auxiliar.dato){
                    if(auxiliar.izq == null){
                        auxiliar.izq=nuevo;
                        break;
                    }else{
                        auxiliar=auxiliar.izq;
                    }
                }else{
                    if(auxiliar.der == null){
                        auxiliar.der=nuevo;
                        break;
                    }else{
                        auxiliar=auxiliar.der;
                    }
                }
            }
            
        }
    }
    
    
}
