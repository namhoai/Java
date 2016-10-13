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
public class Bai27 {
    public static void main(String[] args) {
        System.out.print("Nhap Họ Và Tên : " );
        String s = new Scanner(System.in).nextLine(); 
        StringTokenizer stk = new StringTokenizer(s);
        int n = stk.countTokens(); 
        int i = 1; 
        StringBuilder s2 = new StringBuilder(); 
        StringBuilder s3 = new StringBuilder(); 
        
        while (stk.hasMoreTokens()){
            if (i==n){
                String s1 = stk.nextToken();
                s3.append(s1);
                s3.append(" "); 
            }else {
               s2.append(stk.nextToken()); 
               s2.append(" ");
            }
            i++; 
        }
        s3.append(s2);
        System.out.println("Chuan Hoa Ten : " + s3);
    }
}
