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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class TelaConsultaMaquinaECelofaneModelo extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCelefaneScroll
     */
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null; //resultado 
    
    public TelaConsultaMaquinaECelofaneModelo() {
        initComponents();
        conexao = ModuloConexao.conector();
        
        
    }
    private void consultar() {
       // String sql = "select * from tbusuarios where iduser=?";
        String sql = "select * from tbparametrogeral where produto=?";
        try {
            pst = conexao.prepareStatement(sql);

            ;
            pst.setString(1,txtProduto.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                
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

            ;
            pst.setString(1,txtFormato.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                
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
        PainelCelofane = new javax.swing.JPanel();
        c1_ = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lblCel1 = new javax.swing.JLabel();
        lblObs1 = new javax.swing.JLabel();
        c3_ = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lblObs3 = new javax.swing.JLabel();
        lblCel3 = new javax.swing.JLabel();
        c2 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lblCel2 = new javax.swing.JLabel();
        lblObs2 = new javax.swing.JLabel();
        c4_ = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lblObs4 = new javax.swing.JLabel();
        lblCel4 = new javax.swing.JLabel();
        c8_ = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        lblCel8 = new javax.swing.JLabel();
        lblObs8 = new javax.swing.JLabel();
        c5_ = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        lblObs5 = new javax.swing.JLabel();
        lblCel5 = new javax.swing.JLabel();
        c7 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        lblCel7 = new javax.swing.JLabel();
        lblObs7 = new javax.swing.JLabel();
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
        c13 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        lblCel13 = new javax.swing.JLabel();
        lblObs13 = new javax.swing.JLabel();
        c12 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        lblObs12 = new javax.swing.JLabel();
        lblCel12 = new javax.swing.JLabel();
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
        c17_ = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        lblCel17 = new javax.swing.JLabel();
        lblObs17 = new javax.swing.JLabel();
        c19_ = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        lblCel19 = new javax.swing.JLabel();
        lblObs19 = new javax.swing.JLabel();
        c16_ = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        lblCel16 = new javax.swing.JLabel();
        lblObs16 = new javax.swing.JLabel();
        c18_ = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        lblObs18 = new javax.swing.JLabel();
        lblCel18 = new javax.swing.JLabel();
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
        c25_ = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        lblObs25 = new javax.swing.JLabel();
        lblCel25 = new javax.swing.JLabel();
        c24_ = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        lblCel24 = new javax.swing.JLabel();
        lblObs24 = new javax.swing.JLabel();
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
        c6_ = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        lblCel6 = new javax.swing.JLabel();
        lblObs6 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1200, 2000));

        jTabbedPane2.setForeground(new java.awt.Color(51, 51, 255));

        jInternalFrame5.setVisible(true);

        jLabel186.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel186.setText("1C");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("1D");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("1E");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("1A");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("1B");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("1F");

        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 204));
        lbl1.setText("N/A");

        lbl2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 204));
        lbl2.setText("N/A");

        lbl3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl3.setForeground(new java.awt.Color(0, 0, 204));
        lbl3.setText("N/A");

        lbl4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl4.setForeground(new java.awt.Color(0, 0, 204));
        lbl4.setText("N/A");

        lbl5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl5.setForeground(new java.awt.Color(0, 0, 204));
        lbl5.setText("N/A");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("2G");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("2H");

        jLabel188.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel188.setText("2K");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("2H");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel22.setText("2i");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel23.setText("2J");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel25.setText("2N");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel27.setText("2M");

        lbl7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl7.setForeground(new java.awt.Color(0, 0, 204));
        lbl7.setText("N/A");

        lbl8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl8.setForeground(new java.awt.Color(0, 0, 204));
        lbl8.setText("N/A");

        lbl9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl9.setForeground(new java.awt.Color(0, 0, 204));
        lbl9.setText("N/A");

        lbl10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl10.setForeground(new java.awt.Color(51, 0, 204));
        lbl10.setText("N/A");

        lbl11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl11.setForeground(new java.awt.Color(0, 0, 204));
        lbl11.setText("N/A");

        lbl12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl12.setForeground(new java.awt.Color(0, 0, 204));
        lbl12.setText("N/A");

        lbl13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl13.setForeground(new java.awt.Color(0, 0, 204));
        lbl13.setText("N/A");

        lbl14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl14.setForeground(new java.awt.Color(0, 0, 204));
        lbl14.setText("N/A");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("2O");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("2Q");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("2P");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel26.setText("2F");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel28.setText("2E");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel29.setText("2E");

        lbl15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl15.setForeground(new java.awt.Color(0, 0, 204));
        lbl15.setText("N/A");

        lbl16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl16.setForeground(new java.awt.Color(0, 0, 204));
        lbl16.setText("N/A");

        lbl17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl17.setForeground(new java.awt.Color(0, 0, 204));
        lbl17.setText("N/A");

        lbl18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl18.setForeground(new java.awt.Color(0, 0, 204));
        lbl18.setText("N/A");

        lbl19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl19.setForeground(new java.awt.Color(0, 0, 204));
        lbl19.setText("N/A");

        lbl20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl20.setForeground(new java.awt.Color(0, 0, 204));
        lbl20.setText("N/A");

        jLabel122.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(153, 0, 153));
        jLabel122.setText("TRAZ");

        jLabel123.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(153, 0, 153));
        jLabel123.setText("LASER");

        jLabel124.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(153, 0, 153));
        jLabel124.setText("FRENTE");

        jLabel125.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(153, 0, 153));
        jLabel125.setText("D'PUCKER");

        jLabel126.setText("FORMATO");

        jLabel127.setText("PRODUTO");

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

        jButton1.setText("Procurar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Procurar");
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
        lbl6.setText("N/A");

        jLabel24.setText("Obs:");

        txtArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(txtArea);

        javax.swing.GroupLayout jInternalFrame5Layout = new javax.swing.GroupLayout(jInternalFrame5.getContentPane());
        jInternalFrame5.getContentPane().setLayout(jInternalFrame5Layout);
        jInternalFrame5Layout.setHorizontalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(837, 837, Short.MAX_VALUE))
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
                                .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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

        jTabbedPane2.addTab("PARAMETROS DA MAQUINA", jInternalFrame5);

        PainelCelofane.setPreferredSize(new java.awt.Dimension(1200, 99999));

        c1_.setBorder(javax.swing.BorderFactory.createTitledBorder("1. Altura lamina"));
        c1_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel42.setText("N° voltas");

        jLabel43.setText("obs");

        lblCel1.setForeground(new java.awt.Color(0, 0, 204));
        lblCel1.setText("N/A");

        lblObs1.setForeground(new java.awt.Color(0, 0, 204));
        lblObs1.setText("N/A");

        javax.swing.GroupLayout c1_Layout = new javax.swing.GroupLayout(c1_);
        c1_.setLayout(c1_Layout);
        c1_Layout.setHorizontalGroup(
            c1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c1_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblObs1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        c1_Layout.setVerticalGroup(
            c1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c1_Layout.createSequentialGroup()
                .addGroup(c1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(lblCel1)
                    .addComponent(lblObs1)
                    .addComponent(jLabel43))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        c3_.setBorder(javax.swing.BorderFactory.createTitledBorder("3. Placa da agulha de dobragem direita"));
        c3_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel44.setText("N° voltas");

        jLabel45.setText("obs");

        lblObs3.setForeground(new java.awt.Color(0, 0, 204));
        lblObs3.setText("N/A");

        lblCel3.setForeground(new java.awt.Color(0, 0, 204));
        lblCel3.setText("N/A");

        javax.swing.GroupLayout c3_Layout = new javax.swing.GroupLayout(c3_);
        c3_.setLayout(c3_Layout);
        c3_Layout.setHorizontalGroup(
            c3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c3_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel45)
                .addGap(26, 26, 26)
                .addComponent(lblObs3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        c3_Layout.setVerticalGroup(
            c3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c3_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(c3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel3)
                    .addComponent(lblObs3)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        c2.setBorder(javax.swing.BorderFactory.createTitledBorder("2. Altura Embalagem"));
        c2.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel48.setText("N° voltas");

        jLabel49.setText("obs");

        lblCel2.setForeground(new java.awt.Color(0, 0, 204));
        lblCel2.setText("N/A");

        lblObs2.setForeground(new java.awt.Color(0, 0, 204));
        lblObs2.setText("N/A");

        javax.swing.GroupLayout c2Layout = new javax.swing.GroupLayout(c2);
        c2.setLayout(c2Layout);
        c2Layout.setHorizontalGroup(
            c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c2Layout.createSequentialGroup()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        c2Layout.setVerticalGroup(
            c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblCel2)
                .addComponent(lblObs2)
                .addComponent(jLabel48)
                .addComponent(jLabel49))
        );

        c4_.setBorder(javax.swing.BorderFactory.createTitledBorder("4. Placa da agulha de dobragem esquerda"));
        c4_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel46.setText("N° voltas");

        jLabel47.setText("obs");

        lblObs4.setForeground(new java.awt.Color(0, 0, 204));
        lblObs4.setText("N/A");

        lblCel4.setForeground(new java.awt.Color(0, 0, 204));
        lblCel4.setText("N/A");

        javax.swing.GroupLayout c4_Layout = new javax.swing.GroupLayout(c4_);
        c4_.setLayout(c4_Layout);
        c4_Layout.setHorizontalGroup(
            c4_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c4_Layout.createSequentialGroup()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(lblObs4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        c4_Layout.setVerticalGroup(
            c4_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c4_Layout.createSequentialGroup()
                .addGroup(c4_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(c4_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCel4)
                        .addComponent(jLabel46)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblObs4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        c8_.setBorder(javax.swing.BorderFactory.createTitledBorder("17. Ponto de realinhamento do dobrador superior"));
        c8_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel52.setText("Cm");

        jLabel53.setText("obs");

        lblCel8.setForeground(new java.awt.Color(0, 0, 204));
        lblCel8.setText("N/A");

        lblObs8.setForeground(new java.awt.Color(0, 0, 204));
        lblObs8.setText("N/A");

        javax.swing.GroupLayout c8_Layout = new javax.swing.GroupLayout(c8_);
        c8_.setLayout(c8_Layout);
        c8_Layout.setHorizontalGroup(
            c8_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c8_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel53)
                .addGap(18, 18, 18)
                .addComponent(lblObs8, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        c8_Layout.setVerticalGroup(
            c8_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c8_Layout.createSequentialGroup()
                .addGroup(c8_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel8)
                    .addComponent(lblObs8)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        c5_.setBorder(javax.swing.BorderFactory.createTitledBorder("5. Curva de selagem reajuste"));
        c5_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel54.setText("N° voltas");

        jLabel55.setText("obs");

        lblObs5.setForeground(new java.awt.Color(0, 0, 204));
        lblObs5.setText("N/A");

        lblCel5.setForeground(new java.awt.Color(0, 0, 204));
        lblCel5.setText("N/A");

        javax.swing.GroupLayout c5_Layout = new javax.swing.GroupLayout(c5_);
        c5_.setLayout(c5_Layout);
        c5_Layout.setHorizontalGroup(
            c5_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c5_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObs5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
        );
        c5_Layout.setVerticalGroup(
            c5_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c5_Layout.createSequentialGroup()
                .addGroup(c5_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(lblCel5)
                    .addComponent(jLabel55)
                    .addComponent(lblObs5))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        c7.setBorder(javax.swing.BorderFactory.createTitledBorder("7. Regulagem do Dispositivo de corte de filme largo"));
        c7.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel56.setText("Cm");

        jLabel57.setText("obs");

        lblCel7.setForeground(new java.awt.Color(0, 0, 204));
        lblCel7.setText("N/A");

        lblObs7.setForeground(new java.awt.Color(0, 0, 204));
        lblObs7.setText("N/A");

        javax.swing.GroupLayout c7Layout = new javax.swing.GroupLayout(c7);
        c7.setLayout(c7Layout);
        c7Layout.setHorizontalGroup(
            c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblCel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObs7, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        c7Layout.setVerticalGroup(
            c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c7Layout.createSequentialGroup()
                .addGroup(c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel7)
                    .addComponent(lblObs7)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        c9.setBorder(javax.swing.BorderFactory.createTitledBorder("19. Chapa sujeitadora / fixão de embalagem"));
        c9.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel60.setText("Bar");

        jLabel61.setText("obs");

        lblCel9.setForeground(new java.awt.Color(0, 0, 204));
        lblCel9.setText("N/A");

        lblObs9.setForeground(new java.awt.Color(0, 0, 204));
        lblObs9.setText("N/A");

        javax.swing.GroupLayout c9Layout = new javax.swing.GroupLayout(c9);
        c9.setLayout(c9Layout);
        c9Layout.setHorizontalGroup(
            c9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel61)
                .addGap(18, 18, 18)
                .addComponent(lblObs9, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        c9Layout.setVerticalGroup(
            c9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblCel9)
                .addComponent(lblObs9)
                .addComponent(jLabel60)
                .addComponent(jLabel61))
        );

        c10_.setBorder(javax.swing.BorderFactory.createTitledBorder("20. Curso dobrador superior"));
        c10_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel62.setText("Cm");

        jLabel63.setText("obs");

        lblCel10.setForeground(new java.awt.Color(0, 0, 204));
        lblCel10.setText("N/A");

        lblObs10.setForeground(new java.awt.Color(0, 0, 204));
        lblObs10.setText("N/A");

        javax.swing.GroupLayout c10_Layout = new javax.swing.GroupLayout(c10_);
        c10_.setLayout(c10_Layout);
        c10_Layout.setHorizontalGroup(
            c10_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c10_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObs10, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293))
        );
        c10_Layout.setVerticalGroup(
            c10_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c10_Layout.createSequentialGroup()
                .addGroup(c10_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(lblCel10)
                    .addComponent(jLabel63)
                    .addComponent(lblObs10))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        c11_.setBorder(javax.swing.BorderFactory.createTitledBorder("22. Pré- dobrador curso direito"));
        c11_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel64.setText("Cm");

        jLabel65.setText("obs");

        lblCel11.setForeground(new java.awt.Color(0, 0, 204));
        lblCel11.setText("N/A");

        lblObs11.setForeground(new java.awt.Color(0, 0, 204));
        lblObs11.setText("N/A");

        javax.swing.GroupLayout c11_Layout = new javax.swing.GroupLayout(c11_);
        c11_.setLayout(c11_Layout);
        c11_Layout.setHorizontalGroup(
            c11_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c11_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObs11, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        c11_Layout.setVerticalGroup(
            c11_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c11_Layout.createSequentialGroup()
                .addGroup(c11_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel11)
                    .addComponent(lblObs11)
                    .addComponent(jLabel65)
                    .addComponent(jLabel64))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        c13.setBorder(javax.swing.BorderFactory.createTitledBorder("24. Chapa sujeitadora Agulhas de dobragem direita"));
        c13.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel66.setText("N° voltas");

        jLabel67.setText("obs");

        lblCel13.setForeground(new java.awt.Color(0, 0, 204));
        lblCel13.setText("N/A");

        lblObs13.setForeground(new java.awt.Color(0, 0, 204));
        lblObs13.setText("N/A");

        javax.swing.GroupLayout c13Layout = new javax.swing.GroupLayout(c13);
        c13.setLayout(c13Layout);
        c13Layout.setHorizontalGroup(
            c13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c13Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel67)
                .addGap(18, 18, 18)
                .addComponent(lblObs13, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        c13Layout.setVerticalGroup(
            c13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c13Layout.createSequentialGroup()
                .addGroup(c13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel13)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67)
                    .addComponent(lblObs13))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        c12.setBorder(javax.swing.BorderFactory.createTitledBorder("23. Pré-dobrador curso esquerdo"));
        c12.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel68.setText("Cm");

        jLabel69.setText("obs");

        lblObs12.setForeground(new java.awt.Color(0, 0, 204));
        lblObs12.setText("N/A");

        lblCel12.setForeground(new java.awt.Color(0, 0, 204));
        lblCel12.setText("N/A");

        javax.swing.GroupLayout c12Layout = new javax.swing.GroupLayout(c12);
        c12.setLayout(c12Layout);
        c12Layout.setHorizontalGroup(
            c12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel69)
                .addGap(18, 18, 18)
                .addComponent(lblObs12, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c12Layout.setVerticalGroup(
            c12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c12Layout.createSequentialGroup()
                .addGroup(c12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(lblCel12)
                    .addComponent(jLabel68)
                    .addComponent(lblObs12))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        c14_.setBorder(javax.swing.BorderFactory.createTitledBorder("25. Chapa sujeitadora Agulha de dobragem esquerda"));
        c14_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel70.setText("N° voltas");

        jLabel71.setText("obs");

        lblObs14.setForeground(new java.awt.Color(0, 0, 204));
        lblObs14.setText("N/A");

        lblCel14.setForeground(new java.awt.Color(0, 0, 204));
        lblCel14.setText("N/A");

        javax.swing.GroupLayout c14_Layout = new javax.swing.GroupLayout(c14_);
        c14_.setLayout(c14_Layout);
        c14_Layout.setHorizontalGroup(
            c14_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c14_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblObs14, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        c14_Layout.setVerticalGroup(
            c14_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c14_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(c14_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel14)
                    .addComponent(lblObs14)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71))
                .addGap(28, 28, 28))
        );

        c15_.setBorder(javax.swing.BorderFactory.createTitledBorder("27. Ajuste de altura Grelha"));
        c15_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel72.setText("N° voltas");

        jLabel73.setText("obs");

        lblObs15.setForeground(new java.awt.Color(0, 0, 204));
        lblObs15.setText("N/A");

        lblCel15.setForeground(new java.awt.Color(0, 0, 204));
        lblCel15.setText("N/A");

        javax.swing.GroupLayout c15_Layout = new javax.swing.GroupLayout(c15_);
        c15_.setLayout(c15_Layout);
        c15_Layout.setHorizontalGroup(
            c15_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c15_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblObs15, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        c15_Layout.setVerticalGroup(
            c15_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c15_Layout.createSequentialGroup()
                .addGroup(c15_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel15)
                    .addComponent(lblObs15)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        c17_.setBorder(javax.swing.BorderFactory.createTitledBorder("30. Ajuste longitudinal ponto de selagem direito"));
        c17_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel74.setText("N° voltas");

        jLabel75.setText("obs");

        lblCel17.setForeground(new java.awt.Color(0, 0, 204));
        lblCel17.setText("N/A");

        lblObs17.setForeground(new java.awt.Color(0, 0, 204));
        lblObs17.setText("N/A");

        javax.swing.GroupLayout c17_Layout = new javax.swing.GroupLayout(c17_);
        c17_.setLayout(c17_Layout);
        c17_Layout.setHorizontalGroup(
            c17_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c17_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(lblCel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel75)
                .addGap(29, 29, 29)
                .addComponent(lblObs17, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        c17_Layout.setVerticalGroup(
            c17_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c17_Layout.createSequentialGroup()
                .addGroup(c17_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel17)
                    .addComponent(lblObs17)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        c19_.setBorder(javax.swing.BorderFactory.createTitledBorder("32. Altura ponto de selagem direita"));
        c19_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel76.setText("Cm");

        jLabel77.setText("obs");

        lblCel19.setForeground(new java.awt.Color(0, 0, 204));
        lblCel19.setText("N/A");

        lblObs19.setForeground(new java.awt.Color(0, 0, 204));
        lblObs19.setText("N/A");

        javax.swing.GroupLayout c19_Layout = new javax.swing.GroupLayout(c19_);
        c19_.setLayout(c19_Layout);
        c19_Layout.setHorizontalGroup(
            c19_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c19_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblObs19, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        c19_Layout.setVerticalGroup(
            c19_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c19_Layout.createSequentialGroup()
                .addGroup(c19_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel19)
                    .addComponent(lblObs19)
                    .addComponent(jLabel76)
                    .addComponent(jLabel77))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        c16_.setBorder(javax.swing.BorderFactory.createTitledBorder("29. Trasnporte de saída formato"));
        c16_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel78.setText("N° voltas");

        jLabel79.setText("obs");

        lblCel16.setForeground(new java.awt.Color(0, 0, 204));
        lblCel16.setText("N/A");

        lblObs16.setForeground(new java.awt.Color(0, 0, 204));
        lblObs16.setText("N/A");

        javax.swing.GroupLayout c16_Layout = new javax.swing.GroupLayout(c16_);
        c16_.setLayout(c16_Layout);
        c16_Layout.setHorizontalGroup(
            c16_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c16_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel79)
                .addGap(27, 27, 27)
                .addComponent(lblObs16, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c16_Layout.setVerticalGroup(
            c16_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c16_Layout.createSequentialGroup()
                .addGroup(c16_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel16)
                    .addComponent(lblObs16)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        c18_.setBorder(javax.swing.BorderFactory.createTitledBorder("31. Ajuste longitudinal ponto de selagem esquerdo"));
        c18_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel80.setText("N° voltas");

        jLabel81.setText("obs");

        lblObs18.setForeground(new java.awt.Color(0, 0, 204));
        lblObs18.setText("N/A");

        lblCel18.setForeground(new java.awt.Color(0, 0, 204));
        lblCel18.setText("N/A");

        javax.swing.GroupLayout c18_Layout = new javax.swing.GroupLayout(c18_);
        c18_.setLayout(c18_Layout);
        c18_Layout.setHorizontalGroup(
            c18_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c18_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCel18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblObs18, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c18_Layout.setVerticalGroup(
            c18_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c18_Layout.createSequentialGroup()
                .addGroup(c18_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(lblCel18)
                    .addComponent(jLabel81)
                    .addComponent(lblObs18))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        c20.setBorder(javax.swing.BorderFactory.createTitledBorder("33. Altura ponto de selagem esquerda"));
        c20.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel82.setText("Cm");

        jLabel83.setText("obs");

        lblCel20.setForeground(new java.awt.Color(0, 0, 204));
        lblCel20.setText("N/A");

        lblObs20.setForeground(new java.awt.Color(0, 0, 204));
        lblObs20.setText("N/A");

        javax.swing.GroupLayout c20Layout = new javax.swing.GroupLayout(c20);
        c20.setLayout(c20Layout);
        c20Layout.setHorizontalGroup(
            c20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel83)
                .addGap(18, 18, 18)
                .addComponent(lblObs20, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c20Layout.setVerticalGroup(
            c20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c20Layout.createSequentialGroup()
                .addGroup(c20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(c20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCel20)
                        .addComponent(lblObs20)
                        .addComponent(jLabel82))
                    .addComponent(jLabel83))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        c21_.setBorder(javax.swing.BorderFactory.createTitledBorder("37. Chapa sujeitadora ponto de selagem"));
        c21_.setMaximumSize(new java.awt.Dimension(512, 50));
        c21_.setPreferredSize(new java.awt.Dimension(512, 50));

        lugjhkg.setText("Cm");

        jLabel89.setText("obs");

        lblCel21.setForeground(new java.awt.Color(0, 0, 204));
        lblCel21.setText("N/A");

        lblObs21.setForeground(new java.awt.Color(0, 0, 204));
        lblObs21.setText("N/A");

        javax.swing.GroupLayout c21_Layout = new javax.swing.GroupLayout(c21_);
        c21_.setLayout(c21_Layout);
        c21_Layout.setHorizontalGroup(
            c21_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c21_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lugjhkg, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel89)
                .addGap(26, 26, 26)
                .addComponent(lblObs21, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        c21_Layout.setVerticalGroup(
            c21_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c21_Layout.createSequentialGroup()
                .addGroup(c21_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel21)
                    .addComponent(lblObs21)
                    .addComponent(lugjhkg)
                    .addComponent(jLabel89))
                .addGap(0, 0, 0))
        );

        c22.setBorder(javax.swing.BorderFactory.createTitledBorder("50. Câmara do produto / largura"));
        c22.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel50.setText("Cm");

        jLabel51.setText("obs");

        lblCel22.setForeground(new java.awt.Color(0, 0, 204));
        lblCel22.setText("N/A");

        lblObs22.setForeground(new java.awt.Color(0, 0, 204));
        lblObs22.setText("N/A");

        javax.swing.GroupLayout c22Layout = new javax.swing.GroupLayout(c22);
        c22.setLayout(c22Layout);
        c22Layout.setHorizontalGroup(
            c22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblObs22, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c22Layout.setVerticalGroup(
            c22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c22Layout.createSequentialGroup()
                .addGroup(c22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(c22Layout.createSequentialGroup()
                        .addGroup(c22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCel22)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c22Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblObs22)))
                .addGap(40, 40, 40))
        );

        c23_.setBorder(javax.swing.BorderFactory.createTitledBorder("52. Correia vertical / Largura"));
        c23_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel58.setText("N° voltas");

        jLabel59.setText("obs");

        lblCel23.setForeground(new java.awt.Color(0, 0, 204));
        lblCel23.setText("N/A");

        lblObs23.setForeground(new java.awt.Color(0, 0, 204));
        lblObs23.setText("N/A");

        javax.swing.GroupLayout c23_Layout = new javax.swing.GroupLayout(c23_);
        c23_.setLayout(c23_Layout);
        c23_Layout.setHorizontalGroup(
            c23_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c23_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObs23, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        c23_Layout.setVerticalGroup(
            c23_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c23_Layout.createSequentialGroup()
                .addGroup(c23_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(c23_Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(c23_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCel23)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c23_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblObs23)
                                .addComponent(jLabel59))))
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        c25_.setBorder(javax.swing.BorderFactory.createTitledBorder("56. Comprimento do Produto / Batente"));
        c25_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel86.setText("N° voltas");

        jLabel87.setText("obs");

        lblObs25.setForeground(new java.awt.Color(0, 0, 204));
        lblObs25.setText("N/A");

        lblCel25.setForeground(new java.awt.Color(0, 0, 204));
        lblCel25.setText("N/A");

        javax.swing.GroupLayout c25_Layout = new javax.swing.GroupLayout(c25_);
        c25_.setLayout(c25_Layout);
        c25_Layout.setHorizontalGroup(
            c25_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c25_Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel87)
                .addGap(18, 18, 18)
                .addComponent(lblObs25, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        c25_Layout.setVerticalGroup(
            c25_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c25_Layout.createSequentialGroup()
                .addGroup(c25_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(c25_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCel25)
                        .addComponent(jLabel86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c25_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblObs25)
                        .addComponent(jLabel87)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        c24_.setBorder(javax.swing.BorderFactory.createTitledBorder("55. Correia vertical / Altura"));
        c24_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel92.setText("N° voltas");

        jLabel93.setText("obs");

        lblCel24.setForeground(new java.awt.Color(0, 0, 204));
        lblCel24.setText("N/A");

        lblObs24.setForeground(new java.awt.Color(0, 0, 204));
        lblObs24.setText("N/A");

        javax.swing.GroupLayout c24_Layout = new javax.swing.GroupLayout(c24_);
        c24_.setLayout(c24_Layout);
        c24_Layout.setHorizontalGroup(
            c24_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c24_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel93)
                .addGap(30, 30, 30)
                .addComponent(lblObs24, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c24_Layout.setVerticalGroup(
            c24_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c24_Layout.createSequentialGroup()
                .addGroup(c24_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(c24_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCel24)
                        .addComponent(jLabel92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c24_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblObs24)
                        .addComponent(jLabel93)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        c26.setBorder(javax.swing.BorderFactory.createTitledBorder("85. Bocal1 (transporte do filme)"));
        c26.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel94.setText("Bar");

        jLabel95.setText("obs");

        lblCel26.setForeground(new java.awt.Color(0, 0, 204));
        lblCel26.setText("N/A");

        lblObs26.setForeground(new java.awt.Color(0, 0, 204));
        lblObs26.setText("N/A");

        javax.swing.GroupLayout c26Layout = new javax.swing.GroupLayout(c26);
        c26.setLayout(c26Layout);
        c26Layout.setHorizontalGroup(
            c26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblObs26, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c26Layout.setVerticalGroup(
            c26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c26Layout.createSequentialGroup()
                .addGroup(c26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(lblCel26)
                    .addComponent(jLabel95)
                    .addComponent(lblObs26))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        c27_.setBorder(javax.swing.BorderFactory.createTitledBorder("86. Bocal 2 (lâmina)"));
        c27_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel96.setText("Bar");

        jLabel97.setText("obs");

        lblObs27.setForeground(new java.awt.Color(0, 0, 204));
        lblObs27.setText("N/A");

        lblCel27.setForeground(new java.awt.Color(0, 0, 204));
        lblCel27.setText("N/A");

        javax.swing.GroupLayout c27_Layout = new javax.swing.GroupLayout(c27_);
        c27_.setLayout(c27_Layout);
        c27_Layout.setHorizontalGroup(
            c27_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c27_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblObs27, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        c27_Layout.setVerticalGroup(
            c27_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c27_Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c27_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel27)
                    .addComponent(lblObs27)
                    .addComponent(jLabel96)
                    .addComponent(jLabel97))
                .addContainerGap())
        );

        c29_.setBorder(javax.swing.BorderFactory.createTitledBorder("104. Deslocamento mesa de agrupamento"));
        c29_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel98.setText("Cm");

        jLabel99.setText("obs");

        lblObs29.setForeground(new java.awt.Color(0, 0, 204));
        lblObs29.setText("N/A");

        lblCel29.setForeground(new java.awt.Color(0, 0, 204));
        lblCel29.setText("N/A");

        javax.swing.GroupLayout c29_Layout = new javax.swing.GroupLayout(c29_);
        c29_.setLayout(c29_Layout);
        c29_Layout.setHorizontalGroup(
            c29_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c29_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCel29, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel99)
                .addGap(18, 18, 18)
                .addComponent(lblObs29, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

        c28_.setBorder(javax.swing.BorderFactory.createTitledBorder("87. Bocal 3 (rm baixo da bancada)"));
        c28_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel100.setText("Bar");

        jLabel101.setText("obs");

        lblCel28.setForeground(new java.awt.Color(0, 0, 204));
        lblCel28.setText("N/A");

        lblObs28.setForeground(new java.awt.Color(0, 0, 204));
        lblObs28.setText("N/A");

        javax.swing.GroupLayout c28_Layout = new javax.swing.GroupLayout(c28_);
        c28_.setLayout(c28_Layout);
        c28_Layout.setHorizontalGroup(
            c28_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c28_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel28, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel101)
                .addGap(26, 26, 26)
                .addComponent(lblObs28, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c28_Layout.setVerticalGroup(
            c28_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c28_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(c28_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel28)
                    .addComponent(lblObs28)
                    .addComponent(jLabel100)
                    .addComponent(jLabel101))
                .addGap(28, 28, 28))
        );

        c30.setBorder(javax.swing.BorderFactory.createTitledBorder("105. Interrruptor b80"));
        c30.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel116.setText("Cm");

        jLabel117.setText("obs");

        lblCel30.setForeground(new java.awt.Color(0, 0, 204));
        lblCel30.setText("N/A");

        lblObs30.setForeground(new java.awt.Color(0, 0, 204));
        lblObs30.setText("N/A");

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
                .addComponent(lblObs30, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c30Layout.setVerticalGroup(
            c30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(c30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(lblCel30)
                    .addComponent(jLabel117)
                    .addComponent(lblObs30))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        c31.setBorder(javax.swing.BorderFactory.createTitledBorder("106. Filme"));
        c31.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel102.setText("mm");

        jLabel103.setText("obs");

        lblCel31.setForeground(new java.awt.Color(0, 0, 204));
        lblCel31.setText("N/A");

        lblObs31.setForeground(new java.awt.Color(0, 0, 204));
        lblObs31.setText("N/A");

        javax.swing.GroupLayout c31Layout = new javax.swing.GroupLayout(c31);
        c31.setLayout(c31Layout);
        c31Layout.setHorizontalGroup(
            c31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCel31, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObs31, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c31Layout.setVerticalGroup(
            c31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c31Layout.createSequentialGroup()
                .addGroup(c31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel31)
                    .addComponent(lblObs31)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        c6_.setBorder(javax.swing.BorderFactory.createTitledBorder("6. Largura do Filme"));
        c6_.setPreferredSize(new java.awt.Dimension(512, 50));

        jLabel108.setText("N° voltas");

        jLabel109.setText("obs");

        lblCel6.setForeground(new java.awt.Color(0, 0, 204));
        lblCel6.setText("N/A");

        lblObs6.setForeground(new java.awt.Color(0, 0, 204));
        lblObs6.setText("N/A");

        javax.swing.GroupLayout c6_Layout = new javax.swing.GroupLayout(c6_);
        c6_.setLayout(c6_Layout);
        c6_Layout.setHorizontalGroup(
            c6_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c6_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel109)
                .addGap(26, 26, 26)
                .addComponent(lblObs6, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        c6_Layout.setVerticalGroup(
            c6_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c6_Layout.createSequentialGroup()
                .addGroup(c6_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel6)
                    .addComponent(lblObs6)
                    .addComponent(jLabel108)
                    .addComponent(jLabel109))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelCelofaneLayout = new javax.swing.GroupLayout(PainelCelofane);
        PainelCelofane.setLayout(PainelCelofaneLayout);
        PainelCelofaneLayout.setHorizontalGroup(
            PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCelofaneLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCelofaneLayout.createSequentialGroup()
                        .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c3_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c5_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PainelCelofaneLayout.createSequentialGroup()
                        .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c11_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c15_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c17_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c21_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c19_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c23_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c25_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c27_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c29_, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c26, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                            .addComponent(c28_, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                            .addComponent(c30, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                            .addGroup(PainelCelofaneLayout.createSequentialGroup()
                                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(c6_, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(c24_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                                            .addComponent(c22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                                            .addComponent(c12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                                            .addComponent(c10_, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(c18_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                                            .addComponent(c16_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                                            .addComponent(c14_, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(c20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
                                        .addGroup(PainelCelofaneLayout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(c8_, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(c4_, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 428, Short.MAX_VALUE)))))
                .addGap(117, 117, 117))
        );
        PainelCelofaneLayout.setVerticalGroup(
            PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCelofaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c1_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c3_, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(c4_, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c6_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c5_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c8_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c10_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c11_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c14_, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(c13, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c16_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c15_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c17_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c18_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c19_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c22, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(c21_, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c23_, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c24_, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c25_, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(c26, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c27_, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(c28_, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c30, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(c29_, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        c2.getAccessibleContext().setAccessibleName("fjdslfaj ");

        jTabbedPane2.addTab("CENTERLINE", PainelCelofane);

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1000, 900));

        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });

        jPanel7.setPreferredSize(new java.awt.Dimension(1000, 800));

        jLabel31.setText("DOBRADOR DIREITO");

        jLabel32.setText("DOBRADOR ESQUERDO");

        jLabel33.setText("GUIA ESQUERDA");

        jLabel34.setText("GUIA DIREITA");

        jLabel35.setForeground(new java.awt.Color(51, 51, 255));
        jLabel35.setText("PARÂMETROS DO PRODUTO");

        jLabel36.setText("COMPRIMENTO");

        jLabel37.setText("ALTURA");

        jLabel38.setText("LARGURA");

        jLabel39.setForeground(new java.awt.Color(51, 51, 255));
        jLabel39.setText("TEMPERATURAS");

        jLabel40.setText("BARRA DE SELAGEM");

        jLabel41.setText("PINÇA ESQUERDA");

        jLabel84.setText("PINÇA DIREITA");

        jLabel85.setForeground(new java.awt.Color(51, 51, 255));
        jLabel85.setText("ELEVADOR");

        jLabel88.setText("ABAIXO");

        jLabel90.setText("TOPO");

        lblCel32.setForeground(new java.awt.Color(51, 51, 255));
        lblCel32.setText("N/A");

        lblCel33.setForeground(new java.awt.Color(51, 51, 255));
        lblCel33.setText("N/A");

        lblCel34.setForeground(new java.awt.Color(51, 51, 255));
        lblCel34.setText("N/A");

        lblCel35.setForeground(new java.awt.Color(51, 51, 255));
        lblCel35.setText("N/A");

        lblCel36.setForeground(new java.awt.Color(51, 51, 255));
        lblCel36.setText("N/A");

        lblCel37.setForeground(new java.awt.Color(51, 51, 255));
        lblCel37.setText("N/A");

        lblCel38.setForeground(new java.awt.Color(51, 51, 255));
        lblCel38.setText("N/A");

        lblCel39.setForeground(new java.awt.Color(51, 51, 255));
        lblCel39.setText("N/A");

        lblCel40.setForeground(new java.awt.Color(51, 51, 255));
        lblCel40.setText("N/A");

        lblCel41.setForeground(new java.awt.Color(51, 51, 255));
        lblCel41.setText("N/A");

        lblCel42.setForeground(new java.awt.Color(51, 51, 255));
        lblCel42.setText("N/A");

        lblCel43.setForeground(new java.awt.Color(51, 51, 255));
        lblCel43.setText("N/A");

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
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                                .addComponent(jLabel40)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblCel39, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addComponent(jLabel41)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblCel40, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel36)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblCel36, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addGap(22, 22, 22)
                                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel37)
                                                    .addGap(17, 17, 17)
                                                    .addComponent(lblCel37, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel38)))
                                            .addGap(5, 5, 5)))
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCel38, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel84)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblCel41, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(23, 23, 23))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
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
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCel38))
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
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(lblCel42)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
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

        jTabbedPane1.addTab("AJUSTES TÉCNICOS", jPanel4);

        jLabel7.setText("Atrás ");

        jLabel8.setText("Frente");

        jLabel9.setText("Ciclo");

        jLabel91.setForeground(new java.awt.Color(0, 0, 204));
        jLabel91.setText("TRANSPORTE DE SAIDA");

        jLabel104.setText("Topo");

        jLabel105.setText("Largura");

        jLabel106.setText("Tempo");

        jLabel110.setForeground(new java.awt.Color(0, 0, 204));
        jLabel110.setText("BARRA DE SELAGEM");

        jLabel111.setForeground(new java.awt.Color(0, 0, 204));
        jLabel111.setText("PARAMETROS DO EMPURRADOR");

        jLabel107.setText("Atrás");

        jLabel112.setText("frente");

        jLabel113.setText("posição do cartucho");

        jLabel114.setText("Ciclo");

        lblCel44.setForeground(new java.awt.Color(51, 51, 255));
        lblCel44.setText("N/A");

        lblCel45.setForeground(new java.awt.Color(51, 51, 255));
        lblCel45.setText("N/A");

        lblCel46.setForeground(new java.awt.Color(51, 51, 255));
        lblCel46.setText("N/A");

        lblCel47.setForeground(new java.awt.Color(51, 51, 255));
        lblCel47.setText("N/A");

        lblCel48.setForeground(new java.awt.Color(51, 51, 255));
        lblCel48.setText("N/A");

        lblCel49.setForeground(new java.awt.Color(51, 51, 255));
        lblCel49.setText("N/A");

        lblCel50.setForeground(new java.awt.Color(51, 51, 255));
        lblCel50.setText("N/A");

        lblCel51.setForeground(new java.awt.Color(51, 51, 255));
        lblCel51.setText("N/A");

        lblCel52.setForeground(new java.awt.Color(51, 51, 255));
        lblCel52.setText("N/A");

        lblCel53.setForeground(new java.awt.Color(51, 51, 255));
        lblCel53.setText("N/A");

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
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lblCel44, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCel45, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCel46, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel106)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCel49, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel91))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel110))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel104)
                                .addGap(18, 18, 18)
                                .addComponent(lblCel47, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel105)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCel48, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel107)
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
                                        .addComponent(jLabel114))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCel52, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(230, 230, 230))
                                .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap())))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel111)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblCel44)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblCel45))))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblCel46))
                .addGap(23, 23, 23)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel104)
                                .addGap(16, 16, 16)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel106)
                                    .addComponent(lblCel49))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel111))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel105)
                                .addComponent(lblCel47)
                                .addComponent(lblCel48)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCel53)
                        .addGap(6, 6, 6))
                    .addComponent(jLabel114))
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AJUSTES TÉCNICOS 2", jPanel5);

        jLabel15.setText("ELEVADOR");

        jLabel16.setText("EMPURRADOR");

        jLabel17.setText("GUIAS");

        jLabel18.setText("DOBRADEIRAS");

        jLabel19.setText("MESA");

        jLabel20.setText("PINÇAS");

        jLabel21.setText("CHAPAS PINÇAS");

        lblCel54.setForeground(new java.awt.Color(51, 51, 255));
        lblCel54.setText("N/A");

        lblCel55.setForeground(new java.awt.Color(51, 51, 255));
        lblCel55.setText("N/A");

        lblCel56.setForeground(new java.awt.Color(51, 51, 255));
        lblCel56.setText("N/A");

        lblCel57.setForeground(new java.awt.Color(51, 51, 255));
        lblCel57.setText("N/A");

        lblCel58.setForeground(new java.awt.Color(51, 51, 255));
        lblCel58.setText("N/A");

        lblCel59.setForeground(new java.awt.Color(51, 51, 255));
        lblCel59.setText("N/A");

        lblCel60.setForeground(new java.awt.Color(51, 51, 255));
        lblCel60.setText("N/A");

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
                .addContainerGap(310, Short.MAX_VALUE))
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
                .addContainerGap(261, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("FERRAMENTAL ALTERNATIVO", jPanel6);

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
                .addContainerGap(857, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("OUTROS PARAMENTROS", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1634, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99999, 99999)
        );

        jTabbedPane2.addTab("Imagens", jPanel2);

        jScrollPane1.setViewportView(jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void txtFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormatoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Consultar formato
        consultar_formato();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyReleased
        // TODO add your handling code here:
        pesquisar_produto();
    }//GEN-LAST:event_txtProdutoKeyReleased

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaMaquina_Celofane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCelofane;
    private javax.swing.JPanel c10_;
    private javax.swing.JPanel c11_;
    private javax.swing.JPanel c12;
    private javax.swing.JPanel c13;
    private javax.swing.JPanel c14_;
    private javax.swing.JPanel c15_;
    private javax.swing.JPanel c16_;
    private javax.swing.JPanel c17_;
    private javax.swing.JPanel c18_;
    private javax.swing.JPanel c19_;
    private javax.swing.JPanel c1_;
    private javax.swing.JPanel c2;
    private javax.swing.JPanel c20;
    private javax.swing.JPanel c21_;
    private javax.swing.JPanel c22;
    private javax.swing.JPanel c23_;
    private javax.swing.JPanel c24_;
    private javax.swing.JPanel c25_;
    private javax.swing.JPanel c26;
    private javax.swing.JPanel c27_;
    private javax.swing.JPanel c28_;
    private javax.swing.JPanel c29_;
    private javax.swing.JPanel c30;
    private javax.swing.JPanel c31;
    private javax.swing.JPanel c3_;
    private javax.swing.JPanel c4_;
    private javax.swing.JPanel c5_;
    private javax.swing.JPanel c6_;
    private javax.swing.JPanel c7;
    private javax.swing.JPanel c8_;
    private javax.swing.JPanel c9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblCel1;
    private javax.swing.JLabel lblCel10;
    private javax.swing.JLabel lblCel11;
    private javax.swing.JLabel lblCel12;
    private javax.swing.JLabel lblCel13;
    private javax.swing.JLabel lblCel14;
    private javax.swing.JLabel lblCel15;
    private javax.swing.JLabel lblCel16;
    private javax.swing.JLabel lblCel17;
    private javax.swing.JLabel lblCel18;
    private javax.swing.JLabel lblCel19;
    private javax.swing.JLabel lblCel2;
    private javax.swing.JLabel lblCel20;
    private javax.swing.JLabel lblCel21;
    private javax.swing.JLabel lblCel22;
    private javax.swing.JLabel lblCel23;
    private javax.swing.JLabel lblCel24;
    private javax.swing.JLabel lblCel25;
    private javax.swing.JLabel lblCel26;
    private javax.swing.JLabel lblCel27;
    private javax.swing.JLabel lblCel28;
    private javax.swing.JLabel lblCel29;
    private javax.swing.JLabel lblCel3;
    private javax.swing.JLabel lblCel30;
    private javax.swing.JLabel lblCel31;
    private javax.swing.JLabel lblCel32;
    private javax.swing.JLabel lblCel33;
    private javax.swing.JLabel lblCel34;
    private javax.swing.JLabel lblCel35;
    private javax.swing.JLabel lblCel36;
    private javax.swing.JLabel lblCel37;
    private javax.swing.JLabel lblCel38;
    private javax.swing.JLabel lblCel39;
    private javax.swing.JLabel lblCel4;
    private javax.swing.JLabel lblCel40;
    private javax.swing.JLabel lblCel41;
    private javax.swing.JLabel lblCel42;
    private javax.swing.JLabel lblCel43;
    private javax.swing.JLabel lblCel44;
    private javax.swing.JLabel lblCel45;
    private javax.swing.JLabel lblCel46;
    private javax.swing.JLabel lblCel47;
    private javax.swing.JLabel lblCel48;
    private javax.swing.JLabel lblCel49;
    private javax.swing.JLabel lblCel5;
    private javax.swing.JLabel lblCel50;
    private javax.swing.JLabel lblCel51;
    private javax.swing.JLabel lblCel52;
    private javax.swing.JLabel lblCel53;
    private javax.swing.JLabel lblCel54;
    private javax.swing.JLabel lblCel55;
    private javax.swing.JLabel lblCel56;
    private javax.swing.JLabel lblCel57;
    private javax.swing.JLabel lblCel58;
    private javax.swing.JLabel lblCel59;
    private javax.swing.JLabel lblCel6;
    private javax.swing.JLabel lblCel60;
    private javax.swing.JLabel lblCel7;
    private javax.swing.JLabel lblCel8;
    private javax.swing.JLabel lblCel9;
    private javax.swing.JLabel lblObs1;
    private javax.swing.JLabel lblObs10;
    private javax.swing.JLabel lblObs11;
    private javax.swing.JLabel lblObs12;
    private javax.swing.JLabel lblObs13;
    private javax.swing.JLabel lblObs14;
    private javax.swing.JLabel lblObs15;
    private javax.swing.JLabel lblObs16;
    private javax.swing.JLabel lblObs17;
    private javax.swing.JLabel lblObs18;
    private javax.swing.JLabel lblObs19;
    private javax.swing.JLabel lblObs2;
    private javax.swing.JLabel lblObs20;
    private javax.swing.JLabel lblObs21;
    private javax.swing.JLabel lblObs22;
    private javax.swing.JLabel lblObs23;
    private javax.swing.JLabel lblObs24;
    private javax.swing.JLabel lblObs25;
    private javax.swing.JLabel lblObs26;
    private javax.swing.JLabel lblObs27;
    private javax.swing.JLabel lblObs28;
    private javax.swing.JLabel lblObs29;
    private javax.swing.JLabel lblObs3;
    private javax.swing.JLabel lblObs30;
    private javax.swing.JLabel lblObs31;
    private javax.swing.JLabel lblObs4;
    private javax.swing.JLabel lblObs5;
    private javax.swing.JLabel lblObs6;
    private javax.swing.JLabel lblObs7;
    private javax.swing.JLabel lblObs8;
    private javax.swing.JLabel lblObs9;
    private javax.swing.JLabel lugjhkg;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextPane txtArea;
    private javax.swing.JTextField txtFormato;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
