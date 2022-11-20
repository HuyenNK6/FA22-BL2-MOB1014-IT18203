/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_3_Vong_Lap;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class B2_While_DoWhile {
    public static void main(String[] args) {
        /*
        1. While (điều kiện)
        => kiểm tra điều kiện trước khi thực thi câu lệnh
        
        */
        int n=0;
        while(n<10){
            System.out.print(n+" ");
            n++;
        }
        /*
        Do-While => thực hiện ít nhất 1 lần => kiểm tra đk sau
        do{
            //thực hiện công việc
        }while (điều kiện)
        */
        Scanner sc= new Scanner(System.in);
        int tuoi;
        do {            
            System.out.println("Nhap tuoi: ");
            tuoi= sc.nextInt();
            
        } while (tuoi < 18);
        
        //thêm vòng lặp vào menu switch case
    }
}
