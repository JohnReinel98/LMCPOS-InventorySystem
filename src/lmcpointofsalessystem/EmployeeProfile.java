package lmcpointofsalessystem;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author JohnReinel
 */
public class EmployeeProfile extends javax.swing.JFrame {

    public EmployeeProfile() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblProfileImage = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblImageName = new javax.swing.JLabel();
        btnCancelUp = new javax.swing.JButton();
        jlabelsisiw = new javax.swing.JLabel();
        lblUsern = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblAM = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Profile");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 255, 153));

        lblProfileImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancelUp.setText("Cancel");
        btnCancelUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblImageName)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBrowse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblProfileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCancelUp)
                        .addGap(54, 54, 54))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblProfileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblImageName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBrowse)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelUp)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jlabelsisiw.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jlabelsisiw.setForeground(new java.awt.Color(255, 255, 255));
        jlabelsisiw.setText("Login in as:");

        lblUsern.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblUsern.setForeground(new java.awt.Color(0, 255, 153));
        lblUsern.setText("jLabel24");

        lblTime.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 255, 153));
        lblTime.setText("jLabel13");

        lblAM.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblAM.setForeground(new java.awt.Color(0, 255, 153));
        lblAM.setText("jLabel12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlabelsisiw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsern)
                        .addGap(469, 469, 469)
                        .addComponent(lblTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelsisiw)
                    .addComponent(lblUsern)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAM)
                        .addComponent(lblTime)))
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        JFileChooser choose = new JFileChooser();
        choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
         choose.setFileFilter(new FileFilter(){

            @Override
            public String getDescription() {
                //return "Portable Network Graphics (*.png)";
                return "All image files";
            }
            
            @Override
            public boolean accept(File f) {
                if(f.isDirectory()){
                    return true;
                }else{
                    return f.getName().toLowerCase().endsWith(".png")
                    || f.getName().toLowerCase().endsWith(".jpeg")
                    || f.getName().toLowerCase().endsWith(".jpg")
                    || f.getName().toLowerCase().endsWith(".gif");
                }
            }
 
            });
        int dialog = choose.showOpenDialog(EmployeeProfile.this);
        if(dialog==JFileChooser.APPROVE_OPTION){
            File f = choose.getSelectedFile();
            ImageIcon img  = new ImageIcon(f.getAbsolutePath());
            Rectangle rectangle = lblProfileImage.getBounds();
            Image imgscale = img.getImage().getScaledInstance(rectangle.width, rectangle.height, Image.SCALE_DEFAULT);
            img = new ImageIcon(imgscale);
            lblProfileImage.setIcon(img);
            
            String fname = f.getName().replace(".png", "").replace(".jpg", "").replace(".jpeg", "").replace(".gif", "");
            lblImageName.setText(fname);
        }else{
            JOptionPane.showMessageDialog(null, "No Image Chosen.");
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Rectangle rec = lblProfileImage.getBounds();
        BufferedImage badge = new BufferedImage(rec.width,rec.height,BufferedImage.TYPE_INT_ARGB);
        lblProfileImage.paint(badge.getGraphics());
       
            try{
                ImageIO.write(badge,"PNG",new File("C:\\Users\\JohnReinel\\Desktop\\LMCPOS-InventorySystem\\images\\"+lblImageName.getText()+".png"));
                JOptionPane.showMessageDialog(EmployeeProfile.this, "Profile picture successfully changed!","Success",JOptionPane.INFORMATION_MESSAGE);
            }catch(IOException e){
                JOptionPane.showMessageDialog(EmployeeProfile.this, "Failed to change profile picture!","Error",JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelUpActionPerformed
        lblProfileImage.setIcon(null);
        lblImageName.setText("");
    }//GEN-LAST:event_btnCancelUpActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnCancelUp;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabelsisiw;
    private javax.swing.JLabel lblAM;
    private javax.swing.JLabel lblImageName;
    private javax.swing.JLabel lblProfileImage;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblUsern;
    // End of variables declaration//GEN-END:variables
}
