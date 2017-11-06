package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.AlunoDao;
import br.com.caio.tcc.dao.ItensFichaTreinoDao;
import br.com.caio.tcc.modelo.Aluno;
import br.com.caio.tcc.modelo.ItensFichaTreino;
import br.com.caio.tcc.modelo.TableModelAlunoFicha;
import br.com.caio.tcc.modelo.TableModelFichaDoAluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrmAlterarFichaDoAluno extends javax.swing.JFrame {
    private FrmMenuProfessor formAlterarFichaDoAluno;
    
    private boolean verificaAlunoSelecionado = false, verificaItemFichaSelecionado = false;
    private int matriculaAluno;
    private int codigoFicha;
    private int recebeCodProf;
    private int recebeCodExercicio;
    int recebeNroSeries, recebeNroRepeticoes;
    private String recebeCategoria, recebeNomeEx;
    
    TableModelAlunoFicha tabelaAlunos; // tabela 1
    TableModelFichaDoAluno tabelaItensDaFicha; // tabela 2
    
    public FrmAlterarFichaDoAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
        instanciarTabelaItensDaFicha();
        preencherTabelaAlunoFicha();
    }
    
    public FrmAlterarFichaDoAluno(javax.swing.JFrame form, int codProf){
        this();
        formAlterarFichaDoAluno = (FrmMenuProfessor) form;
        this.recebeCodProf = codProf;
    }
    
    private void ajustarTamanhoCelulasTabela(javax.swing.JTable jTable, int c0, int c1){
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(c0);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(c1);

    }
    
    private void instanciarTabelaItensDaFicha(){
        tabelaItensDaFicha = new TableModelFichaDoAluno();
        jTableItensDaFicha.setModel(tabelaItensDaFicha);
    }
    
    public void preencherTabelaAlunoFicha(){
        AlunoDao dao = new AlunoDao();
        tabelaAlunos = new TableModelAlunoFicha(dao.listarAlunosFicha());
        jTableAlunos.setModel(tabelaAlunos);
        ajustarTamanhoCelulasTabela(jTableAlunos, 75, 408);
    }
    
    public void preencherTabelaFichaDoAluno(){
        ItensFichaTreinoDao dao = new ItensFichaTreinoDao();
        tabelaItensDaFicha = new TableModelFichaDoAluno(dao.listarItensDaFichaDoAluno(matriculaAluno));
        jTableItensDaFicha.setModel(tabelaItensDaFicha);
        //ajustarTamanhoCelulasTabela(jTableAlunos, 70, 196);
    }
    public void atualizarTabelaFichaDoAluno(){
        preencherTabelaFichaDoAluno();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        tfBuscaAlunos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableItensDaFicha = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnExcluirFicha = new javax.swing.JButton();
        btnAlterarFicha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Alteração de itens da ficha");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alteração de ficha de treinamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Selecione o aluno da ficha");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Consultar_Exerc.jpg"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tfBuscaAlunos.setText("Digite o nome do aluno:");
        tfBuscaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscaAlunosMouseClicked(evt);
            }
        });

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
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlunos);

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel14.setText("Selecione o exercício a ser alterado");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTableItensDaFicha.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableItensDaFicha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableItensDaFichaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableItensDaFicha);

        btnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnExcluirFicha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExcluirFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Excluir.png"))); // NOI18N
        btnExcluirFicha.setText("Excluir ficha");
        btnExcluirFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFichaActionPerformed(evt);
            }
        });

        btnAlterarFicha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterarFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Ficha.png"))); // NOI18N
        btnAlterarFicha.setText("Alterar exercício");
        btnAlterarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfBuscaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirFicha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarFicha)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterarFicha)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String auxiliar;

        auxiliar = tfBuscaAlunos.getText();

        AlunoDao dao = new AlunoDao();

        ArrayList<Aluno> alunos = dao.buscarAlunos(auxiliar);

        if (alunos.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum aluno foi encontrado!", "Advertência!", JOptionPane.ERROR_MESSAGE);
        } else{
            tabelaAlunos = new TableModelAlunoFicha(alunos);
            jTableAlunos.setModel(tabelaAlunos);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfBuscaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscaAlunosMouseClicked
        if(evt.getClickCount() == 1){
            tfBuscaAlunos.setText("");
        }
    }//GEN-LAST:event_tfBuscaAlunosMouseClicked

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        // aqui pego os valores que vem da tabela e coloco em variáveis criadas lá no topo do frame.
        for(int i=0; i <= jTableAlunos.getSelectedRow(); i++){
            //As variáveis recebem os valores da JTable
            matriculaAluno = (int) jTableAlunos.getValueAt(i, 0);
        }

        codigoFicha = matriculaAluno + 0;

        preencherTabelaFichaDoAluno();
        verificaAlunoSelecionado = true;

    }//GEN-LAST:event_jTableAlunosMouseClicked

    private void btnAlterarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFichaActionPerformed
        String auxiliar = "sobrecargaConstrutor";
        
        if(verificaAlunoSelecionado == false){
            JOptionPane.showMessageDialog(this, "Atenção!.\nSelecionar um aluno!", "Advertência!", JOptionPane.ERROR_MESSAGE);
        }   else{
                if(verificaItemFichaSelecionado == false){
                    JOptionPane.showMessageDialog(this, "Atenção!.\nSelecionar um exercício!", "Advertência!", JOptionPane.ERROR_MESSAGE);
                }   else{
                        int confirmacao = JOptionPane.showConfirmDialog(this, "Confirma alteração do item?", "Confirmação de Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                        if (confirmacao == JOptionPane.YES_OPTION){
                            ItensFichaTreinoDao dao = new ItensFichaTreinoDao();
                            recebeCodExercicio = dao.retornaCodExercicio(recebeCategoria, recebeNomeEx);

                            dao.excluirItensDaFichaDoAlunoAuxiliar(codigoFicha, recebeCodExercicio);

                            JOptionPane.showMessageDialog(this, "O exercício foi retirado da ficha!.\n Informe o novo exercício desejado!");

                            this.dispose();

                            FrmCadastrarFichaDoAluno f = new FrmCadastrarFichaDoAluno(this, recebeCodProf, auxiliar);
                            f.setVisible(true);
                            f.setAlwaysOnTop(true);
                        }
                    }
            }
    }//GEN-LAST:event_btnAlterarFichaActionPerformed

    private void btnExcluirFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFichaActionPerformed
        ItensFichaTreinoDao dao = new ItensFichaTreinoDao();
        dao.excluirItensDaFichaDoAluno(matriculaAluno);
               
        JOptionPane.showMessageDialog(this, "Dados removidos com sucesso!");
        
        atualizarTabelaFichaDoAluno();
    }//GEN-LAST:event_btnExcluirFichaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        String frameReferente = "AlterarFichaDoAluno";
        
        this.dispose();
        FrmMenuProfessor f = new FrmMenuProfessor(this, recebeCodProf, frameReferente);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jTableItensDaFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableItensDaFichaMouseClicked
        
        for(int i=0; i <= jTableItensDaFicha.getSelectedRow(); i++){  
         //As variáveis recebem os valores da JTable
            recebeCategoria = (String) jTableItensDaFicha.getValueAt(i, 0);
            recebeNomeEx = (String) jTableItensDaFicha.getValueAt(i, 1);  
            recebeNroSeries = (int) jTableItensDaFicha.getValueAt(i, 2);  
            recebeNroRepeticoes = (int )jTableItensDaFicha.getValueAt(i, 3);  
        }
        
        verificaItemFichaSelecionado = true;
    }//GEN-LAST:event_jTableItensDaFichaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlterarFichaDoAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarFicha;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluirFicha;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAlunos;
    private javax.swing.JTable jTableItensDaFicha;
    private javax.swing.JTextField tfBuscaAlunos;
    // End of variables declaration//GEN-END:variables
}
