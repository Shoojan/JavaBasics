/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIpackage;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author plumi
 */
public interface InterfaceRMI extends Remote{
    public static final float PI=(float) 3.14586;
    public int add(int a,int b) throws RemoteException;  
    public int sub(int a,int b) throws RemoteException;
}
