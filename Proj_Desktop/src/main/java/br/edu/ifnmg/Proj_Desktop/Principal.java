/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Proj_Desktop;

import br.edu.ifnmg.LogicaAplicacao.Animal;
import br.edu.ifnmg.LogicaAplicacao.Cliente;
import br.edu.ifnmg.LogicaAplicacao.OrdemServico;
import br.edu.ifnmg.LogicaAplicacao.Raca;
import br.edu.ifnmg.LogicaAplicacao.Servico;
import br.edu.ifnmg.LogicaAplicacao.Usuario;

/**
 *
 * @author Denilson
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnCadastros = new javax.swing.JMenu();
        mnUsuario = new javax.swing.JMenuItem();
        mnCliente = new javax.swing.JMenuItem();
        mnServico = new javax.swing.JMenuItem();
        mnEfetuarVenda = new javax.swing.JMenuItem();
        mnAnimal = new javax.swing.JMenuItem();
        cdRaca = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        buscarAnimal = new javax.swing.JMenuItem();
        buscarCliente = new javax.swing.JMenuItem();
        bcUsuario = new javax.swing.JMenuItem();
        ordemServico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pet Menu");

        jMenu2.setText("Sitema");
        jMenuBar2.add(jMenu2);

        mnCadastros.setText("Cadastros");

        mnUsuario.setText("Usuários");
        mnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUsuarioActionPerformed(evt);
            }
        });
        mnCadastros.add(mnUsuario);

        mnCliente.setText("Cliente");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        mnCadastros.add(mnCliente);

        mnServico.setText("Serviços");
        mnServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnServicoActionPerformed(evt);
            }
        });
        mnCadastros.add(mnServico);

        mnEfetuarVenda.setText("PrestarServiço");
        mnEfetuarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEfetuarVendaActionPerformed(evt);
            }
        });
        mnCadastros.add(mnEfetuarVenda);

        mnAnimal.setText("Animal");
        mnAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAnimalActionPerformed(evt);
            }
        });
        mnCadastros.add(mnAnimal);

        cdRaca.setText("Raça");
        cdRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdRacaActionPerformed(evt);
            }
        });
        mnCadastros.add(cdRaca);

        jMenuBar2.add(mnCadastros);

        jMenu1.setText("Buscar");

        buscarAnimal.setText("Animal");
        buscarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAnimalActionPerformed(evt);
            }
        });
        jMenu1.add(buscarAnimal);

        buscarCliente.setText("Cliente");
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(buscarCliente);

        bcUsuario.setText("Usuario");
        bcUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(bcUsuario);

        ordemServico.setText("OrdemServico");
        ordemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordemServicoActionPerformed(evt);
            }
        });
        jMenu1.add(ordemServico);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUsuarioActionPerformed
        // TODO add your handling code here:
        UsuarioCadastro tela = new UsuarioCadastro(new Usuario());
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_mnUsuarioActionPerformed

    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed
        // TODO add your handling code here:

        ClienteCadastro tela = new ClienteCadastro(new Cliente());
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_mnClienteActionPerformed

    private void mnServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnServicoActionPerformed
        // TODO add your handling code here:
        ServicoCadastro tela = new ServicoCadastro(new Servico());
        this.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_mnServicoActionPerformed

    private void mnEfetuarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEfetuarVendaActionPerformed
        // TODO add your handling code here:
        PrestarServico tela = new PrestarServico();
        this.add(tela);
        tela.setVisible(true);

    }//GEN-LAST:event_mnEfetuarVendaActionPerformed

    private void mnAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAnimalActionPerformed
        // TODO add your handling code here:
        AnimalCadastro tela = new AnimalCadastro(new Animal());
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_mnAnimalActionPerformed

    private void buscarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAnimalActionPerformed
        // TODO add your handling code here:
        AnimalBuscar tela = new AnimalBuscar();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_buscarAnimalActionPerformed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed
        // TODO add your handling code here:
        ClienteBuscar tela = new ClienteBuscar();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_buscarClienteActionPerformed

    private void bcUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcUsuarioActionPerformed
        // TODO add your handling code here:
        UsuarioBuscar tela = new UsuarioBuscar();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_bcUsuarioActionPerformed

    private void cdRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdRacaActionPerformed
        // TODO add your handling code here:
        EspecieCadastro tela = new EspecieCadastro(new Raca());
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_cdRacaActionPerformed

    private void ordemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordemServicoActionPerformed
        // TODO add your handling code here:
        OrdemServicos tela = new OrdemServicos();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_ordemServicoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bcUsuario;
    private javax.swing.JMenuItem buscarAnimal;
    private javax.swing.JMenuItem buscarCliente;
    private javax.swing.JMenuItem cdRaca;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem mnAnimal;
    private javax.swing.JMenu mnCadastros;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenuItem mnEfetuarVenda;
    private javax.swing.JMenuItem mnServico;
    private javax.swing.JMenuItem mnUsuario;
    private javax.swing.JMenuItem ordemServico;
    // End of variables declaration//GEN-END:variables
}
