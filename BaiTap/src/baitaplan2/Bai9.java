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
public class Bai9 {

    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n : ");
        n = new Scanner(System.in).nextInt();
        int[] A = new int[n+1];
        
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nhap A[" + (i + 1) + "] : ");
                A[i] = new Scanner(System.in).nextInt();
                
                if (i == 0){
                    break; 
                }
                if (A[i] < A[i-1] ) {
                    System.err.println("day tang dan ! ");
                }
            } while (A[i] < A[i-1]);
        }
        
        int x = 0; 
        System.out.print("Nhap X : ");
        x = new Scanner(System.in).nextInt(); 
        int k = 0; 
        for (int i = 0; i<n; i++){
            if (A[i] > x){
                k = i; 
                break; 
            }
        }
        for (int i = n-1 ; i>=k ; i--){
            A[i+1] = A[i]; 
        }
        A[k] = x; 
        n++; 
        Bai2.XuatMang(A, n);
    }
}
