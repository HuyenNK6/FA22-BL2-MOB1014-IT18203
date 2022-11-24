/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_6_LuyenTap_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class QLNYC {

    //biến toàn cục => dấu under_score: _
    List<NguoiYeuCu> _lstNYC;
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
}
