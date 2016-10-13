/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author hoain
 */
public class Bai28 {

    public static void main(String[] args) {
        System.out.print("Nhap Xau : ");
        String s = new Scanner(System.in).nextLine();
        String[] s1 = new String[100];
        int k = 0;
        StringTokenizer stk = new StringTokenizer(s);
        while (stk.hasMoreTokens()) {
            s1[k++] = stk.nextToken();
        }
        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (s1[i].compareTo(s1[j]) > 0) {
                    String temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                }
            }
        }
        System.out.print("sap xep theo alphabet : ");
        for (int i = 0; i < k; i++) {
            System.out.print(s1[i] + "   ");
        }
    }
}
