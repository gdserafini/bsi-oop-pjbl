package com.mycompany.intefacegraficadelegacia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import classes.Department;
import javax.swing.*;
import database.Database;
import entity.Case;
import exception.DatabasePersistenceException;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import classes.Policial;
import main.Cadastro;


/**
 *
 * @author julia
 */
public class IGCaso extends javax.swing.JFrame { //Usar o codigo de Cadastro nesta interface, as outras podem continuar como estão

    /**
     * Creates new form IGCaso
     */
    public IGCaso() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoBranco = new javax.swing.JPanel();
        inputNumCaso = new javax.swing.JTextField();
        textoDtAbert = new javax.swing.JLabel();
        logoDel = new javax.swing.JLabel();
        inputDtAbert = new javax.swing.JTextField();
        textoDel = new javax.swing.JLabel();
        textoID = new javax.swing.JLabel();
        cadCasoBtn = new javax.swing.JButton();
        textoStatus = new javax.swing.JLabel();
        linhaCc = new javax.swing.JPanel();
        linhaAe = new javax.swing.JPanel();
        textoCaso = new javax.swing.JLabel();
        btnInicioLinha = new javax.swing.JButton();
        btnDelLinha = new javax.swing.JButton();
        btnServicosLinha = new javax.swing.JButton();
        inputID = new javax.swing.JTextField();
        inputStatus = new javax.swing.JTextField();
        textonNumCaso = new javax.swing.JLabel();
        VoltarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundoBranco.setBackground(new java.awt.Color(255, 255, 255));

        inputNumCaso.setForeground(new java.awt.Color(66, 80, 81));

        textoDtAbert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textoDtAbert.setForeground(new java.awt.Color(66, 80, 81));
        textoDtAbert.setText("DATA DE ABERTURA:");

        logoDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.png"))); // NOI18N

        inputDtAbert.setForeground(new java.awt.Color(66, 80, 81));
        inputDtAbert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDtAbertActionPerformed(evt);
            }
        });

        textoDel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textoDel.setForeground(new java.awt.Color(66, 80, 81));
        textoDel.setText("DELEGACIA");

        textoID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textoID.setForeground(new java.awt.Color(66, 80, 81));
        textoID.setText("ID DO CASO:");

        cadCasoBtn.setBackground(new java.awt.Color(242, 242, 242));
        cadCasoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cadCasoBtn.setForeground(new java.awt.Color(66, 80, 81));
        cadCasoBtn.setText("CADASTRAR CASO");
        cadCasoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCasoBtnActionPerformed(evt);
            }
        });

        textoStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textoStatus.setForeground(new java.awt.Color(66, 80, 81));
        textoStatus.setText("STATUS:");

        linhaAe.setBackground(new java.awt.Color(66, 80, 81));
        linhaAe.setForeground(new java.awt.Color(66, 80, 81));

        javax.swing.GroupLayout linhaAeLayout = new javax.swing.GroupLayout(linhaAe);
        linhaAe.setLayout(linhaAeLayout);
        linhaAeLayout.setHorizontalGroup(
            linhaAeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        linhaAeLayout.setVerticalGroup(
            linhaAeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        textoCaso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textoCaso.setForeground(new java.awt.Color(66, 80, 81));
        textoCaso.setText("CADASTRAR CASO");

        btnInicioLinha.setBackground(new java.awt.Color(242, 242, 242));
        btnInicioLinha.setForeground(new java.awt.Color(66, 80, 81));
        btnInicioLinha.setText("Início");
        btnInicioLinha.setBorder(null);
        btnInicioLinha.setBorderPainted(false);
        btnInicioLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioLinhaActionPerformed(evt);
            }
        });

        btnDelLinha.setBackground(new java.awt.Color(242, 242, 242));
        btnDelLinha.setForeground(new java.awt.Color(66, 80, 81));
        btnDelLinha.setText("Delegacia");
        btnDelLinha.setBorder(null);
        btnDelLinha.setBorderPainted(false);
        btnDelLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelLinhaActionPerformed(evt);
            }
        });

        btnServicosLinha.setBackground(new java.awt.Color(242, 242, 242));
        btnServicosLinha.setForeground(new java.awt.Color(66, 80, 81));
        btnServicosLinha.setText("Serviços");
        btnServicosLinha.setBorder(null);
        btnServicosLinha.setBorderPainted(false);
        btnServicosLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicosLinhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout linhaCcLayout = new javax.swing.GroupLayout(linhaCc);
        linhaCc.setLayout(linhaCcLayout);
        linhaCcLayout.setHorizontalGroup(
            linhaCcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(linhaAe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(linhaCcLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(textoCaso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicioLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnDelLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnServicosLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        linhaCcLayout.setVerticalGroup(
            linhaCcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linhaCcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(linhaAe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(linhaCcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnServicosLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicioLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCaso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputID.setForeground(new java.awt.Color(66, 80, 81));
        inputID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDActionPerformed(evt);
            }
        });

        inputStatus.setForeground(new java.awt.Color(66, 80, 81));
        inputStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputStatusActionPerformed(evt);
            }
        });

        textonNumCaso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textonNumCaso.setForeground(new java.awt.Color(66, 80, 81));
        textonNumCaso.setText("NÚMERO DO CASO:");

        VoltarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seta.png"))); // NOI18N
        VoltarBtn.setBorder(null);
        VoltarBtn.setOpaque(true);
        VoltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundoBrancoLayout = new javax.swing.GroupLayout(fundoBranco);
        fundoBranco.setLayout(fundoBrancoLayout);
        fundoBrancoLayout.setHorizontalGroup(
            fundoBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(linhaCc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fundoBrancoLayout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addGroup(fundoBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoDtAbert)
                    .addGroup(fundoBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(fundoBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textonNumCaso)
                            .addGroup(fundoBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inputNumCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(fundoBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoID)
                                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(inputDtAbert, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textoStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoBrancoLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(fundoBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoBrancoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(299, 299, 299))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoBrancoLayout.createSequentialGroup()
                        .addComponent(VoltarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(logoDel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoDel)
                        .addGap(962, 962, 962))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoBrancoLayout.createSequentialGroup()
                        .addComponent(cadCasoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(385, 385, 385))))
        );
        fundoBrancoLayout.setVerticalGroup(
            fundoBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoBrancoLayout.createSequentialGroup()
                .addGroup(fundoBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoBrancoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(textoDel))
                    .addGroup(fundoBrancoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(logoDel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundoBrancoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(VoltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(linhaCc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(textoID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fundoBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoBrancoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(textonNumCaso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNumCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoDtAbert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputDtAbert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(textoStatus)
                        .addGap(8, 8, 8)
                        .addComponent(inputStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(cadCasoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fundoBrancoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadCasoBtnActionPerformed(java.awt.event.ActionEvent evt) {

        if (inputNumCaso.getText().isEmpty() || inputID.getText().isEmpty() || inputDtAbert.getText().isEmpty() ||
                inputStatus.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite todos os dados!");
        } else {
            Cadastro.salvaCaso(Integer.parseInt(inputID.getText()), inputNumCaso.getText(), inputDtAbert.getText(), inputStatus.getText());
            JOptionPane.showMessageDialog(null, "Dados Cadastrados!");
            Servicos servicosPage = new Servicos(); // Supondo que IGCadastrarDepartamento é uma classe que representa a página de cadastro de departamento.
            servicosPage.setVisible(true);
            this.dispose();
        }
    }


    private void btnInicioLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioLinhaActionPerformed
        IGInicio inicioPage = new IGInicio(); // Supondo que IGCadastrarDepartamento é uma classe que representa a página de cadastro de departamento.
        inicioPage.setVisible(true);
        this.dispose();
        btnInicioLinha.setVisible(false);
    }//GEN-LAST:event_btnInicioLinhaActionPerformed

    private void btnDelLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelLinhaActionPerformed
        IGDelegacia delegaciaPage = new IGDelegacia(); // Supondo que IGCadastrarDepartamento é uma classe que representa a página de cadastro de departamento.
        delegaciaPage.setVisible(true);
        this.dispose();
        btnDelLinha.setVisible(false);     }//GEN-LAST:event_btnDelLinhaActionPerformed

    private void btnServicosLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicosLinhaActionPerformed
        Servicos servicosPage = new Servicos(); // Supondo que IGCadastrarDepartamento é uma classe que representa a página de cadastro de departamento.
        servicosPage.setVisible(true);
        this.dispose();
        btnServicosLinha.setVisible(false);
    }//GEN-LAST:event_btnServicosLinhaActionPerformed

    private void inputIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDActionPerformed

    private void VoltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtnActionPerformed
        Servicos servicosPage = new Servicos(); // Supondo que IGCadastrarDepartamento é uma classe que representa a página de cadastro de departamento.
        servicosPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarBtnActionPerformed

    private void inputDtAbertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDtAbertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDtAbertActionPerformed

    private void inputStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputStatusActionPerformed
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
            java.util.logging.Logger.getLogger(IGCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IGCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IGCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IGCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                IGCaso formulario = new IGCaso();
                    formulario.setVisible(true);
                }
            });
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IGCaso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VoltarBtn;
    private javax.swing.JButton btnDelLinha;
    private javax.swing.JButton btnInicioLinha;
    private javax.swing.JButton btnServicosLinha;
    private javax.swing.JButton cadCasoBtn;
    private javax.swing.JPanel fundoBranco;
    private javax.swing.JTextField inputDtAbert;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputNumCaso;
    private javax.swing.JTextField inputStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel linhaAe;
    private javax.swing.JPanel linhaCc;
    private javax.swing.JLabel logoDel;
    private javax.swing.JLabel textoCaso;
    private javax.swing.JLabel textoDel;
    private javax.swing.JLabel textoDtAbert;
    private javax.swing.JLabel textoID;
    private javax.swing.JLabel textoStatus;
    private javax.swing.JLabel textonNumCaso;
    // End of variables declaration//GEN-END:variables

}
