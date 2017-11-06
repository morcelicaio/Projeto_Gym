package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.AlunoDao;
import br.com.caio.tcc.dao.ExercicioDao;
import br.com.caio.tcc.dao.ItensFichaTreinoDao;
import br.com.caio.tcc.modelo.Aluno;
import br.com.caio.tcc.modelo.Exercicio;
import br.com.caio.tcc.modelo.TableModelAlunoFicha;
import br.com.caio.tcc.modelo.TableModelFichaDoAluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrmConsultarFichaProfessor extends javax.swing.JFrame {
    private FrmMenuProfessor formConsultarFichaProf;
    
    private int recebeMatricula, recebeCodProf;
    
    TableModelAlunoFicha tabelaAlunos;
    TableModelFichaDoAluno tabelaItensDaFicha;
    
    public FrmConsultarFichaProfessor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        preencherTabelaAlunosFicha();
        instanciarTabelaItensDaFicha();
    }
    
    public FrmConsultarFichaProfessor(javax.swing.JFrame form, int codProfessor){
        this();
        formConsultarFichaProf = (FrmMenuProfessor) form;
        this.recebeCodProf = codProfessor;
    }
    
    public FrmConsultarFichaProfessor(javax.swing.JFrame form, String auxiliar, int codProfessor){
        this();
        this.recebeCodProf = codProfessor;
    }
    
    private void ajustarTamanhoCelulasTabelaAlunos(javax.swing.JTable jTable, int c0, int c1){
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(c0);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(c1);

    }
    
    private void ajustarTamanhoCelulasTabelaItensDaFicha(javax.swing.JTable jTable, int c0, int c1, int c2, int c3){
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(c0);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(c1);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(c2);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(c3);

    }
    
    private void instanciarTabelaItensDaFicha(){
        tabelaItensDaFicha = new TableModelFichaDoAluno();
        jTableItensDaFicha.setModel(tabelaItensDaFicha);
        ajustarTamanhoCelulasTabelaItensDaFicha(jTableItensDaFicha, 85, 166, 63, 75);
    }
    
    public void preencherTabelaAlunosFicha(){
        AlunoDao dao = new AlunoDao();
        tabelaAlunos = new TableModelAlunoFicha(dao.listarAlunosFicha());
        jTableAlunos.setModel(tabelaAlunos);
        ajustarTamanhoCelulasTabelaAlunos(jTableAlunos, 60, 206);
    }
    
    public void preencherTabelaFichaDoAluno(){
        ItensFichaTreinoDao dao = new ItensFichaTreinoDao();
        tabelaItensDaFicha = new TableModelFichaDoAluno(dao.listarItensDaFichaDoAluno(recebeMatricula));
        jTableItensDaFicha.setModel(tabelaItensDaFicha);
        ajustarTamanhoCelulasTabelaItensDaFicha(jTableItensDaFicha, 85, 166, 63, 75);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tfBuscaAlunos = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableItensDaFicha = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRetornarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Consulta de fichas de treinamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de ficha de treinamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfBuscaAlunos.setText("Digite o nome do aluno:");
        tfBuscaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscaAlunosMouseClicked(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Consultar_Exerc.jpg"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel16.setText("Ficha de treinamento do aluno");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Selecione o aluno da ficha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel2)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        btnRetornarMenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRetornarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnRetornarMenu.setText("Voltar");
        btnRetornarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRetornarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfBuscaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRetornarMenu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void tfBuscaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscaAlunosMouseClicked
        if(evt.getClickCount() == 1){
            tfBuscaAlunos.setText("");
        }
    }//GEN-LAST:event_tfBuscaAlunosMouseClicked

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

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        // aqui pego os valores que vem da tabela e coloco em variáveis criadas lá no topo do frame.
        for(int i=0; i <= jTableAlunos.getSelectedRow(); i++){
            //As variáveis recebem os valores da JTable
            recebeMatricula = (int) jTableAlunos.getValueAt(i, 0);
        }

        preencherTabelaFichaDoAluno();
    }//GEN-LAST:event_jTableAlunosMouseClicked

    private void btnRetornarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarMenuActionPerformed
        String frameReferente = "ConsultarFichaProfessor";
        
        this.dispose();
        FrmMenuProfessor f = new FrmMenuProfessor(this, recebeCodProf, frameReferente);
        f.setVisible(true);
        f.setAlwaysOnTop(true); 
    }//GEN-LAST:event_btnRetornarMenuActionPerformed

    private void jTableItensDaFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableItensDaFichaMouseClicked
        String categoriaEx = "", nomeEx = "", descricaoEx = "";
        int codEx;
        
        if(evt.getClickCount() == 2){
            for(int i=0; i <= jTableItensDaFicha.getSelectedRow(); i++){  
                //As variáveis recebem os valores da JTable
                categoriaEx = (String) jTableItensDaFicha.getValueAt(i, 0);
                nomeEx = (String) jTableItensDaFicha.getValueAt(i, 1); 
            }
            
            ExercicioDao dao = new ExercicioDao();
            codEx = dao.retornaCodExercicio(categoriaEx, nomeEx);
            descricaoEx = dao.retornaDescricaoExercicio(categoriaEx, nomeEx);
           
            Exercicio exercicio = new Exercicio();
            
            exercicio.setCodExercicio(codEx);
            exercicio.setCategoriaExercicio(categoriaEx);
            exercicio.setNomeExercicio(nomeEx);
            exercicio.setFuncaoExercicio(descricaoEx);
            
            this.dispose();
            FrmExercicioConsultadoDaFicha2 f = new FrmExercicioConsultadoDaFicha2(this, exercicio, recebeCodProf);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
            
        }
    }//GEN-LAST:event_jTableItensDaFichaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultarFichaProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRetornarMenu;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAlunos;
    private javax.swing.JTable jTableItensDaFicha;
    private javax.swing.JTextField tfBuscaAlunos;
    // End of variables declaration//GEN-END:variables
}
