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
public class Rectangle {
    double Width; 
    double height; 
    String color; 

    public Rectangle() {
        Width = 1;
        height = 1; 
    }

    public Rectangle(double Width, double height, String color) {
        this.Width = Width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double Width) {
        this.Width = Width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea (){
        // tinh dien tich 
        double dt = 0; 
        dt = Width*height; 
        return dt; 
    }
    public double findPerimeter (){
        // tinh chu vi 
        double cv ; 
        cv = 2*(Width+height); 
        return cv; 
    }
    void Nhap (){
        System.out.print("Nhap chieu rong : ");
        Width = new Scanner(System.in).nextDouble(); 
        System.out.print("Nhap chieu cao : ");
        height = new Scanner(System.in).nextDouble();
        System.out.print("Nhap mau sac : ");
        color = new Scanner(System.in).nextLine(); 
    }

    @Override
    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return Width + "   " + height + "   " + color +"   " + findArea() + "   " + findPerimeter();
    }
    
}
