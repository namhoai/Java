/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HOAI - NAM
 */
public class Bai6 {
    public static void main(String[] args) {
        int n = 0;
        do {
            System.out.println("Nhap n : ");    
            n = new Scanner(System.in).nextInt(); 
            if (n<10 || n>99){
                System.out.println("Nhap Sai roi <10 - 99>!");
            }
        }while (n<10 || n>99); 
        int kt,rd;
        while (true){
            rd = new Random().nextInt(89) + 10; 
            if (rd != n){
                System.out.println(""+ n + " khac " + rd);
            }else {
                System.out.println(""+ n + " bang " + rd);
                break;
                        
            }
        }
    }
}
