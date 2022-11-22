/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_5_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class B1_Array {
    public static void main(String[] args) {
        int [] arr1= new int[5];
        int [] arr2= {9,5,2,7,3};
        String [] arr3= {"FPT", "Poly", "HN"};
        
        //for  +tab
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("i= "+ arr2[i]);
        }
        //Mảng 2 chiều
        Scanner sc= new Scanner(System.in);
        int row=2, col=3;
        int a[][]= new int [row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("a[%d][%d]=", i,j);
                a[i][j]= Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("a[%d][%d]= %d \n", i,j, a[i][j]);
            }
        }
        Arrays.sort(arr2);
        
    }
}
