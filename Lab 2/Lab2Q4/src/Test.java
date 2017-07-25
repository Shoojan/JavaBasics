/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Test {
    public static void main(String [] args){
        Student std = new Student("Sujan","Kalanki");
        std.tostring();
        
        String course[] = {"Java","Database","Oracle","DBA","SE"};
        int gd[] = {45,88,56,97,23};
        std.addCourseGrade(course[5], gd[5]);
        
    }
}
