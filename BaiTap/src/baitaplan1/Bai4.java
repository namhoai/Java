/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan1;

import java.util.Scanner;

/**
 *
 * @author HOAI - NAM
 */
public class Bai4 {
    public static void main(String[] args) {
        int n; 
	   System.out.print("Nhap n : ");
           n = new Scanner(System.in).nextInt(); 
	for (int i = 1 ; i<= n ; i++){
		int k = 1; 
		for (int j = 1 ; j< (n + i) ; j++){
			if (j<(n-i+1)){
                            System.out.print(" ");
			}else {
				if (j<n){
                                    System.out.print(k++);
				}else {
                                    System.out.print(k--);
				}
			} 
		}
		System.out.println(); 
	}
    }
        
}
