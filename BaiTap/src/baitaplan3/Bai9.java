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
public class Bai9 {

    public static void main(String[] args) {
        System.out.print("Nhap n : ");
        int n = new Scanner(System.in).nextInt();
        int b;
        do {
            System.out.print("Nhap b : ");
            b = new Scanner(System.in).nextInt();
            if (b > 36 || b < 1) {
                System.err.println("loi !");
            }
        } while (b > 36 || b < 1);

        StackOfChars St = new StackOfChars();
        while (n > 0) {
            int s = n % b;
            if (s > 10) {
                St.push((char) ('A' + s - 10));
            } else {
                St.push((char) ((char) s + '0'));
            }
            n = n / b;
        }
        while (!St.IsEmpty()) {
            System.out.print(St.pop());
        }
    }
}
