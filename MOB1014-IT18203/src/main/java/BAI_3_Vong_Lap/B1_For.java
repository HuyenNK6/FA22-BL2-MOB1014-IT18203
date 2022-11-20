/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_3_Vong_Lap;

/**
 *
 * @author Khanh Huyen
 */
public class B1_For {

    public static void main(String[] args) {
        //for +tab
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nBreak");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;//thoát khỏi vòng lặp
            }
            System.out.print(i + " ");
        }
        System.out.println("\nContinue");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;//bỏ qua phần code còn lại
                //chuyển vòng lặp tiếp theo
            }
            System.out.print(i + " ");
        }
    }
}
