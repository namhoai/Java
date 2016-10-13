/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author hoain
 */
public class Bai25 {
    public static void main(String[] args) {
        System.out.print("Nhap Xau : " );
        String s = new Scanner(System.in).nextLine();
        StringTokenizer stk= new StringTokenizer(s); 
        int max = 0;
        String s2 = null;
        int p = 0; 
        int i = 1; 
        while (stk.hasMoreTokens()) {
            String s1 = stk.nextToken(); 
            int L = s1.length();
            if (L>max){
                s2 = s1; 
                p = i; 
            }
            i++; 
        }
        System.out.println("Tu dai nhat trong xau la " + s2);
        System.out.println("Tu thu " + p + " cau xau");
    }
}
