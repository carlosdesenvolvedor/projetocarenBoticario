
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import br.com.infox.dal.ModuloConexao;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class ImagemUpload {
    //usado para auxiliar na implementação das funções de tela..
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null; //resultado 
    File f= null;
    String path = null;
    private ImageIcon format = null;
    String fname = null;
    int n = 0;
    byte[] pimage = null;

    public ImagemUpload() {
         initComponents();
            conexao = ModuloConexao.conector();
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
  
    
}
