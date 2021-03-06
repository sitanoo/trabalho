/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.CardLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import viwes.Agenda;
import viwes.CadastroColaborador;

/**
 *
 * @author Aluno
 */
public class FramePrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
        
        
        Agenda ag = new Agenda();
        CadastroColaborador cad = new CadastroColaborador();
        

        PainelPrincipal.add(ag, "agenda");
        PainelPrincipal.add(cad, "cadColab");
        PainelPrincipal.add(loginPrincipal, "login");
        PainelPrincipal.add(menuPrincipal, "menuPrincipal");
        

        //Chamar a tela padrão aqui
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
        cl.show(PainelPrincipal, "login");
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        menuPrincipal = new javax.swing.JPanel();
        btnEditarColaborador = new javax.swing.JButton();
        lbTarefa = new javax.swing.JLabel();
        btnEliminarColaborador = new javax.swing.JButton();
        btnAdicionarTarefa = new javax.swing.JButton();
        btnEliminarTarefa = new javax.swing.JButton();
        btnEditarTarefa = new javax.swing.JButton();
        btnListarColaborador = new javax.swing.JButton();
        lbAgenda = new javax.swing.JLabel();
        btnAgendaColaborador = new javax.swing.JButton();
        btnAgendaEquipe = new javax.swing.JButton();
        lbEquipe = new javax.swing.JLabel();
        lbSistema = new javax.swing.JLabel();
        BtnCadastrarEquipe = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnEditarEquipe = new javax.swing.JButton();
        lbColaborador = new javax.swing.JLabel();
        btnEliminarEquipe = new javax.swing.JButton();
        btnCadastrarColaborador = new javax.swing.JButton();
        btnListarEquipe = new javax.swing.JButton();
        loginPrincipal = new javax.swing.JPanel();
        labelUsuario2 = new javax.swing.JLabel();
        labelSenha2 = new javax.swing.JLabel();
        cpUsuario2 = new javax.swing.JTextField();
        labelLogin = new javax.swing.JLabel();
        cpSenha = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelPrincipal.setLayout(new java.awt.CardLayout());

        btnEditarColaborador.setText("Editar");
        btnEditarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarColaboradorActionPerformed(evt);
            }
        });

        lbTarefa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbTarefa.setText("Tarefas");

        btnEliminarColaborador.setText("Eliminar");

        btnAdicionarTarefa.setText("Adicionar");

        btnEliminarTarefa.setText("Eliminar");

        btnEditarTarefa.setText("Editar");

        btnListarColaborador.setText("Listar");

        lbAgenda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbAgenda.setText("Agenda");

        btnAgendaColaborador.setText("Agenda Colaborador");
        btnAgendaColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaColaboradorActionPerformed(evt);
            }
        });

        btnAgendaEquipe.setText("Agenda Equipe");

        lbEquipe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbEquipe.setText("Equipe");

        lbSistema.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbSistema.setText("Sistema");

        BtnCadastrarEquipe.setText("Cadastrar");
        BtnCadastrarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarEquipeActionPerformed(evt);
            }
        });

        btnEditarEquipe.setText("Editar");

        lbColaborador.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbColaborador.setText("Colaborador");

        btnEliminarEquipe.setText("Eliminar");

        btnCadastrarColaborador.setText("Cadastrar");
        btnCadastrarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarColaboradorActionPerformed(evt);
            }
        });

        btnListarEquipe.setText("Listar");

        javax.swing.GroupLayout menuPrincipalLayout = new javax.swing.GroupLayout(menuPrincipal);
        menuPrincipal.setLayout(menuPrincipalLayout);
        menuPrincipalLayout.setHorizontalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPrincipalLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditarColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListarColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgendaColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(menuPrincipalLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lbColaborador))
                            .addComponent(btnAgendaEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrarColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(menuPrincipalLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lbAgenda)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPrincipalLayout.createSequentialGroup()
                            .addComponent(lbEquipe)
                            .addGap(98, 98, 98))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPrincipalLayout.createSequentialGroup()
                            .addComponent(lbTarefa)
                            .addGap(95, 95, 95))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPrincipalLayout.createSequentialGroup()
                            .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnCadastrarEquipe)
                                .addComponent(btnAdicionarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEditarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnListarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(82, 82, 82)))
                    .addComponent(btnEditarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(lbSistema)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        menuPrincipalLayout.setVerticalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarColaborador)
                    .addComponent(BtnCadastrarEquipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarColaborador)
                    .addComponent(btnEditarEquipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarColaborador)
                    .addComponent(btnEliminarEquipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarColaborador)
                    .addComponent(btnListarEquipe))
                .addGap(41, 41, 41)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgendaColaborador)
                    .addComponent(btnAdicionarTarefa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgendaEquipe)
                    .addComponent(btnEliminarTarefa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarTarefa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelPrincipal.add(menuPrincipal, "card2");

        labelUsuario2.setText("Usuário:");

        labelSenha2.setText("Senha:");

        cpUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpUsuario2ActionPerformed(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelLogin.setText("Login");

        cpSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpSenhaActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPrincipalLayout = new javax.swing.GroupLayout(loginPrincipal);
        loginPrincipal.setLayout(loginPrincipalLayout);
        loginPrincipalLayout.setHorizontalGroup(
            loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPrincipalLayout.createSequentialGroup()
                .addGap(0, 136, Short.MAX_VALUE)
                .addGroup(loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSenha2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelUsuario2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cpUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(loginPrincipalLayout.createSequentialGroup()
                            .addComponent(btnLogin)
                            .addGap(9, 9, 9)))
                    .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
            .addGroup(loginPrincipalLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(labelLogin)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        loginPrincipalLayout.setVerticalGroup(
            loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario2)
                    .addComponent(cpUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha2)
                    .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(56, 56, 56))
        );

        PainelPrincipal.add(loginPrincipal, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCadastrarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarEquipeActionPerformed
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
        cl.show(this.PainelPrincipal, "");
    }//GEN-LAST:event_BtnCadastrarEquipeActionPerformed

    private void btnCadastrarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarColaboradorActionPerformed
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
        cl.show(this.PainelPrincipal, "cadColab");
    }//GEN-LAST:event_btnCadastrarColaboradorActionPerformed

    private void cpUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpUsuario2ActionPerformed
        
    }//GEN-LAST:event_cpUsuario2ActionPerformed

    private void cpSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpSenhaActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
        cl.show(this.PainelPrincipal, "menuPrincipal");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnEditarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarColaboradorActionPerformed
        
    }//GEN-LAST:event_btnEditarColaboradorActionPerformed

    private void btnAgendaColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaColaboradorActionPerformed
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
        cl.show(this.PainelPrincipal, "agenda");
    }//GEN-LAST:event_btnAgendaColaboradorActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrarEquipe;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JButton btnAdicionarTarefa;
    private javax.swing.JButton btnAgendaColaborador;
    private javax.swing.JButton btnAgendaEquipe;
    private javax.swing.JButton btnCadastrarColaborador;
    private javax.swing.JButton btnEditarColaborador;
    private javax.swing.JButton btnEditarEquipe;
    private javax.swing.JButton btnEditarTarefa;
    private javax.swing.JButton btnEliminarColaborador;
    private javax.swing.JButton btnEliminarEquipe;
    private javax.swing.JButton btnEliminarTarefa;
    private javax.swing.JButton btnListarColaborador;
    private javax.swing.JButton btnListarEquipe;
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField cpSenha;
    private javax.swing.JTextField cpUsuario;
    private javax.swing.JTextField cpUsuario1;
    private javax.swing.JTextField cpUsuario2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSenha1;
    private javax.swing.JLabel labelSenha2;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelUsuario1;
    private javax.swing.JLabel labelUsuario2;
    private javax.swing.JLabel lbAgenda;
    private javax.swing.JLabel lbColaborador;
    private javax.swing.JLabel lbEquipe;
    private javax.swing.JLabel lbSistema;
    private javax.swing.JLabel lbTarefa;
    private javax.swing.JPanel loginPrincipal;
    private javax.swing.JPanel menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
