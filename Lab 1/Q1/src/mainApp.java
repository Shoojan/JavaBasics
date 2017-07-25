/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class mainApp {
    public static void main(String [] args){
        Point p = new Point(4,5);
        p.Scale();
        System.out.println("X = " + p.getX());
        System.out.println("Y = " + p.getY());
    }
}
