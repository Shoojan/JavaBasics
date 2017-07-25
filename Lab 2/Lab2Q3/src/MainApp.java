
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
public class MainApp {
    public static void main(String Arg[]){
        
        System.out.print("Input color : ");
        Scanner scan = new Scanner(System.in);
        String clr = scan.nextLine();
        
        System.out.print("Input the value for filled(true/false) : ");
        scan = new Scanner(System.in);
        boolean fill = scan.nextBoolean();
        
        Shape s = new Shape();
        s.setColor(clr);
        s.setfilled(fill);
        System.out.println(s.toString()+"\n-------------------------------------------");
        
        System.out.print("Input radius : ");
        scan = new Scanner(System.in);
        double r = scan.nextDouble();        
        Circle c = new Circle(r,clr,fill);
        System.out.println("Area = " + c.getArea()+"\n"+c.toString()+"\n-------------------------------------------");
        
        
        System.out.print("Input the length and width of Rectangle:\n\t width = ");
        double w = scan.nextDouble();
        System.out.print("\tlength = ");
        double l = scan.nextDouble();
        Rectangle rec = new Rectangle(w,l,clr,fill);
        System.out.println("Area = " + rec.getArea()+"\nPerimeter = "+rec.getPerimeter()+"\n"+rec.toString());
        
        System.out.print("Input the side of square:\n\t side = ");
        double side = scan.nextDouble();
        Square Sqr = new Square(side,clr,fill);
        System.out.println("Area = " + Sqr.getArea()+"\nPerimeter = "+Sqr.getPerimeter()+"\n"+Sqr.toString());
        
    }
}
