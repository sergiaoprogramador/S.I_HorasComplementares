package View;

import Model.Aluno;
import Controller.AlunoController;

public class Login extends javax.swing.JFrame {
    
    private AlunoController alunoController;
    
    public Login() {
       super("Login");
        initComponents();
        alunoController = new AlunoController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        JLabelCpf = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        BtnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnCadastrar = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();
        jTxtSenha = new javax.swing.JPasswordField();
        jTxtCpf = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabelCpf.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelCpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JLabelCpf.setText("CPF:");
        jPanelPrincipal.add(JLabelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 83, 46));

        jLabelSenha.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSenha.setText("Senha:");
        jPanelPrincipal.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 83, 30));

        BtnEntrar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        BtnEntrar.setText("Entrar");
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(BtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 290, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ou");
        jPanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 300, 60, 30));

        BtnCadastrar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        BtnCadastrar.setText("Cadastre-se");
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(BtnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 290, -1));

        lblMensagem.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(206, 29, 29));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPrincipal.add(lblMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 620, 50));

        jTxtSenha.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTxtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelPrincipal.add(jTxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 290, 40));

        try {
            jTxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtCpf.setText("   .   .   -  ");
        jTxtCpf.setToolTipText("");
        jTxtCpf.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanelPrincipal.add(jTxtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 290, 40));

        getContentPane().add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 82, 670, 490));

        jPanel2.setBackground(new java.awt.Color(172, 196, 220));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("S.I Horas Complentares");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed

        if (jTxtCpf.getText().trim().length() == 14 && !"".equals(jTxtSenha.getText().trim())){
            Aluno aluno = alunoController.loginAluno(jTxtCpf.getText(), jTxtSenha.getText());
            if(aluno != null) {
                dispose();
                Home tela = new Home(aluno);
                tela.setVisible(true);
            } else {
                lblMensagem.setText("Cpf ou Senha incorreto. Tente novamente!");
            }
        } else if (jTxtCpf.getText().trim().length() < 14 && "".equals(jTxtSenha.getText().trim())) {
            lblMensagem.setText("Os campos cpf e senha devem ser preenchidos!");
        } else if (jTxtCpf.getText().trim().length() < 14) {
            lblMensagem.setText("Cpf deve ser preenchido!");
        } else if ("".equals(jTxtSenha.getText().trim())) {
            lblMensagem.setText("Senha não pode ser nulo!");
        }
        
    }//GEN-LAST:event_BtnEntrarActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        dispose();
        Cadastro tela = new Cadastro();
        tela.setVisible(true);
    }//GEN-LAST:event_BtnCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JLabel JLabelCpf;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JFormattedTextField jTxtCpf;
    private javax.swing.JPasswordField jTxtSenha;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables
}
