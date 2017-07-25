/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Shape {
    String color = "red";
    boolean filled = true;
    
    Shape(){}
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setfilled(boolean filled){
        this.filled = filled;
    }
    
    @Override
    public String toString(){  //alt+enter to display @override
        String output = "A shape of color "+this.color+" & ";
        if(filled){
            output += "filled.";
        }else{
            output += "not filled.";
        }
        return output;
    }
}
