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
public class Student {
    String name;
    int id;
    double gpa;
    
    Student(){}
    Student(String name,int id,double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public double getGPA(){
        return this.gpa;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "Name = "+this.name+"\nId = "+this.id+"\nGPA = "+this.gpa;
    }
}
