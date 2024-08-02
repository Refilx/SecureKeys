/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.securekeys.views.UserComum;

import br.com.securekeys.DAO.LogsDAO;
import br.com.securekeys.model.Logs;
import br.com.securekeys.views.*;
import br.com.securekeys.views.formScreen.VisualizarHistoricoDialog;
import br.com.securekeys.views.formScreen.CadastroUserDialog;
import java.awt.Color;
import java.awt.Cursor;
import java.net.URL;
import javax.swing.*;

import br.com.securekeys.views.formScreen.CadastroSalaDialog;
import br.com.securekeys.views.formScreen.VisualizarSalasDialog;
import br.com.securekeys.views.formScreen.VisualizarUserDialog;

/**
 *
 * @author adimael
 */
public class DashboardScreen extends javax.swing.JFrame {

    /**
     * Creates new form DashboardScreen
     */
    public DashboardScreen() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
                
        URL txtBemVindo = getClass().getClassLoader().getResource("br/com/securekeys/icons/image 3.png");
                
        if (txtBemVindo != null) {
            jLabelBemVindo.setIcon(new ImageIcon(txtBemVindo));
        } else {
            System.out.println("icone Bem-vindo não foi encontrado!");
        }
        
        URL txtDashboardIcon = getClass().getClassLoader().getResource("br/com/securekeys/icons/data-analysis32.png");
        btnDashboard.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        if (txtDashboardIcon != null) {
            txtDashboard.setIcon(new ImageIcon(txtDashboardIcon));
        } else {
            System.out.println("icone do btnDashboard não foi encontrado!");
        }

        
        
        
        //Icon Menu Gerenciamento de Salas
        URL txtGenSalasIcon = getClass().getClassLoader().getResource("br/com/securekeys/icons/door.png");
        URL iconSeta2Icon = getClass().getClassLoader().getResource("br/com/securekeys/icons/left-arrow.png");
        URL txtAddSalaIcon = getClass().getClassLoader().getResource("br/com/securekeys/icons/door (1).png");
        URL txtVisualizarSalaIcon = getClass().getClassLoader().getResource("br/com/securekeys/icons/man (1).png");
        URL txtHistoricoChavesIcon = getClass().getClassLoader().getResource("br/com/securekeys/icons/hold_2921771.png");
        btnMenuGenSalas.setCursor(new Cursor(Cursor.HAND_CURSOR));
        itemAddSala.setCursor(new Cursor(Cursor.HAND_CURSOR));
        itemVisualizarSalas.setCursor(new Cursor(Cursor.HAND_CURSOR));
        itemHistoricoChaves.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        if (txtGenSalasIcon != null && iconSeta2Icon != null && txtAddSalaIcon != null && txtVisualizarSalaIcon != null && txtHistoricoChavesIcon != null) {
            txtGenSalas.setIcon(new ImageIcon(txtGenSalasIcon));
            iconSeta2.setIcon(new ImageIcon(iconSeta2Icon));
            txtAddSala.setIcon(new ImageIcon(txtAddSalaIcon));
            txtVisualizarSala.setIcon(new ImageIcon(txtVisualizarSalaIcon));
            txtHistoricoChaves.setIcon(new ImageIcon(txtHistoricoChavesIcon));
        } else {
            System.out.println("Icone Menu Gerenciamento de chaves não foi encontrado!");
        }
        
        //Icon Menu do Perfil do Usuário
        URL txtNomeUserIcon = getClass().getClassLoader().getResource("br/com/securekeys/icons/man_4140037.png");
        URL txtSeta3Icon = getClass().getClassLoader().getResource("br/com/securekeys/icons/left-arrow.png");
        URL txtPerfilIcon = getClass().getClassLoader().getResource("br/com/securekeys/icons/user32.png");
        URL txtConfiguraçõesIcon = getClass().getClassLoader().getResource("br/com/securekeys/icons/settings.png");
        URL txtSuporteIcon = getClass().getClassLoader().getResource("br/com/securekeys/icons/request (1).png");
        URL txtSairIcon = getClass().getClassLoader().getResource("br/com/securekeys/icons/check-out (1).png");
        btnMenuUser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        itemPerfil.setCursor(new Cursor(Cursor.HAND_CURSOR));
        itemConfigurações.setCursor(new Cursor(Cursor.HAND_CURSOR));
        itemSuporte.setCursor(new Cursor(Cursor.HAND_CURSOR));
        itemSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        if (txtNomeUserIcon != null && txtSeta3Icon != null && txtPerfilIcon != null && txtConfiguraçõesIcon != null && txtSuporteIcon != null && txtSairIcon != null) {
            txtNomeUser.setIcon(new ImageIcon(txtNomeUserIcon));
            txtSeta3.setIcon(new ImageIcon(txtSeta3Icon));
            txtPerfil.setIcon(new ImageIcon(txtPerfilIcon));
            txtConfigurações.setIcon(new ImageIcon(txtConfiguraçõesIcon));
            txtSuporte.setIcon(new ImageIcon(txtSuporteIcon));
            txtSair.setIcon(new ImageIcon(txtSairIcon));
        } else {
            System.out.println("Icone Menu do usuário não foi encontrado!");
        }

        LogsDAO logsDAO = new LogsDAO();

        logDoUsuario = logsDAO.getUltimoLogado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JPanel();
        txtDashboard = new javax.swing.JLabel();
        btnMenuGenSalas = new javax.swing.JPanel();
        txtGenSalas = new javax.swing.JLabel();
        iconSeta2 = new javax.swing.JLabel();
        btnMenuUser = new javax.swing.JPanel();
        txtNomeUser = new javax.swing.JLabel();
        txtSeta3 = new javax.swing.JLabel();
        jmenu1 = new javax.swing.JPanel();
        itemAddSala = new javax.swing.JPanel();
        txtAddSala = new javax.swing.JLabel();
        itemVisualizarSalas = new javax.swing.JPanel();
        txtVisualizarSala = new javax.swing.JLabel();
        itemHistoricoChaves = new javax.swing.JPanel();
        txtHistoricoChaves = new javax.swing.JLabel();
        jmenu2 = new javax.swing.JPanel();
        itemPerfil = new javax.swing.JPanel();
        txtPerfil = new javax.swing.JLabel();
        itemConfigurações = new javax.swing.JPanel();
        txtConfigurações = new javax.swing.JLabel();
        itemSuporte = new javax.swing.JPanel();
        txtSuporte = new javax.swing.JLabel();
        itemSair = new javax.swing.JPanel();
        txtSair = new javax.swing.JLabel();
        jLabelBemVindo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1320, 820));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnDashboard.setBackground(new java.awt.Color(255, 255, 255));
        btnDashboard.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardMouseExited(evt);
            }
        });

        txtDashboard.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        txtDashboard.setForeground(new java.awt.Color(51, 51, 51));
        txtDashboard.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/data-analysis32.png"))); // NOI18N
        txtDashboard.setText("Dashboard");

        javax.swing.GroupLayout btnDashboardLayout = new javax.swing.GroupLayout(btnDashboard);
        btnDashboard.setLayout(btnDashboardLayout);
        btnDashboardLayout.setHorizontalGroup(
            btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDashboard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDashboardLayout.setVerticalGroup(
            btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDashboard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnMenuGenSalas.setBackground(new java.awt.Color(255, 255, 255));
        btnMenuGenSalas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnMenuGenSalas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuGenSalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuGenSalasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuGenSalasMouseExited(evt);
            }
        });

        txtGenSalas.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        txtGenSalas.setForeground(new java.awt.Color(51, 51, 51));
        txtGenSalas.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/door.png"))); // NOI18N
        txtGenSalas.setText("Gen. Salas");

        iconSeta2.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/left-arrow.png"))); // NOI18N

        javax.swing.GroupLayout btnMenuGenSalasLayout = new javax.swing.GroupLayout(btnMenuGenSalas);
        btnMenuGenSalas.setLayout(btnMenuGenSalasLayout);
        btnMenuGenSalasLayout.setHorizontalGroup(
            btnMenuGenSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMenuGenSalasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtGenSalas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconSeta2)
                .addGap(10, 10, 10))
        );
        btnMenuGenSalasLayout.setVerticalGroup(
            btnMenuGenSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMenuGenSalasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(btnMenuGenSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGenSalas)
                    .addComponent(iconSeta2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnMenuUser.setBackground(new java.awt.Color(255, 255, 255));
        btnMenuUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuUserMouseExited(evt);
            }
        });

        txtNomeUser.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        txtNomeUser.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/man_4140037.png"))); // NOI18N
        txtNomeUser.setText("fulano.silva");

        txtSeta3.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/left-arrow.png"))); // NOI18N

        javax.swing.GroupLayout btnMenuUserLayout = new javax.swing.GroupLayout(btnMenuUser);
        btnMenuUser.setLayout(btnMenuUserLayout);
        btnMenuUserLayout.setHorizontalGroup(
            btnMenuUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMenuUserLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(txtNomeUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSeta3))
        );
        btnMenuUserLayout.setVerticalGroup(
            btnMenuUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMenuUserLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(btnMenuUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeUser)
                    .addComponent(txtSeta3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenuGenSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenuUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuGenSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(198, 198, 198))
        );

        jmenu1.setBackground(new java.awt.Color(255, 255, 255));
        jmenu1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jmenu1.setPreferredSize(new java.awt.Dimension(242, 126));
        jmenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jmenu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jmenu1MouseExited(evt);
            }
        });

        itemAddSala.setBackground(new java.awt.Color(255, 255, 255));
        itemAddSala.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        itemAddSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemAddSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemAddSalaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemAddSalaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemAddSalaMouseExited(evt);
            }
        });

        txtAddSala.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        txtAddSala.setForeground(new java.awt.Color(51, 51, 51));
        txtAddSala.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/door (1).png"))); // NOI18N
        txtAddSala.setText("Add sala");
        txtAddSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout itemAddSalaLayout = new javax.swing.GroupLayout(itemAddSala);
        itemAddSala.setLayout(itemAddSalaLayout);
        itemAddSalaLayout.setHorizontalGroup(
            itemAddSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemAddSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAddSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        itemAddSalaLayout.setVerticalGroup(
            itemAddSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemAddSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAddSala)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        itemVisualizarSalas.setBackground(new java.awt.Color(255, 255, 255));
        itemVisualizarSalas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        itemVisualizarSalas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemVisualizarSalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemVisualizarSalasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemVisualizarSalasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemVisualizarSalasMouseExited(evt);
            }
        });

        txtVisualizarSala.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        txtVisualizarSala.setForeground(new java.awt.Color(51, 51, 51));
        txtVisualizarSala.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/man (1).png"))); // NOI18N
        txtVisualizarSala.setText("Visualizar salas");
        txtVisualizarSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout itemVisualizarSalasLayout = new javax.swing.GroupLayout(itemVisualizarSalas);
        itemVisualizarSalas.setLayout(itemVisualizarSalasLayout);
        itemVisualizarSalasLayout.setHorizontalGroup(
            itemVisualizarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemVisualizarSalasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtVisualizarSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        itemVisualizarSalasLayout.setVerticalGroup(
            itemVisualizarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemVisualizarSalasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtVisualizarSala)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        itemHistoricoChaves.setBackground(new java.awt.Color(255, 255, 255));
        itemHistoricoChaves.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        itemHistoricoChaves.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemHistoricoChaves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemHistoricoChavesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemHistoricoChavesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemHistoricoChavesMouseExited(evt);
            }
        });

        txtHistoricoChaves.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        txtHistoricoChaves.setForeground(new java.awt.Color(51, 51, 51));
        txtHistoricoChaves.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/hold_2921771.png"))); // NOI18N
        txtHistoricoChaves.setText("Histórico de chaves");
        txtHistoricoChaves.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout itemHistoricoChavesLayout = new javax.swing.GroupLayout(itemHistoricoChaves);
        itemHistoricoChaves.setLayout(itemHistoricoChavesLayout);
        itemHistoricoChavesLayout.setHorizontalGroup(
            itemHistoricoChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemHistoricoChavesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHistoricoChaves, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
        );
        itemHistoricoChavesLayout.setVerticalGroup(
            itemHistoricoChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemHistoricoChavesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHistoricoChaves)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jmenu1Layout = new javax.swing.GroupLayout(jmenu1);
        jmenu1.setLayout(jmenu1Layout);
        jmenu1Layout.setHorizontalGroup(
            jmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemHistoricoChaves, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemVisualizarSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemAddSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 53, Short.MAX_VALUE))
        );
        jmenu1Layout.setVerticalGroup(
            jmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jmenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemAddSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemVisualizarSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemHistoricoChaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmenu2.setBackground(new java.awt.Color(255, 255, 255));
        jmenu2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jmenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jmenu2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jmenu2MouseExited(evt);
            }
        });

        itemPerfil.setBackground(new java.awt.Color(255, 255, 255));
        itemPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        itemPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemPerfilMouseExited(evt);
            }
        });

        txtPerfil.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        txtPerfil.setForeground(new java.awt.Color(102, 102, 102));
        txtPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPerfil.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/user32.png"))); // NOI18N
        txtPerfil.setText("Perfil");
        txtPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout itemPerfilLayout = new javax.swing.GroupLayout(itemPerfil);
        itemPerfil.setLayout(itemPerfilLayout);
        itemPerfilLayout.setHorizontalGroup(
            itemPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        itemPerfilLayout.setVerticalGroup(
            itemPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        itemConfigurações.setBackground(new java.awt.Color(255, 255, 255));
        itemConfigurações.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        itemConfigurações.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemConfigurações.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemConfiguraçõesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemConfiguraçõesMouseExited(evt);
            }
        });

        txtConfigurações.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        txtConfigurações.setForeground(new java.awt.Color(102, 102, 102));
        txtConfigurações.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtConfigurações.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/settings.png"))); // NOI18N
        txtConfigurações.setText("Configurações");
        txtConfigurações.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtConfigurações.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout itemConfiguraçõesLayout = new javax.swing.GroupLayout(itemConfigurações);
        itemConfigurações.setLayout(itemConfiguraçõesLayout);
        itemConfiguraçõesLayout.setHorizontalGroup(
            itemConfiguraçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConfigurações, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        itemConfiguraçõesLayout.setVerticalGroup(
            itemConfiguraçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConfigurações, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        itemSuporte.setBackground(new java.awt.Color(255, 255, 255));
        itemSuporte.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        itemSuporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemSuporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemSuporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemSuporteMouseExited(evt);
            }
        });

        txtSuporte.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        txtSuporte.setForeground(new java.awt.Color(102, 102, 102));
        txtSuporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSuporte.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/request (1).png"))); // NOI18N
        txtSuporte.setText("Suporte");
        txtSuporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSuporte.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout itemSuporteLayout = new javax.swing.GroupLayout(itemSuporte);
        itemSuporte.setLayout(itemSuporteLayout);
        itemSuporteLayout.setHorizontalGroup(
            itemSuporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSuporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        itemSuporteLayout.setVerticalGroup(
            itemSuporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSuporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        itemSair.setBackground(new java.awt.Color(255, 255, 255));
        itemSair.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        itemSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemSairMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSairMouseClicked(evt);
            }
        });

        txtSair.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        txtSair.setForeground(new java.awt.Color(102, 102, 102));
        txtSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSair.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/check-out (1).png"))); // NOI18N
        txtSair.setText("Sair");
        txtSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout itemSairLayout = new javax.swing.GroupLayout(itemSair);
        itemSair.setLayout(itemSairLayout);
        itemSairLayout.setHorizontalGroup(
            itemSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        itemSairLayout.setVerticalGroup(
            itemSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jmenu2Layout = new javax.swing.GroupLayout(jmenu2);
        jmenu2.setLayout(jmenu2Layout);
        jmenu2Layout.setHorizontalGroup(
            jmenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmenu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jmenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemConfigurações, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemSuporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jmenu2Layout.setVerticalGroup(
            jmenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmenu2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(itemPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemConfigurações, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemSuporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelBemVindo.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        jLabelBemVindo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("br/com/securekeys/icons/image 3.png"))); // NOI18N
        jLabelBemVindo.setText("BEM-VINDO AO SECUREKEY");
        jLabelBemVindo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jmenu1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jmenu2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabelBemVindo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 581, Short.MAX_VALUE)
                .addComponent(jmenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBemVindo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jmenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(jLabelBemVindo)
                .addContainerGap(404, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
        // TODO add your handling code here:
        btnDashboard.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDashboardMouseEntered

    private void btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseExited
        // TODO add your handling code here:
        btnDashboard.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnDashboardMouseExited

    private void btnMenuGenSalasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuGenSalasMouseEntered
        jmenu1.setSize(306, 243);
        btnMenuGenSalas.setBackground(Color.LIGHT_GRAY);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        iconSeta2.setIcon(downArrowIcon);
    }//GEN-LAST:event_btnMenuGenSalasMouseEntered

    private void btnMenuGenSalasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuGenSalasMouseExited

    }//GEN-LAST:event_btnMenuGenSalasMouseExited

    private void jmenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmenu1MouseExited
        jmenu1.setSize(0, 180);
        btnMenuGenSalas.setBackground(Color.WHITE);
        URL Setaleft = getClass().getClassLoader().getResource("br/com/securekeys/icons/left-arrow.png");
        ImageIcon leftArrowIcon = new ImageIcon(Setaleft);
        iconSeta2.setIcon(leftArrowIcon);
    }//GEN-LAST:event_jmenu1MouseExited

    private void jmenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmenu1MouseEntered
        jmenu1.setSize(306, 243);
        btnMenuGenSalas.setBackground(Color.LIGHT_GRAY);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        iconSeta2.setIcon(downArrowIcon);
    }//GEN-LAST:event_jmenu1MouseEntered

    private void itemHistoricoChavesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemHistoricoChavesMouseExited
        itemHistoricoChaves.setBackground(Color.WHITE);
        URL Setaleft = getClass().getClassLoader().getResource("br/com/securekeys/icons/left-arrow.png");
        ImageIcon leftArrowIcon = new ImageIcon(Setaleft);
        iconSeta2.setIcon(leftArrowIcon);
    }//GEN-LAST:event_itemHistoricoChavesMouseExited

    private void itemHistoricoChavesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemHistoricoChavesMouseEntered
        jmenu1.setSize(306, 243);
        btnMenuGenSalas.setBackground(Color.LIGHT_GRAY);
        itemHistoricoChaves.setBackground(Color.LIGHT_GRAY);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        iconSeta2.setIcon(downArrowIcon);
    }//GEN-LAST:event_itemHistoricoChavesMouseEntered

    private void itemVisualizarSalasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemVisualizarSalasMouseExited
        itemVisualizarSalas.setBackground(Color.WHITE);
        URL Setaleft = getClass().getClassLoader().getResource("br/com/securekeys/icons/left-arrow.png");
        ImageIcon leftArrowIcon = new ImageIcon(Setaleft);
        iconSeta2.setIcon(leftArrowIcon);
    }//GEN-LAST:event_itemVisualizarSalasMouseExited

    private void itemVisualizarSalasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemVisualizarSalasMouseEntered
        jmenu1.setSize(306, 243);
        btnMenuGenSalas.setBackground(Color.LIGHT_GRAY);
        itemVisualizarSalas.setBackground(Color.LIGHT_GRAY);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        iconSeta2.setIcon(downArrowIcon);
    }//GEN-LAST:event_itemVisualizarSalasMouseEntered

    private void itemAddSalaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemAddSalaMouseExited
        itemAddSala.setBackground(Color.WHITE);
        URL Setaleft = getClass().getClassLoader().getResource("br/com/securekeys/icons/left-arrow.png");
        ImageIcon leftArrowIcon = new ImageIcon(Setaleft);
        iconSeta2.setIcon(leftArrowIcon);
    }//GEN-LAST:event_itemAddSalaMouseExited

    private void itemAddSalaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemAddSalaMouseEntered
        jmenu1.setSize(306, 243);
        btnMenuGenSalas.setBackground(Color.LIGHT_GRAY);
        itemAddSala.setBackground(Color.LIGHT_GRAY);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        iconSeta2.setIcon(downArrowIcon);
    }//GEN-LAST:event_itemAddSalaMouseEntered

    private void btnMenuUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuUserMouseEntered

    }//GEN-LAST:event_btnMenuUserMouseEntered

    private void itemPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemPerfilMouseEntered
        // TODO add your handling code here:
        jmenu2.setSize(270, 290);
        itemPerfil.setBackground(Color.LIGHT_GRAY);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        txtSeta3.setIcon(downArrowIcon);
    }//GEN-LAST:event_itemPerfilMouseEntered

    private void itemPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemPerfilMouseExited
        // TODO add your handling code here:
        itemPerfil.setBackground(Color.WHITE);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        txtSeta3.setIcon(downArrowIcon);
    }//GEN-LAST:event_itemPerfilMouseExited

    private void itemConfiguraçõesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemConfiguraçõesMouseEntered
        // TODO add your handling code here:
        jmenu2.setSize(270, 290);
        itemConfigurações.setBackground(Color.LIGHT_GRAY);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        txtSeta3.setIcon(downArrowIcon);
    }//GEN-LAST:event_itemConfiguraçõesMouseEntered

    private void itemConfiguraçõesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemConfiguraçõesMouseExited
        // TODO add your handling code here:
        itemConfigurações.setBackground(Color.WHITE);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        txtSeta3.setIcon(downArrowIcon);
    }//GEN-LAST:event_itemConfiguraçõesMouseExited

    private void itemSuporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSuporteMouseEntered
        // TODO add your handling code here:
        jmenu2.setSize(270, 290);
        itemSuporte.setBackground(Color.LIGHT_GRAY);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        txtSeta3.setIcon(downArrowIcon);
    }//GEN-LAST:event_itemSuporteMouseEntered

    private void itemSuporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSuporteMouseExited
        // TODO add your handling code here:
        itemSuporte.setBackground(Color.WHITE);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        txtSeta3.setIcon(downArrowIcon);
    }//GEN-LAST:event_itemSuporteMouseExited

    private void itemSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSairMouseEntered
        // TODO add your handling code here:
        jmenu2.setSize(270, 290);
        itemSair.setBackground(Color.LIGHT_GRAY);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        txtSeta3.setIcon(downArrowIcon);
    }//GEN-LAST:event_itemSairMouseEntered

    private void itemSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSairMouseExited
        // TODO add your handling code here:
        itemSair.setBackground(Color.WHITE);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        txtSeta3.setIcon(downArrowIcon);
    }//GEN-LAST:event_itemSairMouseExited

    private void itemSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:

        int opcao = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair?", "Confirmação",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Sim", "Não"}, null);

        //Se o usuário selecionar a opção "Sim", a aplicação irá fechar a tela de dashboard e voltar para a tela de login
        if(opcao == 0){
            LogsDAO logsDAO = new LogsDAO();
            logsDAO.saveLogout(logDoUsuario);

            this.dispose();

            LoginScreen loginScreen = new LoginScreen();
            loginScreen.setVisible(true);
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnMenuUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuUserMouseExited

    }//GEN-LAST:event_btnMenuUserMouseExited

    private void jmenu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmenu2MouseEntered
        // TODO add your handling code here:
        jmenu2.setSize(270, 290);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        txtSeta3.setIcon(downArrowIcon);
    }//GEN-LAST:event_jmenu2MouseEntered

    private void jmenu2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmenu2MouseExited
        // TODO add your handling code here:
        jmenu2.setSize(0, 180);
        URL Setaleft = getClass().getClassLoader().getResource("br/com/securekeys/icons/left-arrow.png");
        ImageIcon leftArrowIcon = new ImageIcon(Setaleft);
        txtSeta3.setIcon(leftArrowIcon);
    }//GEN-LAST:event_jmenu2MouseExited

    private void btnMenuUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuUserMouseClicked
        // TODO add your handling code here:
        jmenu2.setSize(270, 290);
        URL SetaDown = getClass().getClassLoader().getResource("br/com/securekeys/icons/down-arrow.png");
        ImageIcon downArrowIcon = new ImageIcon(SetaDown);
        txtSeta3.setIcon(downArrowIcon);
    }//GEN-LAST:event_btnMenuUserMouseClicked

    private void itemAddSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemAddSalaMouseClicked
        // TODO add your handling code here:
        CadastroSalaDialog cadastroSala = new CadastroSalaDialog(new javax.swing.JFrame(), true);
        cadastroSala.setVisible(true);
    }//GEN-LAST:event_itemAddSalaMouseClicked

    private void itemVisualizarSalasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemVisualizarSalasMouseClicked
        // TODO add your handling code here:
        VisualizarSalasDialog visualizarSalas = new VisualizarSalasDialog(new javax.swing.JFrame(), true);
        visualizarSalas.setVisible(true);
    }//GEN-LAST:event_itemVisualizarSalasMouseClicked

    private void itemHistoricoChavesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemHistoricoChavesMouseClicked
        // TODO add your handling code here:
        VisualizarHistoricoDialog visualizarHistorico = new VisualizarHistoricoDialog(new javax.swing.JFrame(), true);
        visualizarHistorico.setVisible(true);
    }//GEN-LAST:event_itemHistoricoChavesMouseClicked

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
            java.util.logging.Logger.getLogger(DashboardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DashboardScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDashboard;
    private javax.swing.JPanel btnMenuGenSalas;
    private javax.swing.JPanel btnMenuUser;
    private javax.swing.JLabel iconSeta2;
    private javax.swing.JPanel itemAddSala;
    private javax.swing.JPanel itemConfigurações;
    private javax.swing.JPanel itemHistoricoChaves;
    private javax.swing.JPanel itemPerfil;
    private javax.swing.JPanel itemSair;
    private javax.swing.JPanel itemSuporte;
    private javax.swing.JPanel itemVisualizarSalas;
    private javax.swing.JLabel jLabelBemVindo;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jmenu1;
    private javax.swing.JPanel jmenu2;
    private javax.swing.JLabel txtAddSala;
    private javax.swing.JLabel txtConfigurações;
    private javax.swing.JLabel txtDashboard;
    private javax.swing.JLabel txtGenSalas;
    private javax.swing.JLabel txtHistoricoChaves;
    private javax.swing.JLabel txtNomeUser;
    private javax.swing.JLabel txtPerfil;
    private javax.swing.JLabel txtSair;
    private javax.swing.JLabel txtSeta3;
    private javax.swing.JLabel txtSuporte;
    private javax.swing.JLabel txtVisualizarSala;

    private Logs logDoUsuario;
    // End of variables declaration//GEN-END:variables
}
