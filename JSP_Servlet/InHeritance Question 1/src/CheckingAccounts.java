/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plumi
 */
public class CheckingAccounts extends Account{
    public CheckingAccounts(double amount) {
        super.setAmount(amount);
        if( super.getAmount() == amount){
            System.out.print("Account Balance(Rs."+amount+") is up to date.");
        }else{ System.out.print("Account Balance(Rs."+amount+") is not up to date."); }
    }
    public void withdraw(double amount){
        super.amount -= amount;
        System.out.println("Amount withdrawn successfully. Remaining Amount ="+super.getAmount());
    }
    
}
