/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan3;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

/**
 *
 * @author hoain
 */
public class MyPoint {

    double x;
    double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint mypoint) {
        MyPoint p = new MyPoint();
        p.x = mypoint.x;
        p.y = mypoint.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint p) {
        double a, b;
        a = Math.abs(this.x - p.x);
        b = Math.abs(this.y - p.y);
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        double a, b;
        a = Math.abs(p1.x - p2.x);
        b = Math.abs(p1.y - p2.y);
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    public void Nhap (){
        System.out.println ("Nhap Toa Do : ");
        System.out.print("X = ");
        this.x = new Scanner(System.in).nextDouble(); 
        System.out.print("Y = ");
        this.y = new Scanner(System.in).nextDouble(); 
    }
}
