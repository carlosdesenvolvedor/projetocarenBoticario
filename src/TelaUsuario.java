/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author carlo
 */
import java.sql.*;
import br.com.infox.dal.ModuloConexao;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaUsuario
     */
    //abaixo 3 frameworks para executar as tabelas sql
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null; //resultado 
    

    public TelaUsuario() {
        initComponents();
        conexao = ModuloConexao.conector();
        //A linha abaixo da foco ao campo do nome do Calaborador
        final JTextField ftf = txtUsuCol; 
        javax.swing.SwingUtilities.invokeLater(new Runnable() { public void run() { ftf.requestFocusInWindow(); } });
        
        
        
    }
     
    

    private void consultar() {
       // String sql = "select * from tbusuarios where iduser=?";
        String sql = "select * from tbusuarios where usuario=?";
        try {
            pst = conexao.prepareStatement(sql);

            //pst.setString(1, txtUsuId.getText());
            pst.setString(1,txtUsuCol.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtUsuId.setText(rs.getString(1));
                txtUsuCol.setText(rs.getString(2));
                txtUsuFon.setText(rs.getString(3));
                txtUsuLog.setText(rs.getString(4));
                txtUsuSen.setText(rs.getString(5));
                //cboUsoPerfil.setSelectedItem(rs.getString(6)); //não tenho certeza se é isto

            } else {
                JOptionPane.showMessageDialog(null, "usuário não cadastrado");
                //as linhas abqaixo linpa os campos
                txtUsuCol.setText(null);
                txtUsuFon.setText(null);
                txtUsuLog.setText(null);
                txtUsuSen.setText(null);
                cboUsoPerfil.setSelectedItem(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    //método para add colaboradores

    private void adicionar() {
        String sql = "insert into tbusuarios(iduser,usuario,fone,login,senha,perfil)values(?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuId.getText());
            pst.setString(2, txtUsuCol.getText());
            pst.setString(3, txtUsuFon.getText());
            pst.setString(4, txtUsuLog.getText());
            pst.setString(5, txtUsuSen.getText());
            pst.setString(6, cboUsoPerfil.getSelectedItem().toString());
            //validação dos campos obrigatorios:
            if (txtUsuId.getText().isEmpty()||txtUsuCol.getText().isEmpty()||
                txtUsuLog.getText().isEmpty()||txtUsuSen.getText().isEmpty()||cboUsoPerfil.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Favor preecher todos os campos obrigatórios");

            } else {

                //a linha abaixo atualiza usuarios com os dados do formulario...
                //pst.executeUpdate();
                //a estrutura abaiso é usada para confirmar a inserção dos dados na tabela.
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Colaborador adicionado com sucesso!!");
                    txtUsuCol.setText(null);
                    txtUsuFon.setText(null);
                    txtUsuLog.setText(null);
                    txtUsuSen.setText(null);
                    //cboUsoPerfil.setSelectedItem(null);
                    txtUsuId.setText(null);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    } 
    //método pra alterar dados do colaborador
    private void alterar(){
        String sql = "update tbusuarios set usuario= ?,fone=?,login=?,senha=?,perfil=? where iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtUsuCol.getText());
            pst.setString(2,txtUsuFon.getText());
            pst.setString(3,txtUsuLog.getText());
            pst.setString(4,txtUsuSen.getText());
            pst.setString(5,cboUsoPerfil.getSelectedItem().toString());
            pst.setString(6,txtUsuId.getText());
            // a estrutura abaixo é usada para confirmar a alteração do colaborador.
            if (txtUsuId.getText().isEmpty()||txtUsuCol.getText().isEmpty()||
                txtUsuLog.getText().isEmpty()||txtUsuSen.getText().isEmpty()||cboUsoPerfil.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Favor preecher todos os campos obrigatórios");

            } else {

                //a linha abaixo atualiza usuarios com os dados do formulario...
                //pst.executeUpdate();
                //a estrutura abaixo é usada para confirmar a inserção dos dados na tabela.
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados alterado com sucesso!!");
                    txtUsuCol.setText(null);
                    txtUsuFon.setText(null);
                    txtUsuLog.setText(null);
                    txtUsuSen.setText(null);
                    //cboUsoPerfil.setSelectedItem(null);
                    txtUsuId.setText(null);
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    //método responsalvel pela remoção de usuários
    private void remover(){
        //a estrutura a baixo confirma a remoção do colaborador
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este cadastro","Atenção",JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
            String sql = "delete from tbusuarios where iduser =?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1,txtUsuId.getText());
                int apagado = pst.executeUpdate();
                if(apagado>0){
                    JOptionPane.showMessageDialog(null, "Usuario removido com sucess!!");
                    txtUsuCol.setText(null);
                    txtUsuFon.setText(null);
                    txtUsuLog.setText(null);
                    txtUsuSen.setText(null);
                    //cboUsoPerfil.setSelectedItem(null);
                    txtUsuId.setText(null);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
               
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuCol = new javax.swing.JTextField();
        txtUsuFon = new javax.swing.JTextField();
        txtUsuSen = new javax.swing.JTextField();
        cboUsoPerfil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtUsuId = new javax.swing.JTextField();
        txtUsuLog = new javax.swing.JTextField();
        btnUsuRead = new javax.swing.JButton();
        btnUsuCreat = new javax.swing.JButton();
        btnUsuUpdate = new javax.swing.JButton();
        btnUsuDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("-Novo Colaborador");
        setMinimumSize(new java.awt.Dimension(700, 500));
        setNextFocusableComponent(txtUsuCol);
        setPreferredSize(new java.awt.Dimension(530, 310));

        jLabel1.setText("*Id");

        jLabel2.setText("*Colaborador");

        jLabel3.setText("*Perfil");

        jLabel4.setText("*Login");

        jLabel5.setText("*Senha");

        txtUsuCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuColActionPerformed(evt);
            }
        });

        cboUsoPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "normal", "admin" }));

        jLabel6.setText("*Matricula");

        btnUsuRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/read.png"))); // NOI18N
        btnUsuRead.setToolTipText("Consulatar");
        btnUsuRead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuReadActionPerformed(evt);
            }
        });

        btnUsuCreat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/create.png"))); // NOI18N
        btnUsuCreat.setToolTipText("Adicionar");
        btnUsuCreat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuCreat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuCreatActionPerformed(evt);
            }
        });

        btnUsuUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        btnUsuUpdate.setToolTipText("Atualizar");
        btnUsuUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuUpdateActionPerformed(evt);
            }
        });

        btnUsuDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        btnUsuDelete.setToolTipText("Excluir");
        btnUsuDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuDeleteActionPerformed(evt);
            }
        });

        jLabel7.setText("* Campos obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuLog, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuFon))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(8, 8, 8)
                                .addComponent(txtUsuSen, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUsuCreat, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addGap(43, 43, 43)
                                .addComponent(btnUsuRead, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addGap(11, 11, 11)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboUsoPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnUsuUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(btnUsuDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuCol))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(txtUsuId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(108, 108, 108)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txtUsuFon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUsuSen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cboUsoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuRead, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUsuCreat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUsuDelete)
                    .addComponent(btnUsuUpdate))
                .addGap(46, 46, 46))
        );

        setBounds(0, 0, 547, 337);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuReadActionPerformed
        // Quando apertar o botão de consulta de usuario
        consultar();
    }//GEN-LAST:event_btnUsuReadActionPerformed

    private void btnUsuCreatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuCreatActionPerformed
        // quando clicar no botão adicionar
        adicionar();
    }//GEN-LAST:event_btnUsuCreatActionPerformed

    private void btnUsuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuUpdateActionPerformed
        // chamando médoto alterar para o botão
        alterar();
    }//GEN-LAST:event_btnUsuUpdateActionPerformed

    private void btnUsuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuDeleteActionPerformed
        // Chamando o método remover
        remover();
    }//GEN-LAST:event_btnUsuDeleteActionPerformed

    private void txtUsuColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuColActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtUsuColActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuCreat;
    private javax.swing.JButton btnUsuDelete;
    private javax.swing.JButton btnUsuRead;
    private javax.swing.JButton btnUsuUpdate;
    private javax.swing.JComboBox<String> cboUsoPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtUsuCol;
    private javax.swing.JTextField txtUsuFon;
    private javax.swing.JTextField txtUsuId;
    private javax.swing.JTextField txtUsuLog;
    private javax.swing.JTextField txtUsuSen;
    // End of variables declaration//GEN-END:variables
}
