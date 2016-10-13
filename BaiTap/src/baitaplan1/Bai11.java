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
public class Bai11 {
    public static void main(String[] args) {
        Bai10 b10 = new Bai10(); 
        int a = 0, b = 0;
           System.out.print("Nhap a : ");
           a = new Scanner(System.in).nextInt();
  
           System.out.print("Nhap b : ");
           b = new Scanner(System.in).nextInt();
           System.out.println(" cac cap nguyen to cung nhau o [a,b] la : ");
        for (int i = a; i<=b ; i++){
            for (int j = i+1; j<=b ; j++){
                if (b10.TimUCLN(i, j)== 1){
                    System.out.println("(" + i + "," + j + ") , ");
                } 
            }
        }
    }
}
