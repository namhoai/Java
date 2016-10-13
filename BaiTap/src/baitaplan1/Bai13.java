/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author HOAI - NAM
 */
public class Bai13 {
    public static void main(String[] args) {
        int n = 0; 
        System.out.print("Nhap N : ");
        n = new Scanner(System.in).nextInt();
        System.out.print(""+ n + " = ");
        int i = 2; 
        while (n > 1){
            if (chek(n)) {
                System.out.print(n);
                break; 
            }
            if (chek (i)){
                if (n%i==0){
                    System.out.print(i + " * ");
                    n = n/i; 
                }else {
                    i++; 
                }
            }else {
                i++; 
            }
        }
    }
    public static boolean chek(int n){
        for (int i = 2; i<=sqrt (n); i++){
            if (n%i==0){
                return false; 
            }
        }
        return true; 
    } 
}
