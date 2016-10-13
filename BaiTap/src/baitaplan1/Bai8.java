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
public class Bai8 {
    public static void main(String[] args) {
        double n = 0 , s = 0; 
        System.out.print("Nhap N : " );
        n = new Scanner(System.in).nextDouble(); 
        for (int i = 1; i<=n; i++){
            s += (float) 1/i;  
        }
        System.out.println("s = " +s);
        
    }
}
