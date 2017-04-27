/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Com 8
 */
public class Array {

    /**
     * @param args the command line arguments
     */
     public static void main(String []args){
         
         //To do code 
         
         double [] myList = {1.8,2.9,3.4,5.1,6.5};
         double max=myList[0];
         
         for(int i=1; i<myList.length; i++){ 
             
             if(myList[i]>max){
                 
                 max=myList[i];
             
             }
             
         }  
             System.out.println("Largest number is "+max);
       
     }
}
