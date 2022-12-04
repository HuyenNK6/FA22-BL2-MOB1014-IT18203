/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_9_1_Ke_Thua;

/**
 *
 * @author Khanh Huyen
 */
public class SinhVien extends Nguoi{
    //LỚP CON
    //thuộc tính riêng
    private String msv;
    private String mailfpt;

    public SinhVien() {
    }
//Insert code => constructor
    public SinhVien(String msv, String mailfpt) {
        this.msv = msv;
        this.mailfpt = mailfpt;
    }

    public SinhVien(String msv, String mailfpt, String ten, int tuoi, String cccd, String diaChi) {
        super(ten, tuoi, cccd, diaChi);
        this.msv = msv;
        this.mailfpt = mailfpt;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getMailfpt() {
        return mailfpt;
    }

    public void setMailfpt(String mailfpt) {
        this.mailfpt = mailfpt;
    }

    @Override
    public String toString() {
        return super.toString()+ "SinhVien{" + "msv=" + msv + ", mailfpt=" + mailfpt + '}';
    }

    //ghi đè phương thức của lớp cha
    //Insert code => override method
    // tích chọn inThongTin();

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("MSV= "+ msv);
        System.out.println("Mail fpt= "+ mailfpt);
    }
  
    
    
}
