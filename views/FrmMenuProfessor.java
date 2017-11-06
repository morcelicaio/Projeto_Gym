package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.AlunoDao;
import br.com.caio.tcc.modelo.TableModelAluno;
import javax.swing.JOptionPane;

public class FrmMenuProfessor extends javax.swing.JFrame {
    private FrmLoginProfessor formAcessoProfessor;
    private FrmCadastrarFichaDoAluno formRetornaCadastrarFichaDoAluno;
    
    int codigoProfessor;
    
    public FrmMenuProfessor() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setAlwaysOnTop(true);
    }
    
    public FrmMenuProfessor(javax.swing.JFrame form, int codigoProfessor){
        this();
        this.codigoProfessor = codigoProfessor;
  
        formAcessoProfessor = (FrmLoginProfessor) form;
    }
    
    public FrmMenuProfessor(javax.swing.JFrame form, int codigoProfessor, String frameQueRetornou){
        this();
        this.codigoProfessor = codigoProfessor;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAbrirCadastrarAluno = new javax.swing.JButton();
        btnCadastrarExercicio = new javax.swing.JButton();
        btnAtribuirFicha = new javax.swing.JButton();
        btnConsultarExercicio = new javax.swing.JButton();
        btnConsultarFicha = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnAlterarAluno = new javax.swing.JButton();
        btnAlterarExercicio = new javax.swing.JButton();
        btnAlterarFicha = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAlterarSenha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Menu de professores");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Painel de professores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(210, 210, 210))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnAbrirCadastrarAluno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAbrirCadastrarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Add_Aluno.png"))); // NOI18N
        btnAbrirCadastrarAluno.setText("Cadastrar aluno");
        btnAbrirCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirCadastrarAlunoActionPerformed(evt);
            }
        });

        btnCadastrarExercicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrarExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Halter.jpg"))); // NOI18N
        btnCadastrarExercicio.setText("Cadatrar exercício");
        btnCadastrarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarExercicioActionPerformed(evt);
            }
        });

        btnAtribuirFicha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAtribuirFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Ficha.png"))); // NOI18N
        btnAtribuirFicha.setText("Atribuir ficha de treino");
        btnAtribuirFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtribuirFichaActionPerformed(evt);
            }
        });

        btnConsultarExercicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConsultarExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Consultar_Exerc2.jpg"))); // NOI18N
        btnConsultarExercicio.setText("Consultar Exercício");
        btnConsultarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarExercicioActionPerformed(evt);
            }
        });

        btnConsultarFicha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConsultarFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Consultar_Exerc2.jpg"))); // NOI18N
        btnConsultarFicha.setText("Consultar ficha de treino");
        btnConsultarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAbrirCadastrarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarExercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtribuirFicha, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(btnConsultarExercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAbrirCadastrarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtribuirFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnAlterarAluno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/AlterarExcluir.jpg"))); // NOI18N
        btnAlterarAluno.setText("Alterar / Excluir aluno");
        btnAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlunoActionPerformed(evt);
            }
        });

        btnAlterarExercicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterarExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/AlterarExcluir.jpg"))); // NOI18N
        btnAlterarExercicio.setText("Alterar / Excluir exercício");
        btnAlterarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarExercicioActionPerformed(evt);
            }
        });

        btnAlterarFicha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterarFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/AlterarExcluir.jpg"))); // NOI18N
        btnAlterarFicha.setText("Alterar / Excluir ficha de treino");
        btnAlterarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarExercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAlterarAluno)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarExercicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterarFicha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Sair.jpg"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Selecione a opção desejada");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(217, 217, 217))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        btnAlterarSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Cadeado_senha4.JPG"))); // NOI18N
        btnAlterarSenha.setText("Alterar senha");
        btnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btnSair))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAbrirCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCadastrarAlunoActionPerformed
        FrmCadastrarAluno f = new FrmCadastrarAluno(this, codigoProfessor);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
        
        this.dispose();
    }//GEN-LAST:event_btnAbrirCadastrarAlunoActionPerformed

    private void btnConsultarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarExercicioActionPerformed
        String tipoUsuario = "Professor";
        FrmConsultarExercicio f = new FrmConsultarExercicio(this, tipoUsuario, codigoProfessor);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
        
        this.dispose();
    }//GEN-LAST:event_btnConsultarExercicioActionPerformed

    private void btnAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlunoActionPerformed
        FrmAlterarAluno f = new FrmAlterarAluno(this, codigoProfessor);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
        
        this.dispose();
    }//GEN-LAST:event_btnAlterarAlunoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        //System.exit(0);
        new FrmTelaInicial().show();
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastrarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarExercicioActionPerformed
        FrmCadastrarExercicio f = new FrmCadastrarExercicio(this, codigoProfessor);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
        
        this.dispose();
    }//GEN-LAST:event_btnCadastrarExercicioActionPerformed

    private void btnAlterarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarExercicioActionPerformed
        FrmAlterarExercicio f = new FrmAlterarExercicio(this, codigoProfessor);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
        
        this.dispose();
    }//GEN-LAST:event_btnAlterarExercicioActionPerformed

    private void btnAtribuirFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtribuirFichaActionPerformed
        FrmCadastrarFichaDoAluno f = new FrmCadastrarFichaDoAluno(this, codigoProfessor);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
        
        this.dispose();

    }//GEN-LAST:event_btnAtribuirFichaActionPerformed

    private void btnConsultarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFichaActionPerformed
        FrmConsultarFichaProfessor f = new FrmConsultarFichaProfessor(this, codigoProfessor);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
                  
        this.dispose();
    }//GEN-LAST:event_btnConsultarFichaActionPerformed

    private void btnAlterarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFichaActionPerformed
        FrmAlterarFichaDoAluno f = new FrmAlterarFichaDoAluno(this, codigoProfessor);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
        
        this.dispose();
    }//GEN-LAST:event_btnAlterarFichaActionPerformed

    private void btnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaActionPerformed
        FrmAlterarSenhaProfessor f = new FrmAlterarSenhaProfessor(this, codigoProfessor);
        f.setVisible(true);
        f.setAlwaysOnTop(true);

        this.dispose();
    }//GEN-LAST:event_btnAlterarSenhaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirCadastrarAluno;
    private javax.swing.JButton btnAlterarAluno;
    private javax.swing.JButton btnAlterarExercicio;
    private javax.swing.JButton btnAlterarFicha;
    private javax.swing.JButton btnAlterarSenha;
    private javax.swing.JButton btnAtribuirFicha;
    private javax.swing.JButton btnCadastrarExercicio;
    private javax.swing.JButton btnConsultarExercicio;
    private javax.swing.JButton btnConsultarFicha;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
