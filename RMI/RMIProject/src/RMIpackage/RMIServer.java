/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIpackage;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author plumi
 */
public class RMIServer {
    
    public static void main(String[] args) {
        
        try {
            RMI_ClassImplementation server = new RMI_ClassImplementation();
            Registry registry = LocateRegistry.createRegistry(6789);
            registry.rebind("Myregistry", server);
            
        } catch (RemoteException ex) {
            System.out.println("Remote Exception : " + ex.toString());
        }
    }
    
}
