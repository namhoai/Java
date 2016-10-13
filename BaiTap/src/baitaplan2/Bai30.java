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
public class Bai30 {

    public static void main(String[] args) {
        System.out.print("Nhap xau s1 : ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhap xau s2 : ");
        String s2 = new Scanner(System.in).nextLine();
        StringBuilder s = new StringBuilder(s1);
        while (s.indexOf(s2) > 0) {
            int i = s.indexOf(s2);
            s.delete(i, i + s2.length());
        }
        System.out.println("ket qua : " + s);
    }
}
