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
    public static void main(String args[]){
        Circle Ci = new Circle(7,"Circle");
        System.out.println(Ci.getName()+" with radius "+Ci.radius+" has area "+Ci.getArea());
        
        Square Sq = new Square(10,"Square");
        System.out.println(Sq.getName()+" with side "+Sq.side+" has area "+Sq.getArea());
        
        Cube Cu = new Cube(10,"Cube");
        System.out.println(Cu.getName()+" with side "+Cu.side+" has volume "+Cu.getVolume());
        
        Sphere Sp = new Sphere(3,"Sphere");
        System.out.println(Sp.getName()+" with radius "+Sp.radius+" has volume "+Sp.getVolume());
        
        Cylinder Cy = new Cylinder(10,3,"Cylinder");
        System.out.println(Cy.getName()+" with height "+Cy.height+" & radius "+Cy.radius+" has volume "+Cy.getVolume());
        
        Glome Gl = new Glome(3,"Glome");
        System.out.println(Gl.getName()+" with radius "+Gl.radius+" has volume "+Gl.getVolume());
    }
}
