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
public class Bai7 {

    public static void main(String[] args) {
        StackOfChars st = new StackOfChars();
        String ht = "";
        String s;
        System.out.print("Nhap Bieu thuc can tinh : ");
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
//        System.out.println(ht);
        StackOfIntergers stk = new StackOfIntergers();
        for (int i = 0; i < ht.length(); i++) {
            char c = ht.charAt(i);
            if (c >= '0' && c <= '9') {
                stk.push(c - '0');
            } else {
                int so1 = stk.pop();
                int so2 = stk.pop();
                switch (c) {
                    case '+':
                        stk.push(so2 + so1);
                        break;
                    case '-':
                        stk.push(so2 - so1);
                        break;
                    case 'x':
                        stk.push(so2 * so1);
                        break;
                    case '/':
                        stk.push(so2 / so1);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println("KQ : " + stk.pop());
    }
}
