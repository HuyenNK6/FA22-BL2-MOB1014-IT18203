/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DETHITHU_Vaccine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class QLVC {

    Scanner _sc = new Scanner(System.in);
    ArrayList<Vaccine> _lstVC = new ArrayList<>();
    Vaccine _vaccine;
    String _input;

    public QLVC() {
        //fakeData();
        _lstVC.add(new Vaccine("vc01", "vc01", 12, "08/12/2022"));
        _lstVC.add(new Vaccine("vc02", "vc02", 5, "08/12/2022"));
        _lstVC.add(new Vaccine("vc03", "vc03", 8, "08/12/2022"));
        _lstVC.add(new Vaccine("vc04", "vc04", 2, "08/12/2022"));
        _lstVC.add(new Vaccine("vc05", "vc05", 10, "08/12/2022"));
    }

    public void nhapDS() {
        String yesNo;
        do {
            //1. khởi tạo đối tượng
            _vaccine = new Vaccine();
            //2. nhập thông tin
            //....................
            _vaccine.nhapThongTin();
            //3. add thêm vào list danh sách
            _lstVC.add(_vaccine);
            System.out.println("Co tiep tuc ko (Y/N)?");
            yesNo = _sc.nextLine();
        } while (yesNo.equalsIgnoreCase("y"));
    }

    public void xuatDS() {
        System.out.println("===DANH SACH VACCINE====");
        for (Vaccine vaccine : _lstVC) {
            vaccine.inThongTin();
        }
    }
//3.Xuất danh sách các VC  (ThoiGianTacDung >= 6 tháng)(1 đ )
    public void xuatDSTheoTGTD(){
         ArrayList<Vaccine> listTGTD= getListVC();
         for (Vaccine vaccine : listTGTD) {
             vaccine.inThongTin();
        }
//          for (Vaccine vaccine : _lstVC) {
//            if ( vaccine.getThoiGianTD() >= 6){
//                vaccine.inThongTin();
//            }
//        }
    }
    //Phương thức có trả về giá trị 
    public ArrayList<Vaccine> getListVC(){
        ArrayList<Vaccine> list= new ArrayList<>();
        for (Vaccine vaccine : _lstVC) {
            if ( vaccine.getThoiGianTD() >= 6){
                list.add(vaccine);//tim thay => them vao danh sach moi
            }
        }
        return list;//tra ve ca 1 danh sach VC
    }
      
    public void sapXepGiamDan(){
        Collections.sort(_lstVC, new Comparator<Vaccine>() {
            @Override
            public int compare(Vaccine o1, Vaccine o2) {
                //tang dan
               //return Float.compare(o1.getThoiGianTD(), o2.getThoiGianTD());
               //giam dan
               return -Float.compare(o1.getThoiGianTD(), o2.getThoiGianTD());
            }
        });
        xuatDS();
    }
    public void keThua(){
        VaccineVN vcvn= new VaccineVN();
        vcvn.nhapThongTin();
        vcvn.inThongTin();
    }
            
    public void menu() {

        int chon;
        do {
            System.out.println("----------MENU--------");
            System.out.println("1. Nhap DS vaccine");
            System.out.println("2. Xuat DS vaccine");
            System.out.println("3. Xuat DS vaccine TGTD >= 6 thang");
            System.out.println("4. Sap xep giam dan theo TGTD");
            System.out.println("5. Ke thua");
            System.out.println("0. Thoat");
            System.out.println("------------------------");
            System.out.print("Moi chon: ");
            chon = Integer.parseInt(_sc.nextLine());
            //sw + tab
            switch (chon) {
                case 1:
                    System.out.println("1. Nhap DS vaccine");
                    nhapDS();
                    break;
                case 2:
                    System.out.println("2. Xuat DS vaccine");
                    xuatDS();
                    break;
                case 3:
                    System.out.println("3. Xuat DS vaccine TGTD >= 6 thang");
                    xuatDSTheoTGTD();
                    break;
                case 4:
                    System.out.println("4. Sap xep giam dan theo TGTD");
                    sapXepGiamDan();
                    break;
                case 5:
                    System.out.println("5. Ke thua");
                    keThua();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nhap lai chuc nang!!");
                    break;
            }
        } while (chon != 0);
    }

    
}
