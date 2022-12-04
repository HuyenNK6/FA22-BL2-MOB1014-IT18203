/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_9_1_Ke_Thua;

/**
 *
 * @author Khanh Huyen
 */
public class Nguoi {
    //thuộc tính chung
    //LỚP CHA
    private String ten;
    private int tuoi;
    private String cccd;
    private String diaChi;
    
    //cons

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, String cccd, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.cccd = cccd;
        this.diaChi = diaChi;
    }
    //get set

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "ten=" + ten + ", tuoi=" + tuoi + ", cccd=" + cccd + ", diaChi=" + diaChi + '}';
    }
    
    public void inThongTin(){
        System.out.println("====THONG TIN=====");
        System.out.println("Ho ten= "+ ten);
        System.out.println("Tuoi= "+ tuoi);
        System.out.println("CCCD= "+ cccd);
        System.out.println("Dia chi= "+ diaChi);
    }
}
