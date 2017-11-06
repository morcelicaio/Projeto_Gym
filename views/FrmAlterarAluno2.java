package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.AlunoDao;
import br.com.caio.tcc.modelo.Aluno;
import java.util.Date;
import javax.swing.JOptionPane;

public class FrmAlterarAluno2 extends javax.swing.JFrame {
    private FrmAlterarAluno fAlteracaoAluno;
    
    public String sexoAluno;
    private int nroMatriculaAluno, recebeCodProf;
    
    public FrmAlterarAluno2() {
        initComponents();
        setLocationRelativeTo(null);
    }
        
    private void configurarOpcoesSexo(Aluno a) {
        if (a.getSexoAluno().equals("M")){
            radioBtnMasculino.setSelected(true);
        } else {
                if(a.getSexoAluno().equals("F")){
                    radioBtnFeminino.setSelected(true);
                }
            }
    }
    
    public FrmAlterarAluno2(javax.swing.JFrame form, Aluno a, int codProf) {        
        this();
        this.recebeCodProf = codProf;
        
        configurarOpcoesSexo(a);
        tfNomeAluno.setText(a.getNomeAluno());
        dcDataNascAluno.setToolTipText(null);
        tfRg.setText(Integer.toString(a.getRg()));
        tfCpf.setText(a.getCpf());
        tfPasswordAluno.setText(a.getSenhaAluno());
        
        nroMatriculaAluno = a.getNroMatricula();
        
        fAlteracaoAluno = (FrmAlterarAluno) form;        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfNomeAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        radioBtnFeminino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        dcDataNascAluno = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfRg = new javax.swing.JTextField();
        tfCpf = new javax.swing.JTextField();
        tfPasswordAluno = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        btnRetornar = new javax.swing.JButton();
        btnExcluirAluno = new javax.swing.JButton();
        btnAlterarAluno = new javax.swing.JButton();
        radioBtnMasculino = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Alteração de alunos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alteração de alunos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Informe os novos dados do aluno");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(194, 194, 194)
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

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Sexo:");

        btnGroupSexo.add(radioBtnFeminino);
        radioBtnFeminino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        radioBtnFeminino.setText("Feminino");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Data de nascimento:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("RG:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("CPF:");

        tfRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRgKeyTyped(evt);
            }
        });

        tfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCpfKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Senha do aluno:");

        btnRetornar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnRetornar.setText("Retornar ao menu principal");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        btnExcluirAluno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExcluirAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/ExcluirUser.jpg"))); // NOI18N
        btnExcluirAluno.setText("Excluir");
        btnExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlunoActionPerformed(evt);
            }
        });

        btnAlterarAluno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/AlterarAluno.jpg"))); // NOI18N
        btnAlterarAluno.setText("Alterar");
        btnAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlunoActionPerformed(evt);
            }
        });

        btnGroupSexo.add(radioBtnMasculino);
        radioBtnMasculino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        radioBtnMasculino.setText("Masculino");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfPasswordAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRetornar)
                        .addGap(32, 32, 32)
                        .addComponent(btnExcluirAluno)
                        .addGap(27, 27, 27)
                        .addComponent(btnAlterarAluno))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNomeAluno)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(radioBtnMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnFeminino))
                                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dcDataNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radioBtnFeminino)
                    .addComponent(radioBtnMasculino))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dcDataNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tfPasswordAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRetornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterarAluno)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
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

    private void btnAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlunoActionPerformed
        Aluno a = new Aluno();
        
        if(radioBtnMasculino.isSelected()){
            sexoAluno = "M";
        }   else{
                sexoAluno = "F";
            }

        if(tfNomeAluno.getText().isEmpty() || tfPasswordAluno.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Informe os campos de nome ou senha corretamente!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }   else{
                if(dcDataNascAluno.getDate() == null){
                    JOptionPane.showMessageDialog(this, "Informe a data de nascimento!", "Erro!", JOptionPane.ERROR_MESSAGE);
                }   else{
                        Date dataAtual = new Date();
                        if(dcDataNascAluno.getDate().after(dataAtual)){
                            JOptionPane.showMessageDialog(this, "Data incorreta!", "Erro!", JOptionPane.ERROR_MESSAGE);
                        }   else{
                                int confirmacao = JOptionPane.showConfirmDialog(this, "Confirma as alterações?", "Confirmação de Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                                
                                if (confirmacao == JOptionPane.YES_OPTION){
                                    try{
                                        a.setNroMatricula(nroMatriculaAluno);
                                        a.setSexoAluno(sexoAluno);
                                        a.setNomeAluno(tfNomeAluno.getText());
                                        a.setDataNascAluno(dcDataNascAluno.getDate());
                                        a.setRg(Integer.parseInt(tfRg.getText()));
                                        a.setCpf(tfCpf.getText());
                                        a.setSenhaAluno(tfPasswordAluno.getText());

                                        AlunoDao dao = new AlunoDao();
                                        dao.alterarAluno(a);                                      

                                        JOptionPane.showMessageDialog(this, "Aluno alterado com sucesso!.");
                                        JOptionPane.showMessageDialog(this, "O número da sua matrícula é "+ a.getNroMatricula() + ".");
                                        fAlteracaoAluno.preencherTabelaAluno();

                                        fAlteracaoAluno.atualizarTabelaAluno();
                                        
                                        this.dispose();
                                        String frameReferente = "";
                                        
                                        FrmAlterarAluno f = new FrmAlterarAluno(this, recebeCodProf, frameReferente);
                                        f.setVisible(true);
                                        f.setAlwaysOnTop(true);
                                        
                                    }   catch(Exception e){
                                            JOptionPane.showMessageDialog(this, "Erro na alteração de alunos!", "Erro!", JOptionPane.ERROR_MESSAGE);
                                        }
                                }
                            } 
                    }                    
            }
    }//GEN-LAST:event_btnAlterarAlunoActionPerformed

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        String frameReferente = "AlterarAluno2";
        
        this.dispose();
        FrmAlterarAluno f = new FrmAlterarAluno(this, recebeCodProf, frameReferente);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
        
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void tfRgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRgKeyTyped
        // Evento no campo de texto Rg que não permite a inserção de letras no campo.
        String caracteres="0987654321";
        
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfRgKeyTyped

    private void tfCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCpfKeyTyped
        // Evento no campo de texto Cpf que não permite a inserção de letras no campo.
        String caracteres="0987654321";
        
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfCpfKeyTyped

    private void btnExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlunoActionPerformed
        Aluno a = new Aluno();
        
        a.setNroMatricula(nroMatriculaAluno);
        
        AlunoDao dao = new AlunoDao();
        dao.excluirAluno(a);        
               
        JOptionPane.showMessageDialog(this, "Dados removidos com sucesso!");
        
        new FrmAlterarAluno().show();        
        fAlteracaoAluno.atualizarTabelaAluno();
        this.dispose();
    }//GEN-LAST:event_btnExcluirAlunoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlterarAluno2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAluno;
    private javax.swing.JButton btnExcluirAluno;
    private javax.swing.ButtonGroup btnGroupSexo;
    private javax.swing.JButton btnRetornar;
    private com.toedter.calendar.JDateChooser dcDataNascAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton radioBtnFeminino;
    private javax.swing.JRadioButton radioBtnMasculino;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfNomeAluno;
    private javax.swing.JPasswordField tfPasswordAluno;
    private javax.swing.JTextField tfRg;
    // End of variables declaration//GEN-END:variables
}
