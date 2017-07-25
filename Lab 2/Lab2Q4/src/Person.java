/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Person {
    String name,address;
    
    Person(){}
    Person(String name,String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    @Override
    public String toString(){
        return "Name = "+this.name+"\nAddress = "+this.address;
    }
}
