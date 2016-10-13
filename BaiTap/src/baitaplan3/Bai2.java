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
public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhap So luong SV them : ");
        int n = new Scanner(System.in).nextInt(); 
        SinhVien []DS = new SinhVien[n];
        for (int i = 0; i < DS.length; i++) {
            System.out.println("Nhap Sinh Vien Thu " + (i+1));
            DS[i] = new SinhVien();
            DS[i].NhapSV();
        }
        System.out.println("----DANH SACH SINH VIEN----");
        System.out.println("MaSV   Ten   Lop   Khoa");
        for (int i = 0; i < DS.length; i++) {
            System.out.println(DS[i].toString());
        }
        // sap xep theo ten 
//        for (int )
        // in theo lop 
    }
}
