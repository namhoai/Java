/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan1;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.sqrt;
import java.util.Scanner;

/**
 *
 * @author hoain
 */
public class Bai18 {
    public static void main(String[] args) {
        int m ; 
        int n; 
        do {
            System.out.print("Nhap n : ");
            n = new Scanner (System.in).nextInt(); 
            System.out.print("Nhap m : ");
            m = new Scanner (System.in).nextInt();
            if (m>n) {
                System.out.println("sai roi !");
            }
        } while (m>n);
        for (int i = m ; i<n ; i++){
            if (ktcp(i)){
                System.out.println(i);
          }
        }
    }
    public static boolean ktcp (int n){
       float k = n; 
       int m = (int) sqrt (n);
       float h = m*m; 
       if (h == k) {
           return true; 
       }else {
           return false; 
       }
    }
}
