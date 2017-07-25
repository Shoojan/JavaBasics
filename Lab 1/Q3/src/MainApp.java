/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class MainApp {
    
    public static void main(String [] arg){
        MyPoint original = new MyPoint(2,3);
        
        double d = original.distance(3,4);
        System.out.println("Distance Calculation of "+ original.toString()+"and "+ " = "+d);
        
        MyPoint second = new MyPoint(5,5);
        System.out.println("Distance Calculation of "+ original.toString()+
                           "and "+second.toString()+ " = "+original.distance(second));
    }
    
}
