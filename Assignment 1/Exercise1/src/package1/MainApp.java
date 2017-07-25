/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author Shoojan
 */
public class MainApp {
    public static void main(String [] args){
        Undergrad ug =new Undergrad("Ram",1,44.12,2012);
        Graduate g = new Graduate("Shyam",2,77.55,"I have come to Bargain");
        System.out.println(ug.toString()+"\n----------------------------\n"+g.toString());
    }
}
