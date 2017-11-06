package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.ExercicioDao;
import br.com.caio.tcc.modelo.Exercicio;
import br.com.caio.tcc.modelo.TableModelExAbdomen;
import br.com.caio.tcc.modelo.TableModelExBraco;
import br.com.caio.tcc.modelo.TableModelExCosta;
import br.com.caio.tcc.modelo.TableModelExOmbro;
import br.com.caio.tcc.modelo.TableModelExPerna;
import br.com.caio.tcc.modelo.TableModelExTorax;
import javax.swing.JOptionPane;

public class FrmConsultarExercicio2 extends javax.swing.JFrame {
    private FrmConsultarExercicio formSelecionarExercicio;
    
    public String tipoDoUsuario;
    private String categoriaSelecionada;
    private int recebeCodProf, recebeMatriculaAluno;
    private int codProfOuAluno;
    
    TableModelExOmbro tabelaExerciciosOmbros;
    TableModelExTorax tabelaExerciciosTorax;
    TableModelExBraco tabelaExerciciosBracos;
    TableModelExCosta tabelaExerciciosCostas;
    TableModelExPerna tabelaExerciciosPernas;
    TableModelExAbdomen tabelaExerciciosAbdominais;
    
    public FrmConsultarExercicio2(){
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public FrmConsultarExercicio2(javax.swing.JFrame form, String frame3QueRetorna, String categoriaQueRetorna, String tipoUsuario, int codAlunoOuProfessor){
        this();
        this.tipoDoUsuario = tipoUsuario;
        this.categoriaSelecionada = categoriaQueRetorna;
                    
        if(tipoDoUsuario.equals("Aluno")){
            recebeMatriculaAluno = codAlunoOuProfessor;
            codProfOuAluno = recebeMatriculaAluno + 0;
        }   else{
                recebeCodProf = codAlunoOuProfessor;
                codProfOuAluno = recebeCodProf + 0;
            }
        
        if(categoriaSelecionada.equals("Ombros")){
            carregarTabelaExerciciosOmbros();
        }   else{
              if(categoriaSelecionada.equals("Tórax")){
                carregarTabelaExerciciosTorax();
              } else{
                  if(categoriaSelecionada.equals("Bracos")){
                    carregarTabelaExerciciosBracos();    
                  } else{
                      if(categoriaSelecionada.equals("Costas")){
                        carregarTabelaExerciciosCostas();    
                      } else{
                          if(categoriaSelecionada.equals("Pernas")){
                            carregarTabelaExerciciosPernas();    
                          } else{
                              if(categoriaSelecionada.equals("Abdominais")){
                                carregarTabelaExerciciosAbdominais();      
                              }    
                            } 
                        } 
                    }     
                }   
            }
        // FIM da categoriaSelecionada
    }
    
    public FrmConsultarExercicio2(javax.swing.JFrame form, String categSelecionada, String tipoUsuario, int codAlunoOuProfessor){
        this();
        this.categoriaSelecionada = categSelecionada;
        this.tipoDoUsuario = tipoUsuario;
        
        formSelecionarExercicio = (FrmConsultarExercicio) form;
        
        if(tipoDoUsuario.equals("Aluno")){
            recebeMatriculaAluno = codAlunoOuProfessor;
        }   else{
                recebeCodProf = codAlunoOuProfessor;
            }
        
        if(categoriaSelecionada.equals("Ombros")){
            carregarTabelaExerciciosOmbros();
        }   else{
              if(categoriaSelecionada.equals("Tórax")){
                carregarTabelaExerciciosTorax();
              } else{
                  if(categoriaSelecionada.equals("Bracos")){
                    carregarTabelaExerciciosBracos();    
                  } else{
                      if(categoriaSelecionada.equals("Costas")){
                        carregarTabelaExerciciosCostas();    
                      } else{
                          if(categoriaSelecionada.equals("Pernas")){
                            carregarTabelaExerciciosPernas();    
                          } else{
                              if(categoriaSelecionada.equals("Abdominais")){
                                carregarTabelaExerciciosAbdominais();      
                              }    
                            } 
                        } 
                    }     
                }   
            }
        // FIM da categoriaSelecionada
    }
    
    private void carregarTabelaExerciciosOmbros(){
        ExercicioDao dao = new ExercicioDao();
        tabelaExerciciosOmbros = new TableModelExOmbro(dao.listarExerciciosOmbro());
        jTableExercicios.setModel(tabelaExerciciosOmbros);
    }
    
    private void carregarTabelaExerciciosTorax(){
        ExercicioDao dao = new ExercicioDao();
        tabelaExerciciosTorax = new TableModelExTorax(dao.listarExerciciosTorax());
        jTableExercicios.setModel(tabelaExerciciosTorax);
    }
    
    private void carregarTabelaExerciciosBracos(){
        ExercicioDao dao = new ExercicioDao();
        tabelaExerciciosBracos = new TableModelExBraco(dao.listarExerciciosBracos());
        jTableExercicios.setModel(tabelaExerciciosBracos);
    }
    
    private void carregarTabelaExerciciosCostas(){
        ExercicioDao dao = new ExercicioDao();
        tabelaExerciciosCostas = new TableModelExCosta(dao.listarExerciciosCostas());
        jTableExercicios.setModel(tabelaExerciciosCostas);
    }
    
    private void carregarTabelaExerciciosPernas(){
        ExercicioDao dao = new ExercicioDao();
        tabelaExerciciosPernas = new TableModelExPerna(dao.listarExerciciosPernas());
        jTableExercicios.setModel(tabelaExerciciosPernas);
    }
    
    private void carregarTabelaExerciciosAbdominais(){
        ExercicioDao dao = new ExercicioDao();
        tabelaExerciciosAbdominais = new TableModelExAbdomen(dao.listarExerciciosAbdominais());
        jTableExercicios.setModel(tabelaExerciciosAbdominais);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableExercicios = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnConsultarExercicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Consulta de exercício");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de exercícios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTableExercicios.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableExercicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableExerciciosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableExercicios);

        btnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnConsultarExercicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConsultarExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Consultar_Exerc.jpg"))); // NOI18N
        btnConsultarExercicio.setText("Consultar");
        btnConsultarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarExercicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultarExercicio)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnConsultarExercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void btnConsultarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarExercicioActionPerformed
        int linhaSelecionada = jTableExercicios.getSelectedRow();
        
        if(linhaSelecionada < 0){
            JOptionPane.showMessageDialog(this, "Selecione um exercício!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else{
            if(tipoDoUsuario.equals("Professor")){
                if(categoriaSelecionada.equals("Ombros")){
                    tabelaExerciciosOmbros = (TableModelExOmbro)jTableExercicios.getModel();           
                    Exercicio exercicio = tabelaExerciciosOmbros.retornarObjetoExercicioSelecionado(linhaSelecionada);
                  
                    FrmConsultarExercicio3 f = new FrmConsultarExercicio3(this, exercicio, categoriaSelecionada,tipoDoUsuario, recebeCodProf);
                    f.setVisible(true);
                    f.setAlwaysOnTop(true);
            
                    this.dispose();
                } else{
                    if(categoriaSelecionada.equals("Tórax")){
                        tabelaExerciciosTorax = (TableModelExTorax)jTableExercicios.getModel();           
                        Exercicio exercicio = tabelaExerciciosTorax.retornarObjetoExercicioSelecionado(linhaSelecionada);
                 
                        FrmConsultarExercicio3 f = new FrmConsultarExercicio3(this, exercicio, categoriaSelecionada, tipoDoUsuario, recebeCodProf);
                        f.setVisible(true);
                        f.setAlwaysOnTop(true);
            
                        this.dispose();
                    } else{
                        if(categoriaSelecionada.equals("Bracos")){
                            tabelaExerciciosBracos = (TableModelExBraco)jTableExercicios.getModel();           
                            Exercicio exercicio = tabelaExerciciosBracos.retornarObjetoExercicioSelecionado(linhaSelecionada); 
                 
                            FrmConsultarExercicio3 f = new FrmConsultarExercicio3(this, exercicio, categoriaSelecionada, tipoDoUsuario, recebeCodProf);
                            f.setVisible(true);
                            f.setAlwaysOnTop(true);
            
                            this.dispose();
                        } else{
                            if(categoriaSelecionada.equals("Costas")){
                                tabelaExerciciosCostas = (TableModelExCosta)jTableExercicios.getModel();           
                                Exercicio exercicio = tabelaExerciciosCostas.retornarObjetoExercicioSelecionado(linhaSelecionada);
                                
                                FrmConsultarExercicio3 f = new FrmConsultarExercicio3(this, exercicio, categoriaSelecionada, tipoDoUsuario, recebeCodProf);
                                f.setVisible(true);
                                f.setAlwaysOnTop(true);
                                
                                this.dispose();
                            } else{
                                if(categoriaSelecionada.equals("Pernas")){
                                    tabelaExerciciosPernas = (TableModelExPerna)jTableExercicios.getModel();           
                                    Exercicio exercicio = tabelaExerciciosPernas.retornarObjetoExercicioSelecionado(linhaSelecionada);
                                
                                    FrmConsultarExercicio3 f = new FrmConsultarExercicio3(this, exercicio, categoriaSelecionada, tipoDoUsuario, recebeCodProf);
                                    f.setVisible(true);
                                    f.setAlwaysOnTop(true);
            
                                    this.dispose();
                                } else{
                                    if(categoriaSelecionada.equals("Abdominais")){
                                        tabelaExerciciosAbdominais = (TableModelExAbdomen)jTableExercicios.getModel();           
                                        Exercicio exercicio = tabelaExerciciosAbdominais.retornarObjetoExercicioSelecionado(linhaSelecionada);
                 
                                        FrmConsultarExercicio3 f = new FrmConsultarExercicio3(this, exercicio, categoriaSelecionada, tipoDoUsuario, recebeCodProf);
                                        f.setVisible(true);
                                        f.setAlwaysOnTop(true);
                                        
                                        this.dispose();
                                    } 
                                  }
                              } 
                          } 
                      }     
                  }   
            }   else{
                    // INICIO DO ELSE  DE ALUNO
                    if(categoriaSelecionada.equals("Ombros")){
                        tabelaExerciciosOmbros = (TableModelExOmbro)jTableExercicios.getModel();           
                        Exercicio exercicio = tabelaExerciciosOmbros.retornarObjetoExercicioSelecionado(linhaSelecionada);
                  
                        FrmConsultarExercicio3 f = new FrmConsultarExercicio3(this, exercicio, categoriaSelecionada,tipoDoUsuario, recebeMatriculaAluno);
                        f.setVisible(true);
                        f.setAlwaysOnTop(true);
            
                        this.dispose();
                    } else{
                        if(categoriaSelecionada.equals("Tórax")){
                            tabelaExerciciosTorax = (TableModelExTorax)jTableExercicios.getModel();           
                            Exercicio exercicio = tabelaExerciciosTorax.retornarObjetoExercicioSelecionado(linhaSelecionada);
                 
                            FrmConsultarExercicio3 f = new FrmConsultarExercicio3(this, exercicio, categoriaSelecionada, tipoDoUsuario, recebeMatriculaAluno);
                            f.setVisible(true);
                            f.setAlwaysOnTop(true);
            
                            this.dispose();
                        } else{
                            if(categoriaSelecionada.equals("Bracos")){
                                tabelaExerciciosBracos = (TableModelExBraco)jTableExercicios.getModel();           
                                Exercicio exercicio = tabelaExerciciosBracos.retornarObjetoExercicioSelecionado(linhaSelecionada); 
                                
                                FrmConsultarExercicio3 f = new FrmConsultarExercicio3(this, exercicio, categoriaSelecionada, tipoDoUsuario, recebeMatriculaAluno);
                                f.setVisible(true);
                                f.setAlwaysOnTop(true);
            
                                this.dispose();
                            } else{
                                if(categoriaSelecionada.equals("Costas")){
                                    tabelaExerciciosCostas = (TableModelExCosta)jTableExercicios.getModel();           
                                    Exercicio exercicio = tabelaExerciciosCostas.retornarObjetoExercicioSelecionado(linhaSelecionada);
                                    
                                    FrmConsultarExercicio3 f = new FrmConsultarExercicio3(this, exercicio, categoriaSelecionada, tipoDoUsuario, recebeMatriculaAluno);
                                    f.setVisible(true);
                                    f.setAlwaysOnTop(true);
                                
                                    this.dispose();
                                } else{
                                    if(categoriaSelecionada.equals("Pernas")){
                                        tabelaExerciciosPernas = (TableModelExPerna)jTableExercicios.getModel();           
                                        Exercicio exercicio = tabelaExerciciosPernas.retornarObjetoExercicioSelecionado(linhaSelecionada);
                                
                                        FrmConsultarExercicio3 f = new FrmConsultarExercicio3(this, exercicio, categoriaSelecionada, tipoDoUsuario, recebeMatriculaAluno);
                                        f.setVisible(true);
                                        f.setAlwaysOnTop(true);
            
                                        this.dispose();
                                    } else{
                                        if(categoriaSelecionada.equals("Abdominais")){
                                            tabelaExerciciosAbdominais = (TableModelExAbdomen)jTableExercicios.getModel();           
                                            Exercicio exercicio = tabelaExerciciosAbdominais.retornarObjetoExercicioSelecionado(linhaSelecionada);
                 
                                            FrmConsultarExercicio3 f = new FrmConsultarExercicio3(this, exercicio, categoriaSelecionada, tipoDoUsuario, recebeMatriculaAluno);
                                            f.setVisible(true);
                                            f.setAlwaysOnTop(true);
                                        
                                            this.dispose();
                                        } 
                                      }
                                  }
                              }
                          }
                      }  
                }
          }
    }//GEN-LAST:event_btnConsultarExercicioActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
            if(tipoDoUsuario.equals("Aluno")){
            String frameReferente = "ConsultarExercicio";
            
            this.dispose();
            FrmConsultarExercicio f = new FrmConsultarExercicio(this, frameReferente, tipoDoUsuario, recebeMatriculaAluno);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
        }   else{
                if(tipoDoUsuario.equals("Professor")){
                    String frameReferente = "ConsultarExercicio";
        
                    this.dispose();
                    FrmConsultarExercicio f = new FrmConsultarExercicio(this, frameReferente, tipoDoUsuario, recebeCodProf);
                    f.setVisible(true);
                    f.setAlwaysOnTop(true);
                }
            }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jTableExerciciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableExerciciosMouseClicked
    }//GEN-LAST:event_jTableExerciciosMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultarExercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarExercicio;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableExercicios;
    // End of variables declaration//GEN-END:variables
}
