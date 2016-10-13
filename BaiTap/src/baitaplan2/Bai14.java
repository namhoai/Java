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
public class Bai14 {
    public static void main(String[] args) {
        System.out.print("Nhap n : ");
        int n = new Scanner(System.in).nextInt(); 
        int [][]A = new int[n][n]; 
        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<n; j++){
                System.out.print("A["+i+"]["+j+"] : ");
                A[i][j] = new Scanner(System.in).nextInt(); 
            }
        }
        int sc = 0; 
        int sp = 0; 
        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<n; j++){
                if (i==j){
                    sc += A[i][j]; 
                }
                if (i+j+1 == n){
                    sp+= A[i][j]; 
                }
            }
        }
        System.out.println("ma tran A : ");
        Bai11.Xuatmatran(A, n, n);
        System.out.println("Tong duong cheo chinh : " + sc);
        System.out.println("Tong duong cheo phu : " + sp);
        
        
    }
}
