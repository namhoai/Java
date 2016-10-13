/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan2;

import java.util.Scanner;

/**
 *
 * @author hoain 3/9/2016 - by NamVu
 */
public class Bai1 {

    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n : ");
        n = new Scanner(System.in).nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nhap A[" + (i + 1) + "] : ");
                A[i] = new Scanner(System.in).nextInt();
                if (A[i] < 0) {
                    System.err.println("So Nguyen Duong !"); // bao loi ! 
                }
            } while (A[i] < 0);
        }

        if (chek(A, n)) {
            System.out.println("Mang Thuan Nghich !");

        } else {
            System.out.println("Mang Ko Thuan Ngich !");
        }
    }

    public static boolean chek(int A[], int n) {
        for (int i = 0; i < n / 2; i++) {
            if (A[i] != A[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
