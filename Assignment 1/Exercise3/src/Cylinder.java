/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Cylinder extends Circle implements Volume{
    double height;
    Cylinder(double height,double radius,String name){
        super(radius,name);
        this.height = height;
    }
    @Override
    public double getVolume(){
        return super.PI*Math.pow(super.radius,2)*this.height;
    }

}
