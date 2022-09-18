
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.sql.*;
import br.com.infox.dal.ModuloConexao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class TelaCadastroImagensModelo extends javax.swing.JFrame {

   //preparando a conexão: 
    Connection conexao;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    BufferedImage imagem; //para converter a imagem
    File f= null;
    String path = null;
    private ImageIcon format = null;
    String fname = null;
    int n = 0;
    byte[] pimage = null;
    
    public TelaCadastroImagensModelo() {
        initComponents();
        conexao = ModuloConexao.conector();
        selecionar_foto_combo_box();
        
    }
    public void selecionarFoto(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG", "png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);
        
        if(load == fileChooser.APPROVE_OPTION){
            f = fileChooser.getSelectedFile();
            path = f.getAbsolutePath();
            
            imagePath.setText(path);
            ImageIcon li = new ImageIcon(path);
            Image img = li.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
            lblimagem.setIcon(new ImageIcon(img));
    
        }
        
    } //ok
    
    public void salvarFotoBancoDeDados(){
            System.out.println("Image Path" + path);
            System.out.println("Image Name  " + f.getName());
            File f = new File(path);
            String sql = "insert into tbimagem(imageName, imagePath,imageFile)values(?,?,?)";
            try {
                InputStream is = new FileInputStream(f);
                pst = conexao.prepareStatement(sql);
                pst.setString(1,f.getName());
                pst.setString(2,path);
                pst.setBlob(3, is);
                int adicionado = pst.executeUpdate();
            
            if(adicionado>0 ){
                JOptionPane.showMessageDialog(null, "Imagem adicionada com sucesso!!!");
                selecionar_foto_combo_box();
            }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar foto. Contate o desenvolvedor!!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
        }
     
    }
    
    public void selecionar_foto_combo_box(){
        try {
            pst = conexao.prepareStatement("select imgId from tbimagem");
            rs = pst.executeQuery();
            ImageID.removeAllItems();
            
            while(rs.next()){
                ImageID.addItem(rs.getString(1));
            }
            
        } catch (Exception e) {
        }
    }

 
    //vou precisar usar esse método na tela cliente...
    public void procurar_foto_por_imgID(){
        String imgID = ImageID.getSelectedItem().toString();
        try {
            pst = conexao.prepareStatement("select * from tbimagem WHERE imgId =?");
            pst.setString(1, ImageID.getSelectedItem().toString());
            
            rs = pst.executeQuery();
            if(rs.next()){
                LoadImage();
            }else{
                JOptionPane.showMessageDialog(this, "Imagem não encontrada!");
                        
            }
                
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        
    }
    //voltar imagem para usuario carregar vindo do banco de dados
    public void LoadImage(){
        try {
            byte[] imagedata = rs.getBytes("imageFile");
            format = new ImageIcon(imagedata);
            Image mm = format.getImage();
            Image img2 = mm.getScaledInstance(labelDisplayImage.getWidth(), labelDisplayImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(img2);
            labelDisplayImage.setIcon(image);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        imagePath = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblimagem = new javax.swing.JLabel();
        labelDisplayImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ImageID = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        imagePath.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        jButton4.setText("selecionar imagem");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagens"));

        lblimagem.setText(".");
        lblimagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem enviada para banco de dados"));

        labelDisplayImage.setText(".");
        labelDisplayImage.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem recuperada"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(labelDisplayImage, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDisplayImage, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ImageID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ImageID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageIDActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(95, 95, 95))
                    .addComponent(jSeparator5)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(729, 729, 729)
                                .addComponent(jSeparator2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(ImageID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImageID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );

        setSize(new java.awt.Dimension(949, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //para selecionar uma foto
        selecionarFoto();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            //
            salvarFotoBancoDeDados();
            
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // chama o metodo de busca de foto pelo ID
        procurar_foto_por_imgID();
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void ImageIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImageIDActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroImagensModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroImagensModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroImagensModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroImagensModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroImagensModelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ImageID;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField imagePath;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelDisplayImage;
    private javax.swing.JLabel lblimagem;
    // End of variables declaration//GEN-END:variables
}
