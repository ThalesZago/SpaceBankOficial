/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.ContaDAO;
import POO.Conta;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author UserSoffti
 */
public class spaceTransfer extends javax.swing.JFrame {

    Conta conta;
    ContaDAO contaDAO;
    /**
     * Creates new form spaceTransfer
     */
    public spaceTransfer(Conta conta) {
        initComponents();
        this.conta = conta;
        String saldo = Float.toString(conta.getSaldo());
        lblSaldo.setText(saldo);
    }

    private spaceTransfer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean validarFormulario(){
       try{
            if(tfNome.getText().trim().length() < 2){
              JOptionPane.showMessageDialog(this, "Nome inválido", "Alerta",
              JOptionPane.WARNING_MESSAGE);
              return false;
          }
            if(tfCpf.getText().trim().length() < 14){
                  JOptionPane.showMessageDialog(this, "CPF inválido", "Alerta",
                  JOptionPane.WARNING_MESSAGE);
                  return false;
              }
            
            if(tfAgencia.getText().length() <= 0){
                 JOptionPane.showMessageDialog(this, "Agencia inválida", "Alerta",
                  JOptionPane.WARNING_MESSAGE);
                  return false;
            }
            
            if(tfConta.getText().length() <=0){
                JOptionPane.showMessageDialog(this, "Conta corrente inválida", "Alerta",
                  JOptionPane.WARNING_MESSAGE);
                  return false;
            }            
                
            return true;
       } catch(Exception e){
           JOptionPane.showMessageDialog(this, "Algo aconteceu: " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
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

        jpDashboard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfAgencia = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        tfNome = new javax.swing.JFormattedTextField();
        tfCpf = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfConta = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        tfValor = new javax.swing.JFormattedTextField();
        btnDepositar = new keeptoo.KButton();
        btnCancelar = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDashboard.setBackground(new java.awt.Color(255, 255, 255));
        jpDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Para quem deseja depositar?");
        jpDashboard.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("SpaceConta");
        jpDashboard.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/rocketIcon40x40.png"))); // NOI18N
        jpDashboard.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Agência:");
        jpDashboard.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        tfAgencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jpDashboard.add(tfAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 220, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Nome completo:");
        jpDashboard.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        jpDashboard.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 220, -1));

        try {
            tfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jpDashboard.add(tfCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 220, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("CPF:");
        jpDashboard.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Conta:");
        jpDashboard.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        tfConta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jpDashboard.add(tfConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Valor:");
        jpDashboard.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        tfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jpDashboard.add(tfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 220, -1));

        btnDepositar.setText("Depositar");
        btnDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDepositarMouseClicked(evt);
            }
        });
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });
        jpDashboard.add(btnDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 140, 30));

        btnCancelar.setText("Cancelar");
        jpDashboard.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 130, 30));

        jLabel2.setText("Saldo:");
        jpDashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));
        jpDashboard.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 60, 20));

        getContentPane().add(jpDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 440, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/spaceActionBackground.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositarMouseClicked
        float valorTotal = Float.parseFloat(tfValor.getText());       
        //float valorTotal = ((Long) tfValor.getValue()).floatValue();
        if(validarFormulario()){
            System.out.println("valor: " + tfValor.getValue());
            System.out.println("valor float: " + ((Number) tfValor.getValue()));
           try{
               contaDAO.getViaNumeroConta(Integer.parseInt(tfConta.getText()));
                try{
                conta.setSaldo(valorTotal);
                contaDAO.deposito(conta);
                JOptionPane.showMessageDialog(this, "Depósito realizado com sucesso!", "OK", JOptionPane.INFORMATION_MESSAGE);
            } catch(Exception e){
                JOptionPane.showMessageDialog(this, "Erro ao realizar depósito: " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
            }
           } catch(Exception e){
                               JOptionPane.showMessageDialog(this, "Conta não encontrada. Erro: " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
           }
        }
    }//GEN-LAST:event_btnDepositarMouseClicked

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Clicou em depósito");
    }//GEN-LAST:event_btnDepositarActionPerformed

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
            java.util.logging.Logger.getLogger(spaceTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(spaceTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(spaceTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(spaceTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new spaceTransfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnCancelar;
    private keeptoo.KButton btnDepositar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jpDashboard;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JFormattedTextField tfAgencia;
    private javax.swing.JFormattedTextField tfConta;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JFormattedTextField tfNome;
    private javax.swing.JFormattedTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
