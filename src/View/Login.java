package View;

public class Login extends javax.swing.JFrame {

    public Login() {
       super("Login");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLabelCpf = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        JTextCpf = new javax.swing.JPasswordField();
        BtnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnCadastrar = new javax.swing.JButton();
        JTextSenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabelCpf.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelCpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JLabelCpf.setText("CPF:");
        jPanel1.add(JLabelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 64, 83, 46));

        jLabelSenha.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSenha.setText("Senha:");
        jPanel1.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 134, 83, 30));

        JTextCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextCpfActionPerformed(evt);
            }
        });
        jPanel1.add(JTextCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 66, 290, 40));

        BtnEntrar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        BtnEntrar.setText("Entrar");
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 188, 294, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ou");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 246, 64, 30));

        BtnCadastrar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        BtnCadastrar.setText("Cadastre-se");
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 294, 294, -1));

        JTextSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(JTextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 128, 290, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 118, 644, 424));

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
        dispose();
        Home tela = new Home();
        tela.setVisible(true);
    }//GEN-LAST:event_BtnEntrarActionPerformed

    private void JTextCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextCpfActionPerformed
        
    }//GEN-LAST:event_JTextCpfActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        dispose();
        Cadastro tela = new Cadastro();
        tela.setVisible(true);
    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void JTextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextSenhaActionPerformed
       
    }//GEN-LAST:event_JTextSenhaActionPerformed

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
    private javax.swing.JPasswordField JTextCpf;
    private javax.swing.JPasswordField JTextSenha;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
