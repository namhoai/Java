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
public class Bai16 {
    public static void main(String[] args) {
        int n = 0; 
        do {
            System.out.print("Nhap n : ");
            n = new Scanner(System.in).nextInt(); 
            if (n<2 || n>90){
                System.out.println("Sai Roi ! <2 - 90>");
            }
        }while (n<2 || n>90); 
        int F0 = 0 , F1 = 1, F3 = 1; 
        n= n-1; 
        while (n != 0){
            F3 = F0+F1; 
            F0 = F1; 
            F1 = F3; 
            n--; 
        }
        System.out.print(" so fibonacci thu n la : " + F3);
    }
}
