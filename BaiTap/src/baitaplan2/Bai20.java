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
public class Bai20 {
    public static void main(String[] args) {
        System.out.print("Nhap n : ");
        int n = new Scanner(System.in).nextInt(); 
        
        System.out.print("Nhap b : ");
        int b = new Scanner(System.in).nextInt(); 
        
        System.out.println("Chuyen n-> co so b : " + chuyen(n,b));
        
    }

    private static String chuyen(int n, int b) {
        StringBuilder s = new StringBuilder();
        while(n>0){
            int du=n%b;
            if(du<10)
                s.append(du);
            else    
                s.append((char)(du-10+'a'));
            n=n/b;
        }
        s.reverse();
        return s.toString();
    }
}
