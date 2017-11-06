package br.com.caio.tcc.apresentacao;

public class FrmConsultarExercicio extends javax.swing.JFrame {
    private FrmMenuProfessor formConsultarExercicioProf;
    private FrmMenuAluno     formConsultarExercicioAluno;
 
    private String tipoDeUsuario;
    private int recebeCodProf, recebeMatriculaAluno;
    
    public FrmConsultarExercicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
    }
    
    public FrmConsultarExercicio(javax.swing.JFrame form, String tipoUsuario, int codAlunoOuProfessor){
        this();
        tipoDeUsuario = tipoUsuario;
        
        if(tipoUsuario.equals("Aluno")){
            formConsultarExercicioAluno = (FrmMenuAluno) form;
            this.recebeMatriculaAluno = codAlunoOuProfessor;
            //System.out.println("Aqui é aluno que vem do menu aluno ");
        }   else{
                formConsultarExercicioProf = (FrmMenuProfessor) form;
                this.recebeCodProf = codAlunoOuProfessor;
                //System.out.println("Aqui é prof que vem do menu prof");
            }   
    }
    
    public FrmConsultarExercicio(javax.swing.JFrame form, String auxiliar, String tipoUsuario, int codAlunoOuProfessor){
        this();

        if(tipoUsuario.equals("Aluno")){
            this.recebeMatriculaAluno = codAlunoOuProfessor;
            tipoDeUsuario = tipoUsuario;
        }   else{
                this.recebeCodProf = codAlunoOuProfessor;
                this.tipoDeUsuario = tipoUsuario;
            }   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOmbros = new javax.swing.JButton();
        btnTorax = new javax.swing.JButton();
        btnBraços = new javax.swing.JButton();
        btnPernas = new javax.swing.JButton();
        btnAbdominais = new javax.swing.JButton();
        btnRetornarMenu = new javax.swing.JButton();
        btnCostas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM - Consulta de exercício");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de exercícios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Selecione a categoria desejada");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
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

        btnBraços.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBraços.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Bracos.jpg"))); // NOI18N
        btnBraços.setText("Braços");
        btnBraços.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBraçosActionPerformed(evt);
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

        btnAbdominais.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAbdominais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Abdominais.jpg"))); // NOI18N
        btnAbdominais.setText("Abdominais");
        btnAbdominais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbdominaisActionPerformed(evt);
            }
        });

        btnRetornarMenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRetornarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnRetornarMenu.setText("Retornar ao menu principal");
        btnRetornarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarMenuActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOmbros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCostas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTorax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPernas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAbdominais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBraços, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnRetornarMenu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOmbros, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTorax, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBraços, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCostas)
                    .addComponent(btnPernas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbdominais, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnRetornarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnRetornarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarMenuActionPerformed
        if(tipoDeUsuario.equals("Aluno")){
            String frameReferente = "ConsultarExercicio";
        
            this.dispose();
            FrmMenuAluno f = new FrmMenuAluno(this, tipoDeUsuario, recebeMatriculaAluno);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
        }   else{
                if(tipoDeUsuario.equals("Professor")){
                    String frameReferente = "ConsultarExercicio";
        
                    this.dispose();
                    FrmMenuProfessor f = new FrmMenuProfessor(this, recebeCodProf, frameReferente);
                    f.setVisible(true);
                    f.setAlwaysOnTop(true);
                }
            }
    }//GEN-LAST:event_btnRetornarMenuActionPerformed

    private void btnOmbrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmbrosActionPerformed
        String categoria = "Ombros";
        
        if(tipoDeUsuario.equals("Aluno")){
            this.dispose();
            FrmConsultarExercicio2 f = new FrmConsultarExercicio2(this, categoria, tipoDeUsuario, recebeMatriculaAluno);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
        }   else{
                this.dispose();
                FrmConsultarExercicio2 f = new FrmConsultarExercicio2(this, categoria, tipoDeUsuario, recebeCodProf);
                f.setVisible(true);
                f.setAlwaysOnTop(true);
            }
    }//GEN-LAST:event_btnOmbrosActionPerformed

    private void btnToraxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToraxActionPerformed
        String categoria = "Tórax";
        
        if(tipoDeUsuario.equals("Aluno")){
            this.dispose();
            FrmConsultarExercicio2 f = new FrmConsultarExercicio2(this, categoria, tipoDeUsuario, recebeMatriculaAluno);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
        }   else{
                this.dispose();
                FrmConsultarExercicio2 f = new FrmConsultarExercicio2(this, categoria, tipoDeUsuario, recebeCodProf);
                f.setVisible(true);
                f.setAlwaysOnTop(true);
            }
    }//GEN-LAST:event_btnToraxActionPerformed

    private void btnBraçosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBraçosActionPerformed
        String categoria = "Bracos";
        
        if(tipoDeUsuario.equals("Aluno")){
            this.dispose();
            FrmConsultarExercicio2 f = new FrmConsultarExercicio2(this, categoria, tipoDeUsuario, recebeMatriculaAluno);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
        }   else{
                this.dispose();
                FrmConsultarExercicio2 f = new FrmConsultarExercicio2(this, categoria, tipoDeUsuario, recebeCodProf);
                f.setVisible(true);
                f.setAlwaysOnTop(true);
            }
    }//GEN-LAST:event_btnBraçosActionPerformed

    private void btnCostasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostasActionPerformed
        String categoria = "Costas";
        
        if(tipoDeUsuario.equals("Aluno")){
            this.dispose();
            FrmConsultarExercicio2 f = new FrmConsultarExercicio2(this, categoria, tipoDeUsuario, recebeMatriculaAluno);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
        }   else{
                this.dispose();
                FrmConsultarExercicio2 f = new FrmConsultarExercicio2(this, categoria, tipoDeUsuario, recebeCodProf);
                f.setVisible(true);
                f.setAlwaysOnTop(true);
            }
    }//GEN-LAST:event_btnCostasActionPerformed

    private void btnPernasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPernasActionPerformed
        String categoria = "Pernas";
        
        if(tipoDeUsuario.equals("Aluno")){
            this.dispose();
            FrmConsultarExercicio2 f = new FrmConsultarExercicio2(this, categoria, tipoDeUsuario, recebeMatriculaAluno);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
        }   else{
                this.dispose();
                FrmConsultarExercicio2 f = new FrmConsultarExercicio2(this, categoria, tipoDeUsuario, recebeCodProf);
                f.setVisible(true);
                f.setAlwaysOnTop(true);
            }
    }//GEN-LAST:event_btnPernasActionPerformed

    private void btnAbdominaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbdominaisActionPerformed
        String categoria = "Abdominais";
        
        if(tipoDeUsuario.equals("Aluno")){
            this.dispose();
            FrmConsultarExercicio2 f = new FrmConsultarExercicio2(this, categoria, tipoDeUsuario, recebeMatriculaAluno);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
        }   else{
                this.dispose();
                FrmConsultarExercicio2 f = new FrmConsultarExercicio2(this, categoria, tipoDeUsuario, recebeCodProf);
                f.setVisible(true);
                f.setAlwaysOnTop(true);
            }
    }//GEN-LAST:event_btnAbdominaisActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultarExercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbdominais;
    private javax.swing.JButton btnBraços;
    private javax.swing.JButton btnCostas;
    private javax.swing.JButton btnOmbros;
    private javax.swing.JButton btnPernas;
    private javax.swing.JButton btnRetornarMenu;
    private javax.swing.JButton btnTorax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
