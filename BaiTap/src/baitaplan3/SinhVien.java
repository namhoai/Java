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
public class SinhVien {
    int maSV ;
    String Ten; 
    String Lop; 
    String Khoa; 

    public SinhVien() {
    
    }
    
    public SinhVien(int maSV, String Ten, String Lop, String Khoa) {
        this.maSV = maSV;
        this.Ten = Ten;
        this.Lop = Lop;
        this.Khoa = Khoa;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }
    public void NhapSV (){
        System.out.print("Nhap MaSV : "); 
        maSV = new Scanner(System.in).nextInt(); 
        System.out.print("Nhap Ten : ");  
        Ten = new Scanner(System.in).nextLine(); 
        System.out.print("Nhap Lop : ");  
        Lop = new Scanner(System.in).nextLine(); 
        System.out.print("Nhap Khoa : ");
        Khoa  =  new Scanner(System.in).nextLine(); 
    }
    
    @Override
    public String toString() {
//        return super.toString();
        return maSV + "   " + Ten +"   " + Lop + "   " + Khoa; 
    }

//    public static int SoSanhTen (SinhVien Sv){
//        if (Ten==Sv.getTen()){
//            
//        }
//    }
}
