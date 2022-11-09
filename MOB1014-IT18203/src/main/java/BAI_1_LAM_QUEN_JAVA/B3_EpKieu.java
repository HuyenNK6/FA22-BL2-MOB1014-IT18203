/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_1_LAM_QUEN_JAVA;

/**
 *
 * @author Khanh Huyen
 */
public class B3_EpKieu {

    public static void main(String[] args) {
        /*
            1. Ép kiểu:
                Việc gán giá trị của biến này sang biến khác có kiểu DL khác
            2. Các loại ép kiểu:
                - Nới rộng (Widening): kiểu DL từ nhỏ => lớn
                    => thông tin ko mất đi
                - Thu hẹp (Narrowing): kiểu DL từ lớn => nhỏ
                    => thông tin sẽ mất đi
         */
        //1. Ép kiểu giữa các số
        int a = 10;
        double b = 8.6;
        b = a; //ép kiểu ngầm định
        a = (int) b; //ép kiểu tường minh
        System.out.println("a= " + a);
        
        // 2. Ép kiểu từ String về số
        String luong= "2000", thuong = "1000";
        String tong= luong + thuong;
        //sout+tab
        System.out.println("Tong la: "+ tong);
        int ketQua= Integer.parseInt(luong)+ Integer.parseInt(thuong);
        System.out.println("Ket qua la: "+ ketQua);
        
        String diem="9.2";
        double score= Double.parseDouble(diem);
        /*
        các kiểu ép từ String về số
        - Integer.parseInt(<String>)
        - Double.parseDouble(<String>)
        - Float.parseFloat(<String>)
        - Byte.parseByte(<String>)....
        */
    }
    
}
