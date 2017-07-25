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
public class Undergrad extends Student{
    int year;
    
    Undergrad(){}
    Undergrad(String name,int id,double gpa,int y){
        super(name,id,gpa);
        this.year = y;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nYear = "+this.year;
    }
}
