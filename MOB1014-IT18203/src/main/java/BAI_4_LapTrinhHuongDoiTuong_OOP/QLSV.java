/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_4_LapTrinhHuongDoiTuong_OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class QLSV {

    public static void main(String[] args) {
        //psvm +tab
        //Khởi tạo đối tượng SV poly= constructor có tham số
        SinhVien svPoly = new SinhVien("PH12345", "HuyenNK6", 2004, 9);

        //Khởi tạo đối tượng SV poly= constructor KHÔNG tham số
        SinhVien sv = new SinhVien();
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
        
        Scanner sc = new Scanner(System.in);
        //Danh sách sinh viên
        //1. Khởi tạo danh sách SV
        ArrayList<SinhVien> lstSV = new ArrayList<>();
        //2. Thêm đối tượng vào danh sách SV
        lstSV.add(svPoly);
        lstSV.add(sv);
        //nhập số lượng SV cần thêm vào
        System.out.println("Nhap so luong SV n= ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            SinhVien svien = new SinhVien();
            System.out.println("Nhap msv: ");//nhập mã sv
            String msv = sc.nextLine();
            svien.setMsv(msv);
            
            System.out.println("Nhap ho ten: ");//nhập họ tên
            String hoTen = sc.nextLine();
            svien.setHoTen(hoTen);
            
            System.out.println("Nhap nam sinh: ");//nhập năm sinh
            int namSinh = Integer.parseInt(sc.nextLine());
            svien.setNamSinh(namSinh);
            
            System.out.println("Nhap diem: ");//nhập năm sinh
            double diem = Double.parseDouble(sc.nextLine());
            svien.setDiem(diem);
            
            lstSV.add(svien);
        }
        //3. Duyệt toàn bộ phần tử trong danh sách SV
        //fore+ tab
        for (SinhVien sinhVien : lstSV) {
            System.out.println(sinhVien.toString());
        }
        
    }
}
