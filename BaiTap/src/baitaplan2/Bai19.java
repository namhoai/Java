/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan2;

import java.util.Scanner;

/**
 *
 * @author hoain
 */
public class Bai19 {
    // bài này gần giống như bài 11
    public static void main(String[] args) {
         System.out.print("Nhap n : ");
        int n = new Scanner(System.in).nextInt(); 
        int [][]A = new int[n][n]; 
        for (int i = 0 ; i<n ; i++){
            for (int j = 0; j<n ; j++){
                System.out.print("Nhap A["+ i+"]["+ j +"] = " );
                A[i][j] = new Scanner(System.in).nextInt(); 
            }
        }
        int [][]B = new int[n][n];
        for (int i = 0 ; i<n ; i++){
            for (int j = 0; j<n ; j++){
                B[i][j] = A[j][n-i-1]; 
            }
        }
        System.out.println("Ma Tran Luc Dau : ");
        Bai11.Xuatmatran(A, n, n);
        System.out.println("Xoay Ma Tran : ");
        Bai11.Xuatmatran(B, n, n);
    }
}
