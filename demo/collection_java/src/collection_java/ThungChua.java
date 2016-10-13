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

// tạo ra một thứ giống như list hoặc set ........... 

public class ThungChua <T extends SinhVien>{ // thêm điều kiện cho T (các thứ truyền vào) là - phải là ojbect và nó phải extends từ SinhVien
    public SinhVien sv; 

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }
}
