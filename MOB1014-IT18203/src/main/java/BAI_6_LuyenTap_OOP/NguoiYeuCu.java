/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_6_LuyenTap_OOP;

/**
 *
 * @author Khanh Huyen
 */
public class NguoiYeuCu {
    //1. private tất cả thuộc tính
    private String maNY;
    private String hoTen;
    private double vong1;
    private double vong2;
    private double vong3;
    //2. Constructor- hàm tạo
    //(ctrl + cách+ enter) x2
    // Constructor ko tham số

    public NguoiYeuCu() {
    }
    // Constructor có tham số
    public NguoiYeuCu(String maNY, String hoTen, double vong1, double vong2, double vong3) {
        this.maNY = maNY;
        this.hoTen = hoTen;
        this.vong1 = vong1;
        this.vong2 = vong2;
        this.vong3 = vong3;
    }
    // 3. Getter and Setter
//click chuột phải => insert code => getter & setter
    public String getMaNY() {
        return maNY;
    }

    public void setMaNY(String maNY) {
        this.maNY = maNY;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getVong1() {
        return vong1;
    }

    public void setVong1(double vong1) {
        this.vong1 = vong1;
    }

    public double getVong2() {
        return vong2;
    }

    public void setVong2(double vong2) {
        this.vong2 = vong2;
    }

    public double getVong3() {
        return vong3;
    }

    public void setVong3(double vong3) {
        this.vong3 = vong3;
    }
    ////click chuột phải => insert code => toString()

    @Override
    public String toString() {
        return "NguoiYeuCu{" + "maNY=" + maNY + ", hoTen=" + hoTen + ", vong1=" + vong1 + ", vong2=" + vong2 + ", vong3=" + vong3 + '}';
    }
    
    //in thông tin
    public void inThongTin(){
        System.out.println("--THONG TIN NYC--");
        System.out.println("Ma NY= "+maNY);
        System.out.println("Ho ten= "+ hoTen);
        System.out.println("Vong 1= "+ vong1);
        System.out.println("Vong 2= "+ vong2);
        System.out.println("Vong 3= "+ vong3);
        System.out.println("------------------");
        
    }
//nhapThongTin()
    
}
