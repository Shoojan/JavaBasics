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
public class Graduate extends Student{
    String thesisTitle;
    Graduate(){}
    Graduate(String name,int id,double gpa,String tt){
        super(name,id,gpa);
        this.thesisTitle = tt;
    }
    
    public String getThesisTitle(){
        return this.thesisTitle;
    }
    public void setThesisTitle(String tt){
        this.thesisTitle = tt;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nThesis Title = " + this.thesisTitle;
    }
}
