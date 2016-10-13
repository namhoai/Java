/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan3;

import java.util.Scanner;

/**
 *
 * @author hoain
 */
public class Bai8 {

    public static void main(String[] args) {
        StackOfChars st = new StackOfChars();
        String ht = "";
        String s;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap bieu thuc trung to : ");
        s = new Scanner(System.in).nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(c);
            }
            if (c >= '0' && c <= '9') {
                ht += c;
            }
            if (c == '+' || c == '-' || c == 'x' || c == '/') {
                char c1 = st.peak();
                if (Mucuutien(c1) >= Mucuutien(c)) {
                    ht += st.pop();
                }
                st.push(c);
            }
            if (c == ')') {
                while (true) {
                    char c1 = st.pop();
                    if (c1 == '(') {
                        break;
                    }
                    ht += c1;
                }
            }
        }
        while (!st.IsEmpty()) {
            ht += st.pop();
        }
        System.out.println("hau to = " + ht);
    }

    public static int Mucuutien(char s) {
        if (s == '+' || s == '-') {
            return 0;
        }
        if (s == '/' || s == 'x') {
            return 1;
        }
        return -1;
    }
}
