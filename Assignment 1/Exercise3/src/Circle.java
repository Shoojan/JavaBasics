/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Circle extends Shape implements Area{
    double radius;
    Circle(double radius,String name){
        this.radius = radius;
        super.name = name;
    }
    @Override
    public double getArea(){
        return Area.PI*this.radius*this.radius;
    }
}
