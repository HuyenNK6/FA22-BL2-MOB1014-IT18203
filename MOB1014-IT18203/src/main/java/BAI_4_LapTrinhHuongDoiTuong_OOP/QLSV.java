/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_4_LapTrinhHuongDoiTuong_OOP;

/**
 *
 * @author Khanh Huyen
 */
public class QLSV {
    public static void main(String[] args) {
        //psvm +tab
        //Khởi tạo đối tượng SV poly= constructor có tham số
        SinhVien svPoly= new SinhVien("PH12345", "HuyenNK6", 2004, 9);
        
        //Khởi tạo đối tượng SV poly= constructor KHÔNG tham số
        SinhVien sv= new SinhVien();
        sv.setMsv("PH6789");
        sv.setHoTen("Trung Duc");
        sv.setNamSinh(2005);
        sv.setDiem(2.5);
        //sout +tab
        //dùng getter
        svPoly.setHoTen("Khanh Huyen");
        System.out.println(svPoly.getHoTen());
        System.out.println(sv.getNamSinh());
        
        System.out.println(svPoly.toString());
        sv.inThongTin();
        
        

        
    }
}
