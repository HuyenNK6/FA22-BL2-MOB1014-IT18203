/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_9_2_TruuTuong;

/**
 *
 * @author Khanh Huyen
 */
public class Main {
    public static void main(String[] args) {
        Hinh hinhTron= new HinhTron(3, "hinh tron");
        Hinh hinhVuong= new HinhVuong(5, "hinh vuong");
        
        System.out.println(hinhTron.toString());
        System.out.println("Chu vi hinh tron= "+ hinhTron.tinhChuVi());
        System.out.println("Dien tich hinh tron= "+ hinhTron.tinhDienTich());
        
        System.out.println(hinhVuong.toString());
        System.out.println("Chu vi hinh vuong= "+ hinhVuong.tinhChuVi());
        System.out.println("Dien tich hinh vuong= "+ hinhVuong.tinhDienTich());
        
        HinhTron hinhTron2= new HinhTron(3, "hinh tron");
        HinhVuong hinhVuong2= new HinhVuong(5, "hinh vuong");
    }
}
