package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.ExercicioDao;
import br.com.caio.tcc.modelo.Exercicio;
import br.com.caio.tcc.modelo.TableModelTodosExercicios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrmAlterarExercicio extends javax.swing.JFrame {
    private FrmMenuProfessor formAlterarExercicio;
    
    private int recebeCodProf;
    
    TableModelTodosExercicios tabelaTodosExercicios;
    
    public FrmAlterarExercicio() {
        initComponents();
        setLocationRelativeTo(null);
        preencherTabelaTodosExercicios();
    }
    
    public FrmAlterarExercicio(javax.swing.JFrame form, int codProf){
        this();
        formAlterarExercicio = (FrmMenuProfessor) form;
        
        this.recebeCodProf = codProf;
    }
    
    public FrmAlterarExercicio(javax.swing.JFrame form, int codProf, String frameQueRetornou){
        this();       
        this.recebeCodProf = codProf;
    }
    
    private void ajustarTamanhoCelulasTabela(javax.swing.JTable jTable, int c0, int c1, int c2){
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(c0);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(c1);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(c2);
    }
    
    public void preencherTabelaTodosExercicios(){
        ExercicioDao dao = new ExercicioDao(); 
        tabelaTodosExercicios = new TableModelTodosExercicios(dao.listarExercicios());
        jTableTodosExercicios.setModel(tabelaTodosExercicios);
        ajustarTamanhoCelulasTabela(jTableTodosExercicios, 55, 100, 329);
    }
    
    public void atualizarTabelaTodosExercicios(){
        preencherTabelaTodosExercicios();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTodosExercicios = new javax.swing.JTable();
        btnRetornar = new javax.swing.JButton();
        btnAlterarExercicio = new javax.swing.JButton();
        tfBuscaExercicio = new javax.swing.JTextField();
        btnBuscarExercicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Alteração de exercícios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alteração de exercícios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Selecione o exercício desejado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
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

        jTableTodosExercicios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableTodosExercicios);

        btnRetornar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnRetornar.setText("Retornar ao menu principal");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        btnAlterarExercicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterarExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/AlterarExerc.jpg"))); // NOI18N
        btnAlterarExercicio.setText("Alterar");
        btnAlterarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarExercicioActionPerformed(evt);
            }
        });

        tfBuscaExercicio.setText("Digite o nome do exercício aqui:");
        tfBuscaExercicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscaExercicioMouseClicked(evt);
            }
        });

        btnBuscarExercicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Consultar_Exerc.jpg"))); // NOI18N
        btnBuscarExercicio.setText("Buscar");
        btnBuscarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarExercicioActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRetornar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarExercicio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfBuscaExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarExercicio)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscaExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarExercicio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarExercicio)
                    .addComponent(btnRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void tfBuscaExercicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscaExercicioMouseClicked
        if(evt.getClickCount() == 1){
            tfBuscaExercicio.setText("");
        }
    }//GEN-LAST:event_tfBuscaExercicioMouseClicked

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        String frameReferente = "AlterarExercicio";
        
        this.dispose();
        FrmMenuProfessor f = new FrmMenuProfessor(this, recebeCodProf, frameReferente);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void btnBuscarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarExercicioActionPerformed
        String auxiliar;
        
        auxiliar = tfBuscaExercicio.getText();
        
        ExercicioDao dao = new ExercicioDao();
        
        ArrayList<Exercicio> exercicios = dao.buscarExercicios(auxiliar);
        
        if (exercicios.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum exercicio foi encontrado!", "Advertência!", JOptionPane.ERROR_MESSAGE);
        } else{
            tabelaTodosExercicios = new TableModelTodosExercicios(exercicios);
            jTableTodosExercicios.setModel(tabelaTodosExercicios);    
            ajustarTamanhoCelulasTabela(jTableTodosExercicios, 70, 100, 309);
        }
    }//GEN-LAST:event_btnBuscarExercicioActionPerformed

    private void btnAlterarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarExercicioActionPerformed
        int linhaSelecionada = jTableTodosExercicios.getSelectedRow();
        
        if(linhaSelecionada < 0){
            JOptionPane.showMessageDialog(this, "Selecione um exercício!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else{
            tabelaTodosExercicios = (TableModelTodosExercicios)jTableTodosExercicios.getModel();           
            Exercicio exercicio = tabelaTodosExercicios.retornarObjetoExercicioSelecionado(linhaSelecionada);
                System.out.println(exercicio.getCodExercicio());
            FrmAlterarExercicio2 f = new FrmAlterarExercicio2(this, exercicio, recebeCodProf);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
            
            this.dispose();
          }    
    }//GEN-LAST:event_btnAlterarExercicioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlterarExercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarExercicio;
    private javax.swing.JButton btnBuscarExercicio;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTodosExercicios;
    private javax.swing.JTextField tfBuscaExercicio;
    // End of variables declaration//GEN-END:variables
}
