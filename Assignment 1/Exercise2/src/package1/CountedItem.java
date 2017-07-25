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
public class CountedItem extends PurchaseItem{
    private int quantity;
    
    CountedItem(){}
    CountedItem(String name,double unitPrice,int q){
        super(name,unitPrice);
        this.quantity = q;
    }
    
    public double getPrice(){
        return super.getPrice()*this.quantity;
    }
    
    @Override
    public String toString(){
        return super.toString()+this.quantity+"units "+this.getPrice()+"SR";
    }
}
