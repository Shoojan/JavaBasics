/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Cube extends Square implements Volume{
    Cube(double side, String name){
        super(side,name);
    }
    @Override
    public double getVolume(){
        return Math.pow(super.side,3);
    }

}
