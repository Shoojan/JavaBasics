/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Author {
    private String NAME,EMAIL;
    private char GENDER;
    
    Author(){
        this.NAME = "";
        this.EMAIL = "";
        this.GENDER = ' ';
    }
    
    Author(String n, String e, char g){
        this.NAME = n;
        this.EMAIL = e;
        this.GENDER = g;
    }
    
    public String getName(){
        return this.NAME;
    }
    
    public String getEmail(){
        return this.EMAIL;
    }
    
    public char getGender(){
        return this.GENDER;
    }
}
