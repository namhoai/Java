/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan2;

import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author hoain
 */
public class Bai24 {
    public static void main(String[] args) {
        String s = null; 
        System.out.print("Nhap Xau : ");
        s = new Scanner(System.in).nextLine(); 
        StringTokenizer stk = new StringTokenizer(s, " ,.:*)(!?/|]["); 
        StringBuilder s4 = new StringBuilder();
        while (stk.hasMoreTokens()){
            String s1 = stk.nextToken()+""; 
            for (int i = 0 ; i<s1.length(); i++){
                String s2 = s1.charAt(i)+"";
                if (i==0){
                    String s3 = s2.toUpperCase();
                    s4.append(s3); 
                }else {
                    String s3 = s2.toLowerCase(); 
                    s4.append(s3); 
                }
            }
            s4.append(" "); 
        }
        System.out.println("xau sau khi chuan hoa : " + s4);
    }
}
