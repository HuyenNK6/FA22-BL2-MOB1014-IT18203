/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_8_Chuoi_BieuThucChinhQuy;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class ChuoiServices {
    Scanner _sc= new Scanner(System.in);
    public String checkInputChu(String str){
        String input;
        do {
            System.out.println("Nhap "+ str+": "); //vi du: str= hoten/ diachi/...
            input= _sc.nextLine();
        } while (!input.matches("[a-zA-Z\\s]+"));
        //kiểm tra input có khớp với regex ?
        //ko khớp => nhập lại        
        return input;
    }
    public int checkInputSo(String str){
        String input;
        do {
            System.out.println("Nhap "+ str+": "); 
            input= _sc.nextLine();
        } while (!input.matches("\\d+"));  //"[0-9]+"     
        return Integer.parseInt(input);
    }
    public String checkInputSoDT(String str){
        String input;
        do {
            System.out.println("Nhap "+ str+": "); 
            input= _sc.nextLine();
        } while (!input.matches("\\d{10}"));  //"[0-9]{10}"     
        return input;
    }
    public String checkInputNgay(String str){
        String input;
        do {
            System.out.println("Nhap "+ str+": "); 
            input= _sc.nextLine();
        } while (!input.matches("[\\d]{2}[-|/][\\d]{2}[-|/][\\d]{4}"));  
        return input;
    }
}
