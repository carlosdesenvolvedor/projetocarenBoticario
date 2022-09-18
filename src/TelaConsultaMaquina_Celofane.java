/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author carlo
 */
import java.sql.*;
import br.com.infox.dal.ModuloConexao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class TelaConsultaMaquina_Celofane extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCelefaneScroll
     */
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null; //resultado 
    BufferedImage imagem; //para converter a imagem
    BufferedImage imagem2; //para converter a imagem
    BufferedImage imagem3; //para converter a imagem
    BufferedImage imagem4; //para converter a imagem
    File f= null;
    String path = null;
    private ImageIcon format = null;
    private ImageIcon format2 = null;
    private ImageIcon format3 = null;
    private ImageIcon format4 = null;
    String fname = null;
    int n = 0;
    byte[] image = null;
    
    public TelaConsultaMaquina_Celofane() {
        initComponents();
        conexao = ModuloConexao.conector();
        
        
    }
    private void consultar() {
       // String sql = "select * from tbusuarios where iduser=?";
        String sql = "select * from tbparametrogeral where produto=?";
        try {
            pst = conexao.prepareStatement(sql);

            pst.setString(1,txtProduto.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                
                //foto 1
                try {
                    labelDisplayImage1.setIcon(null);
                    
                    byte[] imagedata = rs.getBytes("foto1");
                    
                    format = new ImageIcon(imagedata);
                    Image mm = format.getImage();
                    Image img1 = mm.getScaledInstance(349,250, Image.SCALE_SMOOTH);
                    ImageIcon image = new ImageIcon(img1);
                    labelDisplayImage1.setIcon(image);
                    
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 1, favar informar responsavel por cadastramento!!");
                }
                
               
                //foto 2 
                try {
                    labelDisplayImage2.setIcon(null);
                    
                    byte[] imagedata2 = rs.getBytes("foto2");
                    
                    format2 = new ImageIcon(imagedata2);
                    Image mm2 = format2.getImage();
                    Image img2 = mm2.getScaledInstance(349,250, Image.SCALE_SMOOTH);
                    ImageIcon image2 = new ImageIcon(img2);
                    labelDisplayImage2.setIcon(image2);
                    
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 2, favar informar responsavel por cadastramento!!");
                }
                
                
                //foto 3
                
                try {
                    labelDisplayImage3.setIcon(null);
                    
                    byte[] imagedata3 = rs.getBytes("foto3");
                    format3 = new ImageIcon(imagedata3);
                    Image mm3 = format3.getImage();
                    Image img3 = mm3.getScaledInstance(349,250, Image.SCALE_SMOOTH);
                    ImageIcon image3 = new ImageIcon(img3);
                    labelDisplayImage3.setIcon(image3);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 3, favar informar responsavel por cadastramento!!");
                }
                    
                // foto 4
                try {
                    labelDisplayImage4.setIcon(null);
                    
                    byte[] imagedata4 = rs.getBytes("foto4");
                    format4 = new ImageIcon(imagedata4);
                    Image mm4 = format4.getImage();
                    Image img4 = mm4.getScaledInstance(349,250, Image.SCALE_SMOOTH);
                    ImageIcon image4 = new ImageIcon(img4);
                    labelDisplayImage4.setIcon(image4);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 4, favar informar responsavel por cadastramento!!");
                }
               
                
                
                 
                 
                txtAcondi.setText(rs.getString("acondicionamento"));
                txtAbaste.setText(rs.getString("abastecimento"));
                txtEsteira.setText(rs.getString("esteira"));
                txtFormato.setText(rs.getString("formato"));
                txtArea.setText(rs.getString("obsGeral"));
                txtObs.setText(rs.getString("obs"));
                txtObs2.setText(rs.getString("obs2"));
                txtObs3.setText(rs.getString("obs3"));
                txtObs4.setText(rs.getString("obs4"));
                lbl1.setText(rs.getString(5));
                lbl2.setText(rs.getString(6));
                lbl3.setText(rs.getString(7));
                lbl4.setText(rs.getString(8));
                lbl5.setText(rs.getString(9));
                lbl6.setText(rs.getString(10));
                lbl7.setText(rs.getString(11));
                lbl8.setText(rs.getString(12));
                lbl9.setText(rs.getString(13));
                lbl10.setText(rs.getString(14));
                lbl11.setText(rs.getString(15));
                lbl12.setText(rs.getString(16));
                lbl13.setText(rs.getString(17));
                lbl14.setText(rs.getString(18));
                lbl15.setText(rs.getString(19));
                lbl16.setText(rs.getString(20));
                lbl17.setText(rs.getString(21));
                lbl18.setText(rs.getString(22));
                lbl19.setText(rs.getString(23));
                lbl20.setText(rs.getString(24));
                lblCel1.setText(rs.getString(25));
                lblObs1.setText(rs.getString(26));
                lblCel2.setText(rs.getString(27));
                lblObs2.setText(rs.getString(28));
                lblCel3.setText(rs.getString(29));
                lblObs3.setText(rs.getString(30));
                lblCel4.setText(rs.getString(31));
                lblObs4.setText(rs.getString(32));
                lblCel5.setText(rs.getString(33));
                lblObs5.setText(rs.getString(34));
                lblCel6.setText(rs.getString(35));
                lblObs6.setText(rs.getString(36));
                lblCel7.setText(rs.getString(37));
                lblObs7.setText(rs.getString(38));
                lblCel8.setText(rs.getString(39));
                lblObs8.setText(rs.getString(40));
                lblCel9.setText(rs.getString(41));
                lblObs9.setText(rs.getString(42));
                lblCel10.setText(rs.getString(43));
                lblObs10.setText(rs.getString(44));
                lblCel11.setText(rs.getString(45));
                lblObs11.setText(rs.getString(46));
                lblCel12.setText(rs.getString(47));
                lblObs12.setText(rs.getString(48));
                lblCel13.setText(rs.getString(49));
                lblObs13.setText(rs.getString(50));
                lblCel14.setText(rs.getString(51));
                lblObs14.setText(rs.getString(52));
                lblCel15.setText(rs.getString(53));
                lblObs15.setText(rs.getString(54));
                lblCel16.setText(rs.getString(55));
                lblObs16.setText(rs.getString(56));
                lblCel17.setText(rs.getString(57));
                lblObs17.setText(rs.getString(58));
                lblCel18.setText(rs.getString(59));
                lblObs18.setText(rs.getString(60));
                lblCel19.setText(rs.getString(61));
                lblObs19.setText(rs.getString(62));
                lblCel20.setText(rs.getString(63));
                lblObs20.setText(rs.getString(64));
                lblCel21.setText(rs.getString(65));
                lblObs21.setText(rs.getString(66));
                lblCel22.setText(rs.getString(67));
                lblObs22.setText(rs.getString(68));
                lblCel23.setText(rs.getString(69));
                lblObs23.setText(rs.getString(70));
                lblCel24.setText(rs.getString(71));
                lblObs24.setText(rs.getString(72));
                lblCel25.setText(rs.getString(73));
                lblObs25.setText(rs.getString(74));
                lblCel26.setText(rs.getString(75));
                lblObs26.setText(rs.getString(76));
                lblCel27.setText(rs.getString(77));
                lblObs27.setText(rs.getString(78));
                lblCel28.setText(rs.getString(79));
                lblObs28.setText(rs.getString(80));
                lblCel29.setText(rs.getString(81));
                lblObs29.setText(rs.getString(82));
                lblCel30.setText(rs.getString(83));
                lblObs30.setText(rs.getString(84));
                lblCel31.setText(rs.getString(85));
                lblObs31.setText(rs.getString(86));
                lblCel32.setText(rs.getString(87));
                lblCel33.setText(rs.getString(88));
                lblCel34.setText(rs.getString(89));
                lblCel35.setText(rs.getString(90));
                lblCel36.setText(rs.getString(91));
                lblCel37.setText(rs.getString(92));
                lblCel38.setText(rs.getString(93));
                lblCel39.setText(rs.getString(94));
                lblCel40.setText(rs.getString(95));
                lblCel41.setText(rs.getString(96));
                lblCel42.setText(rs.getString(97));
                lblCel43.setText(rs.getString(98));
                lblCel44.setText(rs.getString(99));
                lblCel45.setText(rs.getString(100));
                lblCel46.setText(rs.getString(101));
                lblCel47.setText(rs.getString(102));
                lblCel48.setText(rs.getString(103));
                lblCel49.setText(rs.getString(104));
                lblCel50.setText(rs.getString(105));
                lblCel51.setText(rs.getString(106));
                lblCel52.setText(rs.getString(107));
                lblCel53.setText(rs.getString(108));
                lblCel54.setText(rs.getString(109));
                lblCel55.setText(rs.getString(110));
                lblCel56.setText(rs.getString(111));
                lblCel57.setText(rs.getString(112));
                lblCel58.setText(rs.getString(113));
                lblCel59.setText(rs.getString(114));
                lblCel60.setText(rs.getString(115));
              
                
            } else {
                JOptionPane.showMessageDialog(null, "usuário não cadastrado");
                //as linhas abqaixo linpa os campos
                /*txtUsuCol.setText(null);
                txtUsuFon.setText(null);
                txtUsuLog.setText(null);
                txtUsuSen.setText(null);
                cboUsoPerfil.setSelectedItem(null);*/
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    private void consultar_formato() {
       // String sql = "select * from tbusuarios where iduser=?";
        String sql = "select * from tbparametrogeral where formato=?";
        try {
            pst = conexao.prepareStatement(sql);

            
            pst.setString(1,txtFormato.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                
                //foto 1
                try {
                    labelDisplayImage1.setIcon(null);
                    
                    byte[] imagedata = rs.getBytes("foto1");
                    
                    format = new ImageIcon(imagedata);
                    Image mm = format.getImage();
                    Image img1 = mm.getScaledInstance(349,250, Image.SCALE_SMOOTH);
                    ImageIcon image = new ImageIcon(img1);
                    labelDisplayImage1.setIcon(image);
                    
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 1, favar informar responsavel por cadastramento!!");
                }
                
               
                //foto 2 
                try {
                    labelDisplayImage2.setIcon(null);
                    
                    byte[] imagedata2 = rs.getBytes("foto2");
                    
                    format2 = new ImageIcon(imagedata2);
                    Image mm2 = format2.getImage();
                    Image img2 = mm2.getScaledInstance(349,250, Image.SCALE_SMOOTH);
                    ImageIcon image2 = new ImageIcon(img2);
                    labelDisplayImage2.setIcon(image2);
                    
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 2, favar informar responsavel por cadastramento!!");
                }
                
                
                //foto 3
                
                try {
                    labelDisplayImage3.setIcon(null);
                    
                    byte[] imagedata3 = rs.getBytes("foto3");
                    format3 = new ImageIcon(imagedata3);
                    Image mm3 = format3.getImage();
                    Image img3 = mm3.getScaledInstance(349,250, Image.SCALE_SMOOTH);
                    ImageIcon image3 = new ImageIcon(img3);
                    labelDisplayImage3.setIcon(image3);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 3, favar informar responsavel por cadastramento!!");
                }
                    
                // foto 4
                try {
                    labelDisplayImage4.setIcon(null);
                    
                    byte[] imagedata4 = rs.getBytes("foto4");
                    format4 = new ImageIcon(imagedata4);
                    Image mm4 = format4.getImage();
                    Image img4 = mm4.getScaledInstance(349,250, Image.SCALE_SMOOTH);
                    ImageIcon image4 = new ImageIcon(img4);
                    labelDisplayImage4.setIcon(image4);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 4, favar informar responsavel por cadastramento!!");
                }
               
                
                
                 
                 
                txtProduto.setText(rs.getString("produto"));
                txtAcondi.setText(rs.getString("acondicionamento"));
                txtAbaste.setText(rs.getString("abastecimento"));
                txtEsteira.setText(rs.getString("esteira"));
                txtFormato.setText(rs.getString("formato"));
                txtArea.setText(rs.getString("obsGeral"));
                txtObs.setText(rs.getString("obs"));
                txtObs2.setText(rs.getString("obs2"));
                txtObs3.setText(rs.getString("obs3"));
                txtObs4.setText(rs.getString("obs4"));
                lbl1.setText(rs.getString(5));
                lbl2.setText(rs.getString(6));
                lbl3.setText(rs.getString(7));
                lbl4.setText(rs.getString(8));
                lbl5.setText(rs.getString(9));
                lbl6.setText(rs.getString(10));
                lbl7.setText(rs.getString(11));
                lbl8.setText(rs.getString(12));
                lbl9.setText(rs.getString(13));
                lbl10.setText(rs.getString(14));
                lbl11.setText(rs.getString(15));
                lbl12.setText(rs.getString(16));
                lbl13.setText(rs.getString(17));
                lbl14.setText(rs.getString(18));
                lbl15.setText(rs.getString(19));
                lbl16.setText(rs.getString(20));
                lbl17.setText(rs.getString(21));
                lbl18.setText(rs.getString(22));
                lbl19.setText(rs.getString(23));
                lbl20.setText(rs.getString(24));
                lblCel1.setText(rs.getString(25));
                lblObs1.setText(rs.getString(26));
                lblCel2.setText(rs.getString(27));
                lblObs2.setText(rs.getString(28));
                lblCel3.setText(rs.getString(29));
                lblObs3.setText(rs.getString(30));
                lblCel4.setText(rs.getString(31));
                lblObs4.setText(rs.getString(32));
                lblCel5.setText(rs.getString(33));
                lblObs5.setText(rs.getString(34));
                lblCel6.setText(rs.getString(35));
                lblObs6.setText(rs.getString(36));
                lblCel7.setText(rs.getString(37));
                lblObs7.setText(rs.getString(38));
                lblCel8.setText(rs.getString(39));
                lblObs8.setText(rs.getString(40));
                lblCel9.setText(rs.getString(41));
                lblObs9.setText(rs.getString(42));
                lblCel10.setText(rs.getString(43));
                lblObs10.setText(rs.getString(44));
                lblCel11.setText(rs.getString(45));
                lblObs11.setText(rs.getString(46));
                lblCel12.setText(rs.getString(47));
                lblObs12.setText(rs.getString(48));
                lblCel13.setText(rs.getString(49));
                lblObs13.setText(rs.getString(50));
                lblCel14.setText(rs.getString(51));
                lblObs14.setText(rs.getString(52));
                lblCel15.setText(rs.getString(53));
                lblObs15.setText(rs.getString(54));
                lblCel16.setText(rs.getString(55));
                lblObs16.setText(rs.getString(56));
                lblCel17.setText(rs.getString(57));
                lblObs17.setText(rs.getString(58));
                lblCel18.setText(rs.getString(59));
                lblObs18.setText(rs.getString(60));
                lblCel19.setText(rs.getString(61));
                lblObs19.setText(rs.getString(62));
                lblCel20.setText(rs.getString(63));
                lblObs20.setText(rs.getString(64));
                lblCel21.setText(rs.getString(65));
                lblObs21.setText(rs.getString(66));
                lblCel22.setText(rs.getString(67));
                lblObs22.setText(rs.getString(68));
                lblCel23.setText(rs.getString(69));
                lblObs23.setText(rs.getString(70));
                lblCel24.setText(rs.getString(71));
                lblObs24.setText(rs.getString(72));
                lblCel25.setText(rs.getString(73));
                lblObs25.setText(rs.getString(74));
                lblCel26.setText(rs.getString(75));
                lblObs26.setText(rs.getString(76));
                lblCel27.setText(rs.getString(77));
                lblObs27.setText(rs.getString(78));
                lblCel28.setText(rs.getString(79));
                lblObs28.setText(rs.getString(80));
                lblCel29.setText(rs.getString(81));
                lblObs29.setText(rs.getString(82));
                lblCel30.setText(rs.getString(83));
                lblObs30.setText(rs.getString(84));
                lblCel31.setText(rs.getString(85));
                lblObs31.setText(rs.getString(86));
                lblCel32.setText(rs.getString(87));
                lblCel33.setText(rs.getString(88));
                lblCel34.setText(rs.getString(89));
                lblCel35.setText(rs.getString(90));
                lblCel36.setText(rs.getString(91));
                lblCel37.setText(rs.getString(92));
                lblCel38.setText(rs.getString(93));
                lblCel39.setText(rs.getString(94));
                lblCel40.setText(rs.getString(95));
                lblCel41.setText(rs.getString(96));
                lblCel42.setText(rs.getString(97));
                lblCel43.setText(rs.getString(98));
                lblCel44.setText(rs.getString(99));
                lblCel45.setText(rs.getString(100));
                lblCel46.setText(rs.getString(101));
                lblCel47.setText(rs.getString(102));
                lblCel48.setText(rs.getString(103));
                lblCel49.setText(rs.getString(104));
                lblCel50.setText(rs.getString(105));
                lblCel51.setText(rs.getString(106));
                lblCel52.setText(rs.getString(107));
                lblCel53.setText(rs.getString(108));
                lblCel54.setText(rs.getString(109));
                lblCel55.setText(rs.getString(110));
                lblCel56.setText(rs.getString(111));
                lblCel57.setText(rs.getString(112));
                lblCel58.setText(rs.getString(113));
                lblCel59.setText(rs.getString(114));
                lblCel60.setText(rs.getString(115));
                
                
                
              

            } else {
                JOptionPane.showMessageDialog(null, "usuário não cadastrado");
                //as linhas abqaixo linpa os campos
                /*txtUsuCol.setText(null);
                txtUsuFon.setText(null);
                txtUsuLog.setText(null);
                txtUsuSen.setText(null);
                cboUsoPerfil.setSelectedItem(null);*/
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    private void pesquisar_produto(){
        String sql = "select * from tbparametrogeral where produto like ?";
        try {
            pst = conexao.prepareStatement(sql);
            
            
            pst.setString(1,txtProduto.getText()+ "%");
            rs = pst.executeQuery();
            
            tblProdutos.setModel(DbUtils.resultSetToTableModel(rs));
            DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
            modelo.setColumnCount(4); //corrigir bug
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    public void setar_campos(){
        int setar = tblProdutos.getSelectedRow();
        txtProduto.setText(tblProdutos.getModel().getValueAt(setar, 3).toString());
        /*mudei de ideia quanto estas linhas para não atrapalhas o usuario, 
        mas vou manter caso precise
        lbl1.setText(tblProdutos.getModel().getValueAt(setar, 4).toString());
        lbl2.setText(tblProdutos.getModel().getValueAt(setar, 5).toString());
        lbl3.setText(tblProdutos.getModel().getValueAt(setar, 6).toString());
        lbl4.setText(tblProdutos.getModel().getValueAt(setar, 7).toString());
        lbl5.setText(tblProdutos.getModel().getValueAt(setar, 8).toString());
        lbl6.setText(tblProdutos.getModel().getValueAt(setar, 9).toString());
        lbl7.setText(tblProdutos.getModel().getValueAt(setar, 10).toString());
        lbl8.setText(tblProdutos.getModel().getValueAt(setar, 11).toString());
        lbl9.setText(tblProdutos.getModel().getValueAt(setar, 12).toString());
        lbl10.setText(tblProdutos.getModel().getValueAt(setar, 13).toString());
        lbl11.setText(tblProdutos.getModel().getValueAt(setar, 14).toString());
        lbl12.setText(tblProdutos.getModel().getValueAt(setar, 15).toString());
        lbl13.setText(tblProdutos.getModel().getValueAt(setar, 16).toString());
        lbl14.setText(tblProdutos.getModel().getValueAt(setar, 17).toString());
        lbl15.setText(tblProdutos.getModel().getValueAt(setar, 18).toString());
        lbl16.setText(tblProdutos.getModel().getValueAt(setar, 19).toString());
        lbl17.setText(tblProdutos.getModel().getValueAt(setar, 20).toString());
        lbl18.setText(tblProdutos.getModel().getValueAt(setar, 21).toString());
        lbl19.setText(tblProdutos.getModel().getValueAt(setar, 22).toString());
        lbl20.setText(tblProdutos.getModel().getValueAt(setar, 23).toString());
        lblCel1.setText(tblProdutos.getModel().getValueAt(setar,24).toString());
        lblObs1.setText(tblProdutos.getModel().getValueAt(setar,25).toString());
        lblCel2.setText(tblProdutos.getModel().getValueAt(setar, 26).toString());
        lblObs2.setText(tblProdutos.getModel().getValueAt(setar, 27).toString());
        lblCel3.setText(tblProdutos.getModel().getValueAt(setar, 28).toString());
        lblObs3.setText(tblProdutos.getModel().getValueAt(setar, 29).toString());
        lblCel4.setText(tblProdutos.getModel().getValueAt(setar, 30).toString());
        lblObs4.setText(tblProdutos.getModel().getValueAt(setar, 31).toString());
        lblCel5.setText(tblProdutos.getModel().getValueAt(setar, 32).toString());
        lblObs5.setText(tblProdutos.getModel().getValueAt(setar, 33).toString());
        lblCel6.setText(tblProdutos.getModel().getValueAt(setar, 34).toString());
        lblObs6.setText(tblProdutos.getModel().getValueAt(setar, 35).toString());
        lblCel7.setText(tblProdutos.getModel().getValueAt(setar, 36).toString());
        lblObs7.setText(tblProdutos.getModel().getValueAt(setar, 37).toString());
        lblCel8.setText(tblProdutos.getModel().getValueAt(setar, 38).toString());
        lblObs8.setText(tblProdutos.getModel().getValueAt(setar, 39).toString());
        lblCel9.setText(tblProdutos.getModel().getValueAt(setar, 40).toString());
        lblObs9.setText(tblProdutos.getModel().getValueAt(setar, 41).toString());
        lblCel10.setText(tblProdutos.getModel().getValueAt(setar,42).toString());
        lblObs10.setText(tblProdutos.getModel().getValueAt(setar,43).toString());
        lblCel11.setText(tblProdutos.getModel().getValueAt(setar,44).toString());
        lblObs11.setText(tblProdutos.getModel().getValueAt(setar, 45).toString());
        lblCel12.setText(tblProdutos.getModel().getValueAt(setar, 46).toString());
        lblObs12.setText(tblProdutos.getModel().getValueAt(setar, 47).toString());
        lblCel13.setText(tblProdutos.getModel().getValueAt(setar,48).toString());
        lblObs13.setText(tblProdutos.getModel().getValueAt(setar,49).toString());
        lblCel14.setText(tblProdutos.getModel().getValueAt(setar,50).toString());
        lblObs14.setText(tblProdutos.getModel().getValueAt(setar,51).toString());
        lblCel15.setText(tblProdutos.getModel().getValueAt(setar,52).toString());
        lblObs15.setText(tblProdutos.getModel().getValueAt(setar,53).toString());
        lblCel16.setText(tblProdutos.getModel().getValueAt(setar,54).toString());
        lblObs16.setText(tblProdutos.getModel().getValueAt(setar,55).toString());
        lblCel17.setText(tblProdutos.getModel().getValueAt(setar, 56).toString());
        lblObs17.setText(tblProdutos.getModel().getValueAt(setar,57).toString());
        lblCel18.setText(tblProdutos.getModel().getValueAt(setar,58).toString());
        lblObs18.setText(tblProdutos.getModel().getValueAt(setar,59).toString());
        lblCel19.setText(tblProdutos.getModel().getValueAt(setar,60).toString());
        lblObs19.setText(tblProdutos.getModel().getValueAt(setar,61).toString());
        lblCel20.setText(tblProdutos.getModel().getValueAt(setar,62).toString());
        lblObs20.setText(tblProdutos.getModel().getValueAt(setar,63).toString());
        lblCel21.setText(tblProdutos.getModel().getValueAt(setar,64).toString());
        lblObs21.setText(tblProdutos.getModel().getValueAt(setar,65).toString());
        lblCel22.setText(tblProdutos.getModel().getValueAt(setar,66).toString());
        lblObs22.setText(tblProdutos.getModel().getValueAt(setar,67).toString());
        lblCel23.setText(tblProdutos.getModel().getValueAt(setar,68).toString());
        lblObs23.setText(tblProdutos.getModel().getValueAt(setar,69).toString());
        lblCel24.setText(tblProdutos.getModel().getValueAt(setar, 70).toString());
        lblObs24.setText(tblProdutos.getModel().getValueAt(setar, 71).toString());
        lblCel25.setText(tblProdutos.getModel().getValueAt(setar, 72).toString());
        lblObs25.setText(tblProdutos.getModel().getValueAt(setar, 73).toString());
        lblCel26.setText(tblProdutos.getModel().getValueAt(setar, 74).toString());
        lblObs26.setText(tblProdutos.getModel().getValueAt(setar, 75).toString());
        lblCel27.setText(tblProdutos.getModel().getValueAt(setar, 76).toString());
        lblObs27.setText(tblProdutos.getModel().getValueAt(setar, 77).toString());
        lblCel28.setText(tblProdutos.getModel().getValueAt(setar, 78).toString());
        lblObs28.setText(tblProdutos.getModel().getValueAt(setar, 79).toString());
        lblCel29.setText(tblProdutos.getModel().getValueAt(setar, 80).toString());
        lblObs29.setText(tblProdutos.getModel().getValueAt(setar, 81).toString());
        lblCel30.setText(tblProdutos.getModel().getValueAt(setar, 82).toString());
        lblObs30.setText(tblProdutos.getModel().getValueAt(setar, 83).toString());
        lblCel31.setText(tblProdutos.getModel().getValueAt(setar, 84).toString());
        lblObs31.setText(tblProdutos.getModel().getValueAt(setar, 85).toString());
        lblCel32.setText(tblProdutos.getModel().getValueAt(setar, 86).toString());
        lblCel33.setText(tblProdutos.getModel().getValueAt(setar, 87).toString());
        lblCel34.setText(tblProdutos.getModel().getValueAt(setar, 88).toString());
        lblCel35.setText(tblProdutos.getModel().getValueAt(setar, 89).toString());
        lblCel36.setText(tblProdutos.getModel().getValueAt(setar, 90).toString());
        lblCel37.setText(tblProdutos.getModel().getValueAt(setar, 91).toString());
        lblCel38.setText(tblProdutos.getModel().getValueAt(setar, 92).toString());
        lblCel39.setText(tblProdutos.getModel().getValueAt(setar, 93).toString());
        lblCel40.setText(tblProdutos.getModel().getValueAt(setar, 94).toString());
        lblCel41.setText(tblProdutos.getModel().getValueAt(setar, 95).toString());
        lblCel42.setText(tblProdutos.getModel().getValueAt(setar, 96).toString());
        lblCel43.setText(tblProdutos.getModel().getValueAt(setar, 97).toString());
        lblCel44.setText(tblProdutos.getModel().getValueAt(setar, 98).toString());
        lblCel45.setText(tblProdutos.getModel().getValueAt(setar, 99).toString());
        lblCel46.setText(tblProdutos.getModel().getValueAt(setar, 100).toString());
        lblCel47.setText(tblProdutos.getModel().getValueAt(setar, 101).toString());
        lblCel48.setText(tblProdutos.getModel().getValueAt(setar, 102).toString());
        lblCel49.setText(tblProdutos.getModel().getValueAt(setar, 103).toString());
        lblCel50.setText(tblProdutos.getModel().getValueAt(setar, 104).toString());
        lblCel51.setText(tblProdutos.getModel().getValueAt(setar, 105).toString());
        lblCel52.setText(tblProdutos.getModel().getValueAt(setar, 106).toString());
        lblCel53.setText(tblProdutos.getModel().getValueAt(setar, 107).toString());
        lblCel54.setText(tblProdutos.getModel().getValueAt(setar, 108).toString());
        lblCel55.setText(tblProdutos.getModel().getValueAt(setar, 109).toString());
        lblCel56.setText(tblProdutos.getModel().getValueAt(setar, 110).toString());
        lblCel57.setText(tblProdutos.getModel().getValueAt(setar, 111).toString());
        lblCel58.setText(tblProdutos.getModel().getValueAt(setar, 112).toString());
        lblCel59.setText(tblProdutos.getModel().getValueAt(setar, 113).toString());
        lblCel60.setText(tblProdutos.getModel().getValueAt(setar, 114).toString());*/
    }
            
    
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jInternalFrame5 = new javax.swing.JInternalFrame();
        jLabel186 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        txtFormato = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lbl6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextPane();
        jLabel30 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        txtEsteira = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        txtAcondi = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        txtAbaste = new javax.swing.JLabel();
        PainelCelofane1 = new javax.swing.JPanel();
        c1_ = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lblCel1 = new javax.swing.JLabel();
        lblObs1 = new javax.swing.JLabel();
        c2 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lblCel2 = new javax.swing.JLabel();
        lblObs2 = new javax.swing.JLabel();
        c3_ = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lblObs3 = new javax.swing.JLabel();
        lblCel3 = new javax.swing.JLabel();
        c4_ = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lblObs4 = new javax.swing.JLabel();
        lblCel4 = new javax.swing.JLabel();
        c5_ = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        lblObs5 = new javax.swing.JLabel();
        lblCel5 = new javax.swing.JLabel();
        c6_ = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        lblCel6 = new javax.swing.JLabel();
        lblObs6 = new javax.swing.JLabel();
        c7 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        lblCel7 = new javax.swing.JLabel();
        lblObs7 = new javax.swing.JLabel();
        c8_ = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        lblCel8 = new javax.swing.JLabel();
        lblObs8 = new javax.swing.JLabel();
        c9 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        lblCel9 = new javax.swing.JLabel();
        lblObs9 = new javax.swing.JLabel();
        c10_ = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        lblCel10 = new javax.swing.JLabel();
        lblObs10 = new javax.swing.JLabel();
        c11_ = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        lblCel11 = new javax.swing.JLabel();
        lblObs11 = new javax.swing.JLabel();
        c12 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        lblObs12 = new javax.swing.JLabel();
        lblCel12 = new javax.swing.JLabel();
        c13 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        lblCel13 = new javax.swing.JLabel();
        lblObs13 = new javax.swing.JLabel();
        c14_ = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        lblObs14 = new javax.swing.JLabel();
        lblCel14 = new javax.swing.JLabel();
        c15_ = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        lblObs15 = new javax.swing.JLabel();
        lblCel15 = new javax.swing.JLabel();
        c16_ = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        lblCel16 = new javax.swing.JLabel();
        lblObs16 = new javax.swing.JLabel();
        c17_ = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        lblCel17 = new javax.swing.JLabel();
        lblObs17 = new javax.swing.JLabel();
        c18_ = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        lblObs18 = new javax.swing.JLabel();
        lblCel18 = new javax.swing.JLabel();
        c19_ = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        lblCel19 = new javax.swing.JLabel();
        lblObs19 = new javax.swing.JLabel();
        c20 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        lblCel20 = new javax.swing.JLabel();
        lblObs20 = new javax.swing.JLabel();
        c21_ = new javax.swing.JPanel();
        lugjhkg = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        lblCel21 = new javax.swing.JLabel();
        lblObs21 = new javax.swing.JLabel();
        c22 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lblCel22 = new javax.swing.JLabel();
        lblObs22 = new javax.swing.JLabel();
        c23_ = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        lblCel23 = new javax.swing.JLabel();
        lblObs23 = new javax.swing.JLabel();
        c24_ = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        lblCel24 = new javax.swing.JLabel();
        lblObs24 = new javax.swing.JLabel();
        c25_ = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        lblObs25 = new javax.swing.JLabel();
        lblCel25 = new javax.swing.JLabel();
        c26 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        lblCel26 = new javax.swing.JLabel();
        lblObs26 = new javax.swing.JLabel();
        c27_ = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        lblObs27 = new javax.swing.JLabel();
        lblCel27 = new javax.swing.JLabel();
        c29_ = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        lblObs29 = new javax.swing.JLabel();
        lblCel29 = new javax.swing.JLabel();
        c28_ = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        lblCel28 = new javax.swing.JLabel();
        lblObs28 = new javax.swing.JLabel();
        c30 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        lblCel30 = new javax.swing.JLabel();
        lblObs30 = new javax.swing.JLabel();
        c31 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        lblCel31 = new javax.swing.JLabel();
        lblObs31 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jTextField43 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        lblCel32 = new javax.swing.JLabel();
        lblCel33 = new javax.swing.JLabel();
        lblCel34 = new javax.swing.JLabel();
        lblCel35 = new javax.swing.JLabel();
        lblCel36 = new javax.swing.JLabel();
        lblCel37 = new javax.swing.JLabel();
        lblCel38 = new javax.swing.JLabel();
        lblCel39 = new javax.swing.JLabel();
        lblCel40 = new javax.swing.JLabel();
        lblCel41 = new javax.swing.JLabel();
        lblCel42 = new javax.swing.JLabel();
        lblCel43 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel111 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblCel44 = new javax.swing.JLabel();
        lblCel45 = new javax.swing.JLabel();
        lblCel46 = new javax.swing.JLabel();
        lblCel47 = new javax.swing.JLabel();
        lblCel48 = new javax.swing.JLabel();
        lblCel49 = new javax.swing.JLabel();
        lblCel50 = new javax.swing.JLabel();
        lblCel51 = new javax.swing.JLabel();
        lblCel52 = new javax.swing.JLabel();
        lblCel53 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblCel54 = new javax.swing.JLabel();
        lblCel55 = new javax.swing.JLabel();
        lblCel56 = new javax.swing.JLabel();
        lblCel57 = new javax.swing.JLabel();
        lblCel58 = new javax.swing.JLabel();
        lblCel59 = new javax.swing.JLabel();
        lblCel60 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelDisplayImage1 = new javax.swing.JLabel();
        labelDisplayImage2 = new javax.swing.JLabel();
        txtObs = new javax.swing.JLabel();
        txtObs2 = new javax.swing.JLabel();
        labelDisplayImage4 = new javax.swing.JLabel();
        labelDisplayImage3 = new javax.swing.JLabel();
        txtObs3 = new javax.swing.JLabel();
        txtObs4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 900));
        setPreferredSize(new java.awt.Dimension(1405, 900));
        setSize(new java.awt.Dimension(850, 900));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1200, 1200));
        jScrollPane1.setRequestFocusEnabled(false);

        jTabbedPane2.setForeground(new java.awt.Color(51, 51, 255));
        jTabbedPane2.setMinimumSize(new java.awt.Dimension(1040, 1600));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(2166, 1500));

        jInternalFrame5.setMaximumSize(new java.awt.Dimension(1000, 1600));
        jInternalFrame5.setVisible(true);

        jLabel186.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        jLabel186.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel186.text")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel6.text")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel5.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel3.text")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel10.text")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel11.text")); // NOI18N

        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 204));
        lbl1.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl1.text")); // NOI18N

        lbl2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 204));
        lbl2.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl2.text")); // NOI18N

        lbl3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl3.setForeground(new java.awt.Color(0, 0, 204));
        lbl3.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl3.text")); // NOI18N

        lbl4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl4.setForeground(new java.awt.Color(0, 0, 204));
        lbl4.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl4.text")); // NOI18N

        lbl5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl5.setForeground(new java.awt.Color(0, 0, 204));
        lbl5.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl5.text")); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel12.text")); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel13.text")); // NOI18N

        jLabel188.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel188.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel188.text")); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel14.text")); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel22.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel22.text")); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel23.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel23.text")); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel25.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel25.text")); // NOI18N

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel27.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel27.text")); // NOI18N

        lbl7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl7.setForeground(new java.awt.Color(0, 0, 204));
        lbl7.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl7.text")); // NOI18N

        lbl8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl8.setForeground(new java.awt.Color(0, 0, 204));
        lbl8.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl8.text")); // NOI18N

        lbl9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl9.setForeground(new java.awt.Color(0, 0, 204));
        lbl9.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl9.text")); // NOI18N

        lbl10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl10.setForeground(new java.awt.Color(51, 0, 204));
        lbl10.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl10.text")); // NOI18N

        lbl11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl11.setForeground(new java.awt.Color(0, 0, 204));
        lbl11.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl11.text")); // NOI18N

        lbl12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl12.setForeground(new java.awt.Color(0, 0, 204));
        lbl12.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl12.text")); // NOI18N

        lbl13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl13.setForeground(new java.awt.Color(0, 0, 204));
        lbl13.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl13.text")); // NOI18N

        lbl14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl14.setForeground(new java.awt.Color(0, 0, 204));
        lbl14.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl14.text")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel1.text")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel2.text")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel4.text")); // NOI18N

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel26.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel26.text")); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel28.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel28.text")); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel29.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel29.text")); // NOI18N

        lbl15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl15.setForeground(new java.awt.Color(0, 0, 204));
        lbl15.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl15.text")); // NOI18N

        lbl16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl16.setForeground(new java.awt.Color(0, 0, 204));
        lbl16.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl16.text")); // NOI18N

        lbl17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl17.setForeground(new java.awt.Color(0, 0, 204));
        lbl17.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl17.text")); // NOI18N

        lbl18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl18.setForeground(new java.awt.Color(0, 0, 204));
        lbl18.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl18.text")); // NOI18N

        lbl19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl19.setForeground(new java.awt.Color(0, 0, 204));
        lbl19.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl19.text")); // NOI18N

        lbl20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl20.setForeground(new java.awt.Color(0, 0, 204));
        lbl20.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl20.text")); // NOI18N

        jLabel122.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(153, 0, 153));
        jLabel122.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel122.text")); // NOI18N

        jLabel123.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(153, 0, 153));
        jLabel123.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel123.text")); // NOI18N

        jLabel124.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(153, 0, 153));
        jLabel124.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel124.text")); // NOI18N

        jLabel125.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(153, 0, 153));
        jLabel125.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel125.text")); // NOI18N

        jLabel126.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel126.text")); // NOI18N

        jLabel127.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel127.text")); // NOI18N

        txtFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormatoActionPerformed(evt);
            }
        });

        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });
        txtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProdutoKeyReleased(evt);
            }
        });

        jButton1.setText(bundle.getString("TelaConsultaMaquina_Celofane.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(bundle.getString("TelaConsultaMaquina_Celofane.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Formato", "Maquina", "Produto", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProdutos.setFocusable(false);
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProdutos);

        lbl6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl6.setForeground(new java.awt.Color(0, 0, 204));
        lbl6.setText(bundle.getString("TelaConsultaMaquina_Celofane.lbl6.text")); // NOI18N

        jLabel24.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel24.text")); // NOI18N

        txtArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtArea.setEnabled(false);
        jScrollPane4.setViewportView(txtArea);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel30.text")); // NOI18N

        jLabel115.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel115.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel115.text")); // NOI18N

        txtEsteira.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEsteira.setForeground(new java.awt.Color(0, 0, 255));
        txtEsteira.setText(bundle.getString("TelaConsultaMaquina_Celofane.txtEsteira.text")); // NOI18N

        jLabel119.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel119.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel119.text")); // NOI18N

        txtAcondi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAcondi.setForeground(new java.awt.Color(0, 0, 255));
        txtAcondi.setText(bundle.getString("TelaConsultaMaquina_Celofane.txtAcondi.text")); // NOI18N

        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel121.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel121.text")); // NOI18N

        txtAbaste.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAbaste.setForeground(new java.awt.Color(0, 0, 255));
        txtAbaste.setText(bundle.getString("TelaConsultaMaquina_Celofane.txtAbaste.text")); // NOI18N

        javax.swing.GroupLayout jInternalFrame5Layout = new javax.swing.GroupLayout(jInternalFrame5.getContentPane());
        jInternalFrame5.getContentPane().setLayout(jInternalFrame5Layout);
        jInternalFrame5Layout.setHorizontalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame5Layout.createSequentialGroup()
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator9)
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel188, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 831, Short.MAX_VALUE)))
                        .addGap(65, 65, 65))
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addComponent(jSeparator10)
                        .addContainerGap())
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl16, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl17, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(lbl19, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl20, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel126)
                            .addComponent(jLabel127))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addComponent(txtFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addComponent(jLabel115)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEsteira, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel119)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAcondi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel121)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAbaste, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame5Layout.setVerticalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel126)
                            .addComponent(txtFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel127)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jInternalFrame5Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel115)
                                .addComponent(txtEsteira)
                                .addComponent(jLabel119)
                                .addComponent(txtAcondi)
                                .addComponent(jLabel121)
                                .addComponent(txtAbaste))
                            .addGap(10, 10, 10))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(lbl2)
                    .addComponent(jLabel186)
                    .addComponent(lbl3)
                    .addComponent(jLabel6)
                    .addComponent(lbl4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(lbl5)
                    .addComponent(lbl6))
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl7)
                            .addComponent(jLabel13)
                            .addComponent(lbl8)
                            .addComponent(jLabel188)
                            .addComponent(lbl9)
                            .addComponent(jLabel14)
                            .addComponent(lbl10)))
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(lbl11)
                            .addComponent(jLabel23)
                            .addComponent(lbl12)
                            .addComponent(jLabel25)
                            .addComponent(lbl13)
                            .addComponent(jLabel27)
                            .addComponent(lbl14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel125)
                .addGap(24, 24, 24)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(lbl15)
                    .addComponent(lbl16)
                    .addComponent(lbl17))
                .addGap(18, 18, 18)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel123)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(lbl18)
                    .addComponent(lbl19)
                    .addComponent(lbl20))
                .addGap(27, 27, 27)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );

        jTabbedPane2.addTab(bundle.getString("TelaConsultaMaquina_Celofane.jInternalFrame5.TabConstraints.tabTitle"), jInternalFrame5); // NOI18N

        PainelCelofane1.setMaximumSize(new java.awt.Dimension(850, 1600));
        PainelCelofane1.setPreferredSize(new java.awt.Dimension(850, 1200));
        PainelCelofane1.setRequestFocusEnabled(false);
        PainelCelofane1.setVerifyInputWhenFocusTarget(false);
        PainelCelofane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c1_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c1_.border.title"))); // NOI18N
        c1_.setMaximumSize(new java.awt.Dimension(400, 50));
        c1_.setPreferredSize(new java.awt.Dimension(450, 55));
        c1_.setRequestFocusEnabled(false);

        jLabel42.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel42.text")); // NOI18N

        jLabel43.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel43.text")); // NOI18N

        lblCel1.setForeground(new java.awt.Color(0, 0, 204));
        lblCel1.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel1.text")); // NOI18N

        lblObs1.setForeground(new java.awt.Color(0, 0, 204));
        lblObs1.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs1.text")); // NOI18N

        javax.swing.GroupLayout c1_Layout = new javax.swing.GroupLayout(c1_);
        c1_.setLayout(c1_Layout);
        c1_Layout.setHorizontalGroup(
            c1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c1_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        c1_Layout.setVerticalGroup(
            c1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c1_Layout.createSequentialGroup()
                .addGroup(c1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(lblCel1)
                    .addComponent(lblObs1)
                    .addComponent(jLabel43))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c1_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 60));
        c1_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c1_.AccessibleContext.accessibleName")); // NOI18N
        c1_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c1_.AccessibleContext.accessibleDescription")); // NOI18N

        c2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c2.border.title"))); // NOI18N
        c2.setMaximumSize(new java.awt.Dimension(400, 50));
        c2.setPreferredSize(new java.awt.Dimension(450, 55));
        c2.setRequestFocusEnabled(false);

        jLabel48.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel48.text")); // NOI18N

        jLabel49.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel49.text")); // NOI18N

        lblCel2.setForeground(new java.awt.Color(0, 0, 204));
        lblCel2.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel2.text")); // NOI18N

        lblObs2.setForeground(new java.awt.Color(0, 0, 204));
        lblObs2.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs2.text")); // NOI18N

        javax.swing.GroupLayout c2Layout = new javax.swing.GroupLayout(c2);
        c2.setLayout(c2Layout);
        c2Layout.setHorizontalGroup(
            c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c2Layout.createSequentialGroup()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        c2Layout.setVerticalGroup(
            c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblCel2)
                .addComponent(lblObs2)
                .addComponent(jLabel48)
                .addComponent(jLabel49))
        );

        PainelCelofane1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 410, 60));
        c2.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c2.AccessibleContext.accessibleName")); // NOI18N
        c2.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c2.AccessibleContext.accessibleDescription")); // NOI18N
        c2.getAccessibleContext().setAccessibleParent(this);

        c3_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c3_.border.title"))); // NOI18N
        c3_.setMaximumSize(new java.awt.Dimension(400, 50));
        c3_.setPreferredSize(new java.awt.Dimension(450, 55));
        c3_.setRequestFocusEnabled(false);

        jLabel44.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel44.text")); // NOI18N

        jLabel45.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel45.text")); // NOI18N

        lblObs3.setForeground(new java.awt.Color(0, 0, 204));
        lblObs3.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs3.text")); // NOI18N

        lblCel3.setForeground(new java.awt.Color(0, 0, 204));
        lblCel3.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel3.text")); // NOI18N

        javax.swing.GroupLayout c3_Layout = new javax.swing.GroupLayout(c3_);
        c3_.setLayout(c3_Layout);
        c3_Layout.setHorizontalGroup(
            c3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c3_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblObs3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        c3_Layout.setVerticalGroup(
            c3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c3_Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel3)
                    .addComponent(lblObs3)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44))
                .addGap(0, 0, 0))
        );

        PainelCelofane1.add(c3_, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 410, 60));
        c3_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c3_.AccessibleContext.accessibleName")); // NOI18N
        c3_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c3_.AccessibleContext.accessibleDescription")); // NOI18N
        c3_.getAccessibleContext().setAccessibleParent(this);

        c4_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c4_.border.title"))); // NOI18N
        c4_.setMaximumSize(new java.awt.Dimension(400, 50));
        c4_.setPreferredSize(new java.awt.Dimension(450, 55));
        c4_.setRequestFocusEnabled(false);

        jLabel46.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel46.text")); // NOI18N

        jLabel47.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel47.text")); // NOI18N

        lblObs4.setForeground(new java.awt.Color(0, 0, 204));
        lblObs4.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs4.text")); // NOI18N

        lblCel4.setForeground(new java.awt.Color(0, 0, 204));
        lblCel4.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel4.text")); // NOI18N

        javax.swing.GroupLayout c4_Layout = new javax.swing.GroupLayout(c4_);
        c4_.setLayout(c4_Layout);
        c4_Layout.setHorizontalGroup(
            c4_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c4_Layout.createSequentialGroup()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblObs4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        c4_Layout.setVerticalGroup(
            c4_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c4_Layout.createSequentialGroup()
                .addGroup(c4_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel4)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObs4))
                .addGap(0, 0, 0))
        );

        PainelCelofane1.add(c4_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 60));
        c4_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c4_.AccessibleContext.accessibleName")); // NOI18N
        c4_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c4_.AccessibleContext.accessibleDescription")); // NOI18N
        c4_.getAccessibleContext().setAccessibleParent(this);

        c5_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c5_.border.title"))); // NOI18N
        c5_.setMaximumSize(new java.awt.Dimension(400, 50));
        c5_.setPreferredSize(new java.awt.Dimension(455, 55));
        c5_.setRequestFocusEnabled(false);

        jLabel54.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel54.text")); // NOI18N

        jLabel55.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel55.text")); // NOI18N

        lblObs5.setForeground(new java.awt.Color(0, 0, 204));
        lblObs5.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs5.text")); // NOI18N

        lblCel5.setForeground(new java.awt.Color(0, 0, 204));
        lblCel5.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel5.text")); // NOI18N

        javax.swing.GroupLayout c5_Layout = new javax.swing.GroupLayout(c5_);
        c5_.setLayout(c5_Layout);
        c5_Layout.setHorizontalGroup(
            c5_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c5_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 401, 401))
        );
        c5_Layout.setVerticalGroup(
            c5_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c5_Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c5_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(lblCel5)
                    .addComponent(jLabel55)
                    .addComponent(lblObs5))
                .addGap(0, 0, 0))
        );

        PainelCelofane1.add(c5_, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 410, 60));
        c5_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c5_.AccessibleContext.accessibleName")); // NOI18N
        c5_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c5_.AccessibleContext.accessibleDescription")); // NOI18N
        c5_.getAccessibleContext().setAccessibleParent(this);

        c6_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c6_.border.title"))); // NOI18N
        c6_.setMaximumSize(new java.awt.Dimension(450, 55));
        c6_.setPreferredSize(new java.awt.Dimension(450, 55));
        c6_.setRequestFocusEnabled(false);

        jLabel108.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel108.text")); // NOI18N

        jLabel109.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel109.text")); // NOI18N

        lblCel6.setForeground(new java.awt.Color(0, 0, 204));
        lblCel6.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel6.text")); // NOI18N

        lblObs6.setForeground(new java.awt.Color(0, 0, 204));
        lblObs6.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs6.text")); // NOI18N

        javax.swing.GroupLayout c6_Layout = new javax.swing.GroupLayout(c6_);
        c6_.setLayout(c6_Layout);
        c6_Layout.setHorizontalGroup(
            c6_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c6_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        c6_Layout.setVerticalGroup(
            c6_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c6_Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c6_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(lblCel6)
                    .addComponent(jLabel109)
                    .addComponent(lblObs6))
                .addGap(0, 0, 0))
        );

        PainelCelofane1.add(c6_, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 410, 60));
        c6_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c6_.AccessibleContext.accessibleName")); // NOI18N
        c6_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c6_.AccessibleContext.accessibleDescription")); // NOI18N
        c6_.getAccessibleContext().setAccessibleParent(this);

        c7.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c7.border.title"))); // NOI18N
        c7.setMaximumSize(new java.awt.Dimension(450, 55));
        c7.setPreferredSize(new java.awt.Dimension(400, 50));
        c7.setRequestFocusEnabled(false);

        jLabel56.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel56.text")); // NOI18N

        jLabel57.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel57.text")); // NOI18N

        lblCel7.setForeground(new java.awt.Color(0, 0, 204));
        lblCel7.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel7.text")); // NOI18N

        lblObs7.setForeground(new java.awt.Color(0, 0, 204));
        lblObs7.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs7.text")); // NOI18N

        javax.swing.GroupLayout c7Layout = new javax.swing.GroupLayout(c7);
        c7.setLayout(c7Layout);
        c7Layout.setHorizontalGroup(
            c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs7, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );
        c7Layout.setVerticalGroup(
            c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(lblCel7)
                    .addComponent(jLabel57)
                    .addComponent(lblObs7))
                .addGap(0, 0, 0))
        );

        PainelCelofane1.add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 380, 60));
        c7.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c7.AccessibleContext.accessibleName")); // NOI18N
        c7.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c7.AccessibleContext.accessibleDescription")); // NOI18N
        c7.getAccessibleContext().setAccessibleParent(this);

        c8_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c8_.border.title"))); // NOI18N
        c8_.setMaximumSize(new java.awt.Dimension(450, 55));
        c8_.setPreferredSize(new java.awt.Dimension(400, 50));
        c8_.setRequestFocusEnabled(false);

        jLabel52.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel52.text")); // NOI18N

        jLabel53.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel53.text")); // NOI18N

        lblCel8.setForeground(new java.awt.Color(0, 0, 204));
        lblCel8.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel8.text")); // NOI18N

        lblObs8.setForeground(new java.awt.Color(0, 0, 204));
        lblObs8.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs8.text")); // NOI18N

        javax.swing.GroupLayout c8_Layout = new javax.swing.GroupLayout(c8_);
        c8_.setLayout(c8_Layout);
        c8_Layout.setHorizontalGroup(
            c8_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c8_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblCel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c8_Layout.setVerticalGroup(
            c8_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c8_Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c8_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel8)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(lblObs8))
                .addGap(0, 0, 0))
        );

        PainelCelofane1.add(c8_, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 410, 60));
        c8_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c8_.AccessibleContext.accessibleName")); // NOI18N
        c8_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c8_.AccessibleContext.accessibleDescription")); // NOI18N
        c8_.getAccessibleContext().setAccessibleParent(this);

        c9.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c9.border.title"))); // NOI18N
        c9.setMaximumSize(new java.awt.Dimension(400, 50));
        c9.setPreferredSize(new java.awt.Dimension(400, 50));
        c9.setRequestFocusEnabled(false);
        c9.setVerifyInputWhenFocusTarget(false);

        jLabel60.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel60.text")); // NOI18N

        jLabel61.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel61.text")); // NOI18N

        lblCel9.setForeground(new java.awt.Color(0, 0, 204));
        lblCel9.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel9.text")); // NOI18N

        lblObs9.setForeground(new java.awt.Color(0, 0, 204));
        lblObs9.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs9.text")); // NOI18N

        javax.swing.GroupLayout c9Layout = new javax.swing.GroupLayout(c9);
        c9.setLayout(c9Layout);
        c9Layout.setHorizontalGroup(
            c9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblCel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs9, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        c9Layout.setVerticalGroup(
            c9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(lblCel9)
                    .addComponent(jLabel61)
                    .addComponent(lblObs9))
                .addGap(0, 0, 0))
        );

        PainelCelofane1.add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 410, 60));
        c9.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c9.AccessibleContext.accessibleName")); // NOI18N
        c9.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c9.AccessibleContext.accessibleDescription")); // NOI18N
        c9.getAccessibleContext().setAccessibleParent(this);

        c10_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c10_.border.title"))); // NOI18N
        c10_.setMaximumSize(new java.awt.Dimension(400, 50));
        c10_.setPreferredSize(new java.awt.Dimension(400, 50));
        c10_.setRequestFocusEnabled(false);
        c10_.setVerifyInputWhenFocusTarget(false);

        jLabel62.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel62.text")); // NOI18N

        jLabel63.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel63.text")); // NOI18N

        lblCel10.setForeground(new java.awt.Color(0, 0, 204));
        lblCel10.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel10.text")); // NOI18N

        lblObs10.setForeground(new java.awt.Color(0, 0, 204));
        lblObs10.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs10.text")); // NOI18N

        javax.swing.GroupLayout c10_Layout = new javax.swing.GroupLayout(c10_);
        c10_.setLayout(c10_Layout);
        c10_Layout.setHorizontalGroup(
            c10_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c10_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(427, 427, 427))
        );
        c10_Layout.setVerticalGroup(
            c10_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c10_Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c10_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(lblCel10)
                    .addComponent(jLabel63)
                    .addComponent(lblObs10))
                .addGap(0, 0, 0))
        );

        PainelCelofane1.add(c10_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 380, 60));
        c10_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c10_.AccessibleContext.accessibleName")); // NOI18N
        c10_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c10_.AccessibleContext.accessibleDescription")); // NOI18N
        c10_.getAccessibleContext().setAccessibleParent(this);

        c11_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c11_.border.title"))); // NOI18N
        c11_.setMaximumSize(new java.awt.Dimension(400, 50));
        c11_.setPreferredSize(new java.awt.Dimension(400, 50));
        c11_.setRequestFocusEnabled(false);
        c11_.setVerifyInputWhenFocusTarget(false);

        jLabel64.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel64.text")); // NOI18N

        jLabel65.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel65.text")); // NOI18N

        lblCel11.setForeground(new java.awt.Color(0, 0, 204));
        lblCel11.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel11.text")); // NOI18N

        lblObs11.setForeground(new java.awt.Color(0, 0, 204));
        lblObs11.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs11.text")); // NOI18N

        javax.swing.GroupLayout c11_Layout = new javax.swing.GroupLayout(c11_);
        c11_.setLayout(c11_Layout);
        c11_Layout.setHorizontalGroup(
            c11_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c11_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs11, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        c11_Layout.setVerticalGroup(
            c11_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c11_Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c11_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(lblCel11)
                    .addComponent(jLabel65)
                    .addComponent(lblObs11))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c11_, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 410, 60));
        c11_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c11_.AccessibleContext.accessibleName")); // NOI18N
        c11_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c11_.AccessibleContext.accessibleDescription")); // NOI18N
        c11_.getAccessibleContext().setAccessibleParent(this);

        c12.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c12.border.title"))); // NOI18N
        c12.setMaximumSize(new java.awt.Dimension(400, 50));
        c12.setPreferredSize(new java.awt.Dimension(400, 50));
        c12.setRequestFocusEnabled(false);
        c12.setVerifyInputWhenFocusTarget(false);

        jLabel68.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel68.text")); // NOI18N

        jLabel69.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel69.text")); // NOI18N

        lblObs12.setForeground(new java.awt.Color(0, 0, 204));
        lblObs12.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs12.text")); // NOI18N

        lblCel12.setForeground(new java.awt.Color(0, 0, 204));
        lblCel12.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel12.text")); // NOI18N

        javax.swing.GroupLayout c12Layout = new javax.swing.GroupLayout(c12);
        c12.setLayout(c12Layout);
        c12Layout.setHorizontalGroup(
            c12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs12, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );
        c12Layout.setVerticalGroup(
            c12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(lblCel12)
                    .addComponent(jLabel69)
                    .addComponent(lblObs12))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 410, 60));
        c12.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c12.AccessibleContext.accessibleName")); // NOI18N
        c12.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c12.AccessibleContext.accessibleDescription")); // NOI18N
        c12.getAccessibleContext().setAccessibleParent(this);

        c13.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c13.border.title"))); // NOI18N
        c13.setMaximumSize(new java.awt.Dimension(400, 50));
        c13.setPreferredSize(new java.awt.Dimension(400, 50));
        c13.setRequestFocusEnabled(false);
        c13.setVerifyInputWhenFocusTarget(false);

        jLabel66.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel66.text")); // NOI18N

        jLabel67.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel67.text")); // NOI18N

        lblCel13.setForeground(new java.awt.Color(0, 0, 204));
        lblCel13.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel13.text")); // NOI18N

        lblObs13.setForeground(new java.awt.Color(0, 0, 204));
        lblObs13.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs13.text")); // NOI18N

        javax.swing.GroupLayout c13Layout = new javax.swing.GroupLayout(c13);
        c13.setLayout(c13Layout);
        c13Layout.setHorizontalGroup(
            c13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c13Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs13, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        c13Layout.setVerticalGroup(
            c13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(c13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(lblCel13)
                    .addComponent(jLabel67)
                    .addComponent(lblObs13))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 380, 70));
        c13.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c13.AccessibleContext.accessibleName")); // NOI18N
        c13.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c13.AccessibleContext.accessibleDescription")); // NOI18N
        c13.getAccessibleContext().setAccessibleParent(this);

        c14_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c14_.border.title"))); // NOI18N
        c14_.setMaximumSize(new java.awt.Dimension(400, 50));
        c14_.setPreferredSize(new java.awt.Dimension(400, 50));
        c14_.setRequestFocusEnabled(false);
        c14_.setVerifyInputWhenFocusTarget(false);

        jLabel70.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel70.text")); // NOI18N

        jLabel71.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel71.text")); // NOI18N

        lblObs14.setForeground(new java.awt.Color(0, 0, 204));
        lblObs14.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs14.text")); // NOI18N

        lblCel14.setForeground(new java.awt.Color(0, 0, 204));
        lblCel14.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel14.text")); // NOI18N

        javax.swing.GroupLayout c14_Layout = new javax.swing.GroupLayout(c14_);
        c14_.setLayout(c14_Layout);
        c14_Layout.setHorizontalGroup(
            c14_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c14_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObs14, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(406, 406, 406))
        );
        c14_Layout.setVerticalGroup(
            c14_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c14_Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c14_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(lblCel14)
                    .addComponent(jLabel71)
                    .addComponent(lblObs14))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c14_, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 410, 60));
        c14_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c14_.AccessibleContext.accessibleName")); // NOI18N
        c14_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c14_.AccessibleContext.accessibleDescription")); // NOI18N
        c14_.getAccessibleContext().setAccessibleParent(this);

        c15_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c15_.border.title"))); // NOI18N
        c15_.setMaximumSize(new java.awt.Dimension(400, 50));
        c15_.setPreferredSize(new java.awt.Dimension(400, 50));
        c15_.setRequestFocusEnabled(false);
        c15_.setVerifyInputWhenFocusTarget(false);

        jLabel72.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel72.text")); // NOI18N

        jLabel73.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel73.text")); // NOI18N

        lblObs15.setForeground(new java.awt.Color(0, 0, 204));
        lblObs15.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs15.text")); // NOI18N

        lblCel15.setForeground(new java.awt.Color(0, 0, 204));
        lblCel15.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel15.text")); // NOI18N

        javax.swing.GroupLayout c15_Layout = new javax.swing.GroupLayout(c15_);
        c15_.setLayout(c15_Layout);
        c15_Layout.setHorizontalGroup(
            c15_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c15_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs15, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        c15_Layout.setVerticalGroup(
            c15_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c15_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(c15_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(lblCel15)
                    .addComponent(jLabel73)
                    .addComponent(lblObs15))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c15_, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 410, 70));
        c15_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c15_.AccessibleContext.accessibleName")); // NOI18N
        c15_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c15_.AccessibleContext.accessibleDescription")); // NOI18N
        c15_.getAccessibleContext().setAccessibleParent(this);

        c16_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c16_.border.title"))); // NOI18N
        c16_.setMaximumSize(new java.awt.Dimension(400, 50));
        c16_.setPreferredSize(new java.awt.Dimension(400, 50));
        c16_.setRequestFocusEnabled(false);
        c16_.setVerifyInputWhenFocusTarget(false);

        jLabel78.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel78.text")); // NOI18N

        jLabel79.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel79.text")); // NOI18N

        lblCel16.setForeground(new java.awt.Color(0, 0, 204));
        lblCel16.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel16.text")); // NOI18N

        lblObs16.setForeground(new java.awt.Color(0, 0, 204));
        lblObs16.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs16.text")); // NOI18N

        javax.swing.GroupLayout c16_Layout = new javax.swing.GroupLayout(c16_);
        c16_.setLayout(c16_Layout);
        c16_Layout.setHorizontalGroup(
            c16_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c16_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs16, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
        );
        c16_Layout.setVerticalGroup(
            c16_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c16_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(c16_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(lblCel16)
                    .addComponent(jLabel79)
                    .addComponent(lblObs16))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c16_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 380, 60));
        c16_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c16_.AccessibleContext.accessibleName")); // NOI18N
        c16_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c16_.AccessibleContext.accessibleDescription")); // NOI18N
        c16_.getAccessibleContext().setAccessibleParent(this);

        c17_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c17_.border.title"))); // NOI18N
        c17_.setMaximumSize(new java.awt.Dimension(400, 50));
        c17_.setPreferredSize(new java.awt.Dimension(400, 50));
        c17_.setRequestFocusEnabled(false);
        c17_.setVerifyInputWhenFocusTarget(false);

        jLabel74.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel74.text")); // NOI18N

        jLabel75.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel75.text")); // NOI18N

        lblCel17.setForeground(new java.awt.Color(0, 0, 204));
        lblCel17.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel17.text")); // NOI18N

        lblObs17.setForeground(new java.awt.Color(0, 0, 204));
        lblObs17.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs17.text")); // NOI18N

        javax.swing.GroupLayout c17_Layout = new javax.swing.GroupLayout(c17_);
        c17_.setLayout(c17_Layout);
        c17_Layout.setHorizontalGroup(
            c17_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c17_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObs17, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        c17_Layout.setVerticalGroup(
            c17_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c17_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(c17_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(lblCel17)
                    .addComponent(jLabel75)
                    .addComponent(lblObs17))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c17_, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 410, 60));
        c17_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c17_.AccessibleContext.accessibleName")); // NOI18N
        c17_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c17_.AccessibleContext.accessibleDescription")); // NOI18N
        c17_.getAccessibleContext().setAccessibleParent(this);

        c18_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c18_.border.title"))); // NOI18N
        c18_.setMaximumSize(new java.awt.Dimension(400, 50));
        c18_.setPreferredSize(new java.awt.Dimension(400, 50));
        c18_.setRequestFocusEnabled(false);
        c18_.setVerifyInputWhenFocusTarget(false);

        jLabel80.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel80.text")); // NOI18N

        jLabel81.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel81.text")); // NOI18N

        lblObs18.setForeground(new java.awt.Color(0, 0, 204));
        lblObs18.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs18.text")); // NOI18N

        lblCel18.setForeground(new java.awt.Color(0, 0, 204));
        lblCel18.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel18.text")); // NOI18N

        javax.swing.GroupLayout c18_Layout = new javax.swing.GroupLayout(c18_);
        c18_.setLayout(c18_Layout);
        c18_Layout.setHorizontalGroup(
            c18_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c18_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs18, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        c18_Layout.setVerticalGroup(
            c18_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c18_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(c18_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(lblCel18)
                    .addComponent(jLabel81)
                    .addComponent(lblObs18))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c18_, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 410, 60));
        c18_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c18_.AccessibleContext.accessibleName")); // NOI18N
        c18_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c18_.AccessibleContext.accessibleDescription")); // NOI18N
        c18_.getAccessibleContext().setAccessibleParent(this);

        c19_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c19_.border.title"))); // NOI18N
        c19_.setMaximumSize(new java.awt.Dimension(400, 50));
        c19_.setPreferredSize(new java.awt.Dimension(400, 50));
        c19_.setRequestFocusEnabled(false);
        c19_.setVerifyInputWhenFocusTarget(false);

        jLabel76.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel76.text")); // NOI18N

        jLabel77.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel77.text")); // NOI18N

        lblCel19.setForeground(new java.awt.Color(0, 0, 204));
        lblCel19.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel19.text")); // NOI18N

        lblObs19.setForeground(new java.awt.Color(0, 0, 204));
        lblObs19.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs19.text")); // NOI18N

        javax.swing.GroupLayout c19_Layout = new javax.swing.GroupLayout(c19_);
        c19_.setLayout(c19_Layout);
        c19_Layout.setHorizontalGroup(
            c19_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c19_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs19, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c19_Layout.setVerticalGroup(
            c19_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c19_Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c19_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(lblCel19)
                    .addComponent(jLabel77)
                    .addComponent(lblObs19))
                .addGap(0, 0, 0))
        );

        PainelCelofane1.add(c19_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 380, 60));
        c19_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c19_.AccessibleContext.accessibleName")); // NOI18N
        c19_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c19_.AccessibleContext.accessibleDescription")); // NOI18N
        c19_.getAccessibleContext().setAccessibleParent(this);

        c20.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c20.border.title"))); // NOI18N
        c20.setMaximumSize(new java.awt.Dimension(400, 50));
        c20.setPreferredSize(new java.awt.Dimension(400, 50));
        c20.setRequestFocusEnabled(false);
        c20.setVerifyInputWhenFocusTarget(false);

        jLabel82.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel82.text")); // NOI18N

        jLabel83.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel83.text")); // NOI18N

        lblCel20.setForeground(new java.awt.Color(0, 0, 204));
        lblCel20.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel20.text")); // NOI18N

        lblObs20.setForeground(new java.awt.Color(0, 0, 204));
        lblObs20.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs20.text")); // NOI18N

        javax.swing.GroupLayout c20Layout = new javax.swing.GroupLayout(c20);
        c20.setLayout(c20Layout);
        c20Layout.setHorizontalGroup(
            c20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs20, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        c20Layout.setVerticalGroup(
            c20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c20Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel20)
                    .addComponent(lblObs20)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 410, 60));
        c20.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c20.AccessibleContext.accessibleName")); // NOI18N
        c20.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c20.AccessibleContext.accessibleDescription")); // NOI18N
        c20.getAccessibleContext().setAccessibleParent(this);

        c21_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c21_.border.title"))); // NOI18N
        c21_.setMaximumSize(new java.awt.Dimension(400, 50));
        c21_.setPreferredSize(new java.awt.Dimension(400, 50));
        c21_.setRequestFocusEnabled(false);
        c21_.setVerifyInputWhenFocusTarget(false);

        lugjhkg.setText(bundle.getString("TelaConsultaMaquina_Celofane.lugjhkg.text")); // NOI18N

        jLabel89.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel89.text")); // NOI18N

        lblCel21.setForeground(new java.awt.Color(0, 0, 204));
        lblCel21.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel21.text")); // NOI18N

        lblObs21.setForeground(new java.awt.Color(0, 0, 204));
        lblObs21.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs21.text")); // NOI18N

        javax.swing.GroupLayout c21_Layout = new javax.swing.GroupLayout(c21_);
        c21_.setLayout(c21_Layout);
        c21_Layout.setHorizontalGroup(
            c21_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c21_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lugjhkg, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs21, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        c21_Layout.setVerticalGroup(
            c21_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c21_Layout.createSequentialGroup()
                .addGroup(c21_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel21)
                    .addComponent(lblObs21)
                    .addComponent(jLabel89)
                    .addComponent(lugjhkg))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c21_, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 410, 60));
        c21_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c21_.AccessibleContext.accessibleName")); // NOI18N
        c21_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c21_.AccessibleContext.accessibleDescription")); // NOI18N
        c21_.getAccessibleContext().setAccessibleParent(this);

        c22.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c22.border.title"))); // NOI18N
        c22.setMaximumSize(new java.awt.Dimension(400, 50));
        c22.setPreferredSize(new java.awt.Dimension(400, 50));
        c22.setRequestFocusEnabled(false);
        c22.setVerifyInputWhenFocusTarget(false);

        jLabel50.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel50.text")); // NOI18N

        jLabel51.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel51.text")); // NOI18N

        lblCel22.setForeground(new java.awt.Color(0, 0, 204));
        lblCel22.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel22.text")); // NOI18N

        lblObs22.setForeground(new java.awt.Color(0, 0, 204));
        lblObs22.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs22.text")); // NOI18N

        javax.swing.GroupLayout c22Layout = new javax.swing.GroupLayout(c22);
        c22.setLayout(c22Layout);
        c22Layout.setHorizontalGroup(
            c22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs22, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );
        c22Layout.setVerticalGroup(
            c22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c22Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel22)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(lblObs22))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 380, 60));
        c22.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c22.AccessibleContext.accessibleName")); // NOI18N
        c22.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c22.AccessibleContext.accessibleDescription")); // NOI18N
        c22.getAccessibleContext().setAccessibleParent(this);

        c23_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c23_.border.title"))); // NOI18N
        c23_.setMaximumSize(new java.awt.Dimension(400, 50));
        c23_.setPreferredSize(new java.awt.Dimension(400, 50));
        c23_.setRequestFocusEnabled(false);
        c23_.setVerifyInputWhenFocusTarget(false);

        jLabel58.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel58.text")); // NOI18N

        jLabel59.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel59.text")); // NOI18N

        lblCel23.setForeground(new java.awt.Color(0, 0, 204));
        lblCel23.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel23.text")); // NOI18N

        lblObs23.setForeground(new java.awt.Color(0, 0, 204));
        lblObs23.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs23.text")); // NOI18N

        javax.swing.GroupLayout c23_Layout = new javax.swing.GroupLayout(c23_);
        c23_.setLayout(c23_Layout);
        c23_Layout.setHorizontalGroup(
            c23_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c23_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs23, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c23_Layout.setVerticalGroup(
            c23_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c23_Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c23_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(c23_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCel23)
                        .addComponent(jLabel59)
                        .addComponent(lblObs23))
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        PainelCelofane1.add(c23_, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 410, 60));
        c23_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c23_.AccessibleContext.accessibleName")); // NOI18N
        c23_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c23_.AccessibleContext.accessibleDescription")); // NOI18N
        c23_.getAccessibleContext().setAccessibleParent(this);

        c24_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c24_.border.title"))); // NOI18N
        c24_.setMaximumSize(new java.awt.Dimension(400, 50));
        c24_.setPreferredSize(new java.awt.Dimension(400, 50));
        c24_.setRequestFocusEnabled(false);
        c24_.setVerifyInputWhenFocusTarget(false);

        jLabel92.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel92.text")); // NOI18N

        jLabel93.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel93.text")); // NOI18N

        lblCel24.setForeground(new java.awt.Color(0, 0, 204));
        lblCel24.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel24.text")); // NOI18N

        lblObs24.setForeground(new java.awt.Color(0, 0, 204));
        lblObs24.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs24.text")); // NOI18N

        javax.swing.GroupLayout c24_Layout = new javax.swing.GroupLayout(c24_);
        c24_.setLayout(c24_Layout);
        c24_Layout.setHorizontalGroup(
            c24_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c24_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs24, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c24_Layout.setVerticalGroup(
            c24_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c24_Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c24_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel24)
                    .addComponent(jLabel92)
                    .addComponent(jLabel93)
                    .addComponent(lblObs24))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c24_, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, 410, 60));
        c24_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c24_.AccessibleContext.accessibleName")); // NOI18N
        c24_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c24_.AccessibleContext.accessibleDescription")); // NOI18N
        c24_.getAccessibleContext().setAccessibleParent(this);

        c25_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c25_.border.title"))); // NOI18N
        c25_.setMaximumSize(new java.awt.Dimension(400, 50));
        c25_.setPreferredSize(new java.awt.Dimension(400, 50));
        c25_.setRequestFocusEnabled(false);
        c25_.setVerifyInputWhenFocusTarget(false);

        jLabel86.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel86.text")); // NOI18N

        jLabel87.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel87.text")); // NOI18N

        lblObs25.setForeground(new java.awt.Color(0, 0, 204));
        lblObs25.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs25.text")); // NOI18N

        lblCel25.setForeground(new java.awt.Color(0, 0, 204));
        lblCel25.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel25.text")); // NOI18N

        javax.swing.GroupLayout c25_Layout = new javax.swing.GroupLayout(c25_);
        c25_.setLayout(c25_Layout);
        c25_Layout.setHorizontalGroup(
            c25_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c25_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs25, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        c25_Layout.setVerticalGroup(
            c25_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c25_Layout.createSequentialGroup()
                .addGroup(c25_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel25)
                    .addComponent(jLabel86)
                    .addComponent(jLabel87)
                    .addComponent(lblObs25))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c25_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 380, 60));
        c25_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c25_.AccessibleContext.accessibleName")); // NOI18N
        c25_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c25_.AccessibleContext.accessibleDescription")); // NOI18N
        c25_.getAccessibleContext().setAccessibleParent(this);

        c26.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c26.border.title"))); // NOI18N
        c26.setMaximumSize(new java.awt.Dimension(400, 50));
        c26.setPreferredSize(new java.awt.Dimension(400, 50));
        c26.setRequestFocusEnabled(false);
        c26.setVerifyInputWhenFocusTarget(false);

        jLabel94.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel94.text")); // NOI18N

        jLabel95.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel95.text")); // NOI18N

        lblCel26.setForeground(new java.awt.Color(0, 0, 204));
        lblCel26.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel26.text")); // NOI18N

        lblObs26.setForeground(new java.awt.Color(0, 0, 204));
        lblObs26.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs26.text")); // NOI18N

        javax.swing.GroupLayout c26Layout = new javax.swing.GroupLayout(c26);
        c26.setLayout(c26Layout);
        c26Layout.setHorizontalGroup(
            c26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs26, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c26Layout.setVerticalGroup(
            c26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c26Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(lblCel26)
                    .addComponent(jLabel95)
                    .addComponent(lblObs26))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 410, 60));
        c26.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c26.AccessibleContext.accessibleName")); // NOI18N
        c26.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c26.AccessibleContext.accessibleDescription")); // NOI18N
        c26.getAccessibleContext().setAccessibleParent(this);

        c27_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c27_.border.title"))); // NOI18N
        c27_.setMaximumSize(new java.awt.Dimension(400, 50));
        c27_.setPreferredSize(new java.awt.Dimension(400, 50));
        c27_.setRequestFocusEnabled(false);
        c27_.setVerifyInputWhenFocusTarget(false);

        jLabel96.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel96.text")); // NOI18N

        jLabel97.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel97.text")); // NOI18N

        lblObs27.setForeground(new java.awt.Color(0, 0, 204));
        lblObs27.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs27.text")); // NOI18N

        lblCel27.setForeground(new java.awt.Color(0, 0, 204));
        lblCel27.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel27.text")); // NOI18N

        javax.swing.GroupLayout c27_Layout = new javax.swing.GroupLayout(c27_);
        c27_.setLayout(c27_Layout);
        c27_Layout.setHorizontalGroup(
            c27_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c27_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs27, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c27_Layout.setVerticalGroup(
            c27_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c27_Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c27_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel27)
                    .addComponent(lblObs27)
                    .addComponent(jLabel96)
                    .addComponent(jLabel97))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c27_, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, 410, 60));
        c27_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c27_.AccessibleContext.accessibleName")); // NOI18N
        c27_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c27_.AccessibleContext.accessibleDescription")); // NOI18N
        c27_.getAccessibleContext().setAccessibleParent(this);

        c29_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c29_.border.title"))); // NOI18N
        c29_.setMaximumSize(new java.awt.Dimension(400, 50));
        c29_.setPreferredSize(new java.awt.Dimension(400, 50));
        c29_.setRequestFocusEnabled(false);
        c29_.setVerifyInputWhenFocusTarget(false);

        jLabel98.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel98.text")); // NOI18N

        jLabel99.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel99.text")); // NOI18N

        lblObs29.setForeground(new java.awt.Color(0, 0, 204));
        lblObs29.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs29.text")); // NOI18N

        lblCel29.setForeground(new java.awt.Color(0, 0, 204));
        lblCel29.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel29.text")); // NOI18N

        javax.swing.GroupLayout c29_Layout = new javax.swing.GroupLayout(c29_);
        c29_.setLayout(c29_Layout);
        c29_Layout.setHorizontalGroup(
            c29_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c29_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCel29, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs29, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        c29_Layout.setVerticalGroup(
            c29_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c29_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(c29_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel29)
                    .addComponent(lblObs29)
                    .addComponent(jLabel98)
                    .addComponent(jLabel99))
                .addGap(28, 28, 28))
        );

        PainelCelofane1.add(c29_, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 410, 60));
        c29_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c29_.AccessibleContext.accessibleName")); // NOI18N
        c29_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c29_.AccessibleContext.accessibleDescription")); // NOI18N
        c29_.getAccessibleContext().setAccessibleParent(this);

        c28_.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c28_.border.title"))); // NOI18N
        c28_.setMaximumSize(new java.awt.Dimension(400, 50));
        c28_.setPreferredSize(new java.awt.Dimension(400, 50));
        c28_.setRequestFocusEnabled(false);
        c28_.setVerifyInputWhenFocusTarget(false);

        jLabel100.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel100.text")); // NOI18N

        jLabel101.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel101.text")); // NOI18N

        lblCel28.setForeground(new java.awt.Color(0, 0, 204));
        lblCel28.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel28.text")); // NOI18N

        lblObs28.setForeground(new java.awt.Color(0, 0, 204));
        lblObs28.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs28.text")); // NOI18N

        javax.swing.GroupLayout c28_Layout = new javax.swing.GroupLayout(c28_);
        c28_.setLayout(c28_Layout);
        c28_Layout.setHorizontalGroup(
            c28_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c28_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel28, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs28, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c28_Layout.setVerticalGroup(
            c28_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c28_Layout.createSequentialGroup()
                .addGroup(c28_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel28)
                    .addComponent(lblObs28)
                    .addComponent(jLabel100)
                    .addComponent(jLabel101))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c28_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 380, 60));
        c28_.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c28_.AccessibleContext.accessibleName")); // NOI18N
        c28_.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c28_.AccessibleContext.accessibleDescription")); // NOI18N
        c28_.getAccessibleContext().setAccessibleParent(this);

        c30.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c30.border.title"))); // NOI18N
        c30.setMaximumSize(new java.awt.Dimension(400, 50));
        c30.setPreferredSize(new java.awt.Dimension(400, 50));
        c30.setRequestFocusEnabled(false);
        c30.setVerifyInputWhenFocusTarget(false);

        jLabel116.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel116.text")); // NOI18N

        jLabel117.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel117.text")); // NOI18N

        lblCel30.setForeground(new java.awt.Color(0, 0, 204));
        lblCel30.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel30.text")); // NOI18N

        lblObs30.setForeground(new java.awt.Color(0, 0, 204));
        lblObs30.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs30.text")); // NOI18N

        javax.swing.GroupLayout c30Layout = new javax.swing.GroupLayout(c30);
        c30.setLayout(c30Layout);
        c30Layout.setHorizontalGroup(
            c30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel30, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs30, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c30Layout.setVerticalGroup(
            c30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c30Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(c30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(lblCel30)
                    .addComponent(jLabel117)
                    .addComponent(lblObs30))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c30, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 410, -1));
        c30.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c30.AccessibleContext.accessibleName")); // NOI18N
        c30.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c30.AccessibleContext.accessibleDescription")); // NOI18N
        c30.getAccessibleContext().setAccessibleParent(this);

        c31.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.c31.border.title"))); // NOI18N
        c31.setMaximumSize(new java.awt.Dimension(400, 50));
        c31.setPreferredSize(new java.awt.Dimension(400, 50));
        c31.setRequestFocusEnabled(false);
        c31.setVerifyInputWhenFocusTarget(false);

        jLabel102.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel102.text")); // NOI18N

        jLabel103.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel103.text")); // NOI18N

        lblCel31.setForeground(new java.awt.Color(0, 0, 204));
        lblCel31.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel31.text")); // NOI18N

        lblObs31.setForeground(new java.awt.Color(0, 0, 204));
        lblObs31.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblObs31.text")); // NOI18N

        javax.swing.GroupLayout c31Layout = new javax.swing.GroupLayout(c31);
        c31.setLayout(c31Layout);
        c31Layout.setHorizontalGroup(
            c31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCel31, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs31, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );
        c31Layout.setVerticalGroup(
            c31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c31Layout.createSequentialGroup()
                .addGroup(c31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel31)
                    .addComponent(lblObs31)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        PainelCelofane1.add(c31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 380, 60));
        c31.getAccessibleContext().setAccessibleName(bundle.getString("TelaConsultaMaquina_Celofane.c31.AccessibleContext.accessibleName")); // NOI18N
        c31.getAccessibleContext().setAccessibleDescription(bundle.getString("TelaConsultaMaquina_Celofane.c31.AccessibleContext.accessibleDescription")); // NOI18N
        c31.getAccessibleContext().setAccessibleParent(this);

        jTabbedPane2.addTab(bundle.getString("TelaConsultaMaquina_Celofane.PainelCelofane1.TabConstraints.tabTitle"), PainelCelofane1); // NOI18N
        PainelCelofane1.getAccessibleContext().setAccessibleParent(this);

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1000, 900));

        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });

        jPanel7.setPreferredSize(new java.awt.Dimension(1000, 800));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel31.text")); // NOI18N

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel32.text")); // NOI18N

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel33.text")); // NOI18N

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel34.text")); // NOI18N

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel35.text")); // NOI18N

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel36.text")); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel37.text")); // NOI18N

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel38.text")); // NOI18N

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel39.text")); // NOI18N

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel40.text")); // NOI18N

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel41.text")); // NOI18N

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel84.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel84.text")); // NOI18N

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel85.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel85.text")); // NOI18N

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel88.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel88.text")); // NOI18N

        jLabel90.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel90.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel90.text")); // NOI18N

        lblCel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel32.setForeground(new java.awt.Color(51, 51, 255));
        lblCel32.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel32.text")); // NOI18N

        lblCel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel33.setForeground(new java.awt.Color(51, 51, 255));
        lblCel33.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel33.text")); // NOI18N

        lblCel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel34.setForeground(new java.awt.Color(51, 51, 255));
        lblCel34.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel34.text")); // NOI18N

        lblCel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel35.setForeground(new java.awt.Color(51, 51, 255));
        lblCel35.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel35.text")); // NOI18N

        lblCel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel36.setForeground(new java.awt.Color(51, 51, 255));
        lblCel36.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel36.text")); // NOI18N

        lblCel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel37.setForeground(new java.awt.Color(51, 51, 255));
        lblCel37.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel37.text")); // NOI18N

        lblCel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel38.setForeground(new java.awt.Color(51, 51, 255));
        lblCel38.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel38.text")); // NOI18N

        lblCel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel39.setForeground(new java.awt.Color(51, 51, 255));
        lblCel39.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel39.text")); // NOI18N

        lblCel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel40.setForeground(new java.awt.Color(51, 51, 255));
        lblCel40.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel40.text")); // NOI18N

        lblCel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel41.setForeground(new java.awt.Color(51, 51, 255));
        lblCel41.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel41.text")); // NOI18N

        lblCel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel42.setForeground(new java.awt.Color(51, 51, 255));
        lblCel42.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel42.text")); // NOI18N

        lblCel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel43.setForeground(new java.awt.Color(51, 51, 255));
        lblCel43.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel43.text")); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCel35, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCel34, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCel32, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCel33, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel88)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblCel42, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(50, 50, 50)
                                            .addComponent(jLabel90)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblCel43, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(87, 87, 87))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblCel39, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(9, 9, 9)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jLabel41)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblCel40, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCel38, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel84)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblCel41, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(23, 23, 23))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblCel36, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel37)
                                            .addGap(17, 17, 17)
                                            .addComponent(lblCel37, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel38))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(lblCel32))
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(lblCel33))
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(lblCel34))
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(lblCel35))
                .addGap(12, 12, 12)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel35)
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(lblCel36)
                    .addComponent(jLabel37)
                    .addComponent(lblCel37)
                    .addComponent(lblCel38)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel84)
                    .addComponent(lblCel39)
                    .addComponent(lblCel40)
                    .addComponent(lblCel41))
                .addGap(13, 13, 13)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(lblCel42)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel90)
                            .addComponent(lblCel43))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(444, 444, 444))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab(bundle.getString("TelaConsultaMaquina_Celofane.jPanel4.TabConstraints.tabTitle"), jPanel4); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel7.text")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel8.text")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel9.text")); // NOI18N

        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel91.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel91.text")); // NOI18N

        jLabel104.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel104.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel104.text")); // NOI18N

        jLabel105.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel105.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel105.text")); // NOI18N

        jLabel106.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel106.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel106.text")); // NOI18N

        jLabel110.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel110.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel110.text")); // NOI18N

        jLabel111.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel111.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel111.text")); // NOI18N

        jLabel107.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel107.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel107.text")); // NOI18N

        jLabel112.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel112.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel112.text")); // NOI18N

        jLabel113.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel113.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel113.text")); // NOI18N

        jLabel114.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel114.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel114.text")); // NOI18N

        lblCel44.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel44.setForeground(new java.awt.Color(51, 51, 255));
        lblCel44.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel44.text")); // NOI18N

        lblCel45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel45.setForeground(new java.awt.Color(51, 51, 255));
        lblCel45.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel45.text")); // NOI18N

        lblCel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel46.setForeground(new java.awt.Color(51, 51, 255));
        lblCel46.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel46.text")); // NOI18N

        lblCel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel47.setForeground(new java.awt.Color(51, 51, 255));
        lblCel47.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel47.text")); // NOI18N

        lblCel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel48.setForeground(new java.awt.Color(51, 51, 255));
        lblCel48.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel48.text")); // NOI18N

        lblCel49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel49.setForeground(new java.awt.Color(51, 51, 255));
        lblCel49.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel49.text")); // NOI18N

        lblCel50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel50.setForeground(new java.awt.Color(51, 51, 255));
        lblCel50.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel50.text")); // NOI18N

        lblCel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel51.setForeground(new java.awt.Color(51, 51, 255));
        lblCel51.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel51.text")); // NOI18N

        lblCel52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel52.setForeground(new java.awt.Color(51, 51, 255));
        lblCel52.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel52.text")); // NOI18N

        lblCel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel53.setForeground(new java.awt.Color(51, 51, 255));
        lblCel53.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel53.text")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCel46, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel106)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCel49, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblCel50, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel112)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCel51, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel113)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jLabel114)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCel52, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(230, 230, 230))
                                .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCel44, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCel45, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel110)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel104)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCel47, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel105)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCel48, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel91)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel91)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCel44)
                    .addComponent(jLabel8)
                    .addComponent(lblCel45))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblCel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110)
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel104)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106)
                            .addComponent(lblCel49))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel105)
                        .addComponent(lblCel47)
                        .addComponent(lblCel48)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel107)
                                .addComponent(lblCel50))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel112)
                                .addComponent(lblCel51)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel113)
                            .addComponent(lblCel52))
                        .addGap(116, 116, 116)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel114)
                            .addComponent(lblCel53))
                        .addGap(77, 77, 77))))
        );

        jTabbedPane1.addTab(bundle.getString("TelaConsultaMaquina_Celofane.jPanel5.TabConstraints.tabTitle"), jPanel5); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel15.text")); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel16.text")); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel17.text")); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel18.text")); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel19.text")); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel20.text")); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText(bundle.getString("TelaConsultaMaquina_Celofane.jLabel21.text")); // NOI18N

        lblCel54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel54.setForeground(new java.awt.Color(51, 51, 255));
        lblCel54.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel54.text")); // NOI18N

        lblCel55.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel55.setForeground(new java.awt.Color(51, 51, 255));
        lblCel55.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel55.text")); // NOI18N

        lblCel56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel56.setForeground(new java.awt.Color(51, 51, 255));
        lblCel56.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel56.text")); // NOI18N

        lblCel57.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel57.setForeground(new java.awt.Color(51, 51, 255));
        lblCel57.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel57.text")); // NOI18N

        lblCel58.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel58.setForeground(new java.awt.Color(51, 51, 255));
        lblCel58.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel58.text")); // NOI18N

        lblCel59.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel59.setForeground(new java.awt.Color(51, 51, 255));
        lblCel59.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel59.text")); // NOI18N

        lblCel60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCel60.setForeground(new java.awt.Color(51, 51, 255));
        lblCel60.setText(bundle.getString("TelaConsultaMaquina_Celofane.lblCel60.text")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCel60, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(26, 26, 26)
                        .addComponent(lblCel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(lblCel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCel58, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCel59, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCel57, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblCel54))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblCel55))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblCel56))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblCel57))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblCel58))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblCel59))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lblCel60))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(bundle.getString("TelaConsultaMaquina_Celofane.jPanel6.TabConstraints.tabTitle"), jPanel6); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(908, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab(bundle.getString("TelaConsultaMaquina_Celofane.jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        labelDisplayImage1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelDisplayImage1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.labelDisplayImage1.border.title"))); // NOI18N

        labelDisplayImage2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelDisplayImage2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.labelDisplayImage2.border.title"))); // NOI18N

        txtObs.setForeground(new java.awt.Color(0, 0, 204));
        txtObs.setText(bundle.getString("TelaConsultaMaquina_Celofane.txtObs.text")); // NOI18N

        txtObs2.setForeground(new java.awt.Color(0, 0, 204));
        txtObs2.setText(bundle.getString("TelaConsultaMaquina_Celofane.txtObs2.text")); // NOI18N

        labelDisplayImage4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelDisplayImage4.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.labelDisplayImage4.border.title"))); // NOI18N

        labelDisplayImage3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelDisplayImage3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TelaConsultaMaquina_Celofane.labelDisplayImage3.border.title"))); // NOI18N

        txtObs3.setForeground(new java.awt.Color(0, 0, 204));
        txtObs3.setText(bundle.getString("TelaConsultaMaquina_Celofane.txtObs3.text")); // NOI18N

        txtObs4.setForeground(new java.awt.Color(0, 0, 204));
        txtObs4.setText(bundle.getString("TelaConsultaMaquina_Celofane.txtObs4.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtObs3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDisplayImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(labelDisplayImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtObs2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs4)
                    .addComponent(labelDisplayImage2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(labelDisplayImage4, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addContainerGap(1388, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDisplayImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDisplayImage2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtObs2)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtObs)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDisplayImage4, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(labelDisplayImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObs3)
                    .addComponent(txtObs4))
                .addContainerGap())
        );

        jTabbedPane2.addTab(bundle.getString("TelaConsultaMaquina_Celofane.jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        jScrollPane1.setViewportView(jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1369, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField43ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void txtFormatoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtFormatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormatoActionPerformed

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Consultar formato
        consultar_formato();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtProdutoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtProdutoKeyReleased(KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyReleased
        // TODO add your handling code here:
        pesquisar_produto();
    }//GEN-LAST:event_txtProdutoKeyReleased

    private void tblProdutosMouseClicked(MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        // TODO add your handling code here:
        //Evento que será usar para setar os campos da tabela clicando com o mause
        setar_campos();
    }//GEN-LAST:event_tblProdutosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaConsultaMaquina_Celofane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaMaquina_Celofane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaMaquina_Celofane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaMaquina_Celofane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TelaConsultaMaquina_Celofane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel PainelCelofane1;
    javax.swing.JPanel c10_;
    javax.swing.JPanel c11_;
    javax.swing.JPanel c12;
    javax.swing.JPanel c13;
    javax.swing.JPanel c14_;
    javax.swing.JPanel c15_;
    javax.swing.JPanel c16_;
    javax.swing.JPanel c17_;
    javax.swing.JPanel c18_;
    javax.swing.JPanel c19_;
    javax.swing.JPanel c1_;
    javax.swing.JPanel c2;
    javax.swing.JPanel c20;
    javax.swing.JPanel c21_;
    javax.swing.JPanel c22;
    javax.swing.JPanel c23_;
    javax.swing.JPanel c24_;
    javax.swing.JPanel c25_;
    javax.swing.JPanel c26;
    javax.swing.JPanel c27_;
    javax.swing.JPanel c28_;
    javax.swing.JPanel c29_;
    javax.swing.JPanel c30;
    javax.swing.JPanel c31;
    javax.swing.JPanel c3_;
    javax.swing.JPanel c4_;
    javax.swing.JPanel c5_;
    javax.swing.JPanel c6_;
    javax.swing.JPanel c7;
    javax.swing.JPanel c8_;
    javax.swing.JPanel c9;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JInternalFrame jInternalFrame5;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel100;
    javax.swing.JLabel jLabel101;
    javax.swing.JLabel jLabel102;
    javax.swing.JLabel jLabel103;
    javax.swing.JLabel jLabel104;
    javax.swing.JLabel jLabel105;
    javax.swing.JLabel jLabel106;
    javax.swing.JLabel jLabel107;
    javax.swing.JLabel jLabel108;
    javax.swing.JLabel jLabel109;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel110;
    javax.swing.JLabel jLabel111;
    javax.swing.JLabel jLabel112;
    javax.swing.JLabel jLabel113;
    javax.swing.JLabel jLabel114;
    javax.swing.JLabel jLabel115;
    javax.swing.JLabel jLabel116;
    javax.swing.JLabel jLabel117;
    javax.swing.JLabel jLabel119;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel121;
    javax.swing.JLabel jLabel122;
    javax.swing.JLabel jLabel123;
    javax.swing.JLabel jLabel124;
    javax.swing.JLabel jLabel125;
    javax.swing.JLabel jLabel126;
    javax.swing.JLabel jLabel127;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel15;
    javax.swing.JLabel jLabel16;
    javax.swing.JLabel jLabel17;
    javax.swing.JLabel jLabel18;
    javax.swing.JLabel jLabel186;
    javax.swing.JLabel jLabel188;
    javax.swing.JLabel jLabel19;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel20;
    javax.swing.JLabel jLabel21;
    javax.swing.JLabel jLabel22;
    javax.swing.JLabel jLabel23;
    javax.swing.JLabel jLabel24;
    javax.swing.JLabel jLabel25;
    javax.swing.JLabel jLabel26;
    javax.swing.JLabel jLabel27;
    javax.swing.JLabel jLabel28;
    javax.swing.JLabel jLabel29;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel30;
    javax.swing.JLabel jLabel31;
    javax.swing.JLabel jLabel32;
    javax.swing.JLabel jLabel33;
    javax.swing.JLabel jLabel34;
    javax.swing.JLabel jLabel35;
    javax.swing.JLabel jLabel36;
    javax.swing.JLabel jLabel37;
    javax.swing.JLabel jLabel38;
    javax.swing.JLabel jLabel39;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel40;
    javax.swing.JLabel jLabel41;
    javax.swing.JLabel jLabel42;
    javax.swing.JLabel jLabel43;
    javax.swing.JLabel jLabel44;
    javax.swing.JLabel jLabel45;
    javax.swing.JLabel jLabel46;
    javax.swing.JLabel jLabel47;
    javax.swing.JLabel jLabel48;
    javax.swing.JLabel jLabel49;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel50;
    javax.swing.JLabel jLabel51;
    javax.swing.JLabel jLabel52;
    javax.swing.JLabel jLabel53;
    javax.swing.JLabel jLabel54;
    javax.swing.JLabel jLabel55;
    javax.swing.JLabel jLabel56;
    javax.swing.JLabel jLabel57;
    javax.swing.JLabel jLabel58;
    javax.swing.JLabel jLabel59;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel60;
    javax.swing.JLabel jLabel61;
    javax.swing.JLabel jLabel62;
    javax.swing.JLabel jLabel63;
    javax.swing.JLabel jLabel64;
    javax.swing.JLabel jLabel65;
    javax.swing.JLabel jLabel66;
    javax.swing.JLabel jLabel67;
    javax.swing.JLabel jLabel68;
    javax.swing.JLabel jLabel69;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel70;
    javax.swing.JLabel jLabel71;
    javax.swing.JLabel jLabel72;
    javax.swing.JLabel jLabel73;
    javax.swing.JLabel jLabel74;
    javax.swing.JLabel jLabel75;
    javax.swing.JLabel jLabel76;
    javax.swing.JLabel jLabel77;
    javax.swing.JLabel jLabel78;
    javax.swing.JLabel jLabel79;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel80;
    javax.swing.JLabel jLabel81;
    javax.swing.JLabel jLabel82;
    javax.swing.JLabel jLabel83;
    javax.swing.JLabel jLabel84;
    javax.swing.JLabel jLabel85;
    javax.swing.JLabel jLabel86;
    javax.swing.JLabel jLabel87;
    javax.swing.JLabel jLabel88;
    javax.swing.JLabel jLabel89;
    javax.swing.JLabel jLabel9;
    javax.swing.JLabel jLabel90;
    javax.swing.JLabel jLabel91;
    javax.swing.JLabel jLabel92;
    javax.swing.JLabel jLabel93;
    javax.swing.JLabel jLabel94;
    javax.swing.JLabel jLabel95;
    javax.swing.JLabel jLabel96;
    javax.swing.JLabel jLabel97;
    javax.swing.JLabel jLabel98;
    javax.swing.JLabel jLabel99;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel5;
    javax.swing.JPanel jPanel6;
    javax.swing.JPanel jPanel7;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JScrollPane jScrollPane4;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JSeparator jSeparator10;
    javax.swing.JSeparator jSeparator11;
    javax.swing.JSeparator jSeparator12;
    javax.swing.JSeparator jSeparator2;
    javax.swing.JSeparator jSeparator3;
    javax.swing.JSeparator jSeparator4;
    javax.swing.JSeparator jSeparator5;
    javax.swing.JSeparator jSeparator6;
    javax.swing.JSeparator jSeparator7;
    javax.swing.JSeparator jSeparator8;
    javax.swing.JSeparator jSeparator9;
    javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JTabbedPane jTabbedPane2;
    javax.swing.JTextField jTextField43;
    javax.swing.JLabel labelDisplayImage1;
    javax.swing.JLabel labelDisplayImage2;
    javax.swing.JLabel labelDisplayImage3;
    javax.swing.JLabel labelDisplayImage4;
    javax.swing.JLabel lbl1;
    javax.swing.JLabel lbl10;
    javax.swing.JLabel lbl11;
    javax.swing.JLabel lbl12;
    javax.swing.JLabel lbl13;
    javax.swing.JLabel lbl14;
    javax.swing.JLabel lbl15;
    javax.swing.JLabel lbl16;
    javax.swing.JLabel lbl17;
    javax.swing.JLabel lbl18;
    javax.swing.JLabel lbl19;
    javax.swing.JLabel lbl2;
    javax.swing.JLabel lbl20;
    javax.swing.JLabel lbl3;
    javax.swing.JLabel lbl4;
    javax.swing.JLabel lbl5;
    javax.swing.JLabel lbl6;
    javax.swing.JLabel lbl7;
    javax.swing.JLabel lbl8;
    javax.swing.JLabel lbl9;
    javax.swing.JLabel lblCel1;
    javax.swing.JLabel lblCel10;
    javax.swing.JLabel lblCel11;
    javax.swing.JLabel lblCel12;
    javax.swing.JLabel lblCel13;
    javax.swing.JLabel lblCel14;
    javax.swing.JLabel lblCel15;
    javax.swing.JLabel lblCel16;
    javax.swing.JLabel lblCel17;
    javax.swing.JLabel lblCel18;
    javax.swing.JLabel lblCel19;
    javax.swing.JLabel lblCel2;
    javax.swing.JLabel lblCel20;
    javax.swing.JLabel lblCel21;
    javax.swing.JLabel lblCel22;
    javax.swing.JLabel lblCel23;
    javax.swing.JLabel lblCel24;
    javax.swing.JLabel lblCel25;
    javax.swing.JLabel lblCel26;
    javax.swing.JLabel lblCel27;
    javax.swing.JLabel lblCel28;
    javax.swing.JLabel lblCel29;
    javax.swing.JLabel lblCel3;
    javax.swing.JLabel lblCel30;
    javax.swing.JLabel lblCel31;
    javax.swing.JLabel lblCel32;
    javax.swing.JLabel lblCel33;
    javax.swing.JLabel lblCel34;
    javax.swing.JLabel lblCel35;
    javax.swing.JLabel lblCel36;
    javax.swing.JLabel lblCel37;
    javax.swing.JLabel lblCel38;
    javax.swing.JLabel lblCel39;
    javax.swing.JLabel lblCel4;
    javax.swing.JLabel lblCel40;
    javax.swing.JLabel lblCel41;
    javax.swing.JLabel lblCel42;
    javax.swing.JLabel lblCel43;
    javax.swing.JLabel lblCel44;
    javax.swing.JLabel lblCel45;
    javax.swing.JLabel lblCel46;
    javax.swing.JLabel lblCel47;
    javax.swing.JLabel lblCel48;
    javax.swing.JLabel lblCel49;
    javax.swing.JLabel lblCel5;
    javax.swing.JLabel lblCel50;
    javax.swing.JLabel lblCel51;
    javax.swing.JLabel lblCel52;
    javax.swing.JLabel lblCel53;
    javax.swing.JLabel lblCel54;
    javax.swing.JLabel lblCel55;
    javax.swing.JLabel lblCel56;
    javax.swing.JLabel lblCel57;
    javax.swing.JLabel lblCel58;
    javax.swing.JLabel lblCel59;
    javax.swing.JLabel lblCel6;
    javax.swing.JLabel lblCel60;
    javax.swing.JLabel lblCel7;
    javax.swing.JLabel lblCel8;
    javax.swing.JLabel lblCel9;
    javax.swing.JLabel lblObs1;
    javax.swing.JLabel lblObs10;
    javax.swing.JLabel lblObs11;
    javax.swing.JLabel lblObs12;
    javax.swing.JLabel lblObs13;
    javax.swing.JLabel lblObs14;
    javax.swing.JLabel lblObs15;
    javax.swing.JLabel lblObs16;
    javax.swing.JLabel lblObs17;
    javax.swing.JLabel lblObs18;
    javax.swing.JLabel lblObs19;
    javax.swing.JLabel lblObs2;
    javax.swing.JLabel lblObs20;
    javax.swing.JLabel lblObs21;
    javax.swing.JLabel lblObs22;
    javax.swing.JLabel lblObs23;
    javax.swing.JLabel lblObs24;
    javax.swing.JLabel lblObs25;
    javax.swing.JLabel lblObs26;
    javax.swing.JLabel lblObs27;
    javax.swing.JLabel lblObs28;
    javax.swing.JLabel lblObs29;
    javax.swing.JLabel lblObs3;
    javax.swing.JLabel lblObs30;
    javax.swing.JLabel lblObs31;
    javax.swing.JLabel lblObs4;
    javax.swing.JLabel lblObs5;
    javax.swing.JLabel lblObs6;
    javax.swing.JLabel lblObs7;
    javax.swing.JLabel lblObs8;
    javax.swing.JLabel lblObs9;
    javax.swing.JLabel lugjhkg;
    javax.swing.JTable tblProdutos;
    javax.swing.JLabel txtAbaste;
    javax.swing.JLabel txtAcondi;
    public static javax.swing.JTextPane txtArea;
    javax.swing.JLabel txtEsteira;
    javax.swing.JTextField txtFormato;
    javax.swing.JLabel txtObs;
    javax.swing.JLabel txtObs2;
    javax.swing.JLabel txtObs3;
    javax.swing.JLabel txtObs4;
    javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
