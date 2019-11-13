/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import DAO.ClienteDAO;
import DAO.ContaDAO;
import GUI.ADM.spaceAlertAdm;
import POO.Cliente;
import POO.Conta;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author UserSoffti
 */
public class spaceLogin extends javax.swing.JFrame {
    
         Cliente cliente = new Cliente();
         ClienteDAO clienteDAO = new ClienteDAO();
         Conta conta = new Conta();
         ContaDAO contaDAO = new ContaDAO();
        

    /**
     * Creates new form spaceLogin
     */
    public spaceLogin() {
        initComponents();
    }
    
    private boolean validarFormulario(){
         try{        
            if(tfCpfCnpj.getText().trim().length() < 14){
                JOptionPane.showMessageDialog(this, "CPF inválido", "Alerta",
                JOptionPane.WARNING_MESSAGE);
                return false;
            }

            if(tfSenha.getPassword().length <  6 || tfSenha.getPassword().length > 8){
                JOptionPane.showMessageDialog(this, "Senha deve conter entre 6 até 8 caracteres", "Alerta",
                JOptionPane.WARNING_MESSAGE);
                return false;
            }
         return true;
         } catch(Exception e){
             JOptionPane.showMessageDialog(this, "Algo aconteceu" + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
             return false;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCpfCnpj = new javax.swing.JFormattedTextField();
        tfSenha = new javax.swing.JPasswordField();
        btnLogin = new keeptoo.KButton();
        jLabel8 = new javax.swing.JLabel();
        lblCadastroConta = new javax.swing.JLabel();
        btnFinalizar = new keeptoo.KButton();
        btnAreaAdm = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(22, 22, 67));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("frmLogin"); // NOI18N
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(22, 22, 67));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/loginSPACEBANK.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bem vindo ao SPACEBANK");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SENHA:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPF/CNPJ:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, -1));

        tfCpfCnpj.setBackground(new java.awt.Color(22, 22, 67));
        tfCpfCnpj.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        tfCpfCnpj.setForeground(new java.awt.Color(255, 255, 255));
        tfCpfCnpj.setOpaque(false);
        jPanel2.add(tfCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 330, 30));

        tfSenha.setBackground(new java.awt.Color(22, 22, 67));
        tfSenha.setForeground(new java.awt.Color(255, 255, 255));
        tfSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        tfSenha.setOpaque(false);
        jPanel2.add(tfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 330, 30));

        btnLogin.setText("Fazer Login");
        btnLogin.setkBackGroundColor(new java.awt.Color(22, 22, 67));
        btnLogin.setkBorderRadius(15);
        btnLogin.setkEndColor(new java.awt.Color(22, 22, 67));
        btnLogin.setkHoverEndColor(new java.awt.Color(22, 22, 67));
        btnLogin.setkHoverForeGround(new java.awt.Color(22, 22, 67));
        btnLogin.setkHoverStartColor(new java.awt.Color(181, 225, 244));
        btnLogin.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ainda não possui uma conta no SpaceBank?");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        lblCadastroConta.setBackground(new java.awt.Color(22, 22, 67));
        lblCadastroConta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCadastroConta.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroConta.setText("Clique aqui e comece a aproveitar");
        lblCadastroConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCadastroConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastroContaMouseClicked(evt);
            }
        });
        jPanel2.add(lblCadastroConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        btnFinalizar.setText("Finalizar");
        btnFinalizar.setkBackGroundColor(new java.awt.Color(22, 22, 67));
        btnFinalizar.setkBorderRadius(15);
        btnFinalizar.setkEndColor(new java.awt.Color(22, 22, 67));
        btnFinalizar.setkHoverEndColor(new java.awt.Color(22, 22, 67));
        btnFinalizar.setkHoverForeGround(new java.awt.Color(22, 22, 67));
        btnFinalizar.setkHoverStartColor(new java.awt.Color(181, 225, 244));
        btnFinalizar.setkSelectedColor(new java.awt.Color(22, 22, 67));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 120, -1));

        btnAreaAdm.setText("Área ADM");
        btnAreaAdm.setkBackGroundColor(new java.awt.Color(22, 22, 67));
        btnAreaAdm.setkEndColor(new java.awt.Color(22, 22, 67));
        btnAreaAdm.setkHoverEndColor(new java.awt.Color(22, 22, 67));
        btnAreaAdm.setkHoverForeGround(new java.awt.Color(22, 22, 67));
        btnAreaAdm.setkHoverStartColor(new java.awt.Color(181, 225, 244));
        btnAreaAdm.setkPressedColor(new java.awt.Color(181, 225, 244));
        btnAreaAdm.setkSelectedColor(new java.awt.Color(22, 22, 67));
        btnAreaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaAdmActionPerformed(evt);
            }
        });
        jPanel2.add(btnAreaAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 90, 20));

        jLabel2.setBackground(new java.awt.Color(22, 22, 67));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/backgroundSPACEBANKWithoutRocket.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCadastroContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastroContaMouseClicked
        spaceCadastro sc = new spaceCadastro();
        sc.setVisible(true);
    }//GEN-LAST:event_lblCadastroContaMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String senha = new String(tfSenha.getPassword());
        if(validarFormulario()){
            cliente.setCpfCnpj(tfCpfCnpj.getText());
            if(tfCpfCnpj.getText() != "" || senha  != ""){
                try{
                    cliente = clienteDAO.getViaCpfCnpjSenha(tfCpfCnpj.getText(), senha);
                    int id = cliente.getIdCliente();
                    if(true){
                        try{
                            conta = contaDAO.getViaIdCliente(id);
                            conta.setIdCliente(id);
                            conta.setAgencia(conta.getAgencia());
                            conta.setContaCorrente(conta.getContaCorrente());
                            conta.setSaldo(conta.getSaldo());
                            conta.setIdGerente(conta.getIdGerente());
                            
                        } catch(Exception e){
                            JOptionPane.showMessageDialog(this, "Erro ao selecionar cliente."
                            + "\n" +e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    JOptionPane.showMessageDialog(this, "Login realizado com sucesso! Bem-vindo(a) " , "OK", JOptionPane.INFORMATION_MESSAGE);
                    spaceUserArea sUserArea = new spaceUserArea(cliente, conta);
                    sUserArea.setVisible(true);
                } catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Erro ao selecionar cliente."
                        + "\n" +e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnAreaAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaAdmActionPerformed
                spaceAlertAdm alertAdm = new spaceAlertAdm();
                alertAdm.setVisible(true);
    }//GEN-LAST:event_btnAreaAdmActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(spaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(spaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(spaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(spaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new spaceLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnAreaAdm;
    private keeptoo.KButton btnFinalizar;
    private keeptoo.KButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCadastroConta;
    private javax.swing.JFormattedTextField tfCpfCnpj;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}
