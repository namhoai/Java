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
public class Bai23 {

    public static void main(String[] args) {
        System.out.print("Nhap so thu nhat : ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhap so thu hai : ");
        String s2 = new Scanner(System.in).nextLine();
        if (s1.length() >= s2.length()) {
            System.out.println("Tong : " + Tong(s1, s2));
            System.out.println("Hieu : " + Hieu(s1, s2));
        } else {
            System.out.println("Tong : " + Tong(s1, s2));
            System.out.println("Hieu : " + Hieu(s1, s2));
        }
        System.out.println("Tich : "+ tich(s1, s2));
    }
    public static String Tong(String s1, String s2) {
        StringBuilder x = new StringBuilder(s1);
        StringBuilder y = new StringBuilder(s2);
        x.reverse();
        y.reverse();
        StringBuilder kq = new StringBuilder();
        int m = x.length();
        int n = y.length();
        for (int i = 0; i < m - n; i++) {
            y.append('0');
        }

        int nho = 0, t = 0;
        for (int i = 0; i < m; i++) {
            t = (x.charAt(i) - '0') + (y.charAt(i) - '0') + nho;
            nho = t / 10;
            t = t % 10;
            kq.append(t);

        }
        if (nho > 0) {
            kq.append(nho);
        }
        kq.reverse();
        return kq.toString();
    }

    public static String Hieu(String s1, String s2) {
        StringBuilder x = new StringBuilder(s1);
        StringBuilder y = new StringBuilder(s2);
        x.reverse();
        y.reverse();
        StringBuilder kq = new StringBuilder();
        int m = x.length();
        int n = y.length();
        for (int i = 0; i < m - n; i++) {
            y.append('0');
        }
        int nho = 0, t;
        for (int i = 0; i < m; i++) {
            t = (x.charAt(i) - '0') - (y.charAt(i) - '0') - nho;
            if (t < 0) {
                t = t + 10;
                nho = 1;
                kq.append(t);
            } else {
                kq.append(t);
                nho = 0;
            }

        }
        kq.reverse();
        return kq.toString();
    }

    public static String tich(String s1, String s2) {

        String kq = new String();
        String st = new String();
        int m = s2.length();
        for (int i = 0; i < m; i++) {
            int a = s2.charAt(i) - '0';
            st = Nhan10(Nhan(s1, a), m - i - 1);

            if (kq.length() < st.length()) {
                kq = Tong(st, kq);
            } else {
                kq = Tong(kq, st);
            }
        }
        return kq;
    }

    public static String Nhan10(String s, int n) {
        StringBuilder st = new StringBuilder(s);
        while (n > 0) {
            st.append('0');
            n--;
        }
        return st.toString();
    }

    public static String Nhan(String s, int n) {
        StringBuilder st = new StringBuilder(s);
        st.reverse();
        StringBuilder kq = new StringBuilder();
        int nho = 0, t;
        for (int i = 0; i < st.length(); i++) {
            t = (st.charAt(i) - '0') * n + nho;
            nho = t / 10;
            t = t % 10;
            kq.append(t);
        }
        if (nho > 0) {
            kq.append(nho);
        }
        kq.reverse();
        return kq.toString();
    }
}
