package View;

import Controller.AlunoController;
import Model.Aluno;

public class Cadastro extends javax.swing.JFrame {
    AlunoController alunoController;
    
    public Cadastro() {
        initComponents();
        alunoController = new AlunoController();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpHeader = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPMenu = new javax.swing.JPanel();
        jpPesquisarCertificado = new javax.swing.JPanel();
        jpEnviarCertificado = new javax.swing.JPanel();
        jTxtCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtData_nascimento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jTxtMatricula = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtConfirmarSenha = new javax.swing.JTextField();
        jTxtSenha = new javax.swing.JTextField();
        jTxtCampus = new javax.swing.JTextField();
        jTxtCurso = new javax.swing.JTextField();
        jTxtNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpHeader.setBackground(new java.awt.Color(172, 196, 220));
        jpHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cadastrar Aluno");
        jpHeader.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 290, 60));

        getContentPane().add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        jPMenu.setBackground(new java.awt.Color(224, 224, 224));
        jPMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jpPesquisarCertificadoLayout = new javax.swing.GroupLayout(jpPesquisarCertificado);
        jpPesquisarCertificado.setLayout(jpPesquisarCertificadoLayout);
        jpPesquisarCertificadoLayout.setHorizontalGroup(
            jpPesquisarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jpPesquisarCertificadoLayout.setVerticalGroup(
            jpPesquisarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jPMenu.add(jpPesquisarCertificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 300, 330));

        javax.swing.GroupLayout jpEnviarCertificadoLayout = new javax.swing.GroupLayout(jpEnviarCertificado);
        jpEnviarCertificado.setLayout(jpEnviarCertificadoLayout);
        jpEnviarCertificadoLayout.setHorizontalGroup(
            jpEnviarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jpEnviarCertificadoLayout.setVerticalGroup(
            jpEnviarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jPMenu.add(jpEnviarCertificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 330));

        getContentPane().add(jPMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 660));

        jTxtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 460, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 60, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Matricula:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 120, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 70, 40));
        getContentPane().add(jTxtData_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 228, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Campus:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 90, 40));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, 134, 40));

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 134, 40));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 134, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Confirmar Senha:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 150, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Email:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 70, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Data de Nascimento:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 190, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Curso:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 70, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("CPF:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 60, 40));
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 460, 30));

        jTxtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 460, 40));

        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 460, 40));

        jTxtConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtConfirmarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 460, 40));

        jTxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 460, 40));

        jTxtCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCampusActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 460, 40));

        jTxtCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCursoActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 460, 40));

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 460, 40));

        setSize(new java.awt.Dimension(1376, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCpfActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        Login tela = new Login();
        tela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Aluno aluno = alunoController.cadastrarAluno( 
                                            jTxtNome.getText(), 
                                            jTxtCpf.getText(), 
                                            jTxtMatricula.getText(), 
                                            jTxtEmail.getText(), 
                                            jTxtSenha.getText(), 
                                            jTxtData_nascimento.getText(), 
                                            jTxtCampus.getText(), 
                                            jTxtCurso.getText()
        );

        
        if(aluno != null) {
            lblResultado.setText("Aluno cadastrado com sucesso");
            
            limpaCadastro();
            System.out.println("Aluno com " + "id: " + aluno.getIdAluno() + "foi cadastrado. Aqui é a tela cadastro! Debbuger");
            System.out.println("==============================================================================================");
            dispose();
            System.out.println("Abrindo tela home e passando o objeto aluno.");
            System.out.println("==============================================================================================");
            Home tela = new Home(aluno);
            tela.setVisible(true);
        } else {
            lblResultado.setText("Erro ao cadastrar aluno!");
            System.out.println("Entrou no else do metodo btnSalvar da tela cadastro!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jTxtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtMatriculaActionPerformed

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jTxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSenhaActionPerformed

    private void jTxtConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtConfirmarSenhaActionPerformed

    private void jTxtCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCampusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCampusActionPerformed

    private void jTxtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCursoActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }
    
    
    public void limpaCadastro() {
        jTxtNome.setText(""); 
        jTxtCpf.setText(""); 
        jTxtMatricula.setText("");
        jTxtEmail.setText("");
        jTxtSenha.setText("");
        jTxtData_nascimento.setText("");
        jTxtCampus.setText("");
        jTxtCurso.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JTextField jTxtCampus;
    private javax.swing.JTextField jTxtConfirmarSenha;
    private javax.swing.JTextField jTxtCpf;
    private javax.swing.JTextField jTxtCurso;
    private javax.swing.JTextField jTxtData_nascimento;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtMatricula;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtSenha;
    private javax.swing.JPanel jpEnviarCertificado;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpPesquisarCertificado;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables
}
