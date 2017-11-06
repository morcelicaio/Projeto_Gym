package br.com.caio.tcc.apresentacao;

import br.com.caio.tcc.dao.ProfessorDao;
import javax.swing.JOptionPane;

public class FrmLoginProfessor extends javax.swing.JFrame {
    private FrmTelaInicial formAbreTelaLoginProf;
    
    public FrmLoginProfessor() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public FrmLoginProfessor(javax.swing.JFrame form){
        this();
        formAbreTelaLoginProf = (FrmTelaInicial) form;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfPasswProfessor = new javax.swing.JPasswordField();
        btnRetornarMenu = new javax.swing.JButton();
        btnLogarProfessor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfCodProfessor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de consultas - GYM CLM Acesso de professores");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrada de Professores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Digite sua senha de acesso:");

        btnRetornarMenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRetornarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Voltar.jpg"))); // NOI18N
        btnRetornarMenu.setText("Retornar ao menu principal");
        btnRetornarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarMenuActionPerformed(evt);
            }
        });

        btnLogarProfessor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caio/tcc/imagens/Cadeado_senha.JPG"))); // NOI18N
        btnLogarProfessor.setText("Entrar");
        btnLogarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarProfessorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Digite o seu codigo:");

        tfCodProfessor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodProfessorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRetornarMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogarProfessor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(tfPasswProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfCodProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfPasswProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogarProfessor)
                    .addComponent(btnRetornarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnRetornarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarMenuActionPerformed
        new FrmTelaInicial().show();
        this.dispose();
        
    }//GEN-LAST:event_btnRetornarMenuActionPerformed

    private void btnLogarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarProfessorActionPerformed
        int codigo;
        String senha;
        
        codigo = Integer.parseInt(tfCodProfessor.getText());
        senha = tfPasswProfessor.getText();
        
        ProfessorDao dao = new ProfessorDao();
        dao.acessarSistemaProfessor(codigo, senha);
        
        if(dao.acessarSistemaProfessor(codigo, senha) == true){
            FrmMenuProfessor f = new FrmMenuProfessor(this, codigo);
            f.setVisible(true);
            f.setAlwaysOnTop(true);
            this.dispose();
        }   else{
                JOptionPane.showMessageDialog(this, "Senha incorreta!", "Erro!", JOptionPane.ERROR_MESSAGE);  
                tfCodProfessor.setText("");
                tfPasswProfessor.setText("");
            }
    }//GEN-LAST:event_btnLogarProfessorActionPerformed

    private void tfCodProfessorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodProfessorKeyTyped
        // Evento no campo de texto código que não permite a inserção de letras no campo.
        String caracteres="0987654321";
        
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfCodProfessorKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLoginProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogarProfessor;
    private javax.swing.JButton btnRetornarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfCodProfessor;
    private javax.swing.JPasswordField tfPasswProfessor;
    // End of variables declaration//GEN-END:variables
}
