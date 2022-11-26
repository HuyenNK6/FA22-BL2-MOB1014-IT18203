/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_6_LuyenTap_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class QLNYC {

    //biến toàn cục => dấu under_score: _
    ArrayList<NguoiYeuCu> _lstNYC;
    NguoiYeuCu _nguoiYeuCu;
    Scanner _sc;
    String _input;

    //ctrl+ cách+ enter
    public QLNYC() {
        _lstNYC = new ArrayList<>();
        _sc = new Scanner(System.in);
    }

    public void nhapDanhSachNYC() {
        String yesNo;
        do {
            //1. Khởi tạo đối tượng
            _nguoiYeuCu = new NguoiYeuCu();
            //2. Nhập thông tin
            System.out.println("Nhap ma NY= ");
            String maNY = _sc.nextLine();
            _nguoiYeuCu.setMaNY(maNY);
            System.out.println("Nhap ho ten= ");
            String hoTen = _sc.nextLine();
            _nguoiYeuCu.setHoTen(hoTen);
            System.out.println("Nhap so do vong 1= ");
            double vong1 = Double.parseDouble(_sc.nextLine());
            _nguoiYeuCu.setVong1(vong1);
            System.out.println("Nhap so do vong 2= ");
            double vong2 = Double.parseDouble(_sc.nextLine());
            _nguoiYeuCu.setVong2(vong2);
            System.out.println("Nhap so do vong 3= ");
            double vong3 = Double.parseDouble(_sc.nextLine());
            _nguoiYeuCu.setVong3(vong3);
            //3. Thêm vào danh sách
            _lstNYC.add(_nguoiYeuCu);

            System.out.println("Co muon tiep tuc khong yes/no (y/n)?");
            yesNo = _sc.nextLine();
        } while (yesNo.equals("y"));
    }

    public void xuatDanhSachNYC() {
        //for each
        //fore+ tab
        for (NguoiYeuCu nguoiYeuCu : _lstNYC) {
            System.out.println(nguoiYeuCu.toString());
        }
    }

    public void timKiem() {
        //tìm kiếm NYC theo mã ny
        System.out.println("Nhap ma NY can tim: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstNYC.size(); i++) {
            if (_lstNYC.get(i).getMaNY().equals(_input)) {
                System.out.println(_lstNYC.get(i).getMaNY());
                System.out.println(_lstNYC.get(i).toString());
                return;
            }
        }
        System.out.println("Khong tim thay NYC nay!!");
    }

    public void xoaNYC() {
        //xóa NYC theo mã ny
        System.out.println("Nhap ma NY can xoa: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstNYC.size(); i++) {
            if (_lstNYC.get(i).getMaNY().equals(_input)) {
                _lstNYC.remove(i);
                xuatDanhSachNYC();
                return;
            }
        }
        System.out.println("Khong xoa duoc NYC nay!!");

    }

    public void suaNYC() {
        System.out.println("Nhap ma NY can sua: ");
        _input = _sc.nextLine();
        //cách 1
//        for (NguoiYeuCu nguoiYeuCu : _lstNYC) {
//            if (nguoiYeuCu.getMaNY().equals(_input)){
//                 System.out.println(nguoiYeuCu.toString());
//                System.out.println("----Sua thong tin:----");
//                System.out.println("1. Ho Ten");
//                System.out.println("2. Vong 1");
//                System.out.println("3. Vong 2");
//                System.out.println("4. Vong 3");
//                System.out.println("----------------------");
//                System.out.println("chon so (1-4): ");
//                int chon = Integer.parseInt(_sc.nextLine());
//                 switch (chon) {
//                    case 1:
//                        System.out.println("Nhap ho ten= ");
//                        String hoTen = _sc.nextLine();
//                       nguoiYeuCu.setHoTen(hoTen);
//                        break;
//                    case 2:
//                        System.out.println("Nhap so do vong 1= ");
//                        double vong1 = Double.parseDouble(_sc.nextLine());
//                        nguoiYeuCu.setVong1(vong1);
//                        break;
//                    case 3:
//                         System.out.println("Nhap so do vong 2= ");
//                        double vong2 = Double.parseDouble(_sc.nextLine());
//                        nguoiYeuCu.setVong2(vong2);
//                        break;
//                    case 4:
//                        System.out.println("Nhap so do vong 3= ");
//                        double vong3 = Double.parseDouble(_sc.nextLine());
//                        nguoiYeuCu.setVong3(vong3);
//                        break;
//                    default:
//                        System.out.println("khong hop le!!!");
//                        break;
//                }
//                return;
//            }
//        }
        //cách 2
        for (int i = 0; i < _lstNYC.size(); i++) {
            if (_lstNYC.get(i).getMaNY().equals(_input)) {
                System.out.println(_lstNYC.get(i).toString());
                System.out.println("----Sua thong tin:----");
                System.out.println("1. Ho Ten");
                System.out.println("2. Vong 1");
                System.out.println("3. Vong 2");
                System.out.println("4. Vong 3");
                System.out.println("----------------------");
                System.out.println("chon so (1-4): ");
                int chon = Integer.parseInt(_sc.nextLine());
                // sw +tab
                switch (chon) {
                    case 1:
                        System.out.println("Nhap ho ten= ");
                        String hoTen = _sc.nextLine();
                        _lstNYC.get(i).setHoTen(hoTen);
                        break;
                    case 2:
                        System.out.println("Nhap so do vong 1= ");
                        double vong1 = Double.parseDouble(_sc.nextLine());
                        _lstNYC.get(i).setVong1(vong1);
                        break;
                    case 3:
                         System.out.println("Nhap so do vong 2= ");
                        double vong2 = Double.parseDouble(_sc.nextLine());
                        _lstNYC.get(i).setVong2(vong2);
                        break;
                    case 4:
                        System.out.println("Nhap so do vong 3= ");
                        double vong3 = Double.parseDouble(_sc.nextLine());
                        _lstNYC.get(i).setVong3(vong3);
                        break;
                    default:
                        System.out.println("khong hop le!!!");
                        break;
                }
                return;
            }
        }
        System.out.println("Khong tim thay NYC nay!!");
    }

    public void sapXep() {
        //Collections.sort(_lstNYC); => ko dùng dc
       
       Collections.sort(_lstNYC, new Comparator<NguoiYeuCu>() {
           @Override
           public int compare(NguoiYeuCu o1, NguoiYeuCu o2) {
                //sắp xếp tăng dần theo họ tên
              //return o1.getHoTen().compareTo(o2.getHoTen());
              //return o1.getVong1().compareTo(o2.getVong1()); => ko dùng dc
               //sắp xếp tăng dần theo số đo vòng 1
            return -Double.compare(o1.getVong1(), o2.getVong1());
           }
       });
       xuatDanhSachNYC();
    }
}
/*
Bài tập
    1. BillChilling 
            - id: int
            - gia: double
            - vi: String
            - noiSX: String
        => Constructor ko tham số và có tham số
        => Getter & Setter
        => toString() và inThongTin()
    2. QLBC
        - 1. nhapDS()
        - 2. xuatDS()
        - 3. timBC()
        - 4. xoaBC()
        - 5. suaBC()
        - 6. sapXepBC()
    3. Main 
        => gọi đến các chức năng trong QLBC
        => menu lặp
*/
