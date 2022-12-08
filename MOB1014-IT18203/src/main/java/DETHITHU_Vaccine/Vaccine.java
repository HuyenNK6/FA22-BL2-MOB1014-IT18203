/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DETHITHU_Vaccine;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class Vaccine {
    //thuộc tính
    private String maVC;
    private String tenVC;
    private float thoiGianTD;
    private String ngayHetHan;
    //constructor

    public Vaccine() {
    }

    public Vaccine(String maVC, String tenVC, float thoiGianTD, String ngayHetHan) {
        this.maVC = maVC;
        this.tenVC = tenVC;
        this.thoiGianTD = thoiGianTD;
        this.ngayHetHan = ngayHetHan;
    }
    
    //get-set

    public String getMaVC() {
        return maVC;
    }

    public void setMaVC(String maVC) {
        this.maVC = maVC;
    }

    public String getTenVC() {
        return tenVC;
    }

    public void setTenVC(String tenVC) {
        this.tenVC = tenVC;
    }

    public float getThoiGianTD() {
        return thoiGianTD;
    }

    public void setThoiGianTD(float thoiGianTD) {
        this.thoiGianTD = thoiGianTD;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    // toString

    @Override
    public String toString() {
        return "Vaccine{" + "maVC=" + maVC + ", tenVC=" + tenVC + ", thoiGianTD=" + thoiGianTD + ", ngayHetHan=" + ngayHetHan + '}';
    }
    
    public void inThongTin(){
        System.out.println("maVC=" + maVC + ", tenVC=" + tenVC + ", thoiGianTD=" + thoiGianTD + ", ngayHetHan=" + ngayHetHan);
    }
    public void nhapThongTin(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ma vc= ");
        this.maVC= sc.nextLine();
        System.out.print("Nhap ten vc= ");
        this.tenVC= sc.nextLine();
        System.out.print("Nhap thoi gian TD= ");
        this.thoiGianTD= Float.parseFloat(sc.nextLine());
        System.out.print("Nhap ngay het han= ");
        this.ngayHetHan= sc.nextLine();
    }
}
