/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import GUI.ADM.spaceAlertAdm;
/**
 *
 * @author UserSoffti
 */
public class spaceLogin extends javax.swing.JFrame {

    /**
     * Creates new form spaceLogin
     */
    public spaceLogin() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCpfCnpj = new javax.swing.JFormattedTextField();
        tfSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        btnSair = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCadastroConta = new javax.swing.JLabel();
        btnAreaADM = new javax.swing.JPanel();
        lblLogin1 = new javax.swing.JLabel();
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

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setForeground(new java.awt.Color(22, 22, 67));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(22, 22, 67));
        lblLogin.setText("Fazer Login");
        btnLogin.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, 40));

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setForeground(new java.awt.Color(22, 22, 67));
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        lblSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(22, 22, 67));
        lblSair.setText("Finalizar");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSairLayout = new javax.swing.GroupLayout(btnSair);
        btnSair.setLayout(btnSairLayout);
        btnSairLayout.setHorizontalGroup(
            btnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSairLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblSair)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        btnSairLayout.setVerticalGroup(
            btnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 150, 40));

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

        btnAreaADM.setBackground(new java.awt.Color(255, 255, 255));
        btnAreaADM.setForeground(new java.awt.Color(22, 22, 67));
        btnAreaADM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAreaADM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAreaADMMouseClicked(evt);
            }
        });

        lblLogin1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLogin1.setForeground(new java.awt.Color(22, 22, 67));
        lblLogin1.setText("Área ADM");

        javax.swing.GroupLayout btnAreaADMLayout = new javax.swing.GroupLayout(btnAreaADM);
        btnAreaADM.setLayout(btnAreaADMLayout);
        btnAreaADMLayout.setHorizontalGroup(
            btnAreaADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAreaADMLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblLogin1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        btnAreaADMLayout.setVerticalGroup(
            btnAreaADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAreaADMLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogin1)
                .addContainerGap())
        );

        jPanel2.add(btnAreaADM, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, 40));

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

    private void btnAreaADMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAreaADMMouseClicked
        spaceAlertAdm alertAdm = new spaceAlertAdm();
        alertAdm.setVisible(true);
        
    }//GEN-LAST:event_btnAreaADMMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSairMouseClicked

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSairMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        spaceUserArea sUserArea = new spaceUserArea();
        sUserArea.setVisible(true);
    }//GEN-LAST:event_btnLoginMouseClicked

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
    private javax.swing.JPanel btnAreaADM;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JPanel btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCadastroConta;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblSair;
    private javax.swing.JFormattedTextField tfCpfCnpj;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}
