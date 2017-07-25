/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author Shoojan
 */
public class PurchaseItem {
    private String name;
    private double unitPrice;
    
    PurchaseItem(){
        this.name = "no item";
        this.unitPrice = 0;
    }
    PurchaseItem(String name,double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }
    
    public double getPrice(){
        return this.unitPrice;
    }
    public void setItems(String name,double p){
        this.name = name;
        this.unitPrice = p;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.name+" @ "+this.unitPrice+"  ";
    }
}

