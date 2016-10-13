
package giainhdt;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.Scanner;

/**
 *
 * @author HOAI - NAM
 */
public class Nguoi {
    private String ten; 
    private String diaChi;
    private String soDT;

    public Nguoi(String ten, String diaChi, String soDT) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
    void NhapN (){
        System.out.print("Nhap Ten : "); 
//        Scanner n = new Scanner((Readable) String); 
        System.out.print("Nhap Dia Chi : ");
        System.out.print("Nhap So DT : ");
        
    }
    void XuatN (){
        System.out.print("Nhap Ten : " + ten);  
        
        System.out.print("Nhap Dia Chi : " + diaChi);
        System.out.print("Nhap So DT : " + soDT);
    }
}
