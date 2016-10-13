/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan1;

/**
 *
 * @author HOAI - NAM
 */
public class Bai17 {
    public static void main(String[] args) {
        System.out.println("cac so thuan ngich co 6 chu so ! ");
        for (int i = 100000 ; i<1000000 ; i++){
            if (kttn(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean kttn (int n){
        int k = n ; 
        int dao = 0; 
        while (n>0){
            dao = dao*10 + (n%10); 
            n = n/10; 
        }
        if (k == dao){
            return true;
        }else {
            return false; 
        }
    }
}
