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
public class Bai29 {

    public static void main(String[] args) {
        System.out.print("Nhap xau s1 : ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhap xau s2 : ");
        String s2 = new Scanner(System.in).nextLine();
        StringBuilder hop = new StringBuilder(s1);
        StringBuilder giao = new StringBuilder();
        StringBuilder hieu = new StringBuilder();
        for (int i = 0; i < s2.length(); i++) {
            if (chek(s1, s2.charAt(i))) {
                hop.append(s2.charAt(i));
                hieu.append(s2.charAt(i));
            } else {
                giao.append(s2.charAt(i));
            }
        }
        System.out.println("hop cua 2 xau : " + hop.toString());
        System.out.println("giao cua 2 xau : " + giao.toString());
        System.out.println("hieu cua 2 xau : " + hieu.toString());
    }

    public static boolean chek(String s, char a) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                return false;
            }
        }
        return true;
    }
}
