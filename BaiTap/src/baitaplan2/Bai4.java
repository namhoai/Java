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
public class Bai4 {
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
        int k = 0; 
        int [] B = new int[n]; 
        int [] C = new int[n]; 
        for (int i = 0; i < n ; i++) {
            boolean ok = true; 
            for (int j = 0; j<k; j++){
                if (A[i] == B[j]) {
                    C[j] = C[j]+1; 
                    ok = false; 
                }
            }
            if (ok){
              C[k] = 1; 
              B[k++] = A[i];     
            }
        }
        int max = 0;
        int Max = 0; 
        System.out.println("Danh sach so lan xh cua cac phan tu : ");
        for (int i = 0 ; i<k ; i++){
            System.out.println(B[i] + " " + C[i]);
        }
    }
}
