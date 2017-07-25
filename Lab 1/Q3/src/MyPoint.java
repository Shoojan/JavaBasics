/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class MyPoint {
    int x,y;
    
    MyPoint(){
        
    }
    
    MyPoint(int a, int b){
        this.x = a;
        this.y = b;
    }
    
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x =  x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return ("("+this.x+","+this.y+")");
    }
    
    public double distance(int x, int y){
        return (Math.sqrt((Math.pow((x-this.x),2))+(Math.pow((y-this.y),2))));
    }
    
    public double distance(MyPoint ap){
        return (Math.sqrt((Math.pow((ap.x-this.x),2))+(Math.pow((ap.y-this.y),2))));
    }
    
}
