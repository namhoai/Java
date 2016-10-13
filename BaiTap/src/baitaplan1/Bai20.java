/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan1;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author hoain
 */
public class Bai20 {
       public static void main(String[] args) {
        float c; 
        System.out.print("Nhap c : "); 
        c = new Scanner(System.in).nextFloat(); 
        
        int x;
        System.out.print("Nhap x : ");
        x = new Scanner(System.in).nextInt();
        
        int n = 0; 
        double k = 0,s = 0; 
        do { 
            k = (float)pow (x,n)/giathua(n); 
            s +=k;  
            n++;
            if (k<0){
                k = k*(-1); 
            }
        }while (k > c); 
        System.out.print("e^x : " + s ); 
    }

    public static float giathua(int n) {
       int s = 1;
       for (int i = 1; i<=n ; i++){
           s *=i;  
       }
       return s; 
    }
}
