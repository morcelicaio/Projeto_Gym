package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.ProfessorDao;
import br.com.caio.tcc.modelo.Professor;
import javax.swing.JOptionPane;

public class FrmCadastrarProfessor extends javax.swing.JFrame {
    private FrmMenuGerente formCadastrarProfessor;
        
    public FrmCadastrarProfessor(){
        initComponents();
        setVisible(true);
        setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
    }
    
    public FrmCadastrarProfessor(javax.swing.JFrame form){
        this();
        formCadastrarProfessor = (FrmMenuGerente) form;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNomeProfessor = new javax.swing.JTextField();
        tfPasswordProfessor = new javax.swing.JPasswordField();
        btnVoltar = new javax.swing.JButton();
        btnCadastrarProfessor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Cadastro de professores");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de professores ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Digite sua senha:");

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

        btnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnVoltar.setText("Retornar ao menu principal");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnCadastrarProfessor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/CadastrarFichaTreino.jpg"))); // NOI18N
        btnCadastrarProfessor.setText("Cadastrar Professor");
        btnCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProfessorActionPerformed(evt);
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
                        .addComponent(btnVoltar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarProfessor))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(78, 78, 78)
                            .addComponent(tfNomeProfessor))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(tfPasswordProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnCadastrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProfessorActionPerformed
        Professor p = new Professor();
        
        if((tfNomeProfessor.getText().isEmpty()) || (tfPasswordProfessor.getText().isEmpty())){
            JOptionPane.showMessageDialog(this, "Dados inseridos incorretamente!", "Erro!", JOptionPane.ERROR_MESSAGE);
            
            tfNomeProfessor.setText("");
            tfPasswordProfessor.setText("");
            
        }   else{
                try{
                    p.setNomeProfessor(tfNomeProfessor.getText());
                    p.setSenhaProfessor(tfPasswordProfessor.getText());

                    ProfessorDao dao = new ProfessorDao();
                    dao.cadastrarProfessor(p);

                    JOptionPane.showMessageDialog(this, "Dados inseridos com sucesso!", "Cadastro de professor", JOptionPane.INFORMATION_MESSAGE);
                    p.setCodProfessor(dao.getCodigo());

                    JOptionPane.showMessageDialog(this, "Seu código de acesso é "+ p.getCodProfessor() + "");

                    tfNomeProfessor.setText("");
                    tfPasswordProfessor.setText("");
                }   catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Erro no cadastro de professores!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    }
            }
    }//GEN-LAST:event_btnCadastrarProfessorActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new FrmMenuGerente().show();
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProfessor;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfNomeProfessor;
    private javax.swing.JPasswordField tfPasswordProfessor;
    // End of variables declaration//GEN-END:variables
}
