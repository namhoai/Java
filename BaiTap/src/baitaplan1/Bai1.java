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
public class Bai1 {

   
    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        int cc,cr; 
        System.out.print("Nhap chieu cao : ");
        cc = new Scanner(System.in).nextInt();  
        
        
        
        System.out.print("Nhap chieu rong : ");
        cr = new Scanner(System.in).nextInt();  
        
        for (int i = 0; i<cc; i++){
            for (int j = 0; j<cr ; j++){
                 System.out.print("*");   
            }
            System.out.println();
        }      
    }
}
