/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIpackage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author plumi
 */
public class RMI_ClassImplementation extends UnicastRemoteObject implements InterfaceRMI
{
    RMI_ClassImplementation() throws RemoteException{
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public int sub(int a, int b) throws RemoteException {
        return a-b;
    }
    
}
