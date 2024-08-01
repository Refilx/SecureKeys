/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.securekeys.views.formScreen;

import javax.swing.*;
import java.awt.Cursor;

/**
 *
 * @author adimael
 */
public class CadastroSalaDialog extends javax.swing.JDialog {

    /**
     * Creates new form CadastroUserDialog
     */
    public CadastroSalaDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnCadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        placeHolderUser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        placeHolderNome = new javax.swing.JLabel();
        placeHolderCPF = new javax.swing.JLabel();
        placeHolderEmail = new javax.swing.JLabel();
        placeHolderEndereco = new javax.swing.JLabel();
        jNomeField = new javax.swing.JTextField();
        jNumeroField = new javax.swing.JTextField();
        jBlocoField = new javax.swing.JTextField();
        jDescricaoField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jChaveReserva = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        placeHolderUser.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderUser.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderUser.setText("Digite seu nome de usuário....");
        placeHolderUser.setEnabled(false);
        placeHolderUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderUserKeyTyped(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1712, 960));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 330, 20, -1));

        jLabel7.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("*");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 20, -1));

        jLabel8.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("*");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, 20, -1));

        jLabel9.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("*");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 130, 20, -1));

        placeHolderNome.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderNome.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderNome.setText("Nome da sala....");
        placeHolderNome.setEnabled(false);
        placeHolderNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderNomeKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 510, 60));

        placeHolderCPF.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderCPF.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderCPF.setText("Número da sala....");
        placeHolderCPF.setEnabled(false);
        placeHolderCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderCPFKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 510, 60));

        placeHolderEmail.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderEmail.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderEmail.setText("Bloco / Prédio");
        placeHolderEmail.setEnabled(false);
        placeHolderEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderEmailKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 110, 510, 60));

        placeHolderEndereco.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderEndereco.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderEndereco.setText("Descrição....");
        placeHolderEndereco.setEnabled(false);
        placeHolderEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderEnderecoKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 510, 60));

        jNomeField.setBackground(new java.awt.Color(204, 255, 204));
        jNomeField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jNomeField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jNomeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jNomeFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jNomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 114, 520, 60));

        jNumeroField.setBackground(new java.awt.Color(204, 255, 204));
        jNumeroField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jNumeroField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jNumeroField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jNumeroFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jNumeroField, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 114, 520, 60));

        jBlocoField.setBackground(new java.awt.Color(204, 255, 204));
        jBlocoField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jBlocoField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jBlocoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBlocoFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jBlocoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1107, 114, 520, 60));

        jDescricaoField.setBackground(new java.awt.Color(204, 255, 204));
        jDescricaoField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jDescricaoField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jDescricaoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDescricaoFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jDescricaoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 1596, 60));

        jLabel4.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Cadastrar nova sala");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Obs: Todos os campos obrigatórios possuem o símbolo '*'. Por favor preencher corretamente.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 830, -1));

        jChaveReserva.setBackground(new java.awt.Color(204, 255, 204));
        jChaveReserva.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jChaveReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Possui chave reserva?", "Sim", "Não" }));
        jChaveReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChaveReservaActionPerformed(evt);
            }
        });
        jPanel1.add(jChaveReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 430, 40));

        btnCadastrar.setBackground(new java.awt.Color(204, 255, 204));
        btnCadastrar.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnCadastrar.setMaximumSize(new java.awt.Dimension(1290, 760));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(1290, 760));
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 750, 170, 60));
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 51, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 750, 190, 60));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1718, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void placeHolderUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderUserKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderUserKeyTyped

    private void placeHolderNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderNomeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderNomeKeyTyped

    private void placeHolderEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderEmailKeyTyped

    private void placeHolderEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderEnderecoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderEnderecoKeyTyped

    private void jNomeFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNomeFieldKeyReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(jNomeField.getText().isEmpty()) {
            placeHolderNome.setVisible(true);
            placeHolderNome.setEnabled(false);
        } else {
            placeHolderNome.setVisible(false);
            placeHolderNome.setEnabled(false);
        }
    }//GEN-LAST:event_jNomeFieldKeyReleased

    private void jBlocoFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBlocoFieldKeyReleased
        // TODO add your handling code here:
        if(jBlocoField.getText().isEmpty()) {
            placeHolderEmail.setVisible(true);
            placeHolderEmail.setEnabled(false);
        } else {
            placeHolderEmail.setVisible(false);
            placeHolderEmail.setEnabled(false);
        }
    }//GEN-LAST:event_jBlocoFieldKeyReleased

    private void jDescricaoFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDescricaoFieldKeyReleased
        // TODO add your handling code here:
        if(jDescricaoField.getText().isEmpty()) {
            placeHolderEndereco.setVisible(true);
            placeHolderEndereco.setEnabled(false);
        } else {
            placeHolderEndereco.setVisible(false);
            placeHolderEndereco.setEnabled(false);
        }
    }//GEN-LAST:event_jDescricaoFieldKeyReleased

    private void jNumeroFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNumeroFieldKeyReleased
        // TODO add your handling code here:
        if(jNumeroField.getText().isEmpty()) {
            placeHolderCPF.setVisible(true);
            placeHolderCPF.setEnabled(false);
        } else {
            placeHolderCPF.setVisible(false);
            placeHolderCPF.setEnabled(false);
        }
    }//GEN-LAST:event_jNumeroFieldKeyReleased

    private void placeHolderCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderCPFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderCPFKeyTyped

    private void jChaveReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChaveReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChaveReservaActionPerformed

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:

        boolean result = false;

        try {
            //
            String nome = jNomeField.getText();
            int numeroChave = Integer.parseInt(jNumeroField.getText());
            String bloco = jBlocoField.getText();
            String descricao = jDescricaoField.getText();
            String opcao = jChaveReserva.getSelectedItem().toString();

            //
            result = new AddSala(nome, numeroChave, bloco, descricao, opcao).cadastroResult();

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O valor preenchido no campo de número não é válido");
        }

        //
        if(result){
            jNomeField.setText(null);
            jNumeroField.setText(null);
            jBlocoField.setText(null);
            jDescricaoField.setText(null);
            jChaveReserva.setSelectedIndex(0);
        }

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroSalaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroSalaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroSalaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroSalaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroSalaDialog dialog = new CadastroSalaDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField jBlocoField;
    private javax.swing.JComboBox<String> jChaveReserva;
    private javax.swing.JTextField jDescricaoField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNomeField;
    private javax.swing.JTextField jNumeroField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel placeHolderCPF;
    private javax.swing.JLabel placeHolderEmail;
    private javax.swing.JLabel placeHolderEndereco;
    private javax.swing.JLabel placeHolderNome;
    private javax.swing.JLabel placeHolderUser;
    // End of variables declaration//GEN-END:variables
}
