/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plumi
 */
public class Account {
    String name = "";
    double amount = 0.0;
    Account(){}
    Account(String name,double amount){
        this.name = name;
        this.amount = amount;
    }
    public void Deposit(double amount){
        this.amount = this.amount + amount;
    }
    public String getName(){ return this.name; }
    public double getAmount(){ return this.amount; }
    public void setAmount(double amount){ this.amount = amount; }
}
