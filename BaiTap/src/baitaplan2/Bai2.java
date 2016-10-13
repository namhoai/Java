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
public class Bai2 {

    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n : ");
        n = new Scanner(System.in).nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap A[" + (i + 1) + "] : ");
            A[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (A[i] > A[j]) {
                    int temp = A[i]; 
                    A[i] = A[j]; 
                    A[j] = temp; 
                }
            }
        }
        System.out.print("Mang sau khi sap xep la : ");
        XuatMang(A, n);
    }

    public static void XuatMang(int A[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + A[i]);
        }
        System.out.println("");
    }
}
