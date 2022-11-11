/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import rmiinterface.RMICalculadora;

/**
 *
 * @author dafer
 */
public class RMIServer extends UnicastRemoteObject implements RMICalculadora{

    public RMIServer() throws RemoteException{
        super();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Registry registro=LocateRegistry.createRegistry(7777);
            registro.rebind("RMIServer", new RMIServer());
            System.out.println("Servidor Activo");
        }catch(RemoteException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public int sumar(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public int multiplicar(int a, int b) throws RemoteException {
        return a*b;
    }

    @Override
    public int resta(int a, int b) throws RemoteException {
        return a-b;
    }

    @Override
    public double dividir(int a, int b) throws RemoteException {
        return a/b;
    }
    
}
