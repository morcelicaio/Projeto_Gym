package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.AlunoDao;
import br.com.caio.tcc.modelo.Aluno;
import br.com.caio.tcc.modelo.TableModelAluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrmAlterarAluno extends javax.swing.JFrame {
    private FrmMenuProfessor formAlterarAluno;
    
    private int recebeCodProf;
    
    TableModelAluno tabelaAlunos;
    
    public FrmAlterarAluno() {
        initComponents();
        setLocationRelativeTo(null);
        preencherTabelaAluno();
    }
    
    public FrmAlterarAluno(javax.swing.JFrame form, int codProf){
        this();
        formAlterarAluno = (FrmMenuProfessor) form;
        this.recebeCodProf = codProf;
    }
    
    public FrmAlterarAluno(javax.swing.JFrame form, int codProf, String frameReferente){
        this();
        this.recebeCodProf = codProf;
    }
    
    private void ajustarTamanhoCelulasTabela(javax.swing.JTable jTable, int c0, int c1, int c2, int c3, int c4, int c5, int c6){
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(c0);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(c1);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(c2);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(c3);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(c4);
        jTable.getColumnModel().getColumn(5).setPreferredWidth(c5);
        jTable.getColumnModel().getColumn(6).setPreferredWidth(c6);
    }
    
    public void preencherTabelaAluno(){
        AlunoDao dao = new AlunoDao();
        tabelaAlunos = new TableModelAluno(dao.listarAlunos());
        jTableAlunos.setModel(tabelaAlunos);
        ajustarTamanhoCelulasTabela(jTableAlunos, 70, 196, 45, 75, 85, 100, 100);
    }
    
    public void atualizarTabelaAluno(){
        preencherTabelaAluno();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        btnRetornarMenu = new javax.swing.JButton();
        btnAlterarAluno = new javax.swing.JButton();
        btnBuscarAlunos = new javax.swing.JButton();
        tfBuscaAlunos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Alteração de alunos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alteração de alunos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Selecione o aluno desejado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableAlunos);

        btnRetornarMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRetornarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnRetornarMenu.setText("Retornar ao menu principal");
        btnRetornarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarMenuActionPerformed(evt);
            }
        });

        btnAlterarAluno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/AlterarExcluir.jpg"))); // NOI18N
        btnAlterarAluno.setText("Alterar");
        btnAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlunoActionPerformed(evt);
            }
        });

        btnBuscarAlunos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Consultar_Exerc.jpg"))); // NOI18N
        btnBuscarAlunos.setText("Buscar");
        btnBuscarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlunosActionPerformed(evt);
            }
        });

        tfBuscaAlunos.setText("Digite o nome do aluno:");
        tfBuscaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscaAlunosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetornarMenu)
                            .addComponent(tfBuscaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterarAluno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarAlunos, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarAlunos)
                    .addComponent(tfBuscaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarAluno)
                    .addComponent(btnRetornarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlunosActionPerformed
        String auxiliar;
        
        auxiliar = tfBuscaAlunos.getText();
        
        AlunoDao dao = new AlunoDao();
        
        ArrayList<Aluno> alunos = dao.buscarAlunos(auxiliar);
        
        if (alunos.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum aluno foi encontrado!", "Advertência!", JOptionPane.ERROR_MESSAGE);
        } else{
            tabelaAlunos = new TableModelAluno(alunos);
            jTableAlunos.setModel(tabelaAlunos);    
        }
    }//GEN-LAST:event_btnBuscarAlunosActionPerformed

    private void btnRetornarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarMenuActionPerformed
        String frameReferente = "AlterarAluno";
        
        this.dispose();
        FrmMenuProfessor f = new FrmMenuProfessor(this, recebeCodProf, frameReferente);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnRetornarMenuActionPerformed

    private void btnAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlunoActionPerformed
        int linhaSelecionada = jTableAlunos.getSelectedRow();

        if(linhaSelecionada < 0){
            JOptionPane.showMessageDialog(this, "Selecione um aluno!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else{
        
            tabelaAlunos = (TableModelAluno)jTableAlunos.getModel();           
            Aluno aluno = tabelaAlunos.retornarObjetoAlunoSelecionado(linhaSelecionada);
            
            this.dispose();
            
            FrmAlterarAluno2 f = new FrmAlterarAluno2(this, aluno, recebeCodProf);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
         }    
            
    }//GEN-LAST:event_btnAlterarAlunoActionPerformed

    private void tfBuscaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscaAlunosMouseClicked
        if(evt.getClickCount() == 1){
            tfBuscaAlunos.setText("");
        }
    }//GEN-LAST:event_tfBuscaAlunosMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlterarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAluno;
    private javax.swing.JButton btnBuscarAlunos;
    private javax.swing.JButton btnRetornarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunos;
    private javax.swing.JTextField tfBuscaAlunos;
    // End of variables declaration//GEN-END:variables
}
