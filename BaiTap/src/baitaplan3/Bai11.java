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
public class Bai11 {
    public static void main(String[] args) {
        MyPoint p1=new MyPoint();
        MyPoint p2=new MyPoint();
        MyPoint p3=new MyPoint();
        System.out.println("Nhap toa do cua 3 dinh : ");
        p1.Nhap();p2.Nhap();p3.Nhap();
        double a=MyPoint.distance(p1, p2);
        double b=MyPoint.distance(p1, p3);
        double c=MyPoint.distance(p2, p3);
//        System.out.println(a + " " + b + " " + c);
        boolean ok = false; 
        if(a+b<c||a+c<b||b+c<a){
            System.out.println("khong phai tam giac !");
            ok = true; 
        }
        if(a==b||a==c||b==c){
            System.out.println("tam giac can !");
            ok = true; 
        }
        if(a==b && b==c){
            System.out.println("tam giac deu !");
            ok = true; 
        }
        if (!ok){
            System.out.println("tam giac thuong !");
        }
    }
}
