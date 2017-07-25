/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIpackage;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author plumi
 */
public class RMIClient {
    
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",6789);
            InterfaceRMI client =  (InterfaceRMI)registry.lookup("Myregistry");
            int sum = client.add(4, 5);
            int sub = client.sub(sum, 7);
            System.out.println("SUM : "+sum+" (Call from : "+client.getClass().getName()+")\nDIFFERENCE : "+sub);
            
        } catch (RemoteException ex) {
            System.out.println("Remote Exception : "+ex.toString());
        } catch (NotBoundException ex) {
            System.out.println("Not Bound Exception : "+ex.toString());
        }
    }
    
}
