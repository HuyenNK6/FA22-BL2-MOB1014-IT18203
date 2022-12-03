/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_8_Chuoi_BieuThucChinhQuy;

/**
 *
 * @author Khanh Huyen
 */
public class B1_XuLyChuoi {
    public static void main(String[] args) {
        String wc ="      World Cup     ";
        //toLowerCase: viết thường
        System.out.println(wc.toLowerCase());
        //toUpperCase: viết hoa
        System.out.println(wc.toUpperCase());
        //trim: xóa khoảng trắng đầu cuối
        System.out.println(wc.trim());
        //contains: chứa 
        System.out.println(wc.contains("Cup"));
        //substring: cắt chuỗi
        System.out.println(wc.trim().substring(6));
        System.out.println(wc.trim().substring(1, 6));
        //start-end with: bắt đầu- kết thúc chuỗi
        System.out.println(wc.trim().startsWith("W"));
        System.out.println(wc.trim().endsWith("?"));
        //charAt(i): lấy ra ký tự
        System.out.println(wc.trim().charAt(0));
        //isEmpty: trống rỗng
        System.out.println(wc.isEmpty());
        //replace......
        
        String doiBong= "Bo      dao    nha";
        System.out.println(doiBong);
        String [] db= doiBong.split("\\s+");
        //fore+ tab
        for (String str : db) {
            System.out.println(str);
        }
        
        String hq= "Han Quoc";
        System.out.println(hq.matches("[a-zA-Z\\s]+"));
        
    }
}
/*
KÝ TỰ ĐẠI DIỆN
        [xyz] | đại diện 1 ký tự x, y, z
        [ad-f]| đại diện 1 ký tự a, d, e, f
        [^xyz]| đại diện 1 ký tự không thuộc x, y, z
        [x|y] | đại diện ký tự x hoặc y
        \d    | khớp với một kí tự số. tương đương [0-9]
        \w    | khớp với tất cả kí tự là chữ, số và gạch dưới.
                    tương đương [0-9a-zA-Z_]
        \D    | khớp với một kí tự không phải là số. 
                    tương đương [\^d] hoặc [^0-9]
        \W    | khớp với tất cả kí tự không phải là chữ, số và gạch dưới. 
                tương đương [\^w] hoặc [^0-9a-zA-Z_]
        \s    | đại diện ký tự trắng
        .     | đại diện 1 ký tự bất kỳ
        ^     | chỉ ra mẫu bắt đầu
        $     | chỉ ra mẫu kết thúc
        \\, \., \$, \^ | đại diện "\", ".", "$", "^"
        
        SỐ LẦN XUẤT HIỆN
        {M,N}   | ít nhất M lần, nhiều nhất N lần
        {N}     | đúng N lần
        {N,}    | xảy ra N hoặc nhiều lần
        ?       | 0-1 lần
        *       | 0-N lần
        +       | 1-N lần
        Không   | 1 lần
     
*/

