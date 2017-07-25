/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shoojan
 */
public class MyCircle{
    MyPoint center;
    int radius = 1;
    
    MyCircle(){}
    MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }
    MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    
    public MyPoint getCenter(){
        return this.center;
    } 
    
    public void setCenter(MyPoint center){
        this.center = center;
    }
    public void setCenterXY(int x, int y){
        this.center = new MyPoint(x,y);
    }
    @Override
    public String toString(){
        return "Circle @ "+ center.toString() +" and radius = "+this.radius;
    }
    public double getArea(){
        return 3.14*this.radius*this.radius;
    }
    
}
