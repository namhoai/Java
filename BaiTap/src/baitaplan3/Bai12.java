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
public class Bai12 {

    public static void main(String[] args) {
        // nhap 
        Matrix a = new Matrix(3, 3);
        a.input();
        a.print();
        Matrix b = new Matrix(3, 3);
        b.input();
        b.print();
        while (true) {
            System.out.print("1 : y1 \n2 : y2\n3 : y3\n4 : thoat\nBan chon : ");
            int i = new Scanner(System.in).nextInt();
            switch (i) {
                case 1:
                    System.out.println("Cong :");
                    Matrix kq1 = a.add(b);
                    kq1.print();
                    System.out.println("Tru : ");
                    Matrix kq2 = a.sub(b);
                    kq2.print();
                    break;
                case 2:
                    Matrix kq3 = a.mul(b);
                    kq3.print();
                    break;
                case 3:
                    a.transpose().print();
                    break;
                case 4:
                    System.exit(1);
            }
        }
    }
}
