/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_7_BingChilling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class QLBC {
    Scanner _sc;
    ArrayList<BingChilling> _lstBC;
    BingChilling _bingChilling;
    String _input;

    public QLBC() {
        _sc= new Scanner(System.in);
        _lstBC= new ArrayList<>();
        fakeData();
    }
    public void fakeData(){
        _lstBC.add(new BingChilling(1, 10000, "vani", "ThaiLan"));
        _lstBC.add(new BingChilling(2, 20000, "socola", "Lao"));
        _lstBC.add(new BingChilling(3, 30000, "dua", "Ac hen ti na"));
        _lstBC.add(new BingChilling(4, 40000, "dau xanh", "Bo Dao Nha"));
        _lstBC.add(new BingChilling(5, 50000, "mam tom", "VietNam"));
    }
    public void nhapDS(){
        String yesNo;
        do {            
            //1. Khoi tao
            _bingChilling= new BingChilling();
            //2. nhap thong tin
            System.out.println("Nhap id= ");
            int id= Integer.parseInt(_sc.nextLine());
            _bingChilling.setId(id);
            System.out.println("Nhap gia= ");
            double gia= Double.parseDouble(_sc.nextLine());
            _bingChilling.setGia(gia);
            System.out.println("Nhap vi= ");
            String vi= _sc.nextLine();
            _bingChilling.setVi(vi);
            System.out.println("Nhap noi sx= ");
            String noiSX= _sc.nextLine();
            _bingChilling.setNoiSX(noiSX);
            //3. them vao DS
            _lstBC.add(_bingChilling);
            //hoi tiep tuc
            System.out.println("Co tiep tuc hay ko? yes (Y) or no (N)");
            yesNo= _sc.nextLine();
        } while (yesNo.equalsIgnoreCase("Y"));
    }
    public void xuatDS(){
        System.out.println("-----DS BING CHILLING------");
        for (BingChilling bingChilling : _lstBC) {
            System.out.println(bingChilling.toString());
            //in thoong tin
        }
    }
    
    public void timKiem(){
        System.out.println("Nhap id can tim: ");
        _input= _sc.nextLine();
        for (int i = 0; i < _lstBC.size(); i++) {
            if(_lstBC.get(i).getId()== Integer.parseInt(_input)){
                System.out.println(_lstBC.get(i).toString());
                return;
            }
        }
        System.out.println("Khong tim thay!!");
    }
    
    public void xoa(){
        System.out.println("Nhap id can xoa: ");
        _input= _sc.nextLine();
        for (int i = 0; i < _lstBC.size(); i++) {
            if(_lstBC.get(i).getId()== Integer.parseInt(_input)){
                _lstBC.remove(i);
                xuatDS();
                return;
            }
        }
        System.out.println("Khong xoa duoc!!");
    }
    
    public void sapXepTheoGia(){
        Collections.sort(_lstBC, new Comparator<BingChilling>() {
            @Override
            public int compare(BingChilling o1, BingChilling o2) {
                //return -Double.compare(o1.getGia(), o2.getGia());
                return o1.getGia() < o2.getGia() ? 1: -1;
            }
        });
        xuatDS();
    }
    
    public void sua(){
        //ve nha lam not
    }
    
}
