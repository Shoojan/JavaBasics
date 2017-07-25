/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Sphere extends Circle implements Volume{
    Sphere(double radius,String name){
        super(radius,name);
    }
    @Override
    public double getVolume(){
        return 1.3333*super.PI*Math.pow(super.radius,3);
    }

}
