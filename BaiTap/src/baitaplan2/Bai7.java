/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan2;

import static baitaplan2.Bai2.XuatMang;
import java.util.Random;

/**
 *
 * @author hoain
 */
public class Bai7 {

    public static void main(String[] args) {
        int n = 0;
        Random random = new Random();
        n = random.nextInt(100);
        System.out.println("n = " + n);
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = new Random().nextInt(100);
        }
        
        System.out.print("Mang ban dau la : ");
        XuatMang(A, n);
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (A[i] > A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        System.out.print("Mang sau khi sap xep la : ");
        XuatMang(A, n);

        int k = 0;
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            boolean ok = true;
            for (int j = 0; j < k; j++) {
                if (A[i] == B[j]) {
                    ok = false;
                }
            }
            if (ok) {
                B[k++] = A[i];
            }
        }

        System.out.println("so phan tu khac nhau : " + k);
        System.out.println("Danh sach so lan xh cua cac phan tu : ");
        for (int i = 0; i < k; i++) {
            System.out.print(B[i] + "   ");
        }

    }
}
