/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_9_2_TruuTuong;

/**
 *
 * @author Khanh Huyen
 */
public class HinhVuong extends Hinh{
    private int canh;

    public HinhVuong() {
    }

    public HinhVuong(int canh) {
        this.canh = canh;
    }

    public HinhVuong(int canh, String ten) {
        super(ten);
        this.canh = canh;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return super.toString()+ "HinhVuong{" + "canh=" + canh + '}';
    }

    @Override
    public float tinhChuVi() {
        return canh* 4;
    }

    @Override
    public float tinhDienTich() {
        return canh* canh;
    }
    
}
