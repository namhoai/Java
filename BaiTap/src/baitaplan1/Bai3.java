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
public class Bai3 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap chieu cao : ");
        n = new Scanner(System.in).nextInt(); 
        for (int i = n; i< 2*n; i++){
            for (int j = 0;j<=i; j++){
               if (j<(2*n-i)){
                    System.out.print(" ");
               } else {
                    System.out.print("*");   
               }
            }
            System.out.println();
        }
    }
}
