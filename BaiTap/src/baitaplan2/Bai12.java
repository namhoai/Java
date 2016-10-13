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
public class Bai12 {
//    int A[][] = {
//        {2,4}, {2,5}, {2,6} 
//    }; 
//  
    public static void main(String[] args) {
        // nhap A ; 
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
        //nhap B ;
        System.out.println("so Hang cua ma tran B bang so cot cua ma tran A !");
        System.out.print("Nhap k : ");
        int k = new Scanner(System.in).nextInt();
        int [][]B = new int[m][k]; 
        for (int i = 0 ; i<m ; i++){
            for (int j = 0; j<k ; j++){
                System.out.print("Nhap B["+ i+"]["+ j +"] = " );
                B[i][j] = new Scanner(System.in).nextInt(); 
            }
        }
        // tinh 
        int [][]C = new int[n][k]; 
        for (int i = 0 ; i<n ; i++ ){
            for (int h = 0; h<k ; h++){
                for (int j = 0 ; j< m ; j++){
                    C[i][h] += A[i][j]*B[j][h]; 
                }
           }
        }
        System.out.println("Ma tran A : ");
        Bai11.Xuatmatran(A, n, m);
        System.out.println("Ma tran B : ");
        Bai11.Xuatmatran(B, m, k);
        System.out.println("Tich AxB : ");
        Bai11.Xuatmatran(C, n, k);
    }
    
}
