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
public class Bai11 {
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
        int [][]B = new int[m][n];
        for (int i = 0 ; i<m ; i++){
            for (int j = 0; j<n ; j++){
                B[i][j] = A[j][i]; 
            }
        }
        System.out.println("Ma Tran Luc Dau : ");
        Xuatmatran(A, n, m);
        System.out.println("Ma Tran Chuyen Vi : ");
        Xuatmatran(B, m, n);
    }
    public static void Xuatmatran (int A[][] , int n , int m){
        for (int i = 0 ; i<n ; i++){
            for (int j = 0; j<m ; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}