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
public class Bai24 {
//    Bai13 b13 = new  Bai13();
    public static void main(String[] args) {
        
        for (int i = 1000000 ; i< 10000000 ; i++){
            if (Bai13.chek(i) && KTSO(i) && KTDAO (i)){
                  System.out.println(i);
            }
        }
    }

    public static boolean KTSO(int i) {
        while (i>0){
            int k = i%10; 
            if (!Bai13.chek(k)){
                return false; 
            }
            i = i/10; 
        }
        return true; 
    }

    public static boolean KTDAO(int i) {
        int dao = 0; 
        while (i>0){
            dao = dao*10 + (i%10); 
            i = i/10; 
        }
        if (Bai13.chek(dao)){
            return true; 
        }else {
            return false; 
        }
    }
}
