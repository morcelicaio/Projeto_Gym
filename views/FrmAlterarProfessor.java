package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.ProfessorDao;
import br.com.caio.tcc.modelo.Professor;
import br.com.caio.tcc.modelo.TableModelProfessor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrmAlterarProfessor extends javax.swing.JFrame {
    private FrmMenuGerente formAlterarProfessor;
    
    TableModelProfessor tabelaProfessores;

    public FrmAlterarProfessor() {
        initComponents();
        setLocationRelativeTo(null);
        preencherTabelaProfessor();
    }
    
    public FrmAlterarProfessor(javax.swing.JFrame form){
        this();
        formAlterarProfessor = (FrmMenuGerente) form;
    }
    
    private void ajustarTamanhoCelulasTabelaProfessor(javax.swing.JTable jTable, int c0, int c1, int c2){
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(c0);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(c1);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(c2);
    }
    
    public void preencherTabelaProfessor() {
        ProfessorDao dao = new ProfessorDao();
        tabelaProfessores = new TableModelProfessor(dao.listarProfessores());
        jTableProfessores.setModel(tabelaProfessores);
        ajustarTamanhoCelulasTabelaProfessor(jTableProfessores, 70, 250, 130);
    }
    
    public void atualizarTabelaProfessor(){
        preencherTabelaProfessor();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProfessores = new javax.swing.JTable();
        tfBuscaProfessor = new javax.swing.JTextField();
        btnBuscarProf = new javax.swing.JButton();
        btnRetornarMenu = new javax.swing.JButton();
        btnAlterarProf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Alteração de professores");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alteração de professores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jTableProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableProfessores);

        tfBuscaProfessor.setText("Digite o nome do professor:");
        tfBuscaProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscaProfessorMouseClicked(evt);
            }
        });

        btnBuscarProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Consultar_Exerc.jpg"))); // NOI18N
        btnBuscarProf.setText("Buscar");
        btnBuscarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProfActionPerformed(evt);
            }
        });

        btnRetornarMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRetornarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnRetornarMenu.setText("Retornar ao menu");
        btnRetornarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarMenuActionPerformed(evt);
            }
        });

        btnAlterarProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterarProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/AlterarExcluir.jpg"))); // NOI18N
        btnAlterarProf.setText("Alterar");
        btnAlterarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRetornarMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarProf))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfBuscaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarProf))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarProf)
                    .addComponent(tfBuscaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarProf)
                    .addComponent(btnRetornarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarMenuActionPerformed
        new FrmMenuGerente().show();
        this.dispose();
    }//GEN-LAST:event_btnRetornarMenuActionPerformed

    private void btnBuscarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProfActionPerformed
        String auxiliar;
        
        auxiliar = tfBuscaProfessor.getText();
        
        ProfessorDao dao = new ProfessorDao();
        
        ArrayList<Professor> professores = dao.buscarProfessores(auxiliar);
        
        if (professores.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum professor foi encontrado!", "Advertência!", JOptionPane.ERROR_MESSAGE);
        } else{
            tabelaProfessores = new TableModelProfessor(professores);
            jTableProfessores.setModel(tabelaProfessores);    
        }
        
    }//GEN-LAST:event_btnBuscarProfActionPerformed

    private void tfBuscaProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscaProfessorMouseClicked
        if(evt.getClickCount() == 1){
            tfBuscaProfessor.setText("");
        }
    }//GEN-LAST:event_tfBuscaProfessorMouseClicked

    private void btnAlterarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProfActionPerformed
        int linhaSelecionada = jTableProfessores.getSelectedRow();
        
        tabelaProfessores = (TableModelProfessor)jTableProfessores.getModel();           
        Professor professor = tabelaProfessores.retornarObjetoProfessorSelecionado(linhaSelecionada);
    
        FrmAlterarProfessor2 f = new FrmAlterarProfessor2(this, professor);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
        
        this.dispose();
        
    }//GEN-LAST:event_btnAlterarProfActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlterarProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProf;
    private javax.swing.JButton btnBuscarProf;
    private javax.swing.JButton btnRetornarMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProfessores;
    private javax.swing.JTextField tfBuscaProfessor;
    // End of variables declaration//GEN-END:variables
}
