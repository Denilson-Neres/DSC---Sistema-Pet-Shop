/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Proj_Desktop;

import br.edu.ifnmg.LogicaAplicacao.OrdemServico;
import br.edu.ifnmg.LogicaAplicacao.OrdemServicoRepo;
import br.edu.ifnmg.LogicaAplicacao.RepositorioFactory;
import br.edu.ifnmg.LogicaAplicacao.Servico;
import br.edu.ifnmg.LogicaAplicacao.ServicoRepo;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Denilson
 */
public class OrdemServicos extends javax.swing.JInternalFrame {
    
    OrdemServico os;
    OrdemServicoRepo repositorio;
    Servico servico;
    ServicoRepo serRepo;

    /**
     * Creates new form OrdemServicos
     */
    public OrdemServicos() {
        repositorio = RepositorioFactory.getOrdemServicoRepo();
        serRepo = RepositorioFactory.getServicoRepo();
        os = new OrdemServico();
        servico = new Servico();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtServico = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Ordem Servico");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "ValorTotal", "Servico", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblResultado);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txtServico.setText("Serviço:");

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtServico)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpar))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadoMouseClicked
        // TODO add your handling code here:
        
        int linha = tblResultado.getSelectedRow();

        Long id = Long.parseLong(tblResultado.getValueAt(linha, 0).toString());

        OrdemServico os = repositorio.Abrir(id);

        PrestarServico tela = new PrestarServico();
        this.getParent().add(tela);
        tela.setVisible(true);

    }//GEN-LAST:event_tblResultadoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        servico.setDescricao(txtCliente.getText());

        List<OrdemServico> resultado = repositorio.Buscar(os);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("Cliente");
        modelo.addColumn("Data");
        modelo.addColumn("Itens");
        modelo.addColumn("Valor Total");

        for(OrdemServico os : resultado){

            Vector linha = new Vector();
            linha.add(os.getId());
            linha.add(os.getCliente());
            linha.add(os.getItens());
            linha.add(os.getData());
            linha.add(os.getValorTotal());

            modelo.addRow(linha);

            tblResultado.setModel(modelo);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        
        if(JOptionPane.showConfirmDialog(this,"Deseja realmente limpar a busca?", "Confirmação", JOptionPane.YES_NO_OPTION)
            == JOptionPane.YES_OPTION){
            txtServico.setText("");

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("id");
            modelo.addColumn("Cliente");
            modelo.addColumn("Data");
            modelo.addColumn("Itens");
            modelo.addColumn("Valor Total");
            tblResultado.setModel(modelo);
        }

    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JLabel txtServico;
    // End of variables declaration//GEN-END:variables
}
