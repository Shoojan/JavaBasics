
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class TestMyCircle {
    public static void main(String [] args){
        MyCircle mc = new MyCircle();
        
        System.out.print("Input the center of circle :\n\tx = ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("\ty = ");
        int b = scan.nextInt();
        mc.setCenterXY(a, b);
        
        System.out.print("Raduis of the circle(r)= ");
        int r = scan.nextInt();
        mc.setRadius(r);
        
        System.out.println(mc.toString()+"\n Area = "+mc.getArea());
    }
    
    
}
