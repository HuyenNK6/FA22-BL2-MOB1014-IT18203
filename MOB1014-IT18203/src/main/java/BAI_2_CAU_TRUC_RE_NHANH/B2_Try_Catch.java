/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_2_CAU_TRUC_RE_NHANH;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class B2_Try_Catch {

    //psvm  + tab
    public static void main(String[] args) {
        /* try-catch => kiểm soát lỗi
        try + ctrl+ cách
                try{
                    //khối lệnh => có thể xảy ra lỗi
                }catch(Exception e){
                    //bắt lỗi của phần try
                }
        Lưu ý: trong quá trình code => chưa dùng try_catch
         */
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so luong NYC= ");
            int soLuongNYC = Integer.parseInt(sc.nextLine());
            //sc.nextInt();
            System.out.println("Ban co " + soLuongNYC + " NYC");
        } catch (Exception e) {
            System.out.println("Loi roi!!!!");
        }
    }
}
