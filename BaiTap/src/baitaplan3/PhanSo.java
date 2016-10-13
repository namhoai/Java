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
public class PhanSo {

    int ts;
    int ms;

    public PhanSo() {
        ts = 0;
        ms = 1;
    }

    public PhanSo(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }

    public PhanSo cong(PhanSo ps) {
        PhanSo kq = new PhanSo();
        kq.ms = this.ms * ps.ms;
        kq.ts = this.ms * ps.ts + this.ts * ps.ms;
        return kq;
    }

    public PhanSo tru(PhanSo ps) {
        PhanSo kq = new PhanSo();
        kq.ms = this.ms * ps.ms;
        kq.ts = this.ms * ps.ts - this.ts * ps.ms;
        return kq;
    }

    public PhanSo nhan(PhanSo ps) {
        PhanSo kq = new PhanSo();
        kq.ms = this.ms * ps.ms;
        kq.ts = this.ts * ps.ts;
        return kq;
    }

    public PhanSo nghichdao() {
        PhanSo kq = new PhanSo();
        kq.ms = this.ts;
        kq.ts = this.ms;
        return kq;
    }

    public PhanSo chia(PhanSo ps) {
        PhanSo ps1 = new PhanSo();
        ps1 = ps.nghichdao();
        return this.nhan(ps1);
    }
    
    public PhanSo doidau (PhanSo ps){
        PhanSo ps1 = new PhanSo(); 
        ps1.ts = this.ts*(-1);
        ps1.ms = this.ms; 
        return ps1; 
    }
    
    public PhanSo toigian() {
        PhanSo kq = new PhanSo();
        int n = uoc(this.ms, this.ts);
        kq.ms = this.ms / n;
        kq.ts = this.ts / n;
        return kq;
    }

    public boolean bangnhau (PhanSo ps) {
        if (this.tru(ps).ts == 0) {
            return true;
        }
        return false;
    }

    public boolean lonhon (PhanSo ps) {
        if (this.tru(ps).ts > 0) {
            return true;
        }
        return false;
    }

    public boolean nhohon (PhanSo ps) {
        if (this.tru(ps).ts < 0) {
            return true;
        }
        return false;
    }

    public void hien() {
        System.out.printf("%d/%d", this.ts, this.ms);
    }

    public static int uoc(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public void nhap() {
        System.out.print("Tu so : ");
        this.ts = new Scanner(System.in).nextInt();
        System.out.print("Mau so : ");
        this.ms = new Scanner(System.in).nextInt();
    }
}
