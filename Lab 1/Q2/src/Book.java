/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Book {
    String NAME;
    Author athr;
    double PRICE;
    int QTY;
    
    Book(){
    }
    
    Book(String n,Author a, double p, int q){
        this.NAME = n;
        this.athr = a;
        this.PRICE = p;
        this.QTY = q;
    }
    
    public String getName(){
        return this.NAME;
    }
    
    public Author getAuthor(){
        return this.athr;
    }
    
    public double getPrice(){
        return this.PRICE;
    }
    
    public int getQty(){
        return this.QTY;
    }
    
    public void setQty(int q){
        this.QTY += q;                
    }
}
