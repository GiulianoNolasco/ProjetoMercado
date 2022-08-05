/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

/**
 *
 * @author Giuliano
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        btnFuncionarios = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mercado - Vendemos Alimentos");
        setBackground(new java.awt.Color(255, 51, 51));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(710, 415));
        getContentPane().setLayout(null);

        btnFuncionarios.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        btnFuncionarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\icones\\cracha menor.png")); // NOI18N
        btnFuncionarios.setText("FUNCIONARIOS");
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });
        btnFuncionarios.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnFuncionariosPropertyChange(evt);
            }
        });
        getContentPane().add(btnFuncionarios);
        btnFuncionarios.setBounds(10, 10, 220, 81);

        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\icones\\caixa menor.png")); // NOI18N
        jButton1.setText("produtos");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 10, 220, 82);

        btnClientes.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\icones\\clientes menor.png")); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        btnClientes.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnClientesPropertyChange(evt);
            }
        });
        getContentPane().add(btnClientes);
        btnClientes.setBounds(240, 10, 210, 82);

        btnVendas.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        btnVendas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\icones\\vendas icone (1).png")); // NOI18N
        btnVendas.setText("vendas");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });
        btnVendas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnVendasPropertyChange(evt);
            }
        });
        getContentPane().add(btnVendas);
        btnVendas.setBounds(440, 230, 180, 82);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\fundo\\fundo.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        ClientesView tela = new ClientesView();
        tela.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ProdutosView tela = new ProdutosView();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnClientesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnClientesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesPropertyChange

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        FuncionariosView tela = new FuncionariosView();
        tela.setVisible(true);
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void btnFuncionariosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnFuncionariosPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFuncionariosPropertyChange

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        VendasView tela = new VendasView();
        tela.setVisible(true);
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnVendasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnVendasPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVendasPropertyChange

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnVendas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}