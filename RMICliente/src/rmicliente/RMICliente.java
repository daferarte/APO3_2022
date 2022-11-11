/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmiinterface.RMICalculadora;
/**
 *
 * @author dafer
 */
public class RMICliente {

    public void ConexionServidor(){
        try {
            Registry registro = LocateRegistry.getRegistry("127.0.0.1",7777);
            RMICalculadora interfaz = (RMICalculadora) registro.lookup("RMIServer");
            System.out.println("El resultado de la suma es "+interfaz.sumar(4, 8));
            System.out.println("El resultado de la resta es "+interfaz.resta(4, 8));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new RMICliente().ConexionServidor();
    }
    
}
