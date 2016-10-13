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
public class Bai7 {
    
    public static void main(String[] args) {
        int n; 
        System.out.print("Nhap n : ");
        n = new Scanner(System.in).nextInt(); 
        if (n%2==0){
            System.out.println("s : " + Tinh(n));
        }else {
            int k = Tinh(n+1);
            int s = k - (n/2 +1); 
            System.out.println("s : " + s);
        }
    }
    // hàm static mà muốn dùng hàm khác thì hàm đó cũng phải là hàm static 
    public static int Tinh (int n){
        int s = 0;
        int k = n/2; 
        s = k*(k+1); 
        return s; 
    }
}
