/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlyhanghoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Tung
 */
public class frmLoaiSanPham extends javax.swing.JFrame {

    /**
     * Creates new form frmLoaiSanPham
     */
    public frmLoaiSanPham() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaLoai = new javax.swing.JTextField();
        txtTenLoai = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTaoMoi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnXuatFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLoaiSP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã loại");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên loại");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mô tả");

        txtMaLoai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaLoaiKeyReleased(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");

        btnTaoMoi.setText("Tạo mới");
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("THÔNG TIN");

        btnXuatFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXuatFile.setText("Xuất File");
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaLoai)
                                .addComponent(txtTenLoai)
                                .addComponent(txtMoTa, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(15, 15, 15))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnTaoMoi)
                .addGap(18, 18, 18)
                .addComponent(btnXuatFile)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTaoMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        tblLoaiSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Loại", "Tên Loại", "Mô Tả"
            }
        ));
        tblLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLoaiSP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void LayDuLieu(){
            String SQL = "select * from LoaiSanPham";
            ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
            Object [] obj = new Object[] {"STT","Mã Loại Sản Phẩm","Tên Loại","Mô Tả"};
            DefaultTableModel tableModel = new DefaultTableModel(obj,0);
            tblLoaiSP.setModel(tableModel);
            try {
                while(rs.next()){
                    Object[] item = new Object[4];
                    item[0] = tblLoaiSP.getRowCount() + 1;
                    item[1] = rs.getInt("MaLoaiSP");
                    item[2] = rs.getString("TenLoai");
                    item[3] = rs.getString("MoTa");
                    tableModel.addRow(item);
                }
            }catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LayDuLieu();
    }//GEN-LAST:event_formWindowOpened

    private void tblLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiSPMouseClicked
        // TODO add your handling code here:
        int index = tblLoaiSP.getSelectedRow();
        txtMaLoai.setText(tblLoaiSP.getValueAt(index, 1).toString());
        txtTenLoai.setText(tblLoaiSP.getValueAt(index, 2).toString());
        txtMoTa.setText(tblLoaiSP.getValueAt(index, 3).toString());
    }//GEN-LAST:event_tblLoaiSPMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String tenLoai,moTa;
        tenLoai = txtTenLoai.getText();
        moTa = txtMoTa.getText();
        String SQL = "insert into LoaiSanPham(TenLoai,MoTa)"
                + " values(N'"+tenLoai+"',N'"+moTa+"')";        
        if("".equals(tenLoai) && "".equals(moTa)){
            Main.thongBao("Chưa nhập đầy đủ dữ liệu","Thông Báo", 1);
        }
        else{
            Main.connection.ExcuteQueryUpdateDB(SQL);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String tenLoai,moTa,maLoai;
        tenLoai = txtTenLoai.getText();
        moTa = txtMoTa.getText();
        maLoai = txtMaLoai.getText();
        String SQL = "update LoaiSanPham set TenLoai = N'"+tenLoai+"',"
                + " MoTa = N'"+moTa+"' where MaLoaiSP = "+maLoai;
        if("".equals(tenLoai) && "".equals(moTa) && "".equals(maLoai)){
            Main.thongBao("Bạn chưa nhập đầy đủ dữ liệu","Thông Báo", 1);
        }
        else{
            Main.connection.ExcuteQueryUpdateDB(SQL);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        // TODO add your handling code here:
        txtMaLoai.setText("");
        txtTenLoai.setText("");
        txtMoTa.setText("");
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        // TODO add your handling code here:
        ExportExcel xuatExcel = new ExportExcel();
        xuatExcel.exportExcel(tblLoaiSP);
    }//GEN-LAST:event_btnXuatFileActionPerformed

    private void txtMaLoaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaLoaiKeyReleased
        // TODO add your handling code here:
        String tuKhoaCanTim = txtMaLoai.getText();
        String SQL = "select * from LoaiSanPham where"
              //  +" MaLoaiSP like '%"+tuKhoaCanTim+"%'"
                + " TenLoai like N'%"+tuKhoaCanTim+"%'";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object [] obj = new Object[] {"STT","Mã Loại","Tên Loại","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblLoaiSP.setModel(tableModel);
        try {
            while(rs.next()){
                Object[] item = new Object[4];
                item[0] = tblLoaiSP.getRowCount() + 1;
                item[1] = rs.getInt("MaLoaiSP");
                item[2] = rs.getString("TenLoai");
                item[3] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtMaLoaiKeyReleased

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoaiSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLoaiSP;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables
}
