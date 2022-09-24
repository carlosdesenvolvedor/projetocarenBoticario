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
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

public class TelaCadastroParmCelofane extends javax.swing.JFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    BufferedImage imagem; //para converter a imagem
    File f= null;
    File f2= null;
    File f3= null;
    File f4= null;
    File f5= null;
    File f6= null;
    String path1 = null;
    String path2 = null;
    String path3 = null;
    String path4 = null;
    String path5 = null;
    String path6 = null;
    private ImageIcon format = null;
    private ImageIcon format2 = null;
    private ImageIcon format3 = null;
    private ImageIcon format4 = null;
    String fname = null;
    int n = 0;
    byte[] pimage = null;
    private Blob is1;
    
    //Construtor:
    public TelaCadastroParmCelofane() {
        initComponents();
        conexao = ModuloConexao.conector();
        defaultSize(tblProduto1);
        
        
        
    }
    
    public void selecionarFoto1(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter foto1 = new FileNameExtensionFilter("PNG JPG AND JPEG", "png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(foto1);
        int load = fileChooser.showOpenDialog(null);
        
        if(load == fileChooser.APPROVE_OPTION){
            f = fileChooser.getSelectedFile();
            path1 = f.getAbsolutePath();
            
            imagePath.setText(path1);
            ImageIcon li = new ImageIcon(path1);
            Image img = li.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
            lblimagem.setIcon(new ImageIcon(img));
    
        }
        
    }
    
       
    public void selecionarFoto2(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter foto2 = new FileNameExtensionFilter("PNG JPG AND JPEG", "png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(foto2);
        int load2 = fileChooser.showOpenDialog(null);
        
        if(load2 == fileChooser.APPROVE_OPTION){
            f2 = fileChooser.getSelectedFile();
            path2 = f2.getAbsolutePath();
            
            imagePath2.setText(path2);
            ImageIcon li2 = new ImageIcon(path2);
            Image img2 = li2.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
            lblimage2.setIcon(new ImageIcon(img2));
            
    
        }
        
    }
    public void selecionarFoto3(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter foto2 = new FileNameExtensionFilter("PNG JPG AND JPEG", "png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(foto2);
        int load2 = fileChooser.showOpenDialog(null);
        
        if(load2 == fileChooser.APPROVE_OPTION){
            f3 = fileChooser.getSelectedFile();
            path3 = f3.getAbsolutePath();
            
            imagePath3.setText(path3);
            ImageIcon li2 = new ImageIcon(path3);
            Image img2 = li2.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
            lblimagem3.setIcon(new ImageIcon(img2));
            
    
        }
        
    }
    public void selecionarFoto4(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter foto2 = new FileNameExtensionFilter("PNG JPG AND JPEG", "png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(foto2);
        int load2 = fileChooser.showOpenDialog(null);
        
        if(load2 == fileChooser.APPROVE_OPTION){
            f4 = fileChooser.getSelectedFile();
            path4 = f4.getAbsolutePath();
            
            imagePath4.setText(path4);
            ImageIcon li2 = new ImageIcon(path4);
            Image img2 = li2.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
            lblimagem4.setIcon(new ImageIcon(img2));
            
    
        }
        
    }
    
 
    
    
    private void adicionar(){
        try {
            File f = new File(path1);
            File f2 = new File(path2);
            File f3 = new File(path3);
            File f4 = new File(path4);
            
            
        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Favor inserir a imagem do produto!");

        }
        
        String sql = "insert into tbparametrogeral(formato,maquina,produto,fla,flb,flc,fld,fle,flf,t2g,t2h,t2k,t2hh,t2i,t2j,t2n,t2m,"
                + "d2o,d2q,d2p,l2g,l2h,l2k,tc1,to1,tc2,to2,tc3,to3,tc4,to4,tc5,to5,tc6,to6,"
                + "tc7,to7,tc8,to8,tc9,to9,tc10,to10,tc11,to11,tc12,to12,tc13,to13,tc14,to14,tc15,to15,"
                + "tc16,to16,tc17,to17,tc18,to18,tc19,to19,tc20,to20,tc21,to21,tc22,to22,tc23,to23,tc24,to24,"
                + "tc25,to25,tc26,to26,tc27,to27,tc28,to28,tc29,to29,tc30,to30,tc31,to31,tc32,tc33,tc34,tc35,"
                + "tc36,tc37,tc38,tc39,tc40,tc41,tc42,tc43,tc44,tc45,tc46,tc47,tc48,tc49,tc50,tc51,tc52,tc53,"
                + "tc54,tc55,tc56,tc57,tc58,tc59,tc60,obsGeral,imagePath1,foto1,obs,imagePath2,foto2,obs2,"
                + "imagePath3,foto3,obs3,imagePath4,foto4,obs4,esteira,Abastecimento,Acondicionamento)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?)";
        try {
            
            try {
                InputStream is1 = new FileInputStream(f);
                InputStream is2 = new FileInputStream(f2);
                InputStream is3 = new FileInputStream(f3);
                InputStream is4 = new FileInputStream(f4);
                
           
            
            
            pst = conexao.prepareStatement(sql);
            
            
            //tentar incluir campo id para ver se para de dar erro nesta merda
            
            pst.setString(1, txtFor.getText());
            pst.setString(2, cboMaquina.getSelectedItem().toString());
            pst.setString(3, txtProduto1.getText());
            pst.setString(4, txtF1a.getText());
            pst.setString(5, txtF1b.getText());
            pst.setString(6, txtF1c.getText());
            pst.setString(7, txtF1d.getText());
            pst.setString(8, txtF1e.getText());
            pst.setString(9, txtF1f.getText());
            pst.setString(10, txtT2g.getText());
            pst.setString(11, txtT2h.getText());
            pst.setString(12, txtT2k.getText());
            pst.setString(13, txtT2hh.getText());
            pst.setString(14, txtT2i.getText());
            pst.setString(15, txtT2j.getText());
            pst.setString(16, txtT2n.getText());
            pst.setString(17, txtT2m.getText());
            pst.setString(18, txtD2o.getText());
            pst.setString(19, txtD2q.getText());
            pst.setString(20, txtD2p.getText());
            pst.setString(21, txtL2g.getText());
            pst.setString(22, txtL2h.getText());
            pst.setString(23, txtL2k.getText());
            pst.setString(24, txtCel1.getText());
            pst.setString(25, txtObs1.getText());
            pst.setString(26, txtCel2.getText());
            pst.setString(27, txtObs2.getText());
            pst.setString(28, txtCel3.getText());
            pst.setString(29, txtObs3.getText());
            pst.setString(30, txtCel4.getText());
            pst.setString(31, txtObs4.getText());
            pst.setString(32, txtCel5.getText());
            pst.setString(33, txtObs5.getText());
            pst.setString(34, txtCel6.getText());
            pst.setString(35, txtObs6.getText());
            pst.setString(36, txtCel7.getText());
            pst.setString(37, txtObs7.getText());
            pst.setString(38, txtCel8.getText());
            pst.setString(39, txtObs8.getText());
            pst.setString(40, txtCel9.getText());
            pst.setString(41, txtObs9.getText());
            pst.setString(42, txtCel10.getText());
            pst.setString(43, txtObs10.getText());
            pst.setString(44, txtCel11.getText());
            pst.setString(45, txtObs11.getText());
            pst.setString(46, txtCel12.getText());
            pst.setString(47, txtObs12.getText());
            pst.setString(48, txtCel13.getText());
            pst.setString(49, txtObs13.getText());
            pst.setString(50, txtCel14.getText());
            pst.setString(51, txtObs14.getText());
            pst.setString(52, txtCel15.getText());
            pst.setString(53, txtObs15.getText());
            pst.setString(54, txtCel16.getText());
            pst.setString(55, txtObs16.getText());
            pst.setString(56, txtCel17.getText());
            pst.setString(57, txtObs17.getText());
            pst.setString(58, txtCel18.getText());
            pst.setString(59, txtObs18.getText());
            pst.setString(60, txtCel19.getText());
            pst.setString(61, txtObs19.getText());
            pst.setString(62, txtCel20.getText());
            pst.setString(63, txtObs20.getText());
            pst.setString(64, txtCel21.getText());
            pst.setString(65, txtObs21.getText());
            pst.setString(66, txtCel22.getText());
            pst.setString(67, txtObs22.getText());
            pst.setString(68, txtCel23.getText());
            pst.setString(69, txtObs23.getText());
            pst.setString(70, txtCel24.getText());
            pst.setString(71, txtObs24.getText());
            pst.setString(72, txtCel25.getText());
            pst.setString(73, txtObs25.getText());
            pst.setString(74, txtCel26.getText());
            pst.setString(75, txtObs26.getText());
            pst.setString(76, txtCel27.getText());
            pst.setString(77, txtObs27.getText());
            pst.setString(78, txtCel28.getText());
            pst.setString(79, txtObs28.getText());
            pst.setString(80, txtCel29.getText());
            pst.setString(81, txtObs29.getText());
            pst.setString(82, txtCel30.getText());
            pst.setString(83, txtObs30.getText());
            pst.setString(84, txtCel31.getText());
            pst.setString(85, txtObs31.getText());
            pst.setString(86, txtCel32.getText());
            pst.setString(87, txtCel33.getText());
            pst.setString(88, txtCel34.getText());
            pst.setString(89, txtCel35.getText());
            pst.setString(90, txtCel36.getText());
            pst.setString(91, txtCel37.getText());
            pst.setString(92, txtCel38.getText());
            pst.setString(93, txtCel39.getText());
            pst.setString(94, txtCel40.getText());
            pst.setString(95, txtCel41.getText());
            pst.setString(96, txtCel42.getText());
            pst.setString(97, txtCel43.getText());
            pst.setString(98, txtCel44.getText());
            pst.setString(99,txtCel45.getText());
            pst.setString(100,txtCel46.getText());
            pst.setString(101,txtCel47.getText());
            pst.setString(102,txtCel48.getText());
            pst.setString(103,txtCel49.getText());
            pst.setString(104,txtCel50.getText());
            pst.setString(105,txtCel51.getText());
            pst.setString(106,txtCel52.getText());
            pst.setString(107,txtCel53.getText());
            pst.setString(108,txtCel54.getText());
            pst.setString(109,txtCel55.getText());
            pst.setString(110,txtCel56.getText());
            pst.setString(111,txtCel57.getText());
            pst.setString(112,txtCel58.getText());
            pst.setString(113,txtCel59.getText());
            pst.setString(114,txtCel60.getText());
            pst.setString(115,txtObsGeral.getText());
            pst.setString(116,imagePath.getText());//caminho
            pst.setBlob(117,is1);//arquivo
            pst.setString(118,txtFoto1.getText());//obs foto1
            pst.setString(119,imagePath2.getText());//caminho
            pst.setBlob(120,is2);//foto arquivo
            pst.setString(121,txtFoto2.getText()); //obs foto2
            pst.setString(122,imagePath3.getText());//caminho
            pst.setBlob(123,is3);//foto arquivo
            pst.setString(124,txtFoto3.getText()); //obs foto 3
            pst.setString(125,imagePath4.getText());//caminho
            pst.setBlob(126,is4);//foto arquivo
            pst.setString(127,txtFoto4.getText()); //obs foto 4
            pst.setString(128, cboEsteira.getSelectedItem().toString());
            pst.setString(129, cboAbastecimento.getSelectedItem().toString());
            pst.setString(130, cboAcondicionamento.getSelectedItem().toString());
            
            
     
           
            //validação dos campos obrigatorios:
            if (txtFor.getText().isEmpty()||txtProduto1.getText().isEmpty()||txtF1a.getText().isEmpty()||txtF1b.getText().isEmpty()|| txtT2g.getText().isEmpty()||txtT2h.getText().isEmpty()||
                txtF1c.getText().isEmpty()||txtF1d.getText().isEmpty()||txtT2hh.getText().isEmpty()||txtT2i.getText().isEmpty()||
                txtF1e.getText().isEmpty()|| txtF1f.getText().isEmpty()||txtT2k.getText().isEmpty()||txtT2m.getText().isEmpty()||txtT2n.getText().isEmpty()||
                txtD2o.getText().isEmpty()||txtD2q.getText().isEmpty()|| txtD2p.getText().isEmpty()||txtL2g.getText().isEmpty()||
                txtL2h.getText().isEmpty()||txtL2k.getText().isEmpty()|| 
                cboMaquina.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Favor preecher todos os campos obrigatórios");

            } else {

                //a linha abaixo atualiza usuarios com os dados do formulario...
                //pst.executeUpdate();
                //a estrutura abaixo é usada para confirmar a inserção dos dados na tabela.
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!!");
                    //as linhas abaixo limpa os campos
                    txtFor.setText(null);
                    cboAbastecimento.setSelectedItem(null);
                    cboAcondicionamento.setSelectedItem(null);
                    cboEsteira.setSelectedItem(null);
                    cboMaquina.setSelectedItem(null);
                    txtProduto1.setText(null);
                    txtF1a.setText(null);
                    txtF1b.setText(null);
                    txtF1c.setText(null);
                    txtF1d.setText(null);
                    txtF1e.setText(null);
                    txtF1f.setText(null);
                    txtT2g.setText(null);
                    txtT2h.setText(null);
                    txtT2hh.setText(null);
                    txtT2i.setText(null);
                    txtT2j.setText(null);
                    txtT2k.setText(null);
                    txtT2m.setText(null);
                    txtT2n.setText(null);
                    txtD2o.setText(null);
                    txtD2p.setText(null);
                    txtD2q.setText(null);
                    txtL2g.setText(null);
                    txtL2h.setText(null);
                    txtL2k.setText(null);
                    txtCel1.setText(null);
                    txtObs1.setText(null);
                    txtCel2.setText(null);
                    txtObs2.setText(null);
                    txtCel3.setText(null);
                    txtObs3.setText(null);
                    txtCel4.setText(null);
                    txtObs4.setText(null);
                    txtCel5.setText(null);
                    txtObs5.setText(null);
                    txtCel6.setText(null);
                    txtObs6.setText(null);
                    txtCel7.setText(null);
                    txtObs7.setText(null);
                    txtCel8.setText(null);
                    txtObs8.setText(null);
                    txtCel9.setText(null);
                    txtObs9.setText(null);
                    txtCel10.setText(null);
                    txtObs10.setText(null);
                    txtCel11.setText(null);
                    txtObs11.setText(null);
                    txtCel12.setText(null);
                    txtObs12.setText(null);
                    txtCel13.setText(null);
                    txtObs13.setText(null);
                    txtCel14.setText(null);
                    txtObs14.setText(null);
                    txtCel15.setText(null);
                    txtObs15.setText(null);
                    txtCel16.setText(null);
                    txtObs16.setText(null);
                    txtCel17.setText(null);
                    txtObs17.setText(null);
                    txtCel18.setText(null);
                    txtObs18.setText(null);
                    txtCel19.setText(null);
                    txtObs19.setText(null);
                    txtCel20.setText(null);
                    txtObs20.setText(null);
                    txtCel21.setText(null);
                    txtObs21.setText(null);
                    txtCel22.setText(null);
                    txtObs22.setText(null);
                    txtCel23.setText(null);
                    txtObs23.setText(null);
                    txtCel24.setText(null);
                    txtObs24.setText(null);
                    txtCel25.setText(null);
                    txtObs25.setText(null);
                    txtCel26.setText(null);
                    txtObs26.setText(null);
                    txtCel27.setText(null);
                    txtObs27.setText(null);
                    txtCel28.setText(null);
                    txtObs28.setText(null);
                    txtCel29.setText(null);
                    txtObs29.setText(null);
                    txtCel30.setText(null);
                    txtObs30.setText(null);
                    txtCel31.setText(null);
                    txtObs31.setText(null);
                    txtCel32.setText(null);
                    txtCel33.setText(null);
                    txtCel34.setText(null);
                    txtCel35.setText(null);
                    txtCel36.setText(null);
                    txtCel37.setText(null);
                    txtCel38.setText(null);
                    txtCel39.setText(null);
                    txtCel40.setText(null);
                    txtCel41.setText(null);
                    txtCel42.setText(null);
                    txtCel43.setText(null);
                    txtCel44.setText(null);
                    txtCel45.setText(null);
                    txtCel46.setText(null);
                    txtCel47.setText(null);
                    txtCel48.setText(null);
                    txtCel49.setText(null);
                    txtCel50.setText(null);
                    txtCel51.setText(null);
                    txtCel52.setText(null);
                    txtCel53.setText(null);
                    txtCel54.setText(null);
                    txtCel55.setText(null);
                    txtCel56.setText(null);
                    txtCel57.setText(null);
                    txtCel58.setText(null);
                    txtCel59.setText(null);
                    txtCel60.setText(null);
                    txtFoto1.setText(null);
                    txtFoto2.setText(null);
                    txtFoto3.setText(null);
                    txtFoto4.setText(null);
                    txtObsGeral.setText(null);
                    lblimagem.setIcon(null);
                    lblimage2.setIcon(null);
                    lblimagem3.setIcon(null);
                    lblimagem4.setIcon(null);
                    
                    
                    
                    
                }
            }

        }/*catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex);
            
            }*/ 
            catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, e);
            }  
        } 
        catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro, produto não cadastrado pois é obrigatorio as 4 fotos...");
            }
       
    }
    
    private void remover(){
        //a estrutura a baixo confirma a remoção do colaborador
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir: "+txtProduto1.getText()+"?","Atenção",JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
            String sql = "delete from tbparametrogeral where produto =?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1,txtProduto1.getText());
                int apagado = pst.executeUpdate();
                if(apagado>0){
                    JOptionPane.showMessageDialog(null, "Produto removido com sucess!!");
                      txtFor.setText(null);
                      
                    txtFor.setText(null);
                    cboAbastecimento.setSelectedItem(null);
                    cboAcondicionamento.setSelectedItem(null);
                    cboEsteira.setSelectedItem(null);  
                    cboMaquina.setSelectedItem(null);
                    txtProduto1.setText(null);
                    txtF1a.setText(null);
                    txtF1b.setText(null);
                    txtF1c.setText(null);
                    txtF1d.setText(null);
                    txtF1e.setText(null);
                    txtF1f.setText(null);
                    txtT2g.setText(null);
                    txtT2h.setText(null);
                    txtT2hh.setText(null);
                    txtT2i.setText(null);
                    txtT2j.setText(null);
                    txtT2k.setText(null);
                    txtT2m.setText(null);
                    txtT2n.setText(null);
                    txtD2o.setText(null);
                    txtD2p.setText(null);
                    txtD2q.setText(null);
                    txtL2g.setText(null);
                    txtL2h.setText(null);
                    txtL2k.setText(null);
                    txtCel1.setText(null);
                    txtObs1.setText(null);
                    txtCel2.setText(null);
                    txtObs2.setText(null);
                    txtCel3.setText(null);
                    txtObs3.setText(null);
                    txtCel4.setText(null);
                    txtObs4.setText(null);
                    txtCel5.setText(null);
                    txtObs5.setText(null);
                    txtCel6.setText(null);
                    txtObs6.setText(null);
                    txtCel7.setText(null);
                    txtObs7.setText(null);
                    txtCel8.setText(null);
                    txtObs8.setText(null);
                    txtCel9.setText(null);
                    txtObs9.setText(null);
                    txtCel10.setText(null);
                    txtObs10.setText(null);
                    txtCel11.setText(null);
                    txtObs11.setText(null);
                    txtCel12.setText(null);
                    txtObs12.setText(null);
                    txtCel13.setText(null);
                    txtObs13.setText(null);
                    txtCel14.setText(null);
                    txtObs14.setText(null);
                    txtCel15.setText(null);
                    txtObs15.setText(null);
                    txtCel16.setText(null);
                    txtObs16.setText(null);
                    txtCel17.setText(null);
                    txtObs17.setText(null);
                    txtCel18.setText(null);
                    txtObs18.setText(null);
                    txtCel19.setText(null);
                    txtObs19.setText(null);
                    txtCel20.setText(null);
                    txtObs20.setText(null);
                    txtCel21.setText(null);
                    txtObs21.setText(null);
                    txtCel22.setText(null);
                    txtObs22.setText(null);
                    txtCel23.setText(null);
                    txtObs23.setText(null);
                    txtCel24.setText(null);
                    txtObs24.setText(null);
                    txtCel25.setText(null);
                    txtObs25.setText(null);
                    txtCel26.setText(null);
                    txtObs26.setText(null);
                    txtCel27.setText(null);
                    txtObs27.setText(null);
                    txtCel28.setText(null);
                    txtObs28.setText(null);
                    txtCel29.setText(null);
                    txtObs29.setText(null);
                    txtCel30.setText(null);
                    txtObs30.setText(null);
                    txtCel31.setText(null);
                    txtObs31.setText(null);
                    txtCel32.setText(null);
                    txtCel33.setText(null);
                    txtCel34.setText(null);
                    txtCel35.setText(null);
                    txtCel36.setText(null);
                    txtCel37.setText(null);
                    txtCel38.setText(null);
                    txtCel39.setText(null);
                    txtCel40.setText(null);
                    txtCel41.setText(null);
                    txtCel42.setText(null);
                    txtCel43.setText(null);
                    txtCel44.setText(null);
                    txtCel45.setText(null);
                    txtCel46.setText(null);
                    txtCel47.setText(null);
                    txtCel48.setText(null);
                    txtCel49.setText(null);
                    txtCel50.setText(null);
                    txtCel51.setText(null);
                    txtCel52.setText(null);
                    txtCel53.setText(null);
                    txtCel54.setText(null);
                    txtCel55.setText(null);
                    txtCel56.setText(null);
                    txtCel57.setText(null);
                    txtCel58.setText(null);
                    txtCel59.setText(null);
                    txtCel60.setText(null);
                    txtFoto1.setText(null);
                    txtFoto2.setText(null);
                    txtFoto3.setText(null);
                    txtFoto4.setText(null);
                    txtObsGeral.setText(null);
                    lblimagem.setIcon(null);
                    lblimage2.setIcon(null);
                    lblimagem3.setIcon(null);
                    lblimagem4.setIcon(null);
                    
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
               
        }
        
    }
    
    
     private void consultar() {
       // String sql = "select * from tbusuarios where iduser=?";
        String sql = "select * from tbparametrogeral where produto=?";
        try {
            pst = conexao.prepareStatement(sql);

            //pst.setString(1, txtUsuId.getText());
            pst.setString(1,txtProduto1.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                    
                    txtFor.setText(rs.getString(2));
                    /*cbo.setText(rs.getString("acondicionamento"));
                txtAbaste.setText(rs.getString("abastecimento"));
                txtEsteira.setText(rs.getString("esteira"));
                txtFormato.setText(rs.getString("formato"));*/
                 
                    cboMaquina.setSelectedItem(rs.getString(2).toString());
                    txtF1a.setText(rs.getString(5));
                    txtF1b.setText(rs.getString(6));
                    txtF1c.setText(rs.getString(7));
                    txtF1d.setText(rs.getString(8));
                    txtF1e.setText(rs.getString(9));
                    txtF1f.setText(rs.getString(10));
                    txtT2g.setText(rs.getString(11));
                    txtT2h.setText(rs.getString(12));
                    txtT2hh.setText(rs.getString(13));
                    txtT2i.setText(rs.getString(14));
                    txtT2j.setText(rs.getString(15));
                    txtT2k.setText(rs.getString(16));
                    txtT2m.setText(rs.getString(17));
                    txtT2n.setText(rs.getString(18));
                    txtD2o.setText(rs.getString(19));
                    txtD2p.setText(rs.getString(20));
                    txtD2q.setText(rs.getString(21));
                    txtL2g.setText(rs.getString(22));
                    txtL2h.setText(rs.getString(23));
                    txtL2k.setText(rs.getString(24));
                    txtCel1.setText(rs.getString(25));
                    txtObs1.setText(rs.getString(26));
                    txtCel2.setText(rs.getString(27));
                    txtObs2.setText(rs.getString(28));
                    txtCel3.setText(rs.getString(29));
                    txtObs3.setText(rs.getString(30));
                    txtCel4.setText(rs.getString(31));
                    txtObs4.setText(rs.getString(32));
                    txtCel5.setText(rs.getString(33));
                    txtObs5.setText(rs.getString(34));
                    txtCel6.setText(rs.getString(35));
                    txtObs6.setText(rs.getString(36));
                    txtCel7.setText(rs.getString(37));
                    txtObs7.setText(rs.getString(38));
                    txtCel8.setText(rs.getString(39));
                    txtObs8.setText(rs.getString(40));
                    txtCel9.setText(rs.getString(41));
                    txtObs9.setText(rs.getString(42));
                    txtCel10.setText(rs.getString(43));
                    txtObs10.setText(rs.getString(44));
                    txtCel11.setText(rs.getString(45));
                    txtObs11.setText(rs.getString(46));
                    txtCel12.setText(rs.getString(47));
                    txtObs12.setText(rs.getString(48));
                    txtCel13.setText(rs.getString(49));
                    txtObs13.setText(rs.getString(50));
                    txtCel14.setText(rs.getString(51));
                    txtObs14.setText(rs.getString(52));
                    txtCel15.setText(rs.getString(53));
                    txtObs15.setText(rs.getString(54));
                    txtCel16.setText(rs.getString(55));
                    txtObs16.setText(rs.getString(56));
                    txtCel17.setText(rs.getString(57));
                    txtObs17.setText(rs.getString(58));
                    txtCel18.setText(rs.getString(59));
                    txtObs18.setText(rs.getString(60));
                    txtCel19.setText(rs.getString(61));
                    txtObs19.setText(rs.getString(62));
                    txtCel20.setText(rs.getString(63));
                    txtObs20.setText(rs.getString(64));
                    txtCel21.setText(rs.getString(65));
                    txtObs21.setText(rs.getString(66));
                    txtCel22.setText(rs.getString(67));
                    txtObs22.setText(rs.getString(68));
                    txtCel23.setText(rs.getString(69));
                    txtObs23.setText(rs.getString(70));
                    txtCel24.setText(rs.getString(71));
                    txtObs24.setText(rs.getString(72));
                    txtCel25.setText(rs.getString(73));
                    txtObs25.setText(rs.getString(74));
                    txtCel26.setText(rs.getString(75));
                    txtObs26.setText(rs.getString(76));
                    txtCel27.setText(rs.getString(77));
                    txtObs27.setText(rs.getString(78));
                    txtCel28.setText(rs.getString(79));
                    txtObs28.setText(rs.getString(80));
                    txtCel29.setText(rs.getString(81));
                    txtObs29.setText(rs.getString(82));
                    txtCel30.setText(rs.getString(83));
                    txtObs30.setText(rs.getString(84));
                    txtCel31.setText(rs.getString(85));
                    txtObs31.setText(rs.getString(86));
                    txtCel32.setText(rs.getString(87));
                    txtCel33.setText(rs.getString(88));
                    txtCel34.setText(rs.getString(89));
                    txtCel35.setText(rs.getString(90));
                    txtCel36.setText(rs.getString(91));
                    txtCel37.setText(rs.getString(92));
                    txtCel38.setText(rs.getString(93));
                    txtCel39.setText(rs.getString(94));
                    txtCel40.setText(rs.getString(95));
                    txtCel41.setText(rs.getString(96));
                    txtCel42.setText(rs.getString(97));
                    txtCel43.setText(rs.getString(98));
                    txtCel44.setText(rs.getString(99));
                    txtCel45.setText(rs.getString(100));
                    txtCel46.setText(rs.getString(101));
                    txtCel47.setText(rs.getString(102));
                    txtCel48.setText(rs.getString(103));
                    txtCel49.setText(rs.getString(104));
                    txtCel50.setText(rs.getString(105));
                    txtCel51.setText(rs.getString(106));
                    txtCel52.setText(rs.getString(107));
                    txtCel53.setText(rs.getString(108));
                    txtCel54.setText(rs.getString(109));
                    txtCel55.setText(rs.getString(110));
                    txtCel56.setText(rs.getString(111));
                    txtCel57.setText(rs.getString(112));
                    txtCel58.setText(rs.getString(113));
                    txtCel59.setText(rs.getString(114));
                    txtCel60.setText(rs.getString(115));
                    txtFoto1.setText(rs.getString(116));
                    
                    try {
                    lblimagem.setIcon(null);
                    
                    byte[] imagedata = rs.getBytes("foto1");
                    
                    format = new ImageIcon(imagedata);
                    Image mm = format.getImage();
                    Image img1 = mm.getScaledInstance(200,250, Image.SCALE_SMOOTH);
                    ImageIcon image = new ImageIcon(img1);
                    lblimagem.setIcon(image);
                    
                    
                } catch (Exception e) {
                }
                
               
                //foto 2 
                try {
                    lblimage2.setIcon(null);
                    
                    byte[] imagedata2 = rs.getBytes("foto2");
                    
                    format2 = new ImageIcon(imagedata2);
                    Image mm2 = format2.getImage();
                    Image img2 = mm2.getScaledInstance(200,250, Image.SCALE_SMOOTH);
                    ImageIcon image2 = new ImageIcon(img2);
                    lblimage2.setIcon(image2);
                    
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 2, favar informar responsavel por cadastramento!!");
                }
                
                
                //foto 3
                
                try {
                    lblimagem3.setIcon(null);
                    
                    byte[] imagedata3 = rs.getBytes("foto3");
                    format3 = new ImageIcon(imagedata3);
                    Image mm3 = format3.getImage();
                    Image img3 = mm3.getScaledInstance(200,250, Image.SCALE_SMOOTH);
                    ImageIcon image3 = new ImageIcon(img3);
                    lblimagem3.setIcon(image3);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 3, favar informar responsavel por cadastramento!!");
                }
                    
                // foto 4
                try {
                    lblimagem4.setIcon(null);
                    
                    byte[] imagedata4 = rs.getBytes("foto4");
                    format4 = new ImageIcon(imagedata4);
                    Image mm4 = format4.getImage();
                    Image img4 = mm4.getScaledInstance(200,250, Image.SCALE_SMOOTH);
                    ImageIcon image4 = new ImageIcon(img4);
                    lblimagem4.setIcon(image4);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 4, favar informar responsavel por cadastramento!!");
                }
                    txtFoto2.setText(rs.getString(119));
                    txtFoto3.setText(rs.getString(122));
                    txtFoto4.setText(rs.getString(125));
                    txtObsGeral.setText(rs.getString(128));
                    try {
                        cboEsteira.setSelectedItem(rs.getString("esteira").toString());
                        cboAbastecimento.setSelectedItem(rs.getString("abastecimento").toString());
                        cboAcondicionamento.setSelectedItem(rs.getString("acondicionamento").toString());

                    
                } catch (Exception e) {
                }

            } else {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado");
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
       // String sql = "select * from tbusuarios where iduser=?";321
        String sql = "select * from tbparametrogeral where formato=?";
        try {
            pst = conexao.prepareStatement(sql);

            //pst.setString(1, txtUsuId.getText());
            pst.setString(1,txtFor.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
              
                    txtFor.setText(rs.getString(2));
                    cboMaquina.setSelectedItem(rs.getString(3).toString());
                    txtF1a.setText(rs.getString(5));
                    txtF1b.setText(rs.getString(6));
                    txtF1c.setText(rs.getString(7));
                    txtF1d.setText(rs.getString(8));
                    txtF1e.setText(rs.getString(9));
                    txtF1f.setText(rs.getString(10));
                    txtT2g.setText(rs.getString(11));
                    txtT2h.setText(rs.getString(12));
                    txtT2hh.setText(rs.getString(13));
                    txtT2i.setText(rs.getString(14));
                    txtT2j.setText(rs.getString(15));
                    txtT2k.setText(rs.getString(16));
                    txtT2m.setText(rs.getString(17));
                    txtT2n.setText(rs.getString(18));
                    txtD2o.setText(rs.getString(19));
                    txtD2p.setText(rs.getString(20));
                    txtD2q.setText(rs.getString(21));
                    txtL2g.setText(rs.getString(22));
                    txtL2h.setText(rs.getString(23));
                    txtL2k.setText(rs.getString(24));
                    txtCel1.setText(rs.getString(25));
                    txtObs1.setText(rs.getString(26));
                    txtCel2.setText(rs.getString(27));
                    txtObs2.setText(rs.getString(28));
                    txtCel3.setText(rs.getString(29));
                    txtObs3.setText(rs.getString(30));
                    txtCel4.setText(rs.getString(31));
                    txtObs4.setText(rs.getString(32));
                    txtCel5.setText(rs.getString(33));
                    txtObs5.setText(rs.getString(34));
                    txtCel6.setText(rs.getString(35));
                    txtObs6.setText(rs.getString(36));
                    txtCel7.setText(rs.getString(37));
                    txtObs7.setText(rs.getString(38));
                    txtCel8.setText(rs.getString(39));
                    txtObs8.setText(rs.getString(40));
                    txtCel9.setText(rs.getString(41));
                    txtObs9.setText(rs.getString(42));
                    txtCel10.setText(rs.getString(43));
                    txtObs10.setText(rs.getString(44));
                    txtCel11.setText(rs.getString(45));
                    txtObs11.setText(rs.getString(46));
                    txtCel12.setText(rs.getString(47));
                    txtObs12.setText(rs.getString(48));
                    txtCel13.setText(rs.getString(49));
                    txtObs13.setText(rs.getString(50));
                    txtCel14.setText(rs.getString(51));
                    txtObs14.setText(rs.getString(52));
                    txtCel15.setText(rs.getString(53));
                    txtObs15.setText(rs.getString(54));
                    txtCel16.setText(rs.getString(55));
                    txtObs16.setText(rs.getString(56));
                    txtCel17.setText(rs.getString(57));
                    txtObs17.setText(rs.getString(58));
                    txtCel18.setText(rs.getString(59));
                    txtObs18.setText(rs.getString(60));
                    txtCel19.setText(rs.getString(61));
                    txtObs19.setText(rs.getString(62));
                    txtCel20.setText(rs.getString(63));
                    txtObs20.setText(rs.getString(64));
                    txtCel21.setText(rs.getString(65));
                    txtObs21.setText(rs.getString(66));
                    txtCel22.setText(rs.getString(67));
                    txtObs22.setText(rs.getString(68));
                    txtCel23.setText(rs.getString(69));
                    txtObs23.setText(rs.getString(70));
                    txtCel24.setText(rs.getString(71));
                    txtObs24.setText(rs.getString(72));
                    txtCel25.setText(rs.getString(73));
                    txtObs25.setText(rs.getString(74));
                    txtCel26.setText(rs.getString(75));
                    txtObs26.setText(rs.getString(76));
                    txtCel27.setText(rs.getString(77));
                    txtObs27.setText(rs.getString(78));
                    txtCel28.setText(rs.getString(79));
                    txtObs28.setText(rs.getString(80));
                    txtCel29.setText(rs.getString(81));
                    txtObs29.setText(rs.getString(82));
                    txtCel30.setText(rs.getString(83));
                    txtObs30.setText(rs.getString(84));
                    txtCel31.setText(rs.getString(85));
                    txtObs31.setText(rs.getString(86));
                    txtCel32.setText(rs.getString(87));
                    txtCel33.setText(rs.getString(88));
                    txtCel34.setText(rs.getString(89));
                    txtCel35.setText(rs.getString(90));
                    txtCel36.setText(rs.getString(91));
                    txtCel37.setText(rs.getString(92));
                    txtCel38.setText(rs.getString(93));
                    txtCel39.setText(rs.getString(94));
                    txtCel40.setText(rs.getString(95));
                    txtCel41.setText(rs.getString(96));
                    txtCel42.setText(rs.getString(97));
                    txtCel43.setText(rs.getString(98));
                    txtCel44.setText(rs.getString(99));
                    txtCel45.setText(rs.getString(100));
                    txtCel46.setText(rs.getString(101));
                    txtCel47.setText(rs.getString(102));
                    txtCel48.setText(rs.getString(103));
                    txtCel49.setText(rs.getString(104));
                    txtCel50.setText(rs.getString(105));
                    txtCel51.setText(rs.getString(106));
                    txtCel52.setText(rs.getString(107));
                    txtCel53.setText(rs.getString(108));
                    txtCel54.setText(rs.getString(109));
                    txtCel55.setText(rs.getString(110));
                    txtCel56.setText(rs.getString(111));
                    txtCel57.setText(rs.getString(112));
                    txtCel58.setText(rs.getString(113));
                    txtCel59.setText(rs.getString(114));
                    txtCel60.setText(rs.getString(115));
                    txtFoto1.setText(rs.getString(116));
                    txtProduto1.setText(rs.getString(4));
                    try {
                    lblimagem.setIcon(null);
                    
                    byte[] imagedata = rs.getBytes("foto1");
                    
                    format = new ImageIcon(imagedata);
                    Image mm = format.getImage();
                    Image img1 = mm.getScaledInstance(200,250, Image.SCALE_SMOOTH);
                    ImageIcon image = new ImageIcon(img1);
                    lblimagem.setIcon(image);
                    
                    
                } catch (Exception e) {
                }
                
               
                //foto 2 
                try {
                    lblimage2.setIcon(null);
                    
                    byte[] imagedata2 = rs.getBytes("foto2");
                    
                    format2 = new ImageIcon(imagedata2);
                    Image mm2 = format2.getImage();
                    Image img2 = mm2.getScaledInstance(200,250, Image.SCALE_SMOOTH);
                    ImageIcon image2 = new ImageIcon(img2);
                    lblimage2.setIcon(image2);
                    
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 2, favar informar responsavel por cadastramento!!");
                }
                
                
                //foto 3
                
                try {
                    lblimagem3.setIcon(null);
                    
                    byte[] imagedata3 = rs.getBytes("foto3");
                    format3 = new ImageIcon(imagedata3);
                    Image mm3 = format3.getImage();
                    Image img3 = mm3.getScaledInstance(200,250, Image.SCALE_SMOOTH);
                    ImageIcon image3 = new ImageIcon(img3);
                    lblimagem3.setIcon(image3);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 3, favar informar responsavel por cadastramento!!");
                }
                    
                // foto 4
                try {
                    lblimagem4.setIcon(null);
                    
                    byte[] imagedata4 = rs.getBytes("foto4");
                    format4 = new ImageIcon(imagedata4);
                    Image mm4 = format4.getImage();
                    Image img4 = mm4.getScaledInstance(200,250, Image.SCALE_SMOOTH);
                    ImageIcon image4 = new ImageIcon(img4);
                    lblimagem4.setIcon(image4);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "produto sem imagem 4, favar informar responsavel por cadastramento!!");
                }
                    txtFoto2.setText(rs.getString(119));
                    txtFoto3.setText(rs.getString(122));
                    txtFoto4.setText(rs.getString(125));
                    txtObsGeral.setText(rs.getString(128));
                    try {
                    cboEsteira.setSelectedItem(rs.getString("esteira").toString());
                    cboAbastecimento.setSelectedItem(rs.getString("abastecimento").toString());
                    cboAcondicionamento.setSelectedItem(rs.getString("acondicionamento").toString());
                
                    
                } catch (Exception e) {
                }
                

            } else {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado");
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
     
     public void defaultSize(JTable table) {
     final TableColumnModel columnModel = table.getColumnModel();
    for (int column = 0; column < table.getColumnCount(); column++) {
        int width = 250;
        for (int row = 0; row < table.getRowCount(); row++) {
            TableCellRenderer renderer = table.getCellRenderer(row, column);
            Component comp = table.prepareRenderer(renderer, row, column);
            width = Math.max(comp.getPreferredSize().width + 1, width);
            columnModel.getColumn(column).setPreferredWidth(width);
            
        }
    }
    }
   /*  private void pesquisar_produto_cadastrado(){
         String sql = "select * from tbparametrogeral where produto like ?";
        try {
            pst = conexao.prepareStatement(sql);
            
            
            pst.setString(1,txtProduto1.getText()+ "%");
            rs = pst.executeQuery();
            
            tblProduto1.setModel(DbUtils.resultSetToTableModel(rs));
            //defaultSize(tblProduto1);
            DefaultTableModel modelo = (DefaultTableModel) tblProduto1.getModel();
            modelo.setColumnCount(4);
            
            
            //modelo.setColumnCount(114);//resolvere este bug
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }*/
     public void setar_campos_cadastrado(){
        int setar = tblProduto1.getSelectedRow();
        txtProduto1.setText(tblProduto1.getModel().getValueAt(setar, 3).toString());/*
        txtF1b.setText(tblProduto1.getModel().getValueAt(setar, 5).toString());
        txtF1c.setText(tblProduto1.getModel().getValueAt(setar, 6).toString());
        txtF1d.setText(tblProduto1.getModel().getValueAt(setar, 7).toString());
        txtF1e.setText(tblProduto1.getModel().getValueAt(setar, 8).toString());
        txtF1f.setText(tblProduto1.getModel().getValueAt(setar, 9).toString());
        txtT2g.setText(tblProduto1.getModel().getValueAt(setar, 10).toString());
        txtT2h.setText(tblProduto1.getModel().getValueAt(setar, 11).toString());
        txtT2k.setText(tblProduto1.getModel().getValueAt(setar, 12).toString());
        txtT2hh.setText(tblProduto1.getModel().getValueAt(setar, 13).toString());
        txtT2i.setText(tblProduto1.getModel().getValueAt(setar, 14).toString());
        txtT2j.setText(tblProduto1.getModel().getValueAt(setar, 15).toString());
        txtT2n.setText(tblProduto1.getModel().getValueAt(setar, 16).toString());
        txtT2m.setText(tblProduto1.getModel().getValueAt(setar, 17).toString());
        txtD2o.setText(tblProduto1.getModel().getValueAt(setar, 18).toString());
        txtD2q.setText(tblProduto1.getModel().getValueAt(setar, 19).toString());
        txtD2p.setText(tblProduto1.getModel().getValueAt(setar, 20).toString());
        txtL2g.setText(tblProduto1.getModel().getValueAt(setar, 21).toString());
        txtL2h.setText(tblProduto1.getModel().getValueAt(setar, 22).toString());
        txtL2k.setText(tblProduto1.getModel().getValueAt(setar, 23).toString());
       
       */
     }
     private void alterar(){
        String sql = "update tbparametrogeral set maquina=?,produto=?,fla=?,flb=?,flc=?,fld=?,fle=?,flf=?,t2g=?,t2h=?,t2k=?,t2hh=?,t2i=?,t2j=?,t2n=?,t2m=?,"
                + "d2o=?,d2q=?,d2p=?,l2g=?,l2h=?,l2k=?,tc1=?,to1=?,tc2=?,to2=?,tc3=?,to3=?,tc4=?,to4=?,tc5=?,to5=?,tc6=?,to6=?,"
                + "tc7=?,to7=?,tc8=?,to8=?,tc9=?,to9=?,tc10=?,to10=?,tc11=?,to11=?,tc12=?,to12=?,tc13=?,to13=?,tc14=?,to14=?,tc15=?,to15=?,"
                + "tc16=?,to16=?,tc17=?,to17=?,tc18=?,to18=?,tc19=?,to19=?,tc20=?,to20=?,tc21=?,to21=?,tc22=?,to22=?,tc23=?,to23=?,tc24=?,to24=?,"
                + "tc25=?,to25=?,tc26=?,to26=?,tc27=?,to27=?,tc28=?,to28=?,tc29=?,to29=?,tc30=?,to30=?,tc31=?,to31=?,tc32=?,tc33=?,tc34=?,tc35=?,"
                + "tc36=?,tc37=?,tc38=?,tc39=?,tc40=?,tc41=?,tc42=?,tc43=?,tc44=?,tc45=?,tc46=?,tc47=?,tc48=?,tc49=?,tc50=?,tc51=?,tc52=?,tc53=?,"
                + "tc54=?,tc55=?,tc56=?,tc57=?,tc58=?,tc59=?,tc60=?,obsGeral=?, where formato = ?";
                //não esquecer dos obs das fotos e arrumar M.O
            try {
                /*txtFoto2.setText(rs.getString(119));
                    txtFoto3.setText(rs.getString(122));
                    txtFoto4.setText(rs.getString(125));
                    txtObsGeral.setText(rs.getString(128));
                    try {
                    cboEsteira.setSelectedItem(rs.getString("esteira").toString());
                    cboAbastecimento.setSelectedItem(rs.getString("abastecimento").toString());
                    cboAcondicionamento.setSelectedItem(rs.getString("acondicionamento").toString());
                
                    
                } catch (Exception e) {
                }*/
                
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cboMaquina.getSelectedItem().toString());
            pst.setString(2, txtProduto1.getText());
            pst.setString(3, txtF1a.getText());
            pst.setString(4, txtF1b.getText());
            pst.setString(5, txtF1c.getText());
            pst.setString(6, txtF1d.getText());
            pst.setString(7, txtF1e.getText());
            pst.setString(8, txtF1f.getText());
            pst.setString(9, txtT2g.getText());
            pst.setString(10, txtT2h.getText());
            pst.setString(11, txtT2k.getText());
            pst.setString(12, txtT2hh.getText());
            pst.setString(13, txtT2i.getText());
            pst.setString(14, txtT2j.getText());
            pst.setString(15, txtT2n.getText());
            pst.setString(16, txtT2m.getText());
            pst.setString(17, txtD2o.getText());
            pst.setString(18, txtD2q.getText());
            pst.setString(19, txtD2p.getText());
            pst.setString(20, txtL2g.getText());
            pst.setString(21, txtL2h.getText());
            pst.setString(22, txtL2k.getText());
            pst.setString(23, txtCel1.getText());
            pst.setString(24, txtObs1.getText());
            pst.setString(25, txtCel2.getText());
            pst.setString(26, txtObs2.getText());
            pst.setString(27, txtCel3.getText());
            pst.setString(28, txtObs3.getText());
            pst.setString(29, txtCel4.getText());
            pst.setString(30, txtObs4.getText());
            pst.setString(31, txtCel5.getText());
            pst.setString(32, txtObs5.getText());
            pst.setString(33, txtCel6.getText());
            pst.setString(34, txtObs6.getText());
            pst.setString(35, txtCel7.getText());
            pst.setString(36, txtObs7.getText());
            pst.setString(37, txtCel8.getText());
            pst.setString(38, txtObs8.getText());
            pst.setString(39, txtCel9.getText());
            pst.setString(40, txtObs9.getText());
            pst.setString(41, txtCel10.getText());
            pst.setString(42, txtObs10.getText());
            pst.setString(43, txtCel11.getText());
            pst.setString(44, txtObs11.getText());
            pst.setString(45, txtCel12.getText());
            pst.setString(46, txtObs12.getText());
            pst.setString(47, txtCel13.getText());
            pst.setString(48, txtObs13.getText());
            pst.setString(49, txtCel14.getText());
            pst.setString(50, txtObs14.getText());
            pst.setString(51, txtCel15.getText());
            pst.setString(52, txtObs15.getText());
            pst.setString(53, txtCel16.getText());
            pst.setString(54, txtObs16.getText());
            pst.setString(55, txtCel17.getText());
            pst.setString(56, txtObs17.getText());
            pst.setString(57, txtCel18.getText());
            pst.setString(58, txtObs18.getText());
            pst.setString(59, txtCel19.getText());
            pst.setString(60, txtObs19.getText());
            pst.setString(61, txtCel20.getText());
            pst.setString(62, txtObs20.getText());
            pst.setString(63, txtCel21.getText());
            pst.setString(64, txtObs21.getText());
            pst.setString(65, txtCel22.getText());
            pst.setString(66, txtObs22.getText());
            pst.setString(67, txtCel23.getText());
            pst.setString(68, txtObs23.getText());
            pst.setString(69, txtCel24.getText());
            pst.setString(70, txtObs24.getText());
            pst.setString(71, txtCel25.getText());
            pst.setString(72, txtObs25.getText());
            pst.setString(73, txtCel26.getText());
            pst.setString(74, txtObs26.getText());
            pst.setString(75, txtCel27.getText());
            pst.setString(76, txtObs27.getText());
            pst.setString(77, txtCel28.getText());
            pst.setString(78, txtObs28.getText());
            pst.setString(79, txtCel29.getText());
            pst.setString(80, txtObs29.getText());
            pst.setString(81, txtCel30.getText());
            pst.setString(82, txtObs30.getText());
            pst.setString(83, txtCel31.getText());
            pst.setString(84, txtObs31.getText());
            pst.setString(85, txtCel32.getText());
            pst.setString(86, txtCel33.getText());
            pst.setString(87, txtCel34.getText());
            pst.setString(88, txtCel35.getText());
            pst.setString(89, txtCel36.getText());
            pst.setString(90, txtCel37.getText());
            pst.setString(91, txtCel38.getText());
            pst.setString(92, txtCel39.getText());
            pst.setString(93, txtCel40.getText());
            pst.setString(94, txtCel41.getText());
            pst.setString(95, txtCel42.getText());
            pst.setString(96, txtCel43.getText());
            pst.setString(97, txtCel44.getText());
            pst.setString(98,txtCel45.getText());
            pst.setString(99,txtCel46.getText());
            pst.setString(100,txtCel47.getText());
            pst.setString(101,txtCel48.getText());
            pst.setString(102,txtCel49.getText());
            pst.setString(103,txtCel50.getText());
            pst.setString(104,txtCel51.getText());
            pst.setString(105,txtCel52.getText());
            pst.setString(106,txtCel53.getText());
            pst.setString(107,txtCel54.getText());
            pst.setString(108,txtCel55.getText());
            pst.setString(109,txtCel56.getText());
            pst.setString(110,txtCel57.getText());
            pst.setString(111,txtCel58.getText());
            pst.setString(112,txtCel59.getText());
            pst.setString(113,txtCel60.getText());
            pst.setString(114,txtObsGeral.getText());
            pst.setString(115,txtFoto2.getText());
            pst.setString(116,txtFoto3.getText());
            pst.setString(117,txtFoto4.getText());
            pst.setString(118,txtObsGeral.getText());
            pst.setString(119, cboEsteira.getSelectedItem().toString());
            pst.setString(120, cboAbastecimento.getSelectedItem().toString());
            pst.setString(121, cboAcondicionamento.getSelectedItem().toString());
            pst.setString(122,txtFor.getText());
            
           
               
            
            // a estrutura abaixo é usada para confirmar a alteração do parametro. 
            if (txtFor.getText().isEmpty()||txtProduto1.getText().isEmpty()||txtF1a.getText().isEmpty()||txtF1b.getText().isEmpty()|| txtT2g.getText().isEmpty()||txtT2h.getText().isEmpty()||
            
            txtF1c.getText().isEmpty()||txtF1d.getText().isEmpty()||txtT2hh.getText().isEmpty()||txtT2i.getText().isEmpty()||
                txtF1e.getText().isEmpty()|| txtF1f.getText().isEmpty()||txtT2k.getText().isEmpty()||txtT2m.getText().isEmpty()||txtT2n.getText().isEmpty()||
                txtD2o.getText().isEmpty()||txtD2q.getText().isEmpty()|| txtD2p.getText().isEmpty()||txtL2g.getText().isEmpty()||
                txtL2h.getText().isEmpty()||txtL2k.getText().isEmpty()|| 
                cboMaquina.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Favor preecher todos os campos obrigatórios");

            } else {

                //a linha abaixo atualiza usuarios com os dados do formulario...
                //pst.executeUpdate();
                //a estrutura abaixo é usada para confirmar a inserção dos dados na tabela.
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!!");
                    //as linhas abaixo limpa os campos
                    /*txtFor.setText(null);
                    cboMaquina.setSelectedItem(null);
                    txtProduto1.setText(null);
                    txtF1a.setText(null);
                    txtF1b.setText(null);
                    txtF1c.setText(null);
                    txtF1d.setText(null);
                    txtF1e.setText(null);
                    txtF1f.setText(null);
                    txtT2g.setText(null);
                    txtT2h.setText(null);
                    txtT2hh.setText(null);
                    txtT2i.setText(null);
                    txtT2j.setText(null);
                    txtT2k.setText(null);
                    txtT2m.setText(null);
                    txtT2n.setText(null);
                    txtD2o.setText(null);
                    txtD2p.setText(null);
                    txtD2q.setText(null);
                    txtL2g.setText(null);
                    txtL2h.setText(null);
                    txtL2k.setText(null);
                    txtCel1.setText(null);
                    txtObs1.setText(null);
                    txtCel2.setText(null);
                    txtObs2.setText(null);
                    txtCel3.setText(null);
                    txtObs3.setText(null);
                    txtCel4.setText(null);
                    txtObs4.setText(null);
                    txtCel5.setText(null);
                    txtObs5.setText(null);
                    txtCel6.setText(null);
                    txtObs6.setText(null);
                    txtCel7.setText(null);
                    txtObs7.setText(null);
                    txtCel8.setText(null);
                    txtObs8.setText(null);
                    txtCel9.setText(null);
                    txtObs9.setText(null);
                    txtCel10.setText(null);
                    txtObs10.setText(null);
                    txtCel11.setText(null);
                    txtObs11.setText(null);
                    txtCel12.setText(null);
                    txtObs12.setText(null);
                    txtCel13.setText(null);
                    txtObs13.setText(null);
                    txtCel14.setText(null);
                    txtObs14.setText(null);
                    txtCel15.setText(null);
                    txtObs15.setText(null);
                    txtCel16.setText(null);
                    txtObs16.setText(null);
                    txtCel17.setText(null);
                    txtObs17.setText(null);
                    txtCel18.setText(null);
                    txtObs18.setText(null);
                    txtCel19.setText(null);
                    txtObs19.setText(null);
                    txtCel20.setText(null);
                    txtObs20.setText(null);
                    txtCel21.setText(null);
                    txtObs21.setText(null);
                    txtCel22.setText(null);
                    txtObs22.setText(null);
                    txtCel23.setText(null);
                    txtObs23.setText(null);
                    txtCel24.setText(null);
                    txtObs24.setText(null);
                    txtCel25.setText(null);
                    txtObs25.setText(null);
                    txtCel26.setText(null);
                    txtObs26.setText(null);
                    txtCel27.setText(null);
                    txtObs27.setText(null);
                    txtCel28.setText(null);
                    txtObs28.setText(null);
                    txtCel29.setText(null);
                    txtObs29.setText(null);
                    txtCel30.setText(null);
                    txtObs30.setText(null);
                    txtCel31.setText(null);
                    txtObs31.setText(null);
                    txtCel32.setText(null);
                    txtCel33.setText(null);
                    txtCel34.setText(null);
                    txtCel35.setText(null);
                    txtCel36.setText(null);
                    txtCel37.setText(null);
                    txtCel38.setText(null);
                    txtCel39.setText(null);
                    txtCel40.setText(null);
                    txtCel41.setText(null);
                    txtCel42.setText(null);
                    txtCel43.setText(null);
                    txtCel44.setText(null);
                    txtCel45.setText(null);
                    txtCel46.setText(null);
                    txtCel47.setText(null);
                    txtCel48.setText(null);
                    txtCel49.setText(null);
                    txtCel50.setText(null);
                    txtCel51.setText(null);
                    txtCel52.setText(null);
                    txtCel53.setText(null);
                    txtCel54.setText(null);
                    txtCel55.setText(null);
                    txtCel56.setText(null);
                    txtCel57.setText(null);
                    txtCel58.setText(null);
                    txtCel59.setText(null);
                    txtCel60.setText(null);
                    txtObsGeral.setText(null);
                     lblimagem.setIcon(null);
                    lblimage2.setIcon(null);
                    lblimagem3.setIcon(null);
                    lblimagem4.setIcon(null);
                    
                    */
        
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
     private void novo_produto(){
         String sql = "select * from tbparametrogeral";
         try {
         pst = conexao.prepareStatement(sql);
             txtFor.setText(null);
                    cboMaquina.setSelectedItem(null);
                    cboAbastecimento.setSelectedItem(null);
                    cboAcondicionamento.setSelectedItem(null);
                    cboEsteira.setSelectedItem(null);
                            
                    txtProduto1.setText(null);
                    txtF1a.setText(null);
                    txtF1b.setText(null);
                    txtF1c.setText(null);
                    txtF1d.setText(null);
                    txtF1e.setText(null);
                    txtF1f.setText(null);
                    txtT2g.setText(null);
                    txtT2h.setText(null);
                    txtT2hh.setText(null);
                    txtT2i.setText(null);
                    txtT2j.setText(null);
                    txtT2k.setText(null);
                    txtT2m.setText(null);
                    txtT2n.setText(null);
                    txtD2o.setText(null);
                    txtD2p.setText(null);
                    txtD2q.setText(null);
                    txtL2g.setText(null);
                    txtL2h.setText(null);
                    txtL2k.setText(null);
                    txtCel1.setText(null);
                    txtObs1.setText(null);
                    txtCel2.setText(null);
                    txtObs2.setText(null);
                    txtCel3.setText(null);
                    txtObs3.setText(null);
                    txtCel4.setText(null);
                    txtObs4.setText(null);
                    txtCel5.setText(null);
                    txtObs5.setText(null);
                    txtCel6.setText(null);
                    txtObs6.setText(null);
                    txtCel7.setText(null);
                    txtObs7.setText(null);
                    txtCel8.setText(null);
                    txtObs8.setText(null);
                    txtCel9.setText(null);
                    txtObs9.setText(null);
                    txtCel10.setText(null);
                    txtObs10.setText(null);
                    txtCel11.setText(null);
                    txtObs11.setText(null);
                    txtCel12.setText(null);
                    txtObs12.setText(null);
                    txtCel13.setText(null);
                    txtObs13.setText(null);
                    txtCel14.setText(null);
                    txtObs14.setText(null);
                    txtCel15.setText(null);
                    txtObs15.setText(null);
                    txtCel16.setText(null);
                    txtObs16.setText(null);
                    txtCel17.setText(null);
                    txtObs17.setText(null);
                    txtCel18.setText(null);
                    txtObs18.setText(null);
                    txtCel19.setText(null);
                    txtObs19.setText(null);
                    txtCel20.setText(null);
                    txtObs20.setText(null);
                    txtCel21.setText(null);
                    txtObs21.setText(null);
                    txtCel22.setText(null);
                    txtObs22.setText(null);
                    txtCel23.setText(null);
                    txtObs23.setText(null);
                    txtCel24.setText(null);
                    txtObs24.setText(null);
                    txtCel25.setText(null);
                    txtObs25.setText(null);
                    txtCel26.setText(null);
                    txtObs26.setText(null);
                    txtCel27.setText(null);
                    txtObs27.setText(null);
                    txtCel28.setText(null);
                    txtObs28.setText(null);
                    txtCel29.setText(null);
                    txtObs29.setText(null);
                    txtCel30.setText(null);
                    txtObs30.setText(null);
                    txtCel31.setText(null);
                    txtObs31.setText(null);
                    txtCel32.setText(null);
                    txtCel33.setText(null);
                    txtCel34.setText(null);
                    txtCel35.setText(null);
                    txtCel36.setText(null);
                    txtCel37.setText(null);
                    txtCel38.setText(null);
                    txtCel39.setText(null);
                    txtCel40.setText(null);
                    txtCel41.setText(null);
                    txtCel42.setText(null);
                    txtCel43.setText(null);
                    txtCel44.setText(null);
                    txtCel45.setText(null);
                    txtCel46.setText(null);
                    txtCel47.setText(null);
                    txtCel48.setText(null);
                    txtCel49.setText(null);
                    txtCel50.setText(null);
                    txtCel51.setText(null);
                    txtCel52.setText(null);
                    txtCel53.setText(null);
                    txtCel54.setText(null);
                    txtCel55.setText(null);
                    txtCel56.setText(null);
                    txtCel57.setText(null);
                    txtCel58.setText(null);
                    txtCel59.setText(null);
                    txtCel60.setText(null);
                    txtObsGeral.setText(null);
                     lblimagem.setIcon(null);
                    lblimage2.setIcon(null);
                    lblimagem3.setIcon(null);
                    lblimagem4.setIcon(null);
                    
             
         } catch (Exception e) {
         }
     }

   
     

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jInternalFrame5 = new javax.swing.JInternalFrame();
        txtF1b = new javax.swing.JTextField();
        jLabel185 = new javax.swing.JLabel();
        txtF1c = new javax.swing.JTextField();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtL2k = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtD2o = new javax.swing.JTextField();
        txtT2j = new javax.swing.JTextField();
        txtProduto1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel202 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        txtT2m = new javax.swing.JTextField();
        idcli = new javax.swing.JLabel();
        txtFor = new javax.swing.JTextField();
        cboMaquina = new javax.swing.JComboBox<>();
        txtF1a = new javax.swing.JTextField();
        txtF1d = new javax.swing.JTextField();
        txtF1e = new javax.swing.JTextField();
        txtF1f = new javax.swing.JTextField();
        txtT2g = new javax.swing.JTextField();
        txtT2h = new javax.swing.JTextField();
        txtT2k = new javax.swing.JTextField();
        txtT2hh = new javax.swing.JTextField();
        txtT2i = new javax.swing.JTextField();
        txtT2n = new javax.swing.JTextField();
        txtD2q = new javax.swing.JTextField();
        txtD2p = new javax.swing.JTextField();
        txtL2g = new javax.swing.JTextField();
        txtL2h = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto1 = new javax.swing.JTable();
        btnProcurarProduto = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btnProcurarProduto1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObsGeral = new javax.swing.JEditorPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboEsteira = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cboAbastecimento = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cboAcondicionamento = new javax.swing.JComboBox<>();
        PainelCelofane = new javax.swing.JPanel();
        c1_ = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        txtCel1 = new javax.swing.JTextField();
        txtObs1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        c3_ = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        txtCel3 = new javax.swing.JTextField();
        txtObs3 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        c2 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        txtCel2 = new javax.swing.JTextField();
        txtObs2 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        c4_ = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        txtObs4 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtCel4 = new javax.swing.JTextField();
        c8_ = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        txtCel8 = new javax.swing.JTextField();
        txtObs8 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        c5_ = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        txtCel5 = new javax.swing.JTextField();
        txtObs5 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        c7 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        txtCel7 = new javax.swing.JTextField();
        txtObs7 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        c9 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        txtObs9 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtCel9 = new javax.swing.JTextField();
        c10_ = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        txtCel10 = new javax.swing.JTextField();
        txtObs10 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        c11_ = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        txtCel11 = new javax.swing.JTextField();
        txtObs11 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        c13 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        txtObs13 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txtCel13 = new javax.swing.JTextField();
        c12 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        txtCel12 = new javax.swing.JTextField();
        txtObs12 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        c14_ = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        txtCel14 = new javax.swing.JTextField();
        txtObs14 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        c15_ = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        txtCel15 = new javax.swing.JTextField();
        txtObs15 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        c17_ = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        txtObs17 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        txtCel17 = new javax.swing.JTextField();
        c19_ = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        txtCel19 = new javax.swing.JTextField();
        txtObs19 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        c16_ = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        txtCel16 = new javax.swing.JTextField();
        txtObs16 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        c18_ = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        txtCel18 = new javax.swing.JTextField();
        txtObs18 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        c20 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        txtCel20 = new javax.swing.JTextField();
        txtObs20 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        c21_ = new javax.swing.JPanel();
        lugjhkg = new javax.swing.JLabel();
        txtObs21 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        txtCel21 = new javax.swing.JTextField();
        c22 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        txtCel22 = new javax.swing.JTextField();
        txtObs22 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        c23_ = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        txtCel23 = new javax.swing.JTextField();
        txtObs23 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        c25_ = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        txtObs25 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        txtCel25 = new javax.swing.JTextField();
        c24_ = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        txtCel24 = new javax.swing.JTextField();
        txtObs24 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        c26 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        txtCel26 = new javax.swing.JTextField();
        txtObs26 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        c27_ = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        txtCel27 = new javax.swing.JTextField();
        txtObs27 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        c29_ = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        txtCel29 = new javax.swing.JTextField();
        txtObs29 = new javax.swing.JTextField();
        c28_ = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        txtCel28 = new javax.swing.JTextField();
        txtObs28 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        c30 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        txtCel30 = new javax.swing.JTextField();
        txtObs30 = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        c31 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        txtCel31 = new javax.swing.JTextField();
        txtObs31 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        c6_ = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        txtCel6 = new javax.swing.JTextField();
        txtObs6 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jTextField43 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        txtCel32 = new javax.swing.JTextField();
        txtCel33 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtCel34 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtCel35 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtCel39 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtCel40 = new javax.swing.JTextField();
        txtCel41 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        txtCel42 = new javax.swing.JTextField();
        txtCel43 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtCel36 = new javax.swing.JTextField();
        txtCel38 = new javax.swing.JTextField();
        txtCel37 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCel44 = new javax.swing.JTextField();
        txtCel45 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCel46 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        txtCel47 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        txtCel48 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        txtCel49 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel111 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        txtCel50 = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        txtCel51 = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        txtCel52 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        txtCel53 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtCel54 = new javax.swing.JTextField();
        txtCel55 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCel56 = new javax.swing.JTextField();
        txtCel57 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCel58 = new javax.swing.JTextField();
        txtCel59 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtCel60 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        lblimagem = new javax.swing.JLabel();
        lblimagem3 = new javax.swing.JLabel();
        lblimagem4 = new javax.swing.JLabel();
        lblimage2 = new javax.swing.JLabel();
        txtFoto1 = new javax.swing.JTextField();
        btnFoto1 = new javax.swing.JButton();
        btnFoto3 = new javax.swing.JButton();
        txtFoto3 = new javax.swing.JTextField();
        txtFoto2 = new javax.swing.JTextField();
        btnFoto2 = new javax.swing.JButton();
        txtFoto4 = new javax.swing.JTextField();
        btnFoto4 = new javax.swing.JButton();
        imagePath = new javax.swing.JTextField();
        imagePath4 = new javax.swing.JTextField();
        imagePath2 = new javax.swing.JTextField();
        imagePaht5 = new javax.swing.JTextField();
        imagePath3 = new javax.swing.JTextField();
        imagePath6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnSalvarFoto3 = new javax.swing.JButton();
        btnSalvarFoto4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(1900, 1200));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1200, 1000));

        jTabbedPane2.setForeground(new java.awt.Color(51, 51, 255));

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 2000));
        jPanel2.setPreferredSize(new java.awt.Dimension(2091, 2000));

        jInternalFrame5.setVisible(true);

        jLabel185.setText("1B");

        jLabel186.setText("1C");

        jLabel187.setText("2F");

        jLabel6.setText("1D");

        jLabel5.setText("1E");

        jLabel188.setText("2D");

        jLabel28.setText("2N");

        jLabel192.setText("2H");

        jLabel194.setText("2K");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("LASER");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("D'PUCKER");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("TRAZ");

        jLabel195.setText("2H");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("FRENTE");

        jLabel196.setText("2G");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Produto");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Maquina");

        jLabel197.setText("2E");

        jLabel4.setText("1F");

        jLabel198.setText("2P");

        jLabel199.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel199.setText("Formato");

        jLabel200.setText("2Q");

        jLabel201.setText("2O");

        jLabel3.setText("1A");

        txtProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProduto1ActionPerformed(evt);
            }
        });
        txtProduto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProduto1KeyReleased(evt);
            }
        });

        jLabel22.setText("2J");

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel202.setText("2I");

        jLabel115.setText("2M");

        idcli.setBackground(new java.awt.Color(51, 51, 255));

        cboMaquina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Groninger 1", "Groninger 2", "Serac Gaia", "Desodorante" }));

        txtT2h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtT2hActionPerformed(evt);
            }
        });

        txtD2q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtD2qActionPerformed(evt);
            }
        });

        txtL2h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtL2hActionPerformed(evt);
            }
        });

        tblProduto1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProduto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProduto1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduto1);

        btnProcurarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-pesquisar-20.png"))); // NOI18N
        btnProcurarProduto.setToolTipText("");
        btnProcurarProduto.setMaximumSize(new java.awt.Dimension(25, 25));
        btnProcurarProduto.setPreferredSize(new java.awt.Dimension(25, 25));
        btnProcurarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarProdutoActionPerformed(evt);
            }
        });

        jButton8.setText("Salvar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton9.setText("Cadastrar novo");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        btnProcurarProduto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-pesquisar-20.png"))); // NOI18N
        btnProcurarProduto1.setToolTipText("");
        btnProcurarProduto1.setPreferredSize(new java.awt.Dimension(25, 25));
        btnProcurarProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarProduto1ActionPerformed(evt);
            }
        });

        jButton10.setText("Abrir");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame5Layout = new javax.swing.GroupLayout(jInternalFrame5.getContentPane());
        jInternalFrame5.getContentPane().setLayout(jInternalFrame5Layout);
        jInternalFrame5Layout.setHorizontalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtT2g, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtT2h, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel194, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtT2k, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtT2hh, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel202, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtT2i, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtT2j, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtT2n, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel115)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtT2m, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator9)
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtF1a, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel185, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtF1b, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtF1c, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtF1d, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtF1e, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtF1f, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(cboMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9)
                                        .addGap(9, 9, 9)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                        .addComponent(txtProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnProcurarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 1, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12))
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnProcurarProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(idcli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtL2g, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtL2h, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel188, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtL2k, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                        .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtD2o, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtD2q, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtD2p, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame5Layout.setVerticalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame5Layout.createSequentialGroup()
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(idcli)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame5Layout.createSequentialGroup()
                                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnProcurarProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtFor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel199)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23)
                                        .addComponent(txtProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnProcurarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(jButton10))
                        .addGap(13, 13, 13)
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton8)
                            .addComponent(jButton1)
                            .addComponent(jButton9)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtF1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel185)
                    .addComponent(txtF1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel186)
                    .addComponent(txtF1c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtF1d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtF1e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF1f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel196)
                    .addComponent(txtT2g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel195)
                    .addComponent(txtT2h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel194)
                    .addComponent(txtT2k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel192)
                    .addComponent(txtT2hh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel202)
                    .addComponent(txtT2i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtT2j, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtT2n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtT2m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel201)
                    .addComponent(txtD2o, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel200)
                    .addComponent(txtD2q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel198)
                    .addComponent(txtD2p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel187)
                    .addComponent(txtL2k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel188)
                    .addComponent(txtL2h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel197)
                    .addComponent(txtL2g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Obs:"));

        jScrollPane3.setViewportView(txtObsGeral);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("M. O");

        jLabel11.setText("Esteira");

        cboEsteira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        jLabel12.setText("Abastecimento");

        cboAbastecimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        jLabel13.setText("Acondicionamento");

        cboAcondicionamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "1", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jInternalFrame5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboEsteira, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboAcondicionamento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(890, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jInternalFrame5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cboEsteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(cboAcondicionamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cboAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("CADASTRO PARAMETROS", jPanel2);

        PainelCelofane.setPreferredSize(new java.awt.Dimension(1200, 1500));

        c1_.setBorder(javax.swing.BorderFactory.createTitledBorder("1. Altura lamina"));

        jLabel42.setText("N° voltas");

        txtCel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel1ActionPerformed(evt);
            }
        });

        jLabel43.setText("obs");

        javax.swing.GroupLayout c1_Layout = new javax.swing.GroupLayout(c1_);
        c1_.setLayout(c1_Layout);
        c1_Layout.setHorizontalGroup(
            c1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c1_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtObs1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        c1_Layout.setVerticalGroup(
            c1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c1_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(c1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtCel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)))
        );

        c3_.setBorder(javax.swing.BorderFactory.createTitledBorder("3. Placa da agulha de dobragem direita"));

        jLabel44.setText("N° voltas");

        jLabel45.setText("obs");

        javax.swing.GroupLayout c3_Layout = new javax.swing.GroupLayout(c3_);
        c3_.setLayout(c3_Layout);
        c3_Layout.setHorizontalGroup(
            c3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c3_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c3_Layout.setVerticalGroup(
            c3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c3_Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtCel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)))
        );

        c2.setBorder(javax.swing.BorderFactory.createTitledBorder("2. Altura Embalagem"));
        c2.setMaximumSize(new java.awt.Dimension(780, 61));
        c2.setPreferredSize(new java.awt.Dimension(120, 61));

        jLabel48.setText("N° voltas");

        jLabel49.setText("obs");

        javax.swing.GroupLayout c2Layout = new javax.swing.GroupLayout(c2);
        c2.setLayout(c2Layout);
        c2Layout.setHorizontalGroup(
            c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        c2Layout.setVerticalGroup(
            c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtCel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)))
        );

        c4_.setBorder(javax.swing.BorderFactory.createTitledBorder("4. Placa da agulha de dobragem esquerda"));

        jLabel46.setText("N° voltas");

        jLabel47.setText("obs");

        javax.swing.GroupLayout c4_Layout = new javax.swing.GroupLayout(c4_);
        c4_.setLayout(c4_Layout);
        c4_Layout.setHorizontalGroup(
            c4_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c4_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtObs4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        c4_Layout.setVerticalGroup(
            c4_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c4_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(c4_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtObs4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(txtCel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        c8_.setBorder(javax.swing.BorderFactory.createTitledBorder("17. Ponto de realinhamento do dobrador superior"));

        jLabel52.setText("Cm");

        jLabel53.setText("obs");

        javax.swing.GroupLayout c8_Layout = new javax.swing.GroupLayout(c8_);
        c8_.setLayout(c8_Layout);
        c8_Layout.setHorizontalGroup(
            c8_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c8_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        c8_Layout.setVerticalGroup(
            c8_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c8_Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(c8_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtCel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)))
        );

        c5_.setBorder(javax.swing.BorderFactory.createTitledBorder("5. Curva de selagem reajuste"));

        jLabel54.setText("N° voltas");

        jLabel55.setText("obs");

        javax.swing.GroupLayout c5_Layout = new javax.swing.GroupLayout(c5_);
        c5_.setLayout(c5_Layout);
        c5_Layout.setHorizontalGroup(
            c5_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c5_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtObs5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        c5_Layout.setVerticalGroup(
            c5_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c5_Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c5_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txtCel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)))
        );

        c7.setBorder(javax.swing.BorderFactory.createTitledBorder("7. Regulagem do Dispositivo de corte de filme largo"));

        jLabel56.setText("Cm");

        jLabel57.setText("obs");

        javax.swing.GroupLayout c7Layout = new javax.swing.GroupLayout(c7);
        c7.setLayout(c7Layout);
        c7Layout.setHorizontalGroup(
            c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtCel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtObs7, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        c7Layout.setVerticalGroup(
            c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c7Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(txtCel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)))
        );

        c9.setBorder(javax.swing.BorderFactory.createTitledBorder("19. Chapa sujeitadora / fixão de embalagem"));
        c9.setPreferredSize(new java.awt.Dimension(400, 51));

        jLabel60.setText("Bar");

        jLabel61.setText("obs");

        javax.swing.GroupLayout c9Layout = new javax.swing.GroupLayout(c9);
        c9.setLayout(c9Layout);
        c9Layout.setHorizontalGroup(
            c9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs9, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c9Layout.setVerticalGroup(
            c9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(c9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txtObs9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(txtCel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        c10_.setBorder(javax.swing.BorderFactory.createTitledBorder("20. Curso dobrador superior"));
        c10_.setPreferredSize(new java.awt.Dimension(476, 61));

        jLabel62.setText("Cm");

        jLabel63.setText("obs");

        javax.swing.GroupLayout c10_Layout = new javax.swing.GroupLayout(c10_);
        c10_.setLayout(c10_Layout);
        c10_Layout.setHorizontalGroup(
            c10_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c10_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs10, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        c10_Layout.setVerticalGroup(
            c10_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c10_Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c10_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txtCel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)))
        );

        c11_.setBorder(javax.swing.BorderFactory.createTitledBorder("22. Pré- dobrador curso direito"));

        jLabel64.setText("Cm");

        jLabel65.setText("obs");

        javax.swing.GroupLayout c11_Layout = new javax.swing.GroupLayout(c11_);
        c11_.setLayout(c11_Layout);
        c11_Layout.setHorizontalGroup(
            c11_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c11_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtObs11, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
        );
        c11_Layout.setVerticalGroup(
            c11_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c11_Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c11_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(txtCel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)))
        );

        c13.setBorder(javax.swing.BorderFactory.createTitledBorder("24. Chapa sujeitadora Agulhas de dobragem direita"));

        jLabel66.setText("N° voltas");

        jLabel67.setText("obs");

        javax.swing.GroupLayout c13Layout = new javax.swing.GroupLayout(c13);
        c13.setLayout(c13Layout);
        c13Layout.setHorizontalGroup(
            c13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs13, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c13Layout.setVerticalGroup(
            c13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c13Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(c13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(txtObs13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(txtCel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        c12.setBorder(javax.swing.BorderFactory.createTitledBorder("23. Pré-dobrador curso esquerdo"));

        jLabel68.setText("Cm");

        jLabel69.setText("obs");

        javax.swing.GroupLayout c12Layout = new javax.swing.GroupLayout(c12);
        c12.setLayout(c12Layout);
        c12Layout.setHorizontalGroup(
            c12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs12, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        c12Layout.setVerticalGroup(
            c12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(c12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(txtCel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)))
        );

        c14_.setBorder(javax.swing.BorderFactory.createTitledBorder("25. Chapa sujeitadora Agulha de dobragem esquerda"));
        c14_.setPreferredSize(new java.awt.Dimension(476, 51));

        jLabel70.setText("N° voltas");

        jLabel71.setText("obs");

        javax.swing.GroupLayout c14_Layout = new javax.swing.GroupLayout(c14_);
        c14_.setLayout(c14_Layout);
        c14_Layout.setHorizontalGroup(
            c14_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c14_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs14, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        c14_Layout.setVerticalGroup(
            c14_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c14_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(c14_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(txtCel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)))
        );

        c15_.setBorder(javax.swing.BorderFactory.createTitledBorder("27. Ajuste de altura Grelha"));

        jLabel72.setText("N° voltas");

        jLabel73.setText("obs");

        javax.swing.GroupLayout c15_Layout = new javax.swing.GroupLayout(c15_);
        c15_.setLayout(c15_Layout);
        c15_Layout.setHorizontalGroup(
            c15_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c15_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel15, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtObs15, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        c15_Layout.setVerticalGroup(
            c15_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c15_Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c15_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(txtCel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)))
        );

        c17_.setBorder(javax.swing.BorderFactory.createTitledBorder("30. Ajuste longitudinal ponto de selagem direito"));

        jLabel74.setText("N° voltas");

        jLabel75.setText("obs");

        javax.swing.GroupLayout c17_Layout = new javax.swing.GroupLayout(c17_);
        c17_.setLayout(c17_Layout);
        c17_Layout.setHorizontalGroup(
            c17_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c17_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel17, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtObs17, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        c17_Layout.setVerticalGroup(
            c17_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c17_Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(c17_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(txtObs17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75)
                    .addComponent(txtCel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        c19_.setBorder(javax.swing.BorderFactory.createTitledBorder("32. Altura ponto de selagem direita"));

        jLabel76.setText("Cm");

        jLabel77.setText("obs");

        javax.swing.GroupLayout c19_Layout = new javax.swing.GroupLayout(c19_);
        c19_.setLayout(c19_Layout);
        c19_Layout.setHorizontalGroup(
            c19_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c19_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel19, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtObs19, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );
        c19_Layout.setVerticalGroup(
            c19_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c19_Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c19_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(txtCel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)))
        );

        c16_.setBorder(javax.swing.BorderFactory.createTitledBorder("29. Trasnporte de saída formato"));

        jLabel78.setText("N° voltas");

        jLabel79.setText("obs");

        javax.swing.GroupLayout c16_Layout = new javax.swing.GroupLayout(c16_);
        c16_.setLayout(c16_Layout);
        c16_Layout.setHorizontalGroup(
            c16_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c16_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel16, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs16, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        c16_Layout.setVerticalGroup(
            c16_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c16_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(c16_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(txtCel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79)))
        );

        c18_.setBorder(javax.swing.BorderFactory.createTitledBorder("31. Ajuste longitudinal ponto de selagem esquerdo"));

        jLabel80.setText("N° voltas");

        jLabel81.setText("obs");

        javax.swing.GroupLayout c18_Layout = new javax.swing.GroupLayout(c18_);
        c18_.setLayout(c18_Layout);
        c18_Layout.setHorizontalGroup(
            c18_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c18_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel18, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtObs18, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        c18_Layout.setVerticalGroup(
            c18_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c18_Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c18_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(txtCel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81)))
        );

        c20.setBorder(javax.swing.BorderFactory.createTitledBorder("33. Altura ponto de selagem esquerda"));

        jLabel82.setText("Cm");

        jLabel83.setText("obs");

        javax.swing.GroupLayout c20Layout = new javax.swing.GroupLayout(c20);
        c20.setLayout(c20Layout);
        c20Layout.setHorizontalGroup(
            c20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel20, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs20, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c20Layout.setVerticalGroup(
            c20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c20Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(txtCel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83)))
        );

        c21_.setBorder(javax.swing.BorderFactory.createTitledBorder("37. Chapa sujeitadora ponto de selagem"));

        lugjhkg.setText("Cm");

        jLabel89.setText("obs");

        javax.swing.GroupLayout c21_Layout = new javax.swing.GroupLayout(c21_);
        c21_.setLayout(c21_Layout);
        c21_Layout.setHorizontalGroup(
            c21_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c21_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lugjhkg, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel21, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs21, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c21_Layout.setVerticalGroup(
            c21_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c21_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(c21_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lugjhkg)
                    .addComponent(txtObs21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(txtCel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        c22.setBorder(javax.swing.BorderFactory.createTitledBorder("50. Câmara do produto / largura"));

        jLabel50.setText("Cm");

        jLabel51.setText("obs");

        javax.swing.GroupLayout c22Layout = new javax.swing.GroupLayout(c22);
        c22.setLayout(c22Layout);
        c22Layout.setHorizontalGroup(
            c22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel22, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtObs22, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        c22Layout.setVerticalGroup(
            c22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c22Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtCel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)))
        );

        c23_.setBorder(javax.swing.BorderFactory.createTitledBorder("52. Correia vertical / Largura"));

        jLabel58.setText("N° voltas");

        jLabel59.setText("obs");

        javax.swing.GroupLayout c23_Layout = new javax.swing.GroupLayout(c23_);
        c23_.setLayout(c23_Layout);
        c23_Layout.setHorizontalGroup(
            c23_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c23_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel23, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtObs23, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
        );
        c23_Layout.setVerticalGroup(
            c23_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c23_Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c23_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtCel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)))
        );

        c25_.setBorder(javax.swing.BorderFactory.createTitledBorder("56. Comprimento do Produto / Batente"));

        jLabel86.setText("N° voltas");

        jLabel87.setText("obs");

        javax.swing.GroupLayout c25_Layout = new javax.swing.GroupLayout(c25_);
        c25_.setLayout(c25_Layout);
        c25_Layout.setHorizontalGroup(
            c25_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c25_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel25, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtObs25, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        c25_Layout.setVerticalGroup(
            c25_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c25_Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(c25_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(txtObs25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87)
                    .addComponent(txtCel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        c24_.setBorder(javax.swing.BorderFactory.createTitledBorder("55. Correia vertical / Altura"));

        jLabel92.setText("N° voltas");

        jLabel93.setText("obs");

        javax.swing.GroupLayout c24_Layout = new javax.swing.GroupLayout(c24_);
        c24_.setLayout(c24_Layout);
        c24_Layout.setHorizontalGroup(
            c24_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c24_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel24, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs24, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c24_Layout.setVerticalGroup(
            c24_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c24_Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c24_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(txtCel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93)))
        );

        c26.setBorder(javax.swing.BorderFactory.createTitledBorder("85. Bocal1 (transporte do filme)"));

        jLabel94.setText("Bar");

        jLabel95.setText("obs");

        javax.swing.GroupLayout c26Layout = new javax.swing.GroupLayout(c26);
        c26.setLayout(c26Layout);
        c26Layout.setHorizontalGroup(
            c26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel26, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtObs26, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        c26Layout.setVerticalGroup(
            c26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c26Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(txtCel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95)))
        );

        c27_.setBorder(javax.swing.BorderFactory.createTitledBorder("86. Bocal 2 (lâmina)"));

        jLabel96.setText("Bar");

        jLabel97.setText("obs");

        javax.swing.GroupLayout c27_Layout = new javax.swing.GroupLayout(c27_);
        c27_.setLayout(c27_Layout);
        c27_Layout.setHorizontalGroup(
            c27_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c27_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel27, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtObs27, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );
        c27_Layout.setVerticalGroup(
            c27_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c27_Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c27_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(txtCel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97)))
        );

        c29_.setBorder(javax.swing.BorderFactory.createTitledBorder("104. Deslocamento mesa de agrupamento"));

        jLabel98.setText("Cm");

        jLabel99.setText("obs");

        javax.swing.GroupLayout c29_Layout = new javax.swing.GroupLayout(c29_);
        c29_.setLayout(c29_Layout);
        c29_Layout.setHorizontalGroup(
            c29_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c29_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel29, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtObs29, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c29_Layout.setVerticalGroup(
            c29_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c29_Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(c29_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(jLabel99)
                    .addComponent(txtCel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        c28_.setBorder(javax.swing.BorderFactory.createTitledBorder("87. Bocal 3 (rm baixo da bancada)"));

        jLabel100.setText("Bar");

        jLabel101.setText("obs");

        javax.swing.GroupLayout c28_Layout = new javax.swing.GroupLayout(c28_);
        c28_.setLayout(c28_Layout);
        c28_Layout.setHorizontalGroup(
            c28_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c28_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel28, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs28, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c28_Layout.setVerticalGroup(
            c28_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c28_Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c28_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(txtCel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101)))
        );

        c30.setBorder(javax.swing.BorderFactory.createTitledBorder("105. Interrruptor b80"));

        jLabel116.setText("Cm");

        jLabel117.setText("obs");

        javax.swing.GroupLayout c30Layout = new javax.swing.GroupLayout(c30);
        c30.setLayout(c30Layout);
        c30Layout.setHorizontalGroup(
            c30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel30, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtObs30, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        c30Layout.setVerticalGroup(
            c30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c30Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(txtCel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117)))
        );

        c31.setBorder(javax.swing.BorderFactory.createTitledBorder("106. Filme"));

        jLabel102.setText("mm");

        jLabel103.setText("obs");

        javax.swing.GroupLayout c31Layout = new javax.swing.GroupLayout(c31);
        c31.setLayout(c31Layout);
        c31Layout.setHorizontalGroup(
            c31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel31, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtObs31, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
        );
        c31Layout.setVerticalGroup(
            c31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c31Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(c31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(txtCel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103)))
        );

        c6_.setBorder(javax.swing.BorderFactory.createTitledBorder("6. Largura do Filme"));

        jLabel108.setText("N° voltas");

        jLabel109.setText("obs");

        javax.swing.GroupLayout c6_Layout = new javax.swing.GroupLayout(c6_);
        c6_.setLayout(c6_Layout);
        c6_Layout.setHorizontalGroup(
            c6_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c6_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c6_Layout.setVerticalGroup(
            c6_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c6_Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(c6_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(txtCel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs6)
                    .addComponent(jLabel109)))
        );

        javax.swing.GroupLayout PainelCelofaneLayout = new javax.swing.GroupLayout(PainelCelofane);
        PainelCelofane.setLayout(PainelCelofaneLayout);
        PainelCelofaneLayout.setHorizontalGroup(
            PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCelofaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c5_, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1_, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCelofaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelCelofaneLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(c6_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c4_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(PainelCelofaneLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PainelCelofaneLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c29_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(c25_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c27_, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(c23_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(c15_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(c13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(c11_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(c7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                        .addComponent(c17_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(c21_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(c19_, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c10_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c14_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c24_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c18_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c16_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c28_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );
        PainelCelofaneLayout.setVerticalGroup(
            PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCelofaneLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCelofaneLayout.createSequentialGroup()
                        .addComponent(c1_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addComponent(c2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCelofaneLayout.createSequentialGroup()
                        .addComponent(c3_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(c4_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCelofaneLayout.createSequentialGroup()
                        .addComponent(c5_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCelofaneLayout.createSequentialGroup()
                        .addComponent(c6_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c8_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c10_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c9, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c11_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCelofaneLayout.createSequentialGroup()
                        .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCelofaneLayout.createSequentialGroup()
                        .addComponent(c14_, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c15_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c16_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c17_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c18_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c19_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c21_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c23_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c24_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c25_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PainelCelofaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelCelofaneLayout.createSequentialGroup()
                        .addComponent(c27_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c29_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelCelofaneLayout.createSequentialGroup()
                        .addComponent(c28_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(c30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(761, Short.MAX_VALUE))
        );

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

        txtCel33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel33ActionPerformed(evt);
            }
        });

        jLabel32.setText("DOBRADOR ESQUERDO");

        jLabel33.setText("GUIA ESQUERDA");

        txtCel35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel35ActionPerformed(evt);
            }
        });

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

        txtCel40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel40ActionPerformed(evt);
            }
        });

        jLabel84.setText("PINÇA DIREITA");

        jLabel85.setForeground(new java.awt.Color(51, 51, 255));
        jLabel85.setText("ELEVADOR");

        jLabel88.setText("ABAIXO");

        txtCel43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel43ActionPerformed(evt);
            }
        });

        jLabel90.setText("TOPO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCel35, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCel34, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCel33, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCel32, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel88)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCel42, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57)
                                                .addComponent(jLabel90)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCel43, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(81, 81, 81))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel40)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCel39, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(27, 27, 27))
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addComponent(jLabel41)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtCel40, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(12, 12, 12)))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel36)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCel36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(37, 37, 37)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jLabel37)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtCel37, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(26, 26, 26)
                                                    .addComponent(jLabel38))
                                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtCel38, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel84)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCel41, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(13, 13, 13))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtCel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(txtCel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txtCel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(jLabel38)
                        .addComponent(txtCel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtCel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(txtCel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84)
                    .addComponent(txtCel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(txtCel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(441, 441, 441))
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

        txtCel45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel45ActionPerformed(evt);
            }
        });

        jLabel8.setText("Frente");

        jLabel9.setText("Ciclo");

        jLabel91.setForeground(new java.awt.Color(0, 0, 204));
        jLabel91.setText("TRANSPORTE DE SAIDA");

        jLabel104.setText("Topo");

        jLabel105.setText("Largura");

        txtCel48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel48ActionPerformed(evt);
            }
        });

        jLabel106.setText("Tempo");

        jLabel110.setForeground(new java.awt.Color(0, 0, 204));
        jLabel110.setText("BARRA DE SELAGEM");

        jLabel111.setForeground(new java.awt.Color(0, 0, 204));
        jLabel111.setText("PARAMETROS DO EMPURRADOR");

        jLabel107.setText("Atrás");

        jLabel112.setText("frente");

        txtCel51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel51ActionPerformed(evt);
            }
        });

        jLabel113.setText("posição do cartucho");

        jLabel114.setText("Ciclo");

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
                            .addComponent(jLabel7)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtCel44)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCel45, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCel46, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel106)
                                .addGap(9, 9, 9)
                                .addComponent(txtCel49, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel91))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel110))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel104)
                                .addGap(20, 20, 20)
                                .addComponent(txtCel47, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel105)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCel48, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel107)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCel50, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                    .addComponent(jLabel112)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCel51, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel113)
                                        .addComponent(jLabel114))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCel52, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                        .addComponent(txtCel53))
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
                        .addComponent(jLabel7))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel104))
                                    .addComponent(txtCel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel106))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel111))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel105)
                                .addComponent(txtCel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel107))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel112)
                                .addComponent(txtCel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel113)
                            .addComponent(txtCel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel114))
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AJUSTES TÉCNICOS 2", jPanel5);

        jLabel15.setText("ELEVADOR");

        txtCel55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel55ActionPerformed(evt);
            }
        });

        jLabel16.setText("EMPURRADOR");

        jLabel17.setText("GUIAS");

        txtCel57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel57ActionPerformed(evt);
            }
        });

        jLabel18.setText("DOBRADEIRAS");

        jLabel19.setText("MESA");

        txtCel59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel59ActionPerformed(evt);
            }
        });

        jLabel20.setText("PINÇAS");

        jLabel21.setText("CHAPAS PINÇAS");

        jButton4.setText("Salvar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Editar");

        jButton6.setText("Excluir");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(39, 39, 39)
                        .addComponent(jButton5)
                        .addGap(41, 41, 41)
                        .addComponent(jButton6))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCel60))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(27, 27, 27)
                            .addComponent(txtCel54))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCel55, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCel56))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(18, 18, 18)
                            .addComponent(txtCel58))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(18, 18, 18)
                            .addComponent(txtCel59))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCel57, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtCel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtCel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(53, 53, 53))
        );

        jTabbedPane1.addTab("FERRAMENTAL ALTERNATIVO / SALVAR", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1450, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1491, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("OUTROS PARAMENTROS / SALVAR", jPanel1);

        lblimagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem enviada para banco de dados"));

        lblimagem3.setText(".");
        lblimagem3.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem enviada para banco de dados"));

        lblimagem4.setText(".");
        lblimagem4.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem enviada para banco de dados"));

        lblimage2.setText(".");
        lblimage2.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem enviada para banco de dados"));

        btnFoto1.setText("Procurar");
        btnFoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoto1ActionPerformed(evt);
            }
        });

        btnFoto3.setText("Procurar");
        btnFoto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoto3ActionPerformed(evt);
            }
        });

        btnFoto2.setText("Procurar");
        btnFoto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoto2ActionPerformed(evt);
            }
        });

        btnFoto4.setText("Procurar");
        btnFoto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoto4ActionPerformed(evt);
            }
        });

        imagePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagePathActionPerformed(evt);
            }
        });

        jLabel2.setText("Caminho das imagens");

        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setText("Alterar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btnSalvarFoto3.setText("Alterar");
        btnSalvarFoto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFoto3ActionPerformed(evt);
            }
        });

        btnSalvarFoto4.setText("Alterar");
        btnSalvarFoto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFoto4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtFoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFoto3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarFoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFoto1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(lblimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblimage2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimagem4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtFoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFoto4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarFoto4))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFoto2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, Short.MAX_VALUE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(imagePath4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                    .addComponent(imagePath, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(imagePath2)
                                    .addComponent(imagePaht5, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imagePath6, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(imagePath3))))
                .addContainerGap(1372, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblimage2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFoto1)
                    .addComponent(txtFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFoto2)
                    .addComponent(jButton2)
                    .addComponent(jButton7))
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblimagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblimagem4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFoto3)
                    .addComponent(txtFoto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFoto4)
                    .addComponent(btnSalvarFoto3)
                    .addComponent(btnSalvarFoto4))
                .addGap(200, 200, 200)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePath2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePath3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagePath4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePaht5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePath6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1153, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("IMAGENS", jPanel10);

        jScrollPane1.setViewportView(jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        adicionar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtCel59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel59ActionPerformed

    private void txtCel57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel57ActionPerformed

    private void txtCel55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel55ActionPerformed

    private void txtCel51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel51ActionPerformed

    private void txtCel48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel48ActionPerformed

    private void txtCel45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel45ActionPerformed

    private void txtCel43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel43ActionPerformed

    private void txtCel40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel40ActionPerformed

    private void txtCel35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel35ActionPerformed

    private void txtCel33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel33ActionPerformed

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void txtCel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel1ActionPerformed

    private void btnProcurarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarProdutoActionPerformed
        // evento para procurar produto;
                 String sql = "select * from tbparametrogeral where produto like ?";
        try {
            pst = conexao.prepareStatement(sql);
            
            
            pst.setString(1,txtProduto1.getText()+ "%");
            rs = pst.executeQuery();
            
            tblProduto1.setModel(DbUtils.resultSetToTableModel(rs));
            //defaultSize(tblProduto1);
            DefaultTableModel modelo = (DefaultTableModel) tblProduto1.getModel();
            modelo.setColumnCount(4);
            
            
            //modelo.setColumnCount(114);//resolvere este bug
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_btnProcurarProdutoActionPerformed

    private void tblProduto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProduto1MouseClicked
        // Quando clicar na lista
        setar_campos_cadastrado();
    }//GEN-LAST:event_tblProduto1MouseClicked

    private void txtL2hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtL2hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtL2hActionPerformed

    private void txtD2qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtD2qActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtD2qActionPerformed

    private void txtT2hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtT2hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtT2hActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        alterar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtProduto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProduto1KeyReleased
        // TODO add your handling code here:
        /*String sql = "select * from tbparametrogeral where produto like ?";
        try {
            pst = conexao.prepareStatement(sql);
            
            
            pst.setString(1,txtProduto1.getText()+ "%");
            rs = pst.executeQuery();
            
            tblProduto1.setModel(DbUtils.resultSetToTableModel(rs));
            //defaultSize(tblProduto1);
            DefaultTableModel modelo = (DefaultTableModel) tblProduto1.getModel();
            modelo.setColumnCount(4);
            
            
            //modelo.setColumnCount(114);//resolvere este bug
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }*/
    }//GEN-LAST:event_txtProduto1KeyReleased

    private void txtProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProduto1ActionPerformed
        // evento de consultar
        consultar();

    }//GEN-LAST:event_txtProduto1ActionPerformed

    private void btnSalvarFoto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFoto4ActionPerformed
        // salvar foto 4

        System.out.println("Image Path" + path4);
        System.out.println("Image Name  " + f4.getName());
        File f4 = new File(path4);
        String sql = "update tbparametrogeral set obs4 = ?,imagePath4 =?,foto4 = ? where formato = ?";
        try {
            InputStream is4 = new FileInputStream(f4);
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtFoto4.getText());
            pst.setString(2,imagePath4.getText());
            pst.setBlob(3, is4);
            pst.setString(4,txtFor.getText());

            int adicionado = pst.executeUpdate();

            if(adicionado>0 ){
                JOptionPane.showMessageDialog(null, "Imagem adicionada com sucesso!!!");

                txtFoto4.setText(null);
               

            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar foto. Contate o desenvolvedor!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_btnSalvarFoto4ActionPerformed

    private void btnSalvarFoto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFoto3ActionPerformed
        // TODO add your handling code here:
        // Salvar foto 3
        System.out.println("Image Path" + path3);
        System.out.println("Image Name  " + f3.getName());
        File f3 = new File(path3);
        String sql = "update tbparametrogeral set obs3 = ?,imagePath3 =?,foto3 = ? where formato = ?";
        try {
            InputStream is3 = new FileInputStream(f3);
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtFoto3.getText());
            pst.setString(2,imagePath3.getText());
            pst.setBlob(3, is3);
            pst.setString(4,txtFor.getText());

            int adicionado = pst.executeUpdate();

            if(adicionado>0 ){
                JOptionPane.showMessageDialog(null, "Imagem adicionada com sucesso!!!");

                txtFoto3.setText(null);
                

            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar foto. Contate o desenvolvedor!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSalvarFoto3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Salvar foto 2
        System.out.println("Image Path" + path2);
        System.out.println("Image Name  " + f2.getName());
        File f2 = new File(path2);
        String sql = "update tbparametrogeral set obs2 = ?,imagePath2 =?,foto2 = ? where formato = ?";
        try {
            InputStream is2 = new FileInputStream(f2);
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtFoto2.getText());
            pst.setString(2,imagePath2.getText());
            pst.setBlob(3, is2);
            pst.setString(4,txtFor.getText());

            int adicionado = pst.executeUpdate();

            if(adicionado>0 ){
                JOptionPane.showMessageDialog(null, "Imagem adicionada com sucesso!!!");

                txtFoto2.setText(null);
                

            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar foto. Contate o desenvolvedor!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // salvar foto 1
        System.out.println("Image Path" + path1);
        System.out.println("Image Name  " + f.getName());
        File f = new File(path1);
        String sql = "update tbparametrogeral set obs = ?,imagePath1 =?,foto1 = ? where formato = ?";
        try {
            InputStream is = new FileInputStream(f);
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtFoto1.getText());
            pst.setString(2,imagePath.getText());
            pst.setBlob(3, is);
            pst.setString(4,txtFor.getText());

            int adicionado = pst.executeUpdate();

            if(adicionado>0 ){
                JOptionPane.showMessageDialog(null, "Imagem adicionada com sucesso!!!");

                txtFoto1.setText(null);
                

            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar foto. Contate o desenvolvedor!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void imagePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagePathActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_imagePathActionPerformed

    private void btnFoto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoto4ActionPerformed
        // TODO add your handling code here:
        selecionarFoto4();
    }//GEN-LAST:event_btnFoto4ActionPerformed

    private void btnFoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoto2ActionPerformed
        // TODO add your handling code here:
        selecionarFoto2();
    }//GEN-LAST:event_btnFoto2ActionPerformed

    private void btnFoto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoto3ActionPerformed
        // TODO add your handling code here:
        selecionarFoto3();
    }//GEN-LAST:event_btnFoto3ActionPerformed

    private void btnFoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoto1ActionPerformed
        // TODO add your handling code here:
        selecionarFoto1();
    }//GEN-LAST:event_btnFoto1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        adicionar();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        remover();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnProcurarProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarProduto1ActionPerformed
        // TODO add your handling code here:
        consultar_formato();
    }//GEN-LAST:event_btnProcurarProduto1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        novo_produto();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroParmCelofane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroParmCelofane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroParmCelofane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroParmCelofane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroParmCelofane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCelofane;
    private javax.swing.JButton btnFoto1;
    private javax.swing.JButton btnFoto2;
    private javax.swing.JButton btnFoto3;
    private javax.swing.JButton btnFoto4;
    private javax.swing.JButton btnProcurarProduto;
    private javax.swing.JButton btnProcurarProduto1;
    private javax.swing.JButton btnSalvarFoto3;
    private javax.swing.JButton btnSalvarFoto4;
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
    private javax.swing.JComboBox<String> cboAbastecimento;
    private javax.swing.JComboBox<String> cboAcondicionamento;
    private javax.swing.JComboBox<String> cboEsteira;
    private javax.swing.JComboBox<String> cboMaquina;
    private javax.swing.JLabel idcli;
    private javax.swing.JTextField imagePaht5;
    private javax.swing.JTextField imagePath;
    private javax.swing.JTextField imagePath2;
    private javax.swing.JTextField imagePath3;
    private javax.swing.JTextField imagePath4;
    private javax.swing.JTextField imagePath6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
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
    private javax.swing.JLabel lblimage2;
    private javax.swing.JLabel lblimagem;
    private javax.swing.JLabel lblimagem3;
    private javax.swing.JLabel lblimagem4;
    private javax.swing.JLabel lugjhkg;
    private javax.swing.JTable tblProduto1;
    private javax.swing.JTextField txtCel1;
    private javax.swing.JTextField txtCel10;
    private javax.swing.JTextField txtCel11;
    private javax.swing.JTextField txtCel12;
    private javax.swing.JTextField txtCel13;
    private javax.swing.JTextField txtCel14;
    private javax.swing.JTextField txtCel15;
    private javax.swing.JTextField txtCel16;
    private javax.swing.JTextField txtCel17;
    private javax.swing.JTextField txtCel18;
    private javax.swing.JTextField txtCel19;
    private javax.swing.JTextField txtCel2;
    private javax.swing.JTextField txtCel20;
    private javax.swing.JTextField txtCel21;
    private javax.swing.JTextField txtCel22;
    private javax.swing.JTextField txtCel23;
    private javax.swing.JTextField txtCel24;
    private javax.swing.JTextField txtCel25;
    private javax.swing.JTextField txtCel26;
    private javax.swing.JTextField txtCel27;
    private javax.swing.JTextField txtCel28;
    private javax.swing.JTextField txtCel29;
    private javax.swing.JTextField txtCel3;
    private javax.swing.JTextField txtCel30;
    private javax.swing.JTextField txtCel31;
    private javax.swing.JTextField txtCel32;
    private javax.swing.JTextField txtCel33;
    private javax.swing.JTextField txtCel34;
    private javax.swing.JTextField txtCel35;
    private javax.swing.JTextField txtCel36;
    private javax.swing.JTextField txtCel37;
    private javax.swing.JTextField txtCel38;
    private javax.swing.JTextField txtCel39;
    private javax.swing.JTextField txtCel4;
    private javax.swing.JTextField txtCel40;
    private javax.swing.JTextField txtCel41;
    private javax.swing.JTextField txtCel42;
    private javax.swing.JTextField txtCel43;
    private javax.swing.JTextField txtCel44;
    private javax.swing.JTextField txtCel45;
    private javax.swing.JTextField txtCel46;
    private javax.swing.JTextField txtCel47;
    private javax.swing.JTextField txtCel48;
    private javax.swing.JTextField txtCel49;
    private javax.swing.JTextField txtCel5;
    private javax.swing.JTextField txtCel50;
    private javax.swing.JTextField txtCel51;
    private javax.swing.JTextField txtCel52;
    private javax.swing.JTextField txtCel53;
    private javax.swing.JTextField txtCel54;
    private javax.swing.JTextField txtCel55;
    private javax.swing.JTextField txtCel56;
    private javax.swing.JTextField txtCel57;
    private javax.swing.JTextField txtCel58;
    private javax.swing.JTextField txtCel59;
    private javax.swing.JTextField txtCel6;
    private javax.swing.JTextField txtCel60;
    private javax.swing.JTextField txtCel7;
    private javax.swing.JTextField txtCel8;
    private javax.swing.JTextField txtCel9;
    private javax.swing.JTextField txtD2o;
    private javax.swing.JTextField txtD2p;
    private javax.swing.JTextField txtD2q;
    private javax.swing.JTextField txtF1a;
    private javax.swing.JTextField txtF1b;
    private javax.swing.JTextField txtF1c;
    private javax.swing.JTextField txtF1d;
    private javax.swing.JTextField txtF1e;
    private javax.swing.JTextField txtF1f;
    private javax.swing.JTextField txtFor;
    private javax.swing.JTextField txtFoto1;
    private javax.swing.JTextField txtFoto2;
    private javax.swing.JTextField txtFoto3;
    private javax.swing.JTextField txtFoto4;
    private javax.swing.JTextField txtL2g;
    private javax.swing.JTextField txtL2h;
    private javax.swing.JTextField txtL2k;
    private javax.swing.JTextField txtObs1;
    private javax.swing.JTextField txtObs10;
    private javax.swing.JTextField txtObs11;
    private javax.swing.JTextField txtObs12;
    private javax.swing.JTextField txtObs13;
    private javax.swing.JTextField txtObs14;
    private javax.swing.JTextField txtObs15;
    private javax.swing.JTextField txtObs16;
    private javax.swing.JTextField txtObs17;
    private javax.swing.JTextField txtObs18;
    private javax.swing.JTextField txtObs19;
    private javax.swing.JTextField txtObs2;
    private javax.swing.JTextField txtObs20;
    private javax.swing.JTextField txtObs21;
    private javax.swing.JTextField txtObs22;
    private javax.swing.JTextField txtObs23;
    private javax.swing.JTextField txtObs24;
    private javax.swing.JTextField txtObs25;
    private javax.swing.JTextField txtObs26;
    private javax.swing.JTextField txtObs27;
    private javax.swing.JTextField txtObs28;
    private javax.swing.JTextField txtObs29;
    private javax.swing.JTextField txtObs3;
    private javax.swing.JTextField txtObs30;
    private javax.swing.JTextField txtObs31;
    private javax.swing.JTextField txtObs4;
    private javax.swing.JTextField txtObs5;
    private javax.swing.JTextField txtObs6;
    private javax.swing.JTextField txtObs7;
    private javax.swing.JTextField txtObs8;
    private javax.swing.JTextField txtObs9;
    private javax.swing.JEditorPane txtObsGeral;
    private javax.swing.JTextField txtProduto1;
    private javax.swing.JTextField txtT2g;
    private javax.swing.JTextField txtT2h;
    private javax.swing.JTextField txtT2hh;
    private javax.swing.JTextField txtT2i;
    private javax.swing.JTextField txtT2j;
    private javax.swing.JTextField txtT2k;
    private javax.swing.JTextField txtT2m;
    private javax.swing.JTextField txtT2n;
    // End of variables declaration//GEN-END:variables
}
