/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viwes;

/**
 *
 * @author Aluno
 */
public class MenuGestor extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public MenuGestor() {
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

        jLabel1 = new javax.swing.JLabel();
        labelManterColaborador = new javax.swing.JLabel();
        btnCadastrarColaborador = new javax.swing.JButton();
        btnEditarColaborador = new javax.swing.JButton();
        btnEliminarColaborador = new javax.swing.JButton();
        Listar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVerAgendaColaborador = new javax.swing.JButton();
        btnVerAgendaEquipe = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrarEquipe = new javax.swing.JButton();
        btnEditarEquipe = new javax.swing.JButton();
        btnEliminarEquipe = new javax.swing.JButton();
        btnListarEquipe = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAdicionarTarefa = new javax.swing.JButton();
        btnEliminarTarefa = new javax.swing.JButton();
        btnEditarTarefa = new javax.swing.JButton();

        jLabel1.setText("Sistema");

        labelManterColaborador.setText("Manter Colaborador:");

        btnCadastrarColaborador.setText("Cadastrar");
        btnCadastrarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarColaboradorActionPerformed(evt);
            }
        });

        btnEditarColaborador.setText("Editar");
        btnEditarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarColaboradorActionPerformed(evt);
            }
        });

        btnEliminarColaborador.setText("Eliminar");
        btnEliminarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarColaboradorActionPerformed(evt);
            }
        });

        Listar.setText("Listar");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });

        jLabel2.setText("Consultar Agenda:");

        btnVerAgendaColaborador.setText("Ver agenda colaborador");
        btnVerAgendaColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAgendaColaboradorActionPerformed(evt);
            }
        });

        btnVerAgendaEquipe.setText("Ver agenda da Equipe");
        btnVerAgendaEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAgendaEquipeActionPerformed(evt);
            }
        });

        jLabel3.setText("Manter Equipe:");

        btnCadastrarEquipe.setText("Cadastrar");
        btnCadastrarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarEquipeActionPerformed(evt);
            }
        });

        btnEditarEquipe.setText("Editar");
        btnEditarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEquipeActionPerformed(evt);
            }
        });

        btnEliminarEquipe.setText("Eliminar");
        btnEliminarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEquipeActionPerformed(evt);
            }
        });

        btnListarEquipe.setText("Listar");
        btnListarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEquipeActionPerformed(evt);
            }
        });

        jLabel4.setText("Manter Tarefas:");

        btnAdicionarTarefa.setText("Adicionar Tarefa");

        btnEliminarTarefa.setText("Eliminar Tarefa");

        btnEditarTarefa.setText("Editar Tarefa");
        btnEditarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTarefaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelManterColaborador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCadastrarColaborador)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEliminarColaborador)
                                            .addComponent(btnEditarColaborador)
                                            .addComponent(Listar)
                                            .addComponent(jLabel2)
                                            .addComponent(btnVerAgendaColaborador)
                                            .addComponent(btnVerAgendaEquipe))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCadastrarEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditarEquipe)
                                    .addComponent(btnEliminarEquipe)
                                    .addComponent(btnListarEquipe)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdicionarTarefa)
                                    .addComponent(btnEliminarTarefa)
                                    .addComponent(btnEditarTarefa))))))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelManterColaborador)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVerAgendaColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerAgendaEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionarTarefa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarTarefa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarTarefa)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarColaboradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarColaboradorActionPerformed

    private void btnEditarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarColaboradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarColaboradorActionPerformed

    private void btnEliminarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarColaboradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarColaboradorActionPerformed

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListarActionPerformed

    private void btnVerAgendaColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAgendaColaboradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerAgendaColaboradorActionPerformed

    private void btnVerAgendaEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAgendaEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerAgendaEquipeActionPerformed

    private void btnCadastrarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarEquipeActionPerformed

    private void btnEditarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarEquipeActionPerformed

    private void btnEliminarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarEquipeActionPerformed

    private void btnListarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarEquipeActionPerformed

    private void btnEditarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarTarefaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Listar;
    private javax.swing.JButton btnAdicionarTarefa;
    private javax.swing.JButton btnCadastrarColaborador;
    private javax.swing.JButton btnCadastrarEquipe;
    private javax.swing.JButton btnEditarColaborador;
    private javax.swing.JButton btnEditarEquipe;
    private javax.swing.JButton btnEditarTarefa;
    private javax.swing.JButton btnEliminarColaborador;
    private javax.swing.JButton btnEliminarEquipe;
    private javax.swing.JButton btnEliminarTarefa;
    private javax.swing.JButton btnListarEquipe;
    private javax.swing.JButton btnVerAgendaColaborador;
    private javax.swing.JButton btnVerAgendaEquipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelManterColaborador;
    // End of variables declaration//GEN-END:variables
}
