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
public class Bai22 {
    public static void main(String[] args) {
        String s = null;  
        System.out.print("Nhap Xau : ");
        s = new Scanner(System.in).nextLine(); 
        System.out.println("xau ban dau : " + s);
        StringBuilder s3 = new StringBuilder(); 
        for (int i = 0; i<s.length(); i++){
            String s1 = s.charAt(i)+"";
            String s2 = null;
            if (i%2==0){
                s2 = s1.toUpperCase(); 
            }else {
                s2 = s1.toLowerCase(); 
            }
            s3.append(s2); 
        }
        System.out.println("xau sau khi chuyen la : " + s3);
    }
}
