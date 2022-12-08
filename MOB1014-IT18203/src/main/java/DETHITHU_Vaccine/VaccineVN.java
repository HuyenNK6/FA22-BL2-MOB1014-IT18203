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
public class VaccineVN extends Vaccine {

    private String quocGia;

    public VaccineVN() {
    }

    public VaccineVN(String quocGia) {
        this.quocGia = quocGia;
    }

    public VaccineVN(String quocGia, String maVC, String tenVC, float thoiGianTD, String ngayHetHan) {
        super(maVC, tenVC, thoiGianTD, ngayHetHan);
        this.quocGia = quocGia;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "VaccineVN{" + "quocGia=" + quocGia + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("quocGia=" + quocGia);
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap quoc gia= ");
        this.quocGia = sc.nextLine();
    }

}
