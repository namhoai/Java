/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan3;

import java.util.Scanner;

/**
 *
 * @author hoain
 */
public class Bai4 {
    public static void main(String[] args) {
        StackOfIntergers  st = new StackOfIntergers(); // mặc định là 16
        System.out.print(" Nhap n : ");
        int n = new Scanner(System.in).nextInt(); 
        for (int i = 2 ; i<n ; i++){
            if (baitaplan1.Bai13.chek(i)){
                st.push(i);
            }
        }
        System.out.println("Danh sach cac so trong stack : ");
        while (!st.IsEmpty()){
            System.out.print(st.pop() + "   ");
        }
    }
}
