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
public class Bai12 {
    public static void main(String[] args) {
        int n  = 0 , s = 0; 
        System.out.print("Nhap N : ");
        n = new Scanner(System.in).nextInt(); 
        while (n>0){
            int k = n%10; 
            n = n/10;
            s +=  k; 
        }
        System.out.println("Tong : " + s);
    }
}
