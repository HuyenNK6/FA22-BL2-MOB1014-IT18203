/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_9_1_Ke_Thua;

/**
 *
 * @author Khanh Huyen
 */
public class Main {
    public static void main(String[] args) {
        //1. khởi tạo đối tượng SV = constructor full tham số
        SinhVien sv1= new SinhVien("PH1", "ph1@fpt", "Son", 18, "0123", "HN");
        //2. khởi tạo đối tượng SV = constructor ko tham số
        SinhVien sv2= new SinhVien();
        sv2.setMsv("PH2");
        sv2.setMailfpt("ph2@fpt");
        sv2.setTen("Linh");
        sv2.setTuoi(20);
        sv2.setCccd("4567");
        sv2.setDiaChi("SG");
        
        System.out.println("SV1: "+ sv1.toString());
        System.out.println("SV2: "+ sv2.toString());
    
        sv1.inThongTin();
        sv2.inThongTin();
    
    }
}
