/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan1;

/**
 *
 * @author hoain
 */
public class Bai23 {
    public static void main(String[] args) {
        Bai17 b17 = new Bai17(); 
        Bai21 b21 = new Bai21(); 
        for (int i = 1000000 ; i< 1000000000 ; i++){
            if (ChuSo(i) && b17.kttn(i) && b21.ChekTong(i)){
                System.out.println(i); 
            }
        }
    }
    public static boolean ChuSo (int n){
         while (n>0){
            int k = n%10; 
            if (k != 0 && k != 6 && k != 8){
                return false; 
            }
            n= n/10; 
        }
        return true; 
    }
}
