/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Language;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.text.html.parser.DTDConstants.MS;

/**
 *
 * @author XUÂN THÀNH
 */
public class Language {

    private javax.swing.JComboBox<String> cbbLanguge;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLanguge;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMANV;
    private javax.swing.JLabel lblQLNV;
    private javax.swing.JTable tblQLNV;
    private javax.swing.JLabel lblTuoi;
    private javax.swing.JLabel lblEmail;

    public Language(JComboBox<String> cbbLanguge, JLabel lblHoTen, JLabel lblLanguge, JLabel lblLuong, JLabel lblMANV, JLabel lblQLNV, JTable tblQLNV, JLabel lblTuoi, JLabel lblEmail) {
        this.cbbLanguge = cbbLanguge;
        this.lblHoTen = lblHoTen;
        this.lblLanguge = lblLanguge;
        this.lblLuong = lblLuong;
        this.lblMANV = lblMANV;
        this.lblQLNV = lblQLNV;
        this.tblQLNV = tblQLNV;
        this.lblTuoi = lblTuoi;
        this.lblEmail = lblEmail;
    }

    public void language() {
        int index = this.cbbLanguge.getSelectedIndex();

        switch (index) {
            case 0:
                this.lblQLNV.setText("QUẢN LÝ NHÂN VIÊN");
                this.lblQLNV.setFont(new java.awt.Font("Times New Roman", 1, 36));
                this.lblMANV.setText("MÃ NHÂN VIÊN");
                this.lblHoTen.setText("HỌ VÀ TÊN");
                this.lblEmail.setText("EMAIL");
                this.lblLuong.setText("LƯƠNG");
                this.lblTuoi.setText("TUỔI");
                this.lblLanguge.setText("Ngôn Ngữ:");
                this.tblQLNV.getColumnModel().getColumn(0).setHeaderValue("Mã");
                this.tblQLNV.getColumnModel().getColumn(1).setHeaderValue("Họ Tên");
                this.tblQLNV.getColumnModel().getColumn(2).setHeaderValue("Tuổi");
                this.tblQLNV.getColumnModel().getColumn(3).setHeaderValue("Email");
                this.tblQLNV.getColumnModel().getColumn(4).setHeaderValue("Lương");
                this.tblQLNV.getTableHeader().repaint();
               

                break;

            case 1:
                this.lblQLNV.setText("STAFF MANAGEMENT");
                this.lblMANV.setText("STAFF ID");
                this.lblHoTen.setText("FULLNAME");
                this.lblEmail.setText("EMAIL");
                this.lblLuong.setText("SALARY");
                this.lblTuoi.setText("AGE");
                this.lblLanguge.setText("Language:");
                this.tblQLNV.getColumnModel().getColumn(0).setHeaderValue("ID");
                this.tblQLNV.getColumnModel().getColumn(1).setHeaderValue("Fullname");
                this.tblQLNV.getColumnModel().getColumn(2).setHeaderValue("Age");
                this.tblQLNV.getColumnModel().getColumn(3).setHeaderValue("Email");
                this.tblQLNV.getColumnModel().getColumn(4).setHeaderValue("Salary");
                this.tblQLNV.getTableHeader().repaint();

                break;
            case 2:
                this.lblQLNV.setText("スタッフ管理");
                this.lblQLNV.setFont(new java.awt.Font("MS UI Gothic", 1, 36));
                this.lblMANV.setText("スタッフID");
                this.lblMANV.setFont(Font.getFont("MS UI Gothic"));
                this.lblHoTen.setText("名前");
                this.lblHoTen.setFont(Font.getFont("MS UI Gothic"));
                this.lblEmail.setText("EMAIL");
                this.lblEmail.setFont(Font.getFont("MS UI Gothic"));
                this.lblLuong.setText("給料");
                this.lblLuong.setFont(Font.getFont("MS UI Gothic"));
                this.lblTuoi.setText("年齢");
                this.lblTuoi.setFont(Font.getFont("MS UI Gothic"));
                this.lblLanguge.setText("言語:");
                this.lblLanguge.setFont(Font.getFont("MS UI Gothic"));
                this.tblQLNV.getColumnModel().getColumn(0).setHeaderValue("ID");
                this.tblQLNV.getColumnModel().getColumn(1).setHeaderValue("名前");
                this.tblQLNV.getColumnModel().getColumn(2).setHeaderValue("年齢");
                this.tblQLNV.getColumnModel().getColumn(3).setHeaderValue("Email");
                this.tblQLNV.getColumnModel().getColumn(4).setHeaderValue("給料");
                this.tblQLNV.getTableHeader().repaint();

                break;
              

        }

    }
}
