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
public class Bai19 {
    public static void main(String[] args) {
       float c; 
        System.out.print("Nhap c : ");
        c = new Scanner(System.in).nextFloat(); 
        int n = 0; 
        double k = 0,s = 0,pi = 0; 
        do {
            k = (float)1/(2*n + 1); 
            s += pow (-1,n)*k; 
            n++;
        }while (k > c); 
        pi = 4*s; 
        System.out.print("PI : " + pi );
    }
    
    
}
