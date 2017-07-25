/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Circle extends Shape {
    double radius = 1.0;
    
    Circle(){}
    Circle(double radius,String color,boolean filled){
        super(color,filled);  //to access the feature(constructor) of Parent Class
        this.radius = radius;
//        this.color = color;
//        this.filled = filled;
    }
    
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*Math.pow(this.radius,2);
    }
    public double getPerimeter(){
        return 2*3.14*this.radius;
    }
    
    @Override
    public String toString(){
        String output = "A Circle with radius = "+this.radius+",which is a subclass of "+super.toString();
        return output;
    }
}
