/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_9_1_Ke_Thua;

/**
 *
 * @author Khanh Huyen
 */
public class GiangVien  extends Nguoi{
     //LỚP CON
    //thuộc tính riêng
    private String mgv;
    private String mailfe;

    public GiangVien() {
    }

    public GiangVien(String mgv, String mailfe) {
        this.mgv = mgv;
        this.mailfe = mailfe;
    }

    public GiangVien(String mgv, String mailfe, String ten, int tuoi, String cccd, String diaChi) {
        super(ten, tuoi, cccd, diaChi);
        this.mgv = mgv;
        this.mailfe = mailfe;
    }

  
    public String getMgv() {
        return mgv;
    }

    public void setMgv(String mgv) {
        this.mgv = mgv;
    }

    public String getMailfe() {
        return mailfe;
    }

    public void setMailfe(String mailfe) {
        this.mailfe = mailfe;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "mgv=" + mgv + ", mailfe=" + mailfe + '}';
    }
    
}
