/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author HOAI - NAM
 */
public class Bai9 {
    public static void main(String[] args) {
        int n = 0; 
        int dem =1; 
        System.out.print("Nhap n : ");
        n = new Scanner(System.in).nextInt(); 
        System.out.print("Danh Sach cac uoc : 1 ");
        for (int i = 2; i<= sqrt (n);i++ ){
            if (n%i==0){
                dem +=2;  
                System.out.print(" " + i + " " +(n/i));
            }
        }
        System.out.print(" " + n + "\n"); 
        dem++; 
        System.out.println("so uoc cau N la : " + dem);
    }
}
