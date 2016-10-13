/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoain
 */
public class Collection_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List ls = new ArrayList(); 
//        SinhVien sv = new SinhVien(100, "nam vu"); 
        for (int i = 0; i < 10; i++) {
            SinhVien sv = new SinhVien(i+1, "nam" + i);
            ls.add(sv); // them sinh vien 
        }
        // cách  viết tắt cho lệnh ở dưới là fore 
        for (Object get : ls) {
            if (get instanceof SinhVien){ // kiem tra xem get có phải thực thể SinhVien hay Không 
                SinhVien sv = (SinhVien)get; 
                System.out.println(sv);
            }
        }
//        vector cũng như arraylist 
//        set (set thì sử dụng Hashset )thì tương tự như list 
// để đánh dấu cho set hay list chỉ đó chỉ một loại dữ liệu thì ta sử dụng như sau  : list <SinhVien> ls = new .... 

    }
    
}
