/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_1_LAM_QUEN_JAVA;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class B5_XuatNhapDuLieu {
    public static void main(String[] args) {
        //In ra màn hình
        int year= 2022;
        System.out.print("FPT Polytechnic "+ year);
        System.out.printf("FPT Polytechnic %d", year);
        System.out.println("FPT Polytechnic");
        
        String name="HuyenNK6";
        System.out.println("Chao mung "+name+" den voi ky nguyen vo tan "+year);
        
        //Nhập dữ liệu
        Scanner sc= new Scanner(System.in);
//        System.out.print("Nhap ho va ten: ");
//        String hoTen= sc.next(); // cho phép nhập 1 dòng từ bàn phím
//        sc.nextLine();
//        System.out.print("Nhap so tuoi: ");
//        int tuoi= Integer.parseInt(sc.nextLine()); //sc.nextInt(); // cho phép nhập 1 số nguyên từ bàn phím
//        System.out.print("Nhap dia chi: ");
////        sc.nextLine();//loại bỏ ký tự thừa
//        String diaChi= sc.nextLine();
//        System.out.println("Ho ten= "+ hoTen);
//        System.out.println("Tuoi= "+ tuoi);
//        System.out.println("Dia chi= "+ diaChi);
        
        System.out.println("Nhap so luong NYC: ");
        int nyc= sc.nextInt();//Integer.parseInt(sc.nextLine());
        System.out.println("tao da yeu "+nyc+ "nguoi yeu cu");
        sc.nextLine();
        System.out.println("Nhap so luong NYM: ");
        int nym = Integer.parseInt(sc.nextLine());
        System.out.println("Bay gio tao da co "+nym+" nguoi yeu moi");
    }
}
