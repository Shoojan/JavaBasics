/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class Student extends Person{
    int numCourses;
    String courses[] = new String[30];
    int grades[] = new int[30];
    
    Student(){}
    Student(String name,String address){
        super(name,address);
    }
    
    
    
    public void tostring(){
        String output[] = new String[this.numCourses];
        System.out.println(super.toString()+"\nCourses number = "+this.numCourses);
        for(int i=0;i<this.numCourses;i++){
            output[i] = "Courses = " +this.courses[i]+" | Grades = "+this.grades[i];
            System.out.println(output[i]);
        }
    }
    
    public void addCourseGrade(String course,int grade){
            this.courses[0] = course;
            this.grades[0] = grade;
        }
    }
    
    public void printGrades(){
        for(int i=0;i<this.numCourses;i++){
            System.out.print(this.grades[i]);
        }
    }
    
    public double getAverageGrade(){
        double avg = 0;
        for(int i=0;i<this.numCourses;i++){
            avg += this.grades[i];
        }
        return avg;
    }
}
