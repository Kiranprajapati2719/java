/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Com 7
 */
import java.util.Scanner;

public class JavaApplication1 {
    
    public static int add(int num1,int num2){
        return num1+num2;
    }
    
        public static void main(String[] args) {
        // TODO code application logic here
        
        int c;
        
        Scanner num= new Scanner (System.in);
        
        System.out.println("Enter first number:");
        int a= num.nextInt();
        
        System.out.println("Enter second number:");
        int b= num.nextInt();
       
        System.out.println("The sum is " + add(a,b));
    }
    
}
