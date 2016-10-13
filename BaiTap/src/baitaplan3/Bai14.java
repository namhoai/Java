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
public class Bai14 {

    public static void main(String[] args) {
        SoPhuc sp1 = new SoPhuc();
        System.out.println("Nhap so phuc thu 1 : ");
        sp1.nhap();
        SoPhuc sp2 = new SoPhuc();
        System.out.println("Nhap so phuc thu 2 : ");
        sp2.nhap();

        System.out.print("\nTong 2 so phuc : ");
        sp1.cong(sp2).hien();
        System.out.print("\nHieu 2 so phuc : ");
        sp1.tru(sp2).hien();
        System.out.print("\nTich 2 so phuc : ");
        sp1.nhan(sp2).hien();
        System.out.print("\nThuong 2 so phuc : ");
        sp1.chia(sp2).hien();
        System.out.print("\nNgich dao sp1 : ");
        sp1.nghichdao().hien();
        System.out.print("\nNgich dao sp2 : ");
        sp2.nghichdao().hien();
        if (sp1.bangnhau(sp2)) {
            System.out.println("\nhai so phuc bang nhau ! ");
        }
        if (sp1.lonhon(sp2)) {
            System.out.println("\nso phuc 1 lon hon so phuc 2 !");
        }
        if (sp1.nhohon(sp2)) {
            System.out.println("\nso phuc 1 nho hon so phuc 2 !");
        }
    }
}
