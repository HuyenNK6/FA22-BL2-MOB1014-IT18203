/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_7_BingChilling;

/**
 *
 * @author Khanh Huyen
 */
/*
 1. BillChilling 
            - id: int
            - gia: double
            - vi: String
            - noiSX: String
        => Constructor ko tham số và có tham số
        => Getter & Setter
        => toString() và inThongTin()
*/
public class BingChilling {
    private int id;
    private double gia;
    private String vi;
    private String noiSX;

    public BingChilling() {
    }

    public BingChilling(int id, double gia, String vi, String noiSX) {
        this.id = id;
        this.gia = gia;
        this.vi = vi;
        this.noiSX = noiSX;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    public String getNoiSX() {
        return noiSX;
    }

    public void setNoiSX(String noiSX) {
        this.noiSX = noiSX;
    }

    @Override
    public String toString() {
        return "BingChilling{" + "id=" + id + ", gia=" + gia + ", vi=" + vi + ", noiSX=" + noiSX + '}';
    }
    
    //inThongTin()
    //nhapThongTin()
}
