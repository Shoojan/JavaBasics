/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Line{
    Point begin,end;
    
    Line(){}
    Line(int x1,int y1,int x2,int y2){
        this.begin = new Point(x1,y1);
        this.end = new Point(x2,y2);
    }
    Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    
    public Point getBegin(){
        return this.begin;
    }
    public void setBegin(Point begin){
        this.begin = begin;
    }
    public Point getEnd(){
        return this.end;
    }
    public void setEnd(Point end){
        this.end = end;
    }
    
    public int getBeginX(){
        return this.begin.x;
    }
    public void setBeginX(int x){
        this.begin.x = x;
    }
    public int getBeginY(){
        return this.begin.y;
    }
    public void setBeginY(int y){
        this.begin.y = y;
    }
    public void setBeginXY(int x,int y){
        this.begin.x = x; 
        this.begin.y = y;
    }
    
    public int getEndX(){
        return this.end.x;
    }
    public void setEndX(int x){
        this.end.x = x;
    }
    public int getEndY(){
        return this.end.y;
    }
    public void setEndY(int y){
        this.end.y = y;
    }
    public void setEndXY(int x,int y){
        this.end.x = x;
        this.end.y = y;
    }
    
    @Override
    public String toString(){
        return this.begin.toString() + " and " + this.end.toString();
    }
    
    public double getLength(){
        return Math.sqrt(Math.pow((this.end.x - this.begin.x),2)+Math.pow((this.end.y - this.begin.y),2));
    }
}
