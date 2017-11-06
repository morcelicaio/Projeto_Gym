package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.AlunoDao;
import br.com.caio.tcc.dao.ExercicioDao;
import br.com.caio.tcc.dao.ItensFichaTreinoDao;
import br.com.caio.tcc.modelo.Aluno;
import br.com.caio.tcc.modelo.ItensFichaTreino;
import br.com.caio.tcc.modelo.TableModelAlunoFicha;
import br.com.caio.tcc.modelo.TableModelExerciciosDaCategoriaSelecionada;
import br.com.caio.tcc.modelo.TableModelFichaDoAluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrmCadastrarFichaDoAluno extends javax.swing.JFrame {
    private FrmMenuProfessor formCadastrarFichaDoAluno;
    
    private boolean verificaAlunoSelecionado = false;
    private boolean verificaExercicioSelecionado = false;
    private int matriculaAluno;
    private int codigoFicha;
    private int codigoExercicio;
    private int codigoProfessor; 
    
    private String categoria = "";  // variavel usada p pegar o valor categoria da tabela jTableExerciciosOmbros.
    private String nomeExerc = "";  // variavel usada p pegar o valor nomeEx da tabela jTableExerciciosOmbros.
    
    TableModelAlunoFicha tabelaAlunos; // tabela 1
    TableModelExerciciosDaCategoriaSelecionada tabelaExerciciosDaCategoriaSelecionada; // tabela 2
    TableModelFichaDoAluno tabelaItensDaFicha; // tabela 3
    
    public FrmCadastrarFichaDoAluno() {
        initComponents();
        setLocationRelativeTo(null);
        instanciarTabelaDeCategorias();
        instanciarTabelaItensDaFicha();
        preencherTabelaAlunoFicha();
    }
    
    public FrmCadastrarFichaDoAluno(javax.swing.JFrame form, int codigoProfessor){
        this();
        formCadastrarFichaDoAluno = (FrmMenuProfessor) form;
        this.codigoProfessor = codigoProfessor;
    }
    
    public FrmCadastrarFichaDoAluno(javax.swing.JFrame form, int codigoProfessor, String auxiliar){
        this();
        this.codigoProfessor = codigoProfessor;
    }
    
    private void ajustarTamanhoCelulasTabela(javax.swing.JTable jTable, int c0, int c1){
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(c0);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(c1);
    }
    
    // cria o modelo da tabela.
    private void instanciarTabelaItensDaFicha(){
        tabelaItensDaFicha = new TableModelFichaDoAluno();
        jTableItensDaFicha.setModel(tabelaItensDaFicha);
    }
    // cria o modelo da tabela.
    private void instanciarTabelaDeCategorias(){
        tabelaExerciciosDaCategoriaSelecionada = new TableModelExerciciosDaCategoriaSelecionada();
        jTableExerciciosDaCategoriaSelecionada.setModel(tabelaExerciciosDaCategoriaSelecionada);
    }
    
    // preenche a tabela de alunos.
    public void preencherTabelaAlunoFicha(){
        AlunoDao dao = new AlunoDao();
        tabelaAlunos = new TableModelAlunoFicha(dao.listarAlunosFicha());
        jTableAlunos.setModel(tabelaAlunos);
        ajustarTamanhoCelulasTabela(jTableAlunos, 70, 320);
    }
    
    public void preencherTabelaFichaDoAluno(){
        ItensFichaTreinoDao dao = new ItensFichaTreinoDao();
        tabelaItensDaFicha = new TableModelFichaDoAluno(dao.listarItensDaFichaDoAluno(matriculaAluno));
        jTableItensDaFicha.setModel(tabelaItensDaFicha);
    }
    
    public void preencherTabelaCategoriaComExerciciosOmbros(){
        ExercicioDao dao = new ExercicioDao();
        tabelaExerciciosDaCategoriaSelecionada = new TableModelExerciciosDaCategoriaSelecionada(dao.listarExerciciosOmbro());
        jTableExerciciosDaCategoriaSelecionada.setModel(tabelaExerciciosDaCategoriaSelecionada);
    }
    
    public void preencherTabelaCategoriaComExerciciosTorax(){
        ExercicioDao dao = new ExercicioDao();
        tabelaExerciciosDaCategoriaSelecionada = new TableModelExerciciosDaCategoriaSelecionada(dao.listarExerciciosTorax());
        jTableExerciciosDaCategoriaSelecionada.setModel(tabelaExerciciosDaCategoriaSelecionada);
    }
    
    public void preencherTabelaCategoriaComExerciciosBracos(){
        ExercicioDao dao = new ExercicioDao();
        tabelaExerciciosDaCategoriaSelecionada = new TableModelExerciciosDaCategoriaSelecionada(dao.listarExerciciosBracos());
        jTableExerciciosDaCategoriaSelecionada.setModel(tabelaExerciciosDaCategoriaSelecionada);
    }
    
    public void preencherTabelaCategoriaComExerciciosCostas(){
        ExercicioDao dao = new ExercicioDao();
        tabelaExerciciosDaCategoriaSelecionada = new TableModelExerciciosDaCategoriaSelecionada(dao.listarExerciciosCostas());
        jTableExerciciosDaCategoriaSelecionada.setModel(tabelaExerciciosDaCategoriaSelecionada);
    }
    
    public void preencherTabelaCategoriaComExerciciosPernas(){
        ExercicioDao dao = new ExercicioDao();
        tabelaExerciciosDaCategoriaSelecionada = new TableModelExerciciosDaCategoriaSelecionada(dao.listarExerciciosPernas());
        jTableExerciciosDaCategoriaSelecionada.setModel(tabelaExerciciosDaCategoriaSelecionada);
    }
    
    public void preencherTabelaCategoriaComExerciciosAbdominais(){
        ExercicioDao dao = new ExercicioDao();
        tabelaExerciciosDaCategoriaSelecionada = new TableModelExerciciosDaCategoriaSelecionada(dao.listarExerciciosAbdominais());
        jTableExerciciosDaCategoriaSelecionada.setModel(tabelaExerciciosDaCategoriaSelecionada);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        tfBuscaAlunos = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableItensDaFicha = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRetornarMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbNomeAluno = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnOmbros = new javax.swing.JButton();
        btnTorax = new javax.swing.JButton();
        btnBracos = new javax.swing.JButton();
        btnAbdominais = new javax.swing.JButton();
        btnPernas = new javax.swing.JButton();
        btnCostas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableExerciciosDaCategoriaSelecionada = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSpinnerSeries = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jSpinnerRepeticoes = new javax.swing.JSpinner();
        InserirExercicioFicha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Atribuição de ficha");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inserção de exercícios ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlunos);

        tfBuscaAlunos.setText("Digite o nome do aluno:");
        tfBuscaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscaAlunosMouseClicked(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Consultar_Exerc.jpg"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel14.setText("Itens da ficha do aluno");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
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
        jScrollPane3.setViewportView(jTableItensDaFicha);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Selecione o aluno da ficha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel2)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        btnRetornarMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRetornarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnRetornarMenu.setText("Retornar ao menu principal");
        btnRetornarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarMenuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Aluno :");

        lbNomeAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfBuscaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRetornarMenu)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(75, 75, 75)
                                .addComponent(lbNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbNomeAluno))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRetornarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel11.setText("Selecione a categoria desejada");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel11)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        btnOmbros.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnOmbros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Ombros.jpg"))); // NOI18N
        btnOmbros.setText("Ombros");
        btnOmbros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmbrosActionPerformed(evt);
            }
        });

        btnTorax.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTorax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Torax.jpg"))); // NOI18N
        btnTorax.setText("Tórax");
        btnTorax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToraxActionPerformed(evt);
            }
        });

        btnBracos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBracos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Bracos.jpg"))); // NOI18N
        btnBracos.setText("Braços");
        btnBracos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBracosActionPerformed(evt);
            }
        });

        btnAbdominais.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAbdominais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Abdominais.jpg"))); // NOI18N
        btnAbdominais.setText("Abdominais");
        btnAbdominais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbdominaisActionPerformed(evt);
            }
        });

        btnPernas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPernas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Pernas.jpg"))); // NOI18N
        btnPernas.setText("Pernas");
        btnPernas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPernasActionPerformed(evt);
            }
        });

        btnCostas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCostas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Costas.jpg"))); // NOI18N
        btnCostas.setText("Costas");
        btnCostas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostasActionPerformed(evt);
            }
        });

        jTableExerciciosDaCategoriaSelecionada.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableExerciciosDaCategoriaSelecionada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableExerciciosDaCategoriaSelecionadaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableExerciciosDaCategoriaSelecionada);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel12.setText("Quantidade de séries:");

        jLabel13.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel13.setText("Quantidade de repetições:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(34, 34, 34)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jSpinnerSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jSpinnerRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InserirExercicioFicha.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        InserirExercicioFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Ficha.png"))); // NOI18N
        InserirExercicioFicha.setText("Inserir exercício na ficha");
        InserirExercicioFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirExercicioFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(InserirExercicioFicha)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCostas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOmbros))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTorax, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPernas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBracos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAbdominais))))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOmbros, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBracos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTorax, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCostas)
                    .addComponent(btnPernas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbdominais, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InserirExercicioFicha)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String auxiliar;

        auxiliar = tfBuscaAlunos.getText();

        AlunoDao dao = new AlunoDao();

        ArrayList<Aluno> alunos = dao.buscarAlunos(auxiliar);

        if (alunos.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum aluno foi encontrado!", "Advertência!", JOptionPane.ERROR_MESSAGE);
        } else{
            tabelaAlunos = new TableModelAlunoFicha(alunos);
            jTableAlunos.setModel(tabelaAlunos);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfBuscaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscaAlunosMouseClicked
        if(evt.getClickCount() == 1){
            tfBuscaAlunos.setText("");
        }
    }//GEN-LAST:event_tfBuscaAlunosMouseClicked

    private void btnOmbrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmbrosActionPerformed
        preencherTabelaCategoriaComExerciciosOmbros();
        jTableExerciciosDaCategoriaSelecionada.repaint();
    }//GEN-LAST:event_btnOmbrosActionPerformed

    private void btnCostasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostasActionPerformed
        preencherTabelaCategoriaComExerciciosCostas();
        jTableExerciciosDaCategoriaSelecionada.repaint();
    }//GEN-LAST:event_btnCostasActionPerformed

    private void btnPernasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPernasActionPerformed
        preencherTabelaCategoriaComExerciciosPernas();
        jTableExerciciosDaCategoriaSelecionada.repaint();
    }//GEN-LAST:event_btnPernasActionPerformed

    private void btnToraxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToraxActionPerformed
        preencherTabelaCategoriaComExerciciosTorax();
        jTableExerciciosDaCategoriaSelecionada.repaint();
    }//GEN-LAST:event_btnToraxActionPerformed

    private void btnBracosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBracosActionPerformed
        preencherTabelaCategoriaComExerciciosBracos();
        jTableExerciciosDaCategoriaSelecionada.repaint();
    }//GEN-LAST:event_btnBracosActionPerformed

    private void btnAbdominaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbdominaisActionPerformed
        preencherTabelaCategoriaComExerciciosAbdominais();
        jTableExerciciosDaCategoriaSelecionada.repaint();
    }//GEN-LAST:event_btnAbdominaisActionPerformed

    private void InserirExercicioFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirExercicioFichaActionPerformed
        int recebeCodFicha, recebeMatricula;
        int nroSeries, nroRepeticoes;
                
        nroSeries = Integer.parseInt(jSpinnerSeries.getValue().toString());
        nroRepeticoes = Integer.parseInt(jSpinnerRepeticoes.getValue().toString());
        
        if(verificaAlunoSelecionado == false){
            JOptionPane.showMessageDialog(this, "Atenção!.\nSelecionar um aluno!", "Advertência!", JOptionPane.ERROR_MESSAGE);
        }   else{
                if(verificaExercicioSelecionado == false){
                    JOptionPane.showMessageDialog(this, "Atenção!.\nSelecionar um exercício!", "Advertência!", JOptionPane.ERROR_MESSAGE);
                }   else{
                        if((nroSeries <= 0) || (nroRepeticoes <= 0)){
                            JOptionPane.showMessageDialog(this, "Selecione o exercício e as quantidades corretamente!", "Advertência!", JOptionPane.ERROR_MESSAGE);
                        }   else{
                                ItensFichaTreino novaFicha = new ItensFichaTreino();
                                
                                try{
                                    novaFicha.setCodFicha(codigoFicha);
                                    novaFicha.setCodExercicio(codigoExercicio);
                                    novaFicha.setNroMatricula(matriculaAluno);
                                    novaFicha.setCategoria(categoria);
                                    novaFicha.setNomeExercicio(nomeExerc);
                                    novaFicha.setNroSeries(nroSeries);
                                    novaFicha.setNroRepeticoes(nroRepeticoes);                          

                                    ItensFichaTreinoDao daoItens = new ItensFichaTreinoDao();

                                    if(!daoItens.verificarExercicioNaFicha(codigoFicha, codigoExercicio)){

                                        daoItens.cadastrarItensDaFicha(novaFicha, codigoFicha, codigoExercicio);

                                        JOptionPane.showMessageDialog(this, "Exercício adicionado à ficha.");
                                        preencherTabelaFichaDoAluno();
                                    }   else{
                                            JOptionPane.showMessageDialog(this, "Este exercício já existe na ficha!.  \n\n Insira outro exercício.", "Erro!", JOptionPane.ERROR_MESSAGE); 
                                        }
                                }   catch(Exception e){
                                        JOptionPane.showMessageDialog(this, "Erro na inserção de itens!", "Erro!", JOptionPane.ERROR_MESSAGE);
                                    }
                            }
                    }
            }
    }//GEN-LAST:event_InserirExercicioFichaActionPerformed

    private void btnRetornarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarMenuActionPerformed
        String frameReferente = "CadastrarFichaDoAluno";
        
        this.dispose();
        FrmMenuProfessor f = new FrmMenuProfessor(this, codigoProfessor, frameReferente);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnRetornarMenuActionPerformed

    private void jTableExerciciosDaCategoriaSelecionadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableExerciciosDaCategoriaSelecionadaMouseClicked
        verificaExercicioSelecionado = true;
        // aqui pego os valores que vem da tabela e coloco em variáveis criadas lá no topo do frame.
        for(int i=0; i <= jTableExerciciosDaCategoriaSelecionada.getSelectedRow(); i++){  
         //As variáveis recebem os valores da JTable
            codigoExercicio = (int) jTableExerciciosDaCategoriaSelecionada.getValueAt(i, 0);
            categoria = (String) jTableExerciciosDaCategoriaSelecionada.getValueAt(i, 1);  
            nomeExerc = (String) jTableExerciciosDaCategoriaSelecionada.getValueAt(i, 2);
        }
    }//GEN-LAST:event_jTableExerciciosDaCategoriaSelecionadaMouseClicked

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        String labelNomeAluno = "";
        // aqui pego os valores que vem da tabela e coloco em variáveis criadas lá no topo do frame.    
        for(int i=0; i <= jTableAlunos.getSelectedRow(); i++){  
         //As variáveis recebem os valores da JTable
            matriculaAluno = (int) jTableAlunos.getValueAt(i, 0);
            labelNomeAluno = (String) jTableAlunos.getValueAt(i, 1);
        }
        
        lbNomeAluno.setText(labelNomeAluno);
        codigoFicha = matriculaAluno + 0;
        
        preencherTabelaFichaDoAluno();
        verificaAlunoSelecionado = true;
        
    }//GEN-LAST:event_jTableAlunosMouseClicked

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarFichaDoAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InserirExercicioFicha;
    private javax.swing.JButton btnAbdominais;
    private javax.swing.JButton btnBracos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCostas;
    private javax.swing.JButton btnOmbros;
    private javax.swing.JButton btnPernas;
    private javax.swing.JButton btnRetornarMenu;
    private javax.swing.JButton btnTorax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinnerRepeticoes;
    private javax.swing.JSpinner jSpinnerSeries;
    private javax.swing.JTable jTableAlunos;
    private javax.swing.JTable jTableExerciciosDaCategoriaSelecionada;
    private javax.swing.JTable jTableItensDaFicha;
    private javax.swing.JLabel lbNomeAluno;
    private javax.swing.JTextField tfBuscaAlunos;
    // End of variables declaration//GEN-END:variables
}
