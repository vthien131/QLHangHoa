/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlyhanghoa;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Van Thien
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static ConnectDatabase connection = new ConnectDatabase();
        public static String hienThiTaiKhoan = "";
        public static String hienThiMatKhauNguoiDung = "";
        public static String hienThiTenNguoiDung = "";
    public static void main(String[] args) {
        // TODO code application logic here
        frmDangNhap frmLogin = new frmDangNhap();
            frmLogin.show(); 
    }
    public static void thongBao(String noiDungThongBao,String tieuDeThongBao,int icon){
        JOptionPane.showMessageDialog(new JFrame(),noiDungThongBao,tieuDeThongBao,icon);
    }
    
}
