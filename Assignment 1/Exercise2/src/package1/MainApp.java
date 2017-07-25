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
public class MainApp {
    public static void main(String [] args){
        PurchaseItem Pi = new PurchaseItem();
        WeighedItem Wi = new WeighedItem("Banana",3.00,1.37);
        CountedItem Ci = new CountedItem("Pens",4.5,10);
        System.out.println(Pi.toString()+"\n"+Wi.toString()+"\n"+Ci.toString());
    }
}
