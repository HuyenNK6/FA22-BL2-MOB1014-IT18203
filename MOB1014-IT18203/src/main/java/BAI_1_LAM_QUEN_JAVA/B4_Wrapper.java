/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_1_LAM_QUEN_JAVA;

/**
 *
 * @author Khanh Huyen
 */
public class B4_Wrapper {

    /*
        LỚP BAO- WRAPPER
            Tương ứng với mỗi kiểu nguyên thủy- có 1 lớp bao
                boolean => Boolean
                byte    => Byte
                char    => Character
                short   => Short
                int     => Integer
                long    => Long
                float   => Float
                double  => Double
        *Boxing : tạo ra đối tượng bao lấy giá trị nguyên thủy
        *Unboxing: mở bao ra lấy giá trị từ đối tượng lớp bao
    => trong Java, có 1 số hàm chỉ làm việc với lớp bao
     */
    //psvm+tab
    public static void main(String[] args) {
        //Boxing: Bao
        Integer a = new Integer(5);//bao tường minh
        Integer b = Integer.valueOf(8);//bao tường minh
        Integer c = 10; //bao ngầm định

        //Unboxing: mở bao
        int value1 = a.intValue();//mở bao tường minh
        int value2 = a; //mở bao ngầm định

        int num = 0;
        Integer i = null;
    }
}
