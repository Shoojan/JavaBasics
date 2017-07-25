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
public class WeighedItem extends PurchaseItem {
    private double weight;
    
    WeighedItem(){}
    WeighedItem(String name,double unitPrice,double weight){
        super(name,unitPrice);
        this.weight = weight;
    }
    
    @Override
    public double getPrice(){
        return super.getPrice()*this.weight;  
    }
    
    @Override
    public String toString(){
        return super.toString()+this.weight+"Kg "+this.getPrice()+"SR";
    }
}
