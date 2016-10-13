/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan3;

import static baitaplan1.Bai13.chek;
import java.util.Scanner;

/**
 *
 * @author hoain
 */
public class Bai5 {
    public static void main(String[] args) {
        StackOfIntergers stk = new StackOfIntergers(); // mặc định 16 
        int n = 0; 
        System.out.print("Nhap n : ");
        n = new Scanner(System.in).nextInt();
        int i = 2; 
        while (n > 1){
            if (chek (i)){
                if (n%i==0){
                    // day vao stack 
                    stk.push(i);
                    n = n/i; 
                }else {
                    i++; 
                }
            }else {
                i++; 
            }
        }
        System.out.print(" danh sach cac thua so nguyen to : ");
        while (!stk.IsEmpty()) {
            System.out.print(stk.pop() + "   ");
        }
    }
}
