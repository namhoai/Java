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
public class Bai8 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n : ");
        n = new Scanner(System.in).nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap A[" + (i + 1) + "] : ");
            A[i] = new Scanner(System.in).nextInt();
        }
        
        int m;
        System.out.print("Nhap m : ");
        m = new Scanner(System.in).nextInt();
        int[] B = new int[n];
        for (int i = 0; i < m; i++) {
            System.out.print("Nhap B[" + (i + 1) + "] : ");
            B[i] = new Scanner(System.in).nextInt();
        }
        
        int p = 0; 
        do {
            System.out.print("Nhap p : ");
            p = new Scanner(System.in).nextInt(); 
            if (p<0 || p>n){
                System.err.println(" xem lai dk cua p ! ");
            }
        }while (p<0 || p>n); 
        int j = 0; 
        int []C = new int[m+n];
        for (int i = 0; i<m+n ; i++){
            if (i<p){
                C[i] = A[i]; 
            }else {
                if (i>(m+p-1)){
                    C[i] = A[i-p-1]; 
                }else {
                    C[i] = B[j++]; 
                }
            }
        }
        Bai2.XuatMang(C, n+m);
    }
}
