/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.securekeys.views.formScreen;

import javax.swing.text.AbstractDocument;
import java.awt.Cursor;

/**
 *
 * @author adimael
 */
public class CadastroUserDialog extends javax.swing.JDialog {

    /**
     * Creates new form CadastroUserDialog
     */
    public CadastroUserDialog(java.awt.Frame parent, boolean modal) {
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
        placeHolderNome = new javax.swing.JLabel();
        placeHolderCPF = new javax.swing.JLabel();
        placeHolderEmail = new javax.swing.JLabel();
        placeHolderTelefone = new javax.swing.JLabel();
        placeHolderEmpresa = new javax.swing.JLabel();
        placeHolderCargo = new javax.swing.JLabel();
        placeHolderEndereco = new javax.swing.JLabel();
        placeHolderCidade = new javax.swing.JLabel();
        placeHolderCEP = new javax.swing.JLabel();
        jNomeField = new javax.swing.JTextField();
        jCpfField = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            jCpfField= new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }
        jEmailField = new javax.swing.JTextField();
        jTelefoneField = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter telefone= new javax.swing.text.MaskFormatter("(##) #####-####");
            jTelefoneField= new javax.swing.JFormattedTextField(telefone);
        }
        catch (Exception e){
        }
        jEmpresaField = new javax.swing.JTextField();
        jCargoField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jEnderecoField = new javax.swing.JTextField();
        jCidadeField = new javax.swing.JTextField();
        jCepField = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cep= new javax.swing.text.MaskFormatter("#####-###");
            jCepField= new javax.swing.JFormattedTextField(cep);
        }
        catch (Exception e){
        }
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        placeHolderPassword = new javax.swing.JLabel();
        placeHolderUsername = new javax.swing.JLabel();
        jUsernameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jNivelAcesso = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        setPreferredSize(new java.awt.Dimension(1700, 810));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 20, -1));

        placeHolderNome.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderNome.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderNome.setText("Digite seu nome completo....");
        placeHolderNome.setEnabled(false);
        placeHolderNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderNomeKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 510, 60));

        placeHolderCPF.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderCPF.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderCPF.setText("Digite seu CPF....");
        placeHolderCPF.setEnabled(false);
        placeHolderCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderCPFKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 510, 60));

        placeHolderEmail.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderEmail.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderEmail.setText("Digite seu E-mail....");
        placeHolderEmail.setEnabled(false);
        placeHolderEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderEmailKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 110, 510, 60));

        placeHolderTelefone.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderTelefone.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderTelefone.setText("Digite seu telefone....");
        placeHolderTelefone.setEnabled(false);
        placeHolderTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderTelefoneKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 510, 60));

        placeHolderEmpresa.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderEmpresa.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderEmpresa.setText("Empresa que trabalha....");
        placeHolderEmpresa.setEnabled(false);
        placeHolderEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderEmpresaKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 510, 60));

        placeHolderCargo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderCargo.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderCargo.setText("Seu cargo na empresa....");
        placeHolderCargo.setEnabled(false);
        placeHolderCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderCargoKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 190, 510, 60));

        placeHolderEndereco.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderEndereco.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderEndereco.setText("Digite seu endereço residencial....");
        placeHolderEndereco.setEnabled(false);
        placeHolderEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderEnderecoKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 510, 60));

        placeHolderCidade.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderCidade.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderCidade.setText("Cidade....");
        placeHolderCidade.setEnabled(false);
        placeHolderCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderCidadeKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 510, 60));

        placeHolderCEP.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderCEP.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderCEP.setText("CEP");
        placeHolderCEP.setEnabled(false);
        placeHolderCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderCEPKeyTyped(evt);
            }
        });
        jPanel1.add(placeHolderCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 510, 60));

        jNomeField.setBackground(new java.awt.Color(204, 255, 204));
        jNomeField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jNomeField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jNomeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jNomeFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jNomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 114, 520, 60));

        jCpfField.setBackground(new java.awt.Color(204, 255, 204));
        jCpfField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jCpfField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jCpfField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCpfFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jCpfField, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 114, 520, 60));

        jEmailField.setBackground(new java.awt.Color(204, 255, 204));
        jEmailField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jEmailField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jEmailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jEmailFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1107, 114, 520, 60));

        jTelefoneField.setBackground(new java.awt.Color(204, 255, 204));
        jTelefoneField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jTelefoneField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTelefoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTelefoneFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jTelefoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 192, 520, 60));

        jEmpresaField.setBackground(new java.awt.Color(204, 255, 204));
        jEmpresaField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jEmpresaField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jEmpresaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jEmpresaFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jEmpresaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 192, 520, 60));

        jCargoField.setBackground(new java.awt.Color(204, 255, 204));
        jCargoField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jCargoField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jCargoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCargoFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jCargoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1107, 192, 520, 60));

        jLabel2.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Endereço");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 294, -1, -1));

        jEnderecoField.setBackground(new java.awt.Color(204, 255, 204));
        jEnderecoField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jEnderecoField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jEnderecoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jEnderecoFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jEnderecoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 335, 1596, 60));

        jCidadeField.setBackground(new java.awt.Color(204, 255, 204));
        jCidadeField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jCidadeField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jCidadeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCidadeFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jCidadeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 413, 520, 60));

        jCepField.setBackground(new java.awt.Color(204, 255, 204));
        jCepField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jCepField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jCepField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCepFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jCepField, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 413, 520, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("*");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 160, 20, -1));

        jLabel7.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("*");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 20, -1));

        placeHolderPassword.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderPassword.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderPassword.setText("Senha....");
        placeHolderPassword.setEnabled(false);
        placeHolderPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderPasswordKeyTyped(evt);
            }
        });
        jPanel2.add(placeHolderPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 510, 60));

        placeHolderUsername.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        placeHolderUsername.setForeground(new java.awt.Color(153, 153, 153));
        placeHolderUsername.setText("Username... Ex: nome.sobrenome");
        placeHolderUsername.setEnabled(false);
        placeHolderUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placeHolderUsernameKeyTyped(evt);
            }
        });
        jPanel2.add(placeHolderUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 510, 60));

        jUsernameField.setBackground(new java.awt.Color(204, 255, 204));
        jUsernameField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jUsernameField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jUsernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jUsernameFieldKeyReleased(evt);
            }
        });

        /**
         * Obriga que campo UserName seja preenchido apenas com letras minúsculas
         */
        AbstractDocument doc = (AbstractDocument) jUsernameField.getDocument();
        doc.setDocumentFilter(new LowercaseDocumentFilter());

        jPanel2.add(jUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 29, 520, 60));

        jLabel8.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("*");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 50, 20, -1));

        jPasswordField.setBackground(new java.awt.Color(204, 255, 204));
        jPasswordField.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyReleased(evt);
            }
        });
        jPanel2.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 29, 520, 60));

        jLabel3.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Dados de Acesso");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));

        jNivelAcesso.setBackground(new java.awt.Color(204, 255, 204));
        jNivelAcesso.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jNivelAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o nível de acesso...", "Administrador", "Usuário comum" }));
        jPanel2.add(jNivelAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 430, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 522, 1712, -1));

        jLabel4.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Cadastrar novo usuário");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Obs: Todos os campos obrigatórios possuem o símbolo '*'. Por favor preencher corretamente.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 830, -1));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void placeHolderPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderPasswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderPasswordKeyTyped

    private void placeHolderCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderCPFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderCPFKeyTyped

    private void placeHolderNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderNomeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderNomeKeyTyped

    private void placeHolderEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderEmailKeyTyped

    private void placeHolderTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderTelefoneKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderTelefoneKeyTyped

    private void placeHolderEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderEmpresaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderEmpresaKeyTyped

    private void placeHolderCargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderCargoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderCargoKeyTyped

    private void placeHolderEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderEnderecoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderEnderecoKeyTyped

    private void placeHolderCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderCidadeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderCidadeKeyTyped

    private void placeHolderCEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderCEPKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderCEPKeyTyped

    private void placeHolderUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderUsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placeHolderUsernameKeyTyped

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

    private void jCpfFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCpfFieldKeyReleased
        // TODO add your handling code here:
        if(jCpfField.getText().trim().isEmpty()) {
            placeHolderCPF.setVisible(true);
            placeHolderCPF.setEnabled(false);
        } else {
            placeHolderCPF.setVisible(false);
            placeHolderCPF.setEnabled(false);
        }
    }//GEN-LAST:event_jCpfFieldKeyReleased

    private void jEmailFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEmailFieldKeyReleased
        // TODO add your handling code here:
        if(jEmailField.getText().isEmpty()) {
            placeHolderEmail.setVisible(true);
            placeHolderEmail.setEnabled(false);
        } else {
            placeHolderEmail.setVisible(false);
            placeHolderEmail.setEnabled(false);
        }
    }//GEN-LAST:event_jEmailFieldKeyReleased

    private void jTelefoneFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelefoneFieldKeyReleased
        // TODO add your handling code here:
        if(jTelefoneField.getText().isEmpty()) {
            placeHolderTelefone.setVisible(true);
            placeHolderTelefone.setEnabled(false);
        } else {
            placeHolderTelefone.setVisible(false);
            placeHolderTelefone.setEnabled(false);
        }
    }//GEN-LAST:event_jTelefoneFieldKeyReleased

    private void jEmpresaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEmpresaFieldKeyReleased
        // TODO add your handling code here:
        if(jEmpresaField.getText().isEmpty()) {
            placeHolderEmpresa.setVisible(true);
            placeHolderEmpresa.setEnabled(false);
        } else {
            placeHolderEmpresa.setVisible(false);
            placeHolderEmpresa.setEnabled(false);
        }
    }//GEN-LAST:event_jEmpresaFieldKeyReleased

    private void jCargoFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCargoFieldKeyReleased
        // TODO add your handling code here:
        if(jCargoField.getText().isEmpty()) {
            placeHolderCargo.setVisible(true);
            placeHolderCargo.setEnabled(false);
        } else {
            placeHolderCargo.setVisible(false);
            placeHolderCargo.setEnabled(false);
        }
    }//GEN-LAST:event_jCargoFieldKeyReleased

    private void jEnderecoFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEnderecoFieldKeyReleased
        // TODO add your handling code here:
        if(jEnderecoField.getText().isEmpty()) {
            placeHolderEndereco.setVisible(true);
            placeHolderEndereco.setEnabled(false);
        } else {
            placeHolderEndereco.setVisible(false);
            placeHolderEndereco.setEnabled(false);
        }
    }//GEN-LAST:event_jEnderecoFieldKeyReleased

    private void jCidadeFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCidadeFieldKeyReleased
        // TODO add your handling code here:
        if(jCidadeField.getText().isEmpty()) {
            placeHolderCidade.setVisible(true);
            placeHolderCidade.setEnabled(false);
        } else {
            placeHolderCidade.setVisible(false);
            placeHolderCidade.setEnabled(false);
        }
    }//GEN-LAST:event_jCidadeFieldKeyReleased

    private void jCepFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCepFieldKeyReleased
        // TODO add your handling code here:
        if(jCepField.getText().isEmpty()) {
            placeHolderCEP.setVisible(true);
            placeHolderCEP.setEnabled(false);
        } else {
            placeHolderCEP.setVisible(false);
            placeHolderCEP.setEnabled(false);
        }
    }//GEN-LAST:event_jCepFieldKeyReleased

    private void jUsernameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUsernameFieldKeyReleased
        // TODO add your handling code here:
        if(jUsernameField.getText().isEmpty()) {
            placeHolderUsername.setVisible(true);
            placeHolderUsername.setEnabled(false);
        } else {
            placeHolderUsername.setVisible(false);
            placeHolderUsername.setEnabled(false);
        }
    }//GEN-LAST:event_jUsernameFieldKeyReleased

    private void jPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyReleased
        // TODO add your handling code here:
        if (new String(jPasswordField.getPassword()).isEmpty()) {
            placeHolderPassword.setVisible(true);
            placeHolderPassword.setEnabled(false);
        } else {
            placeHolderPassword.setVisible(false);
            placeHolderPassword.setEnabled(false);
        }
    }//GEN-LAST:event_jPasswordFieldKeyReleased

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:


        //Pegamos o conteúdo dos campos de cadastro da tela de AddUser e armazenamos cada valor na respectiva variável
        String nome  = jNomeField.getText();
        String cpf  = jCpfField.getText();
        String email  = jEmailField.getText();
        String telefone  = jTelefoneField.getText();
        String empresa  = jEmpresaField.getText();
        String cargo  = jCargoField.getText();
        String endereco  = jEnderecoField.getText();
        String cidade  = jCidadeField.getText();
        String cep = jCepField.getText();
        String username = jUsernameField.getText();
        String role = jNivelAcesso.getSelectedItem().toString();

        //Inicializamos a String que pegará o valor do campo password da tela de login
        String pass = "";

        //Pegamos o conteúdo do campo password e armazenamos na variável cadaCaractere,
        //para depois passarmos os caracteres para a variável pass
        char[] cadaCaractere = jPasswordField.getPassword();

        //O JPasswordField inputSenha.getPassword retorna uma array tipo char, e para armazenar os caracteres em uma string,
        //foi necessária a construção do seguinte FOR
        for(int i=0; i < jPasswordField.getPassword().length; i++) {
            if(jPasswordField.getPassword().length>0){
                pass = pass + cadaCaractere[i];
            }
        }

        boolean resultado = new AddUser(nome, cpf, email, telefone, empresa, cargo, endereco, cidade, cep, username, role, pass).cadastroResult();

        // Resetando os campos após o cadastro
        // verificar se não é melhor chamar os PlaceHolders de cada um
        if(resultado){
            jNomeField.setText(placeHolderNome.getText());
            jCpfField.setText(placeHolderCPF.getText());
            jEmailField.setText(placeHolderEmail.getText());
            jTelefoneField.setText(placeHolderTelefone.getText());
            jEmpresaField.setText(placeHolderEmpresa.getText());
            jCargoField.setText(placeHolderCargo.getText());
            jEnderecoField.setText(placeHolderEndereco.getText());
            jCidadeField.setText(placeHolderCidade.getText());
            jCepField.setText(placeHolderCEP.getText());
            jUsernameField.setText(placeHolderUsername.getText());
            jPasswordField.setText(placeHolderPassword.getText());
            jNivelAcesso.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(CadastroUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroUserDialog dialog = new CadastroUserDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField jCargoField;
    private javax.swing.JTextField jCepField;
    private javax.swing.JTextField jCidadeField;
    private javax.swing.JTextField jCpfField;
    private javax.swing.JTextField jEmailField;
    private javax.swing.JTextField jEmpresaField;
    private javax.swing.JTextField jEnderecoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jNivelAcesso;
    private javax.swing.JTextField jNomeField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTelefoneField;
    private javax.swing.JTextField jUsernameField;
    private javax.swing.JLabel placeHolderCEP;
    private javax.swing.JLabel placeHolderCPF;
    private javax.swing.JLabel placeHolderCargo;
    private javax.swing.JLabel placeHolderCidade;
    private javax.swing.JLabel placeHolderEmail;
    private javax.swing.JLabel placeHolderEmpresa;
    private javax.swing.JLabel placeHolderEndereco;
    private javax.swing.JLabel placeHolderNome;
    private javax.swing.JLabel placeHolderPassword;
    private javax.swing.JLabel placeHolderTelefone;
    private javax.swing.JLabel placeHolderUser;
    private javax.swing.JLabel placeHolderUsername;
    // End of variables declaration//GEN-END:variables
}
