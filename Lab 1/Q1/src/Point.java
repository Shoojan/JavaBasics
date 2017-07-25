/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Point {
    double x,y;
    Point(){
    }
    Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    /*Alternative method
    public void Scale(double x, double y){
        this.x = x/2;
        this.y = y/2;
    }*/
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    
    public void Scale(){
        this.x = this.x/2;
        this.y = this.y/2;
        //System.out.println("X = " + this.x);
        //System.out.println("Y = " + this.y);
    }
}
