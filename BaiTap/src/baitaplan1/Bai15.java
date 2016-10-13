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
public class Bai15 {
    public static void main(String[] args) {
        Bai13 b13 = new Bai13(); 
        int n = 0; 
        System.out.print("Nhap n : ");
        n = new Scanner(System.in).nextInt(); 
        int i = 2; 
        while (n!=0){
            if (b13.chek(i)){
                n--;
                System.out.print(i + " ");
            }
            i++; 
        }
    }
}
