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
public class Bai2 {
    
    public static void main(String[] args) {
         int cc,cr; 
        System.out.print("Nhap chieu cao : ");
        cc = new Scanner(System.in).nextInt();  
        
        System.out.print("Nhap chieu rong : ");
        cr = new Scanner(System.in).nextInt();  
        
        for (int i = 0; i<cc; i++){
            for (int j = 0; j<cr ; j++){
                if (i==0 || i==(cc-1)){
                    System.out.print("*");
                }else {
                    if (j==0 || j==cr-1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }     
    }
}
