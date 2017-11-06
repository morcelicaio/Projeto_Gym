package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.ExercicioDao;
import br.com.caio.tcc.modelo.Exercicio;
import java.io.File;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FrmAlterarExercicio2 extends javax.swing.JFrame {
    private FrmAlterarExercicio fAlteracaoExercicio;
    
    private Exercicio e = new Exercicio();
    private JFileChooser fc;
    private File arquivo;
    private boolean verificaImagemNulaOuNao = false;
    
    private String categoriaExercicio;
    private int codigoExercicio;
    private int recebeCodProf; 
    
    public FrmAlterarExercicio2() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void configurarOpcoesExercicio(Exercicio e) {
        if(e.getCategoriaExercicio().equals("Ombros")){
            rBtnOmbros.setSelected(true);
        }   else{
                if(e.getCategoriaExercicio().equals("Tórax")){
                    rBtnTorax.setSelected(true);
                }   else{
                        if(e.getCategoriaExercicio().equals("Pernas")){
                            rBtnPernas.setSelected(true);
                        }   else{
                                if(e.getCategoriaExercicio().equals("Bracos")){
                                    rBtnBracos.setSelected(true);
                                }   else{
                                        if(e.getCategoriaExercicio().equals("Costas")){
                                            rBtnCostas.setSelected(true);
                                        }   else{
                                                if(e.getCategoriaExercicio().equals("Abdominais")){
                                                    rBtnAbdominais.setSelected(true);
                                                }
                                            }   
                                    }
                            }          
                    }
            }
    }
    
    public FrmAlterarExercicio2(javax.swing.JFrame form, Exercicio e, int codProf) {        
        this();
        fAlteracaoExercicio = (FrmAlterarExercicio) form;
        
        this.recebeCodProf = codProf;
        configurarOpcoesExercicio(e);
        tfNomeExercicio.setText(e.getNomeExercicio());
        //rogerio - lbFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/CadastrarAluno.jpg")));
        txtAreaDescricaoExerc.setText(e.getFuncaoExercicio());
        
        ExercicioDao dao = new ExercicioDao();
        lbFoto.setIcon(new ImageIcon(dao.abrirFoto(e.getCodExercicio())));
        codigoExercicio = e.getCodExercicio();
        this.e = e;
             
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupCategoria = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rBtnOmbros = new javax.swing.JRadioButton();
        rBtnTorax = new javax.swing.JRadioButton();
        rBtnPernas = new javax.swing.JRadioButton();
        rBtnBracos = new javax.swing.JRadioButton();
        rBtnCostas = new javax.swing.JRadioButton();
        rBtnAbdominais = new javax.swing.JRadioButton();
        tfNomeExercicio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescricaoExerc = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        lbFoto = new javax.swing.JLabel();
        btnRetornar = new javax.swing.JButton();
        btnAlterarExercicio = new javax.swing.JButton();
        btnCarregarImagem = new javax.swing.JButton();
        btnExcluirExercicio = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Alteração de exercícios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alteração de exercícios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Insira os novos dados do exercício");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nome do exercício:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Selecione a categoria do exercício:");

        btnGroupCategoria.add(rBtnOmbros);
        rBtnOmbros.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rBtnOmbros.setSelected(true);
        rBtnOmbros.setText("Ombros");

        btnGroupCategoria.add(rBtnTorax);
        rBtnTorax.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rBtnTorax.setText("Tórax");

        btnGroupCategoria.add(rBtnPernas);
        rBtnPernas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rBtnPernas.setText("Pernas");

        btnGroupCategoria.add(rBtnBracos);
        rBtnBracos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rBtnBracos.setText("Braços");

        btnGroupCategoria.add(rBtnCostas);
        rBtnCostas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rBtnCostas.setText("Costas");

        btnGroupCategoria.add(rBtnAbdominais);
        rBtnAbdominais.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rBtnAbdominais.setText("Abdominais");

        tfNomeExercicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeExercicioKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Descrição do exercício:");

        txtAreaDescricaoExerc.setColumns(20);
        txtAreaDescricaoExerc.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescricaoExerc);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(321, 252));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRetornar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnRetornar.setText("Retornar");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        btnAlterarExercicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterarExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/AlterarExerc.jpg"))); // NOI18N
        btnAlterarExercicio.setText("Alterar exercício");
        btnAlterarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarExercicioActionPerformed(evt);
            }
        });

        btnCarregarImagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCarregarImagem.setText("Imagem");
        btnCarregarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarImagemActionPerformed(evt);
            }
        });

        btnExcluirExercicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExcluirExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Excluir.png"))); // NOI18N
        btnExcluirExercicio.setText("Excluir");
        btnExcluirExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirExercicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNomeExercicio))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rBtnOmbros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rBtnTorax)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rBtnPernas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rBtnBracos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rBtnCostas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rBtnAbdominais))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRetornar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirExercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarExercicio))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCarregarImagem)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnOmbros)
                    .addComponent(rBtnTorax)
                    .addComponent(rBtnPernas)
                    .addComponent(rBtnBracos)
                    .addComponent(rBtnCostas)
                    .addComponent(rBtnAbdominais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnCarregarImagem)
                        .addContainerGap(200, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAlterarExercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluirExercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        String frameReferente = "AlterarExercicio2";
        
        this.dispose();                 
        FrmAlterarExercicio f = new FrmAlterarExercicio(this, recebeCodProf, frameReferente);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void btnAlterarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarExercicioActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(this, "Confirma as alterações?", "Confirmação de Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                                
        if (confirmacao == JOptionPane.YES_OPTION){
            if(rBtnOmbros.isSelected()){
                categoriaExercicio = "Ombros";
            }   else{
                    if(rBtnTorax.isSelected()){
                        categoriaExercicio = "Tórax";
                    }  else{
                           if(rBtnPernas.isSelected()){
                               categoriaExercicio = "Pernas";
                           }  else{
                                  if(rBtnBracos.isSelected()){
                                      categoriaExercicio = "Bracos";
                                  } else{
                                        if(rBtnCostas.isSelected()){
                                            categoriaExercicio = "Costas";
                                        }  else{
                                               categoriaExercicio = "Abdominais"; 
                                           }   
                                    }
                              } 
                       }   
                } // FIM do if  Categoria

        if(tfNomeExercicio.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Informe o nome do exercício!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }   else{
                if(txtAreaDescricaoExerc.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Informe a descrição do exercício!", "Erro!", JOptionPane.ERROR_MESSAGE);
                }   else{
                        try{
                            e.setCategoriaExercicio(categoriaExercicio);
                            e.setNomeExercicio(tfNomeExercicio.getText());
                            e.setFuncaoExercicio(txtAreaDescricaoExerc.getText());

                            ExercicioDao dao = new ExercicioDao();

                            if(verificaImagemNulaOuNao){
                                dao.alterarExercicio(e, arquivo);
                                JOptionPane.showMessageDialog(this, "Exercício alterado com sucesso!");
                            }   else{
                                    dao.alterarExercicio(e);
                                    JOptionPane.showMessageDialog(this, "Exercício alterado com sucesso!");
                                }

                            this.dispose();

                            String frameReferente = "";

                            FrmAlterarExercicio f = new FrmAlterarExercicio(this, recebeCodProf, frameReferente);
                            f.setVisible(true);
                            f.setAlwaysOnTop(true);

                        }   catch(Exception e){
                                JOptionPane.showMessageDialog(this, "Erro na alteração de exercícios!", "Erro!", JOptionPane.ERROR_MESSAGE);
                            }
                    }
            }
        }
        
        
    }//GEN-LAST:event_btnAlterarExercicioActionPerformed

    private void btnCarregarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarImagemActionPerformed
        verificaImagemNulaOuNao = true;
        
        fc = new JFileChooser();
        fc.setDialogTitle("Escolha o arquivo");
        int retorno = fc.showOpenDialog(this);
        if (retorno == JFileChooser.APPROVE_OPTION){
            arquivo = fc.getSelectedFile();      
            lbFoto.setIcon(new ImageIcon(arquivo.toString()));
            JOptionPane.showMessageDialog(this, "ate aqui blz"); // testando
            System.out.println(fc.getSelectedFile());// testando
        }
    }//GEN-LAST:event_btnCarregarImagemActionPerformed

    private void tfNomeExercicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeExercicioKeyTyped
        // Evento no campo de texto NomeExercicio que não permite a inserção de números no campo.
        String caracteres="0987654321";
        
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfNomeExercicioKeyTyped

    private void btnExcluirExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirExercicioActionPerformed
        Exercicio e = new Exercicio();
        
        e.setCodExercicio(codigoExercicio);
        
        ExercicioDao dao = new ExercicioDao();
        dao.excluirExercicio(e);
        
        JOptionPane.showMessageDialog(this, "Dados removidos com sucesso!");
        
        new FrmAlterarExercicio().show();        
        fAlteracaoExercicio.atualizarTabelaTodosExercicios();
        this.dispose();
    }//GEN-LAST:event_btnExcluirExercicioActionPerformed
    
    
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlterarExercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarExercicio;
    private javax.swing.JButton btnCarregarImagem;
    private javax.swing.JButton btnExcluirExercicio;
    private javax.swing.ButtonGroup btnGroupCategoria;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JRadioButton rBtnAbdominais;
    private javax.swing.JRadioButton rBtnBracos;
    private javax.swing.JRadioButton rBtnCostas;
    private javax.swing.JRadioButton rBtnOmbros;
    private javax.swing.JRadioButton rBtnPernas;
    private javax.swing.JRadioButton rBtnTorax;
    private javax.swing.JTextField tfNomeExercicio;
    private javax.swing.JTextArea txtAreaDescricaoExerc;
    // End of variables declaration//GEN-END:variables
}
