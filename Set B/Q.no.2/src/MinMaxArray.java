
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plumi
 */
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min, max, n;
        
        System.out.print("Enter the size of array : ");
        n = scan.nextInt();
        int number[] = new int[n];
        System.out.println("Enter numbers : ");
        for(int i=0;i<n;i++){
            System.out.print("N("+i+") : ");
            number[i] = scan.nextInt();
        }
        
        min = number[0];
        max = number[0];
        
        for(int i=0;i<n;i++){
            if(min>number[i]){
                min = number[i];
            }
            
            if(max<number[i]){
                max = number[i];
            }
        }
        
        System.out.println("Max Number = "+max);
        System.out.println("Min Number = "+min);
    }
}
