package View;

import Controller.AlunoController;
import Model.Aluno;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxtMatricula = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtNome = new javax.swing.JTextField();
        jTxtConfirmarSenha = new javax.swing.JPasswordField();
        jTxtSenha = new javax.swing.JPasswordField();
        jTxtData_nascimento = new javax.swing.JFormattedTextField();
        jTxtCpf = new javax.swing.JFormattedTextField();
        jComboBoxCurso = new javax.swing.JComboBox<>();
        jComboBoxCampus = new javax.swing.JComboBox<>();
        lblResultado = new javax.swing.JLabel();
        lblMsgNome = new javax.swing.JLabel();
        lblMsgCpf = new javax.swing.JLabel();
        lblMsgMatricula = new javax.swing.JLabel();
        lblMsgEmail = new javax.swing.JLabel();
        lblMsgSenha = new javax.swing.JLabel();
        lblMsgConfirmarSenha = new javax.swing.JLabel();
        lblMsgData = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 60, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Matricula:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 90, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 70, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Campus:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 80, 40));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 134, 40));

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 134, 40));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 134, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Confirmar Senha:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 150, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Email:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 60, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Data de Nascimento:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 190, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Curso:");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, 70, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("CPF:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 40, 40));

        jTxtMatricula.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTxtMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 460, 40));

        jTxtEmail.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTxtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 460, 40));

        jTxtNome.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTxtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 460, 40));

        jTxtConfirmarSenha.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTxtConfirmarSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTxtConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 460, 40));

        jTxtSenha.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTxtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 460, 40));

        try {
            jTxtData_nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtData_nascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtData_nascimento.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTxtData_nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtData_nascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtData_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 250, 40));

        try {
            jTxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtCpf.setToolTipText("");
        jTxtCpf.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        getContentPane().add(jTxtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 460, 40));

        jComboBoxCurso.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jComboBoxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistemas de Informação" }));
        getContentPane().add(jComboBoxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, 320, 40));

        jComboBoxCampus.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jComboBoxCampus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jardim Imperial", "Aquarela Das Artes" }));
        getContentPane().add(jComboBoxCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 320, 40));

        lblResultado.setBackground(new java.awt.Color(254, 254, 254));
        lblResultado.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(218, 8, 8));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 970, 60));

        lblMsgNome.setForeground(new java.awt.Color(206, 17, 17));
        getContentPane().add(lblMsgNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 390, 40));

        lblMsgCpf.setForeground(new java.awt.Color(206, 17, 17));
        getContentPane().add(lblMsgCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 410, 40));

        lblMsgMatricula.setForeground(new java.awt.Color(206, 17, 17));
        getContentPane().add(lblMsgMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 360, 40));

        lblMsgEmail.setForeground(new java.awt.Color(206, 17, 17));
        getContentPane().add(lblMsgEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 390, 40));

        lblMsgSenha.setForeground(new java.awt.Color(206, 17, 17));
        getContentPane().add(lblMsgSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 380, 40));

        lblMsgConfirmarSenha.setForeground(new java.awt.Color(206, 17, 17));
        getContentPane().add(lblMsgConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 310, 40));

        lblMsgData.setForeground(new java.awt.Color(206, 17, 17));
        getContentPane().add(lblMsgData, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 250, 30));

        setSize(new java.awt.Dimension(1376, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        Login tela = new Login();
        tela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaCadastro();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String  nome = jTxtNome.getText(),
                cpf = jTxtCpf.getText(),
                matricula = jTxtMatricula.getText(),
                email = jTxtEmail.getText(),
                senha = jTxtSenha.getText(),
                confirmarSenha = jTxtConfirmarSenha.getText(),
                data_nascimento = jTxtData_nascimento.getText(),
                campus = String.valueOf(jComboBoxCampus.getSelectedItem()),
                curso = String.valueOf(jComboBoxCurso.getSelectedItem());
        

        
        if(validaFormulario(nome, cpf, matricula, email, senha, confirmarSenha, data_nascimento, campus, curso) == false){
            lblResultado.setText("Verifique seus dados!");
        } else { 
            
            if(alunoController.verificaAluno(jTxtCpf.getText())){
                lblResultado.setText("O cadastro já existe. Faça login!");
            } else {
                
                Aluno aluno = alunoController.cadastrarAluno( 
                                                    jTxtNome.getText(), 
                                                    jTxtCpf.getText(), 
                                                    jTxtMatricula.getText(), 
                                                    jTxtEmail.getText(), 
                                                    jTxtSenha.getText(), 
                                                    jTxtData_nascimento.getText(), 
                                                    String.valueOf(jComboBoxCampus.getSelectedItem()), 
                                                    String.valueOf(jComboBoxCurso.getSelectedItem())
                );


                if(aluno != null) {
                    lblResultado.setText("Aluno cadastrado com sucesso. Faça o login!");

                    limpaCadastro();
                    System.out.println("Aluno com " + "id: " + aluno.getIdAluno() + "foi cadastrado. Aqui é a tela cadastro! Debbuger");
                    System.out.println("==============================================================================================");
                } else {
                    lblResultado.setText("Erro ao cadastrar aluno!");
                    System.out.println("Entrou no else do metodo btnSalvar da tela cadastro!");
                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jTxtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtMatriculaActionPerformed
        
    }//GEN-LAST:event_jTxtMatriculaActionPerformed

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtData_nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtData_nascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtData_nascimentoActionPerformed

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
    }
    
    public boolean validaFormulario(String  nome, 
                                    String cpf, 
                                    String matricula, 
                                    String email, 
                                    String senha, 
                                    String confirmarSenha, 
                                    String data_nascimento, 
                                    String campus, 
                                    String curso
    ) {
        boolean validaCampo = true;
        
        if(nome.equals("")){
            lblMsgNome.setText("Nome deve ser preenchido!");
            validaCampo = false;
            return validaCampo;
        } else {
            lblMsgNome.setText("");
        }
        
        if (cpf.trim().length() < 14) {
            lblMsgCpf.setText("Cpf deve ser preenchido!");
            validaCampo = false;
            return validaCampo;
        } else {
            lblMsgCpf.setText("");
        }
        
        if(matricula.equals("")){
            lblMsgMatricula.setText("Matricula deve ser preenchido!");
            validaCampo = false;
            return validaCampo;
        } else {
            lblMsgMatricula.setText("");
        }
        
        if(validaEmail(email)) {
            lblMsgEmail.setText("");
        } else {
            lblMsgEmail.setText("Email inválido!");
            validaCampo = false;
            return validaCampo;
        }
        
        if(senha.equals("")){
            lblMsgSenha.setText("Senha deve ser preenchido!");
            validaCampo = false;
            return validaCampo;
        } else {
            lblMsgSenha.setText("");
        }
        
        if(confirmarSenha.equals("")){
            lblMsgConfirmarSenha.setText("Confirmar Senha deve ser preenchido!");
            validaCampo = false;
            return validaCampo;
        } else {
            lblMsgConfirmarSenha.setText("");
        }
        
        if(confirmarSenha.equals(senha)) {
            lblMsgConfirmarSenha.setText("");
        } else {
            lblMsgConfirmarSenha.setText("Senha inválida!");
            validaCampo = false;
            return validaCampo;
        }
        
        if(data_nascimento.trim().length() < 10){
            lblMsgData.setText("Data de nascimento deve ser preenchido!");
            validaCampo = false;
            return validaCampo;
        } else {
            lblMsgData.setText("");
        }
        
        return validaCampo;
    }
    
    public static boolean validaEmail(String email)
    {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> jComboBoxCampus;
    private javax.swing.JComboBox<String> jComboBoxCurso;
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
    private javax.swing.JPasswordField jTxtConfirmarSenha;
    private javax.swing.JFormattedTextField jTxtCpf;
    private javax.swing.JFormattedTextField jTxtData_nascimento;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtMatricula;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JPasswordField jTxtSenha;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JLabel lblMsgConfirmarSenha;
    private javax.swing.JLabel lblMsgCpf;
    private javax.swing.JLabel lblMsgData;
    private javax.swing.JLabel lblMsgEmail;
    private javax.swing.JLabel lblMsgMatricula;
    private javax.swing.JLabel lblMsgNome;
    private javax.swing.JLabel lblMsgSenha;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables
}
