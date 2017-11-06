package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.ProfessorDao;
import br.com.caio.tcc.modelo.Professor;
import br.com.caio.tcc.modelo.TableModelProfessor;
import javax.swing.JOptionPane;

public class FrmAlterarProfessor2 extends javax.swing.JFrame {
    private FrmAlterarProfessor fAlteracaoProfessor;
    
    private int codProfessor;
    
    public FrmAlterarProfessor2() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public FrmAlterarProfessor2(javax.swing.JFrame form, Professor p) {        
        this();
        
        tfNomeProfessor.setText(p.getNomeProfessor()); 
        tfPasswordProfessor.setText(p.getSenhaProfessor());
        
        codProfessor = p.getCodProfessor();
        
        fAlteracaoProfessor = (FrmAlterarProfessor) form;        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNomeProfessor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfPasswordProfessor = new javax.swing.JPasswordField();
        btnRetornar = new javax.swing.JButton();
        btnAlterarProf = new javax.swing.JButton();
        btnExcluirProf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Alteração de professores");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alteração de professores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        tfNomeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeProfessorActionPerformed(evt);
            }
        });
        tfNomeProfessor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeProfessorKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Digite sua senha:");

        btnRetornar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnRetornar.setText("Retornar");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        btnAlterarProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterarProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/AlterarAluno.jpg"))); // NOI18N
        btnAlterarProf.setText("Alterar");
        btnAlterarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProfActionPerformed(evt);
            }
        });

        btnExcluirProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExcluirProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/ExcluirUser.jpg"))); // NOI18N
        btnExcluirProf.setText("Excluir");
        btnExcluirProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(78, 78, 78)
                        .addComponent(tfNomeProfessor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfPasswordProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRetornar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarProf)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPasswordProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAlterarProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeProfessorActionPerformed
        String caracteres="0987654321";
        if(caracteres.contains("0123456789")){
            JOptionPane.showMessageDialog(this, "Não é permitido numeros aqui.");
        }
    }//GEN-LAST:event_tfNomeProfessorActionPerformed

    private void tfNomeProfessorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeProfessorKeyTyped
        // Evento no campo de texto Nome que não permite a inserção de números no campo.
        String caracteres="0987654321";

        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfNomeProfessorKeyTyped

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        new FrmAlterarProfessor().show();
        fAlteracaoProfessor.preencherTabelaProfessor();
        this.dispose();
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void btnAlterarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProfActionPerformed
        Professor p = new Professor();

        if((tfNomeProfessor.getText().isEmpty()) || (tfPasswordProfessor.getText().isEmpty())){
            JOptionPane.showMessageDialog(this, "Dados inseridos incorretamente!", "Erro!", JOptionPane.ERROR_MESSAGE);

        }   else{
                try{
                    p.setCodProfessor(codProfessor);
                    p.setNomeProfessor(tfNomeProfessor.getText());
                    p.setSenhaProfessor(tfPasswordProfessor.getText());

                    ProfessorDao dao = new ProfessorDao();
                    dao.alterarProfessor(p);

                    JOptionPane.showMessageDialog(this, "Dados alterados com sucesso!");
                    p.setCodProfessor(dao.getCodigo());

                    JOptionPane.showMessageDialog(this, "Seu código de acesso é "+ p.getCodProfessor() + "");
                        
                    new FrmAlterarProfessor().show();
                    fAlteracaoProfessor.atualizarTabelaProfessor();
                    this.dispose();
                }   catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Erro no cadastro de alunos!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    }
        }
    }//GEN-LAST:event_btnAlterarProfActionPerformed

    private void btnExcluirProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProfActionPerformed
        Professor p = new Professor();

        p.setCodProfessor(codProfessor);
        
        ProfessorDao dao = new ProfessorDao();
        dao.excluirProfessor(p);        
               
        JOptionPane.showMessageDialog(this, "Dados removidos com sucesso!");
                
        new FrmAlterarProfessor().show();  
        fAlteracaoProfessor.atualizarTabelaProfessor();
        this.dispose();
    }//GEN-LAST:event_btnExcluirProfActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlterarProfessor2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProf;
    private javax.swing.JButton btnExcluirProf;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfNomeProfessor;
    private javax.swing.JPasswordField tfPasswordProfessor;
    // End of variables declaration//GEN-END:variables
}
