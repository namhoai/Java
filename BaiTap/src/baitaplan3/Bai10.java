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
public class Bai10 {

    public static void main(String[] args) {
        System.out.print("Nhap so diem : ");
        int n = new Scanner(System.in).nextInt();
        MyPoint DS[] = new MyPoint[100];
        for (int i = 0; i < n; i++) {
            System.out.println("Dien Thu " + (i+1));
            DS[i] = new MyPoint();
            DS[i].Nhap();
        }
        double m = 0;
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (DS[i].distance(DS[j]) > m) {
                    m = DS[i].distance(DS[j]);
                    p1 = DS[i];
                    p2 = DS[j];
                }
            }
        }
        System.out.println("Khoang cach lon nhat la : " + MyPoint.distance(p1, p2));
    }
}
