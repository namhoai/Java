/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan1;

import java.util.Scanner;

/**
 *
 * @author hoain
 */
public class Bai21 {
    public static void main(String[] args) {
        Bai17 b17 = new  Bai17(); 
        System.out.println("cac so thoa man dk bai ra : ");
        for (int i = 100000 ; i<1000000 ; i++){
            if (b17.kttn(i) && ChekTong(i)){
                System.out.println(i);
            }
        }
        
    }
    public static boolean ChekTong (int n){
        int s = 0; 
        while (n>0){
            int k = n%10; 
            n = n/10;
            s +=  k; 
        }
        if (s%10==0){
            return true; 
        }else {
            return false; 
        }
    }
}
