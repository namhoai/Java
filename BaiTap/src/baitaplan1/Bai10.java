/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan1;

import java.util.Scanner;

/**
 *
 * @author HOAI - NAM
 */
public class Bai10 {
       public static void main(String[] args) {
           int a = 0, b = 0;
           System.out.print("Nhap a : ");
           a = new Scanner(System.in).nextInt();
  
           System.out.print("Nhap b : ");
           b = new Scanner(System.in).nextInt();  
           int k = TimUCLN(a, b); 
          System.out.println("UCLN : " + k );
          System.out.println("BCNN : " + (a*b)/k );
    }
    public static int TimUCLN (int a , int b){
        while (a != b ){
              if (a>b){
                   a = a-b;  
              }else {
                   b = b-a; 
              }  
           }
        return a; 
    }
}
