/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_9_2_TruuTuong;

/**
 *
 * @author Khanh Huyen
 */
public abstract class Hinh {
    //abstact class
    //lớp trừu tượng do chứa phương thức trừu tượng
    private String ten;
    //phương thức trừu tượng
    //chưa có phần thân xử lý
    public abstract float tinhChuVi();
    public abstract float tinhDienTich();
    
    
    public Hinh() {
    }

    public Hinh(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "Hinh{" + "ten=" + ten + '}';
    }
    
    
}
