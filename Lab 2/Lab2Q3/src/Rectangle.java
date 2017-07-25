/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Rectangle extends Shape{
    double width,length = 1.0;
    
    Rectangle(){}
    Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }
    
    @Override
    public String toString(){
        return "A Rectangle with width = "+this.width+" and length = "+this.length+", which is a subclass of "+super.toString();
    }
}
