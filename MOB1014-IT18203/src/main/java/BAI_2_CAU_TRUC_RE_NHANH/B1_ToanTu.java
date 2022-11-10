/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_2_CAU_TRUC_RE_NHANH;

/**
 *
 * @author Khanh Huyen
 */
public class B1_ToanTu {
    public static void main(String[] args) {
        /*
            * 4 loại toán tử
                1. Toán tử số học: + - * / % ++ --
                2. Toán tử so sánh: > < >= <= == !=
                3. Toán tử logic: && || !
                4. Toán tử gán: = += -= /= *= %=
            * Toán tử 3 ngôi
                <biểu thức điều kiện> ? <giá trị đúng> : <giá trị sai>
                => kiểu dữ liệu
        */
        int a= 7, b=2;
        int c= a++ -(b--)-(a--);
        System.out.println(c);
        
        String test = 5 > 6 ? "dung": "sai";
        System.out.println(test);
        /*
        1 số hàm toán học trong Math
            Math.min(a,b) : tìm GTNN
            Math.max(a,b) : tìm GTLN
            Math.sqrt(a)  : căn bậc 2 của a
            Math.pow(a,b) : a mũ b
            Math.abs(a)   : trị tuyệt đối a
            Math.random() : ngẫu nhiên 0-1
            Math.round(a) : làm tròn
            Math.ceil(a)  : làm tròn lên
            Math.floor(a) : làm tròn xuống.........
        */
    }
}
