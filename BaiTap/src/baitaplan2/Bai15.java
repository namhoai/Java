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
public class Bai15 {
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
        for (int i = 0; i<m ;i++){
            int s = 0; 
            for (int j = 0; j<n; j++){
                s+= A[j][i]; 
            }
            if (s>max){
                p = i; 
                max = s; 
            }
        }
        System.out.println("max : " + max);
        System.out.println("vitri : " + p);

        int [][]B = new int[n][m-1];
        int i1 = 0;
        for (int i = 0; i<m; i++){
            if (i!=p){
                int j1 = 0; 
                for (int j = 0; j<n ; j++){
                    B[j1++][i1] = A[j][i]; 
                }
                i1++; 
            }
        }

        System.out.println("Ma tran A : ");
        Bai11.Xuatmatran(A, n, m);
        System.out.println("Ma tran sau khi loai bo : ");
        Bai11.Xuatmatran(B, n ,i1);
    }
}
