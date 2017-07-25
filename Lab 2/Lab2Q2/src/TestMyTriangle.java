/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Shoojan.
 */
public class TestMyTriangle {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        MyPoint mp1 = new MyPoint();
        MyPoint mp2 = new MyPoint();
        MyPoint mp3 = new MyPoint();
        
        System.out.println("Input the points of triangle:");
        for(int i = 1;i<4;i++){
            System.out.print("x"+i+" = ");
            int x = scan.nextInt();
            System.out.print("y"+i+" = ");
            int y = scan.nextInt();
            if(i==1)
                mp1.setXY(x, y);
            else if(i==2)
                mp2.setXY(x, y);
            else
                mp3.setXY(x, y);
        }
        
        MyTriangle mt = new MyTriangle(mp1,mp2,mp3);
        System.out.println(mt.toString()+"\n Perimeter = "+mt.getPerimeter());
    }
}
