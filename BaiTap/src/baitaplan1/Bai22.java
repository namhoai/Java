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
public class Bai22 {
    public static void main(String[] args) {
        Bai13 b13 = new Bai13(); 
        System.out.println("danh sach so thoa mam dk bai ra : ");
        for (int i = 100000 ; i<1000000 ; i++){
            if (b13.chek(i) && KTLE(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean KTLE (int n){
        while (n>0){
            int k = n%10; 
            if (k%2 == 0){
                return false; 
            }
            n= n/10; 
        }
        return true; 
    }
}
