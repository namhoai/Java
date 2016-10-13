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
public class Bai6 {

    public static void main(String[] args) {
        StackOfIntergers stk = new StackOfIntergers(); // mac dinh 16 
        System.out.print("Nhap n : ");
        int n = new Scanner(System.in).nextInt();
        while (n > 0) {
            int s = n % 2;
            stk.push(s);
            n = n / 2;
        }
        System.out.print("He nhi phan cua n la : " );
        while (!stk.IsEmpty()) {
            System.out.print(stk.pop() + "");
        }
    }
}
