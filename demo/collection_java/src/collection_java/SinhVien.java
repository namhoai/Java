/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_java;

/**
 *
 * @author hoain
 */
public class SinhVien {
    int maSV; 
    String ten; 

    public SinhVien() {
    }

    public SinhVien(int maSV, String ten) {
        this.maSV = maSV;
        this.ten = ten;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", ten=" + ten + '}';
    }
    
}
