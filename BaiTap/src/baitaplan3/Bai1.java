/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan3;

/**
 *
 * @author hoain
 */
public class Bai1 {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien(); 
        sv.NhapSV();
        System.out.println("MaSV   Ten   Lop   Khoa");
        System.out.println("\t"+sv.toString()); 
    }
}
