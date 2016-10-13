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
public class SoPhuc {

    double a;
    double b;

    public SoPhuc() {
        a = 0;
        b = 0;
    }

    public SoPhuc(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public SoPhuc cong(SoPhuc sp) {
        SoPhuc kq = new SoPhuc();
        kq.a = this.a + sp.a;
        kq.b = this.b + sp.b;
        return kq;
    }

    public SoPhuc tru(SoPhuc sp) {
        SoPhuc kq = new SoPhuc();
        kq.a = this.a - sp.a;
        kq.b = this.b - sp.b;
        return kq;
    }

    public SoPhuc nhan(SoPhuc sp) {
        SoPhuc kq = new SoPhuc();
        kq.a = this.a * sp.a - this.b + sp.b;
        kq.b = this.b * sp.a + this.a * sp.b;
        return kq;
    }

    public SoPhuc nghichdao() {
        SoPhuc kq = new SoPhuc();
        double m = Math.pow(this.a, 2) + Math.pow(this.b, 2);
        kq.a = this.a / m;
        kq.b = -1 * this.b / m;
        return kq;
    }

    public SoPhuc chia(SoPhuc sp) {
        SoPhuc kq = new SoPhuc();
        kq = this.nhan(sp.nghichdao());
        return kq;
    }

    public void nhap() {
        System.out.print("phan thuc : ");
        this.a = new Scanner(System.in).nextDouble();
        System.out.print("phan ao : ");
        this.b = new Scanner(System.in).nextDouble();
    }

    public boolean bangnhau(SoPhuc sp) {
        double m = Math.pow(this.a, 2) + Math.pow(this.b, 2);
        double n = Math.pow(sp.a, 2) + Math.pow(sp.b, 2);
        if (m == n) {
            return true;
        }
        return false;
    }

    public boolean lonhon(SoPhuc sp) {
        double m = Math.pow(this.a, 2) + Math.pow(this.b, 2);
        double n = Math.pow(sp.a, 2) + Math.pow(sp.b, 2);
        if (m > n) {
            return true;
        }
        return false;
    }

    public boolean nhohon(SoPhuc sp) {
        double m = Math.pow(this.a, 2) + Math.pow(this.b, 2);
        double n = Math.pow(sp.a, 2) + Math.pow(sp.b, 2);
        if (m < n) {
            return true;
        }
        return false;
    }

    public void hien() {
        System.out.printf(" %.3f + %.3fi", a, b);
    }
}
