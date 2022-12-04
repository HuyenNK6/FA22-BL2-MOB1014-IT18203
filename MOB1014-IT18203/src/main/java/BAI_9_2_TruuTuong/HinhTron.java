/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_9_2_TruuTuong;

/**
 *
 * @author Khanh Huyen
 */
public class HinhTron extends Hinh{
    private float banKinh;

    public HinhTron() {
    }

    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(float banKinh, String ten) {
        super(ten);
        this.banKinh = banKinh;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return super.toString()+ "HinhTron{" + "banKinh=" + banKinh + '}';
    }

    @Override
    public float tinhChuVi() {
       return (float) (2*Math.PI*banKinh);
    }

    @Override
    public float tinhDienTich() {
        return  (float) (Math.PI * Math.pow(banKinh, 2));
    }

   
}
