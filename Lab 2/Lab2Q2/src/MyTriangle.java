/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class MyTriangle extends MyPoint {
    MyPoint v1,v2,v3;
    
    MyTriangle(){}
    MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }
    MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    @Override
    public String toString(){
        return "Triangle @ "+v1.toString()+","+v2.toString()+","+v3.toString();
    }
    
    public double getPerimeter(){
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }
}
