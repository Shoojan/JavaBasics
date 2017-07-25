
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
public class Testing {
    public static void main(String [] args){
              
        Line l = new Line(2,3,4,3);
        System.out.println("Before user input,\nDefault points passed : "+l.toString());
        System.out.println("It's distance = "+l.getLength()+"\n----------------------------------");
        
        Scanner scan = new Scanner(System.in);
        int x1,x2,y1,y2;
        System.out.print("x1 : ");
        x1 = scan.nextInt();            
        System.out.print("y1 : ");
        y1 = scan.nextInt();
        System.out.print("x2 : ");
        x2 = scan.nextInt();
        System.out.print("y2 : ");
        y2 = scan.nextInt();
        l.setBeginXY(x1, y1);
        l.setEndXY(x2, y2);
        System.out.println("After user input,\nGetBeginX returns,ie x1 = "+l.getBeginX());
        System.out.println("The points are "+l.toString());
        System.out.println("Distance = "+l.getLength());
    }
}
