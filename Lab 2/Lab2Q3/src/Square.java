/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Square extends Rectangle {
    
    Square(){}
    Square(double side){
        super.length = side;
    }
    Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    
    public double getSide(){
        return super.length;
    } 
    public void setSide(double side){
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    public String toString(){
        return "A Square with side = "+this.length+", which is a subclass of "+super.toString();
    }
    @Override
    public double getArea(){
        return super.length*super.width;
    }
    @Override
    public double getPerimeter(){
        return 4*super.length;
    }
    
}
