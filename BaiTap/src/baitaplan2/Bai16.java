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
public class Bai16 {
    public static void main(String[] args) {
        System.out.print("Nhap n : ");
        int n = new Scanner(System.in).nextInt(); 
        System.out.print("Nhap m : ");
        int m = new Scanner(System.in).nextInt();
        int [][]A = new int[n][m]; 
        for (int i = 0 ; i<n ; i++){
            for (int j = 0; j<m ; j++){
                System.out.print("Nhap A["+ i+"]["+ j +"] = " );
                A[i][j] = new Scanner(System.in).nextInt(); 
            }
        }
        int max = 0; 
        int p = 0; 
        for (int i = 0; i<n ;i++){
            int s = 0; 
            for (int j = 0; j<m; j++){
                s+= A[i][j]; 
            }
            if (s>max){
                p = i; 
                max = s; 
            }
        }
        int [][]B = new int[n-1][m];
        int i1 = 0; 
        for (int i = 0; i<n; i++){
            if (i!=p){
                int j1 = 0; 
                for (int j = 0; j<m ; j++){
                    B[i1][j1++] = A[i][j]; 
                }
                i1++; 
            }
        }
        System.out.println("Ma tran A : ");
        Bai11.Xuatmatran(A, n, m);
        System.out.println("Ma tran sau khi loai bo : ");
        Bai11.Xuatmatran(B, i1 , m);
    }
}
