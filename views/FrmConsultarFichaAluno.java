package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.ExercicioDao;
import br.com.caio.tcc.dao.ItensFichaTreinoDao;
import br.com.caio.tcc.modelo.Exercicio;
import br.com.caio.tcc.modelo.TableModelFichaDoAluno;
import javax.swing.JOptionPane;

public class FrmConsultarFichaAluno extends javax.swing.JFrame {
    private FrmMenuAluno formConsultarFichaAluno;
    
    private String tipoDeUsuario;
    int recebeMatricula;
    
    TableModelFichaDoAluno tabelaItensDaFicha;
    
    public FrmConsultarFichaAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
    }
    
    public FrmConsultarFichaAluno(javax.swing.JFrame form, int matriculaAluno){
        this();
        formConsultarFichaAluno = (FrmMenuAluno) form;
        this.recebeMatricula = matriculaAluno;
        preencherTabelaFichaDoAluno();
    }
    
    public FrmConsultarFichaAluno(javax.swing.JFrame form, String auxiliar, int matriculaAluno){
        this();
        this.recebeMatricula = matriculaAluno;
        preencherTabelaFichaDoAluno();
    }
    
    private void ajustarTamanhoCelulasTabelaItensDaFicha(javax.swing.JTable jTable, int c0, int c1, int c2, int c3){
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(c0);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(c1);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(c2);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(c3);

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
        jPanel15 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableItensDaFicha = new javax.swing.JTable();
        btnRetornarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Consulta de ficha de treinamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de ficha de treinamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel14.setText("Itens da ficha");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14))
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

        btnRetornarMenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRetornarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnRetornarMenu.setText("Retornar ao menu principal");
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRetornarMenu)
                        .addGap(0, 169, Short.MAX_VALUE))
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnRetornarMenu)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        int auxiliar = 0;
        this.dispose(); 
        
        FrmMenuAluno f = new FrmMenuAluno(this, auxiliar, recebeMatricula);
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
            FrmExercicioConsultadoDaFicha f = new FrmExercicioConsultadoDaFicha(this, exercicio, recebeMatricula);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
            
        }
    }//GEN-LAST:event_jTableItensDaFichaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultarFichaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetornarMenu;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableItensDaFicha;
    // End of variables declaration//GEN-END:variables
}
