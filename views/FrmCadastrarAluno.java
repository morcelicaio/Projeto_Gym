package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.AlunoDao;
import br.com.caio.tcc.dao.FichaTreinoDao;
import br.com.caio.tcc.modelo.Aluno;
import br.com.caio.tcc.modelo.FichaTreino;
import java.util.Date;
import javax.swing.JOptionPane;

public class FrmCadastrarAluno extends javax.swing.JFrame {
    private FrmMenuProfessor formCadastrarAluno;
    
     private int codigoProfessor;
    
    public FrmCadastrarAluno() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public FrmCadastrarAluno(javax.swing.JFrame form, int codProfessor){
        this();
        formCadastrarAluno = (FrmMenuProfessor) form;
        this.codigoProfessor = codProfessor;
    }
    
    private void limparCampos(){
        tfNomeAluno.setText("");
        dcDataNascAluno.setDate(null);
        tfRg.setText("");
        tfCpf.setText("");
        tfPasswordAluno.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dcDataNascAluno = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfNomeAluno = new javax.swing.JTextField();
        radioBtnMasculino = new javax.swing.JRadioButton();
        radioBtnFeminino = new javax.swing.JRadioButton();
        tfRg = new javax.swing.JTextField();
        tfCpf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnCadastrarAluno = new javax.swing.JButton();
        tfPasswordAluno = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Cadastro de alunos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de alunos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Sexo:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Data de nascimento:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("RG:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("CPF:");

        tfNomeAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeAlunoKeyTyped(evt);
            }
        });

        btnGroupSexo.add(radioBtnMasculino);
        radioBtnMasculino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        radioBtnMasculino.setSelected(true);
        radioBtnMasculino.setText("Masculino");

        btnGroupSexo.add(radioBtnFeminino);
        radioBtnFeminino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        radioBtnFeminino.setText("Feminino");

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

        btnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnVoltar.setText("Retornar ao menu principal");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnCadastrarAluno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/CadastrarAluno.jpg"))); // NOI18N
        btnCadastrarAluno.setText("Cadastrar aluno");
        btnCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAlunoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("Insira os dados do aluno");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(151, 151, 151))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel1.setText("* Somente números");

        jLabel9.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel9.setText("* Somente números");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(radioBtnMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBtnFeminino)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVoltar)
                                .addGap(26, 26, 26)
                                .addComponent(btnCadastrarAluno))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPasswordAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dcDataNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel9))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNomeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radioBtnMasculino)
                    .addComponent(radioBtnFeminino))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dcDataNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfPasswordAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
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

    private void btnCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAlunoActionPerformed
        Aluno a = new Aluno();
        String sexoAluno = "";
        
        if(radioBtnMasculino.isSelected()){
                    sexoAluno = "M";
                }   else{
                        if(radioBtnFeminino.isSelected()){
                            sexoAluno = "F";
                        }
                    }
        
        if(tfNomeAluno.getText().isEmpty() || (tfPasswordAluno.getText().isEmpty())){
            JOptionPane.showMessageDialog(this, "Informe os campos de nome ou senha corretamente!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }   else{
                if(dcDataNascAluno.getDate() == null){
                    JOptionPane.showMessageDialog(this, "Informe a data de nascimento!", "Erro!", JOptionPane.ERROR_MESSAGE);
                }   else{
                        Date dataAtual = new Date();
                        if(dcDataNascAluno.getDate().after(dataAtual)){
                            JOptionPane.showMessageDialog(this, "Data incorreta!", "Erro!", JOptionPane.ERROR_MESSAGE);
                        }   else{
                                if (tfRg.getText().isEmpty() || (tfCpf.getText().isEmpty())){
                                    JOptionPane.showMessageDialog(this, "Informe os campos de rg ou cpf corretamente!", "Erro!", JOptionPane.ERROR_MESSAGE);    
                                }   else{
                                        try{
                                            a.setNomeAluno(tfNomeAluno.getText());
                                            a.setSexoAluno(sexoAluno);
                                            a.setDataNascAluno(dcDataNascAluno.getDate());
                                            a.setRg(Integer.parseInt(tfRg.getText()));
                                            a.setCpf(tfCpf.getText());
                                            a.setSenhaAluno(tfPasswordAluno.getText());
                                                
                                            AlunoDao dao = new AlunoDao();
                                            dao.cadastrarAluno(a);                                      
                                     
                                            a.setNroMatricula(dao.getCodigo());
                                            
                                            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!. \n\n A ficha do aluno foi cadastrada! \n\n O número da sua matrícula é "+a.getNroMatricula());
                                            //JOptionPane.showMessageDialog(this, "O número da sua matrícula é "+ a.getNroMatricula() + ".");
                                                                               
                                            limparCampos();
                                        
                                            FichaTreino ft = new FichaTreino();
                
                                            ft.setCodProfessor(codigoProfessor);
                                            ft.setNroMatricula(dao.getCodigo());                                   
                                        
                                            FichaTreinoDao daoFicha = new FichaTreinoDao();
                                            daoFicha.cadastrarFichaTreino(ft);
                                        }   catch(Exception e){
                                                JOptionPane.showMessageDialog(this, "Erro no cadastro de alunos!", "Erro!", JOptionPane.ERROR_MESSAGE);
                                            }
                                            
                                   }
                            }
                    }
            }
    }//GEN-LAST:event_btnCadastrarAlunoActionPerformed

    private void tfNomeAlunoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeAlunoKeyTyped
        // Evento no campo de texto Nome que não permite a inserção de números no campo.
        String caracteres="0987654321";
        
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfNomeAlunoKeyTyped

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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        String frameReferente = "CadastrarAluno";
        
        this.dispose();
        FrmMenuProfessor f = new FrmMenuProfessor(this, codigoProfessor, frameReferente);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAluno;
    private javax.swing.ButtonGroup btnGroupSexo;
    private javax.swing.JButton btnVoltar;
    private com.toedter.calendar.JDateChooser dcDataNascAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton radioBtnFeminino;
    private javax.swing.JRadioButton radioBtnMasculino;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfNomeAluno;
    private javax.swing.JPasswordField tfPasswordAluno;
    private javax.swing.JTextField tfRg;
    // End of variables declaration//GEN-END:variables
}
