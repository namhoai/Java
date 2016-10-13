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
public class Bai14 {
    public static void main(String[] args) {
       int n = 0; 
        System.out.print("Nhap n : ");
       n = new Scanner(System.in).nextInt(); 
       Bai13 b13 = new Bai13(); 
        System.out.print (" Danh sach cac so nguyen to nho hon n : ");
       for(int i = 2; i<=n ; i++){
           if (b13.chek(i)){
               System.out.print(" " + i);
           }
       } 
    }
}
