/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hoain
 */
public class Matrix {

    float a[][];

    public Matrix() {
        a = new float[3][3];
    }

    public float[][] getA() {
        return a;
    }

    public Matrix(int n, int m) {
        a = new float[n][m];
    }

    public void input() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("a[" + i + "][" + j + "] : ");
                a[i][j] = new Scanner(System.in).nextFloat();
            }
        }
    }

    public Matrix add(Matrix b) { // tra ve mot ma tran 
        Matrix kq = new Matrix();
        if (this.a.length == b.getA().length && this.a[0].length == b.getA()[0].length) {
            for (int i = 0; i < this.a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    kq.getA()[i][j] = a[i][j] + b.getA()[i][j];
                }
            }
            return kq;
        } else {
            return null;
        }
    }

    public Matrix sub(Matrix b) {
        Matrix kq = new Matrix();
        if (this.a.length == b.getA().length && this.a[0].length == b.getA()[0].length) {

            for (int i = 0; i < this.a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    kq.getA()[i][j] = a[i][j] - b.getA()[i][j];
                }
            }
            return kq;
        } else {
            return null;
        }
    }

    public Matrix transpose() {
        Matrix kq = new Matrix();
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                kq.getA()[i][j] = a[j][i];
            }
        }
        return kq;
    }

    public Matrix neg() {
        Matrix kq = new Matrix();
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                kq.getA()[i][j] = -1 * a[i][j];
            }
        }
        return kq;
    }

    public Matrix mul(Matrix m) {
        if (a[0].length != m.getA().length) {
            System.out.println(" khong hop le - khong nhan dk !");
            return null;
        }

        int r = a.length, c = m.getA()[0].length;
        Matrix kq = new Matrix(r, c);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                kq.getA()[i][j] = 0;
                for (int k = 0; k < a[0].length; k++) {
                    kq.getA()[i][j] += a[i][k] * m.getA()[k][j];
                }
            }
        }
        return kq;
    }

    public void print() {
        for (int i = 0; i < this.a.length; i++) {
            System.out.println(Arrays.toString(this.a[i]));
        }
    }
}
