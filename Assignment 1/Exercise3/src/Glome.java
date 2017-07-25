/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Glome extends Sphere implements Volume{
    Glome(double radius,String name){
        super(radius,name);
    }
    @Override
    public double getVolume(){
        return 0.5*Math.pow(super.PI, 2)*Math.pow(super.radius,4);
    }

}
