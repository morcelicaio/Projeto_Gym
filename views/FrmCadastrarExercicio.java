package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.ExercicioDao;
import br.com.caio.tcc.imagem.excecao.ErroConexaoException;
import br.com.caio.tcc.modelo.Exercicio;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FrmCadastrarExercicio extends javax.swing.JFrame {
    private FrmMenuProfessor formCadastrarExercicio;
    
    private int recebeCodProf;
    
    private JFileChooser fc;
    private File arquivo;
    
    public FrmCadastrarExercicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
    }
    
    public FrmCadastrarExercicio(javax.swing.JFrame form, int codProf){
        this();
        formCadastrarExercicio = (FrmMenuProfessor) form;
        
        this.recebeCodProf = codProf;
    }
    
    public void limparCampos(){
        tfNomeExercicio.setText("");
        txtAreaDescricaoExerc.setText("");
        lbFoto.setIcon(new ImageIcon());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupCategoria = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rBtnOmbros = new javax.swing.JRadioButton();
        rBtnTorax = new javax.swing.JRadioButton();
        rBtnPernas = new javax.swing.JRadioButton();
        rBtnAbdominais = new javax.swing.JRadioButton();
        rBtnCostas = new javax.swing.JRadioButton();
        rBtnBracos = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        tfNomeExercicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescricaoExerc = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lbFoto = new javax.swing.JLabel();
        btnRetornar = new javax.swing.JButton();
        btnCadastrarExerc = new javax.swing.JButton();
        btnCarregarImagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Cadastro de exercícios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de exercícios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Insira os dados do exercício");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(143, 143, 143))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Selecione a categoria do exercício:");

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

        btnGroupCategoria.add(rBtnAbdominais);
        rBtnAbdominais.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rBtnAbdominais.setText("Abdominais");

        btnGroupCategoria.add(rBtnCostas);
        rBtnCostas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rBtnCostas.setText("Costas");

        btnGroupCategoria.add(rBtnBracos);
        rBtnBracos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rBtnBracos.setText("Braços");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nome do exercício:");

        tfNomeExercicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeExercicioKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Descrição do exercício:");

        txtAreaDescricaoExerc.setColumns(20);
        txtAreaDescricaoExerc.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescricaoExerc);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRetornar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnRetornar.setText("Retornar ao menu principal");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        btnCadastrarExerc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCadastrarExerc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Cadastrar_Exercicio.png"))); // NOI18N
        btnCadastrarExerc.setText("Cadastrar exercício");
        btnCadastrarExerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarExercActionPerformed(evt);
            }
        });

        btnCarregarImagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCarregarImagem.setText("Imagem");
        btnCarregarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNomeExercicio))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarregarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnRetornar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadastrarExerc))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(rBtnOmbros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rBtnTorax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rBtnPernas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rBtnBracos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rBtnCostas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rBtnAbdominais)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnOmbros)
                    .addComponent(rBtnTorax)
                    .addComponent(rBtnPernas)
                    .addComponent(rBtnBracos)
                    .addComponent(rBtnCostas)
                    .addComponent(rBtnAbdominais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNomeExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnCarregarImagem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarExerc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnCadastrarExercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarExercActionPerformed
        String categoria = "";
        
        if(rBtnOmbros.isSelected()){
            categoria = "Ombros";
        }  else{
             if(rBtnTorax.isSelected()){
                 categoria = "Tórax";
             }  else{
                  if(rBtnPernas.isSelected()){
                      categoria = "Pernas";
                  }  else{
                       if(rBtnBracos.isSelected()){
                           categoria = "Bracos";
                       }  else{
                            if(rBtnCostas.isSelected()){
                                categoria = "Costas";
                            }  else{
                                  if(rBtnAbdominais.isSelected()){
                                      categoria = "Abdominais";
                                  }
                                }
                          }  
                     }
                }   
            } 
        // FIM DO RADIOBUTTON categoria
        
        if(tfNomeExercicio.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Informe o nome do exercício!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }   else{               
                if(txtAreaDescricaoExerc.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Informe a descrição do exercício!", "Erro!", JOptionPane.ERROR_MESSAGE);
                }   else{
                        if (arquivo == null){
                            JOptionPane.showMessageDialog(this, "Nenhuma imagem foi encontrada!");
                        }   else{
                                Exercicio e = new Exercicio();
                                
                                try{
                                    e.setCategoriaExercicio(categoria);
                                    e.setNomeExercicio(tfNomeExercicio.getText());
                                    e.setFuncaoExercicio(txtAreaDescricaoExerc.getText());

                                    ExercicioDao dao = new ExercicioDao();
                                    dao.cadastrarExercicio(e, arquivo);
                                    JOptionPane.showMessageDialog(this, "Exercício cadastrado com sucesso!");

                                    limparCampos();
                                }   catch(ErroConexaoException E){
                                        JOptionPane.showMessageDialog(this, "Erro no cadastro de exercícios!", "Erro!", JOptionPane.ERROR_MESSAGE);
                                    }
                            }     
                    }
            }
    }//GEN-LAST:event_btnCadastrarExercActionPerformed

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        String frameReferente = "ConsultarFichaProfessor";
        
        this.dispose();
        FrmMenuProfessor f = new FrmMenuProfessor(this, recebeCodProf, frameReferente);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void btnCarregarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarImagemActionPerformed
        //Exercicio e = new Exercicio();  voltar essa linha depois de testar
        fc = new JFileChooser();
        fc.setDialogTitle("Escolha o arquivo");
        int retorno = fc.showOpenDialog(this);
        if (retorno == JFileChooser.APPROVE_OPTION){
            arquivo = fc.getSelectedFile();      
            lbFoto.setIcon(new ImageIcon(arquivo.toString()));
        }
    }//GEN-LAST:event_btnCarregarImagemActionPerformed

    private void tfNomeExercicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeExercicioKeyTyped
        // Evento no campo de texto NomeExercicio que não permite a inserção de números no campo.
        String caracteres="0987654321";
        
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfNomeExercicioKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarExercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarExerc;
    private javax.swing.JButton btnCarregarImagem;
    private javax.swing.ButtonGroup btnGroupCategoria;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
