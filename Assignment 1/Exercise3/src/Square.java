/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Square extends Shape implements Area  {
    double side;
    Square(double side,String name){
        this.side = side;
        super.name = name;
    }
    @Override
    public double getArea(){
        return this.side*this.side;
    }
}
