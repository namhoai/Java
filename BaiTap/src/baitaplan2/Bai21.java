/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan2;

/**
 *
 * @author hoain
 */
public class Bai21 {
    public static void main(String[] args) {
        for (int i = 100000; i<1000000 ; i++){
            if (ThuanNghich (i)){
                System.out.println(i);
            }
        }
    }

    public static boolean ThuanNghich(int i) {
        String s = i+""; 
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        
        if (s.equals(s2.toString())){
            return true; 
        }else {
            return false; 
        }
    }
    
}
