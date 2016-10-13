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
public class Bai13 {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(); 
        System.out.println("Nhap phan so thu 1 : ");
        ps1.nhap();
        PhanSo ps2 = new PhanSo(); 
        System.out.println("Nhap phan so thu 2 : ");
        ps2.nhap();
        // tinh tong 
        System.out.print("\nTong 2 phan so : ");
        ps1.cong(ps2).toigian().hien();
        System.out.print("\nHieu 2 phan so : ");
        ps1.tru(ps2).hien();
        System.out.print("\nTich 2 phan so : ");
        ps1.nhan(ps2).toigian().hien();
        System.out.print("\nThuong 2 phan so : ");
        ps1.chia(ps2).toigian().hien();
        // 
        System.out.print("\nToi gian ps1 : ");
        ps1.toigian().hien();
        System.out.print("\nToi gian ps2 : ");
        ps2.toigian().hien();
        if (ps1.bangnhau(ps2)){
            System.out.println("\nhai phan so bang nhau ! ");
        }
        if (ps1.lonhon(ps2)){
            System.out.println("\nphan so 1 lon hon phan so 2 !");
        }
        if (ps1.nhohon(ps2)){
            System.out.println("\nphan so 1 nho hon phan so 2 !");
        }
    }
}
