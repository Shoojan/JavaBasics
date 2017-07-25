
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plumi
 */
public class AccountDemo {
    public static void main(String [] args){
        double amount=0.0;
        System.out.print("Saving Ammount : ");
        Scanner scan = new Scanner(System.in);
        amount = scan.nextDouble();
        SavingAccounts sa = new SavingAccounts(amount);
        CheckingAccounts ca = new CheckingAccounts(amount);
        System.out.print("Withdraw Ammount : ");
        double wamount = scan.nextDouble();
        ca.withdraw(wamount);
    }        
}
