/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_8_Chuoi_BieuThucChinhQuy;

/**
 *
 * @author Khanh Huyen
 */
public class Main {
    public static void main(String[] args) {
        ChuoiServices cs= new ChuoiServices();
        String hoTen= cs.checkInputChu("ho va ten");
        System.out.println("Ho ten ="+ hoTen);
        int tuoi= cs.checkInputSo("tuoi");
        System.out.println("Tuoi = "+ tuoi);
        int namSinh=  cs.checkInputSo("nam sinh");
        System.out.println("Nam sinh = "+ namSinh);
        String sdt= cs.checkInputSoDT("so dien thoai");
        System.out.println("SDT= "+ sdt);
        String ngaySinh= cs.checkInputNgay("ngay sinh");
        System.out.println("Ngay sinh= "+ ngaySinh);
    }
}
