package View;

public class EnviarCertificado extends javax.swing.JInternalFrame {

    public EnviarCertificado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jComboBoxCurso = new javax.swing.JComboBox<>();
        jpHeader = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CTInstituicao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CTInstituicao1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CTInstituicao2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxCurso1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1065, 580));
        setMinimumSize(new java.awt.Dimension(1065, 580));
        setPreferredSize(new java.awt.Dimension(1065, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton5.setText("ANEXAR CERTIFICADO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 290, 50));

        jComboBoxCurso.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jComboBoxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceito", "Negado" }));
        jComboBoxCurso.setAlignmentX(3.0F);
        jComboBoxCurso.setMaximumSize(new java.awt.Dimension(105, 31));
        getContentPane().add(jComboBoxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 290, 50));

        jpHeader.setBackground(new java.awt.Color(172, 196, 220));
        jpHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Enviar Certificado");
        jpHeader.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 290, 60));

        getContentPane().add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 60));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setText("Atividade:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, 50));

        CTInstituicao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CTInstituicao.setToolTipText("");
        CTInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTInstituicaoActionPerformed(evt);
            }
        });
        getContentPane().add(CTInstituicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 290, 50));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel5.setText("Instituição:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, 50));

        CTInstituicao1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CTInstituicao1.setToolTipText("");
        CTInstituicao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTInstituicao1ActionPerformed(evt);
            }
        });
        getContentPane().add(CTInstituicao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 620, 50));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setText("Tema:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, 50));

        CTInstituicao2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CTInstituicao2.setToolTipText("");
        CTInstituicao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTInstituicao2ActionPerformed(evt);
            }
        });
        getContentPane().add(CTInstituicao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 620, 50));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel8.setText("Carga Horária:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, 50));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel9.setText("Grupo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, 50));

        jComboBoxCurso1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jComboBoxCurso1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I - Atividades de Ensino", "II - Atividades de Pesquisa", "III - Atividades de Extensão" }));
        jComboBoxCurso1.setAlignmentX(3.0F);
        jComboBoxCurso1.setMaximumSize(new java.awt.Dimension(105, 31));
        getContentPane().add(jComboBoxCurso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 290, 50));

        jButton6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton6.setText("VOLTAR");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 280, 40));

        jLabel1.setText("MENSAGEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 620, 50));

        jLabel2.setText("ARQUIVO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 290, 120));

        jButton7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton7.setText("ENVIAR");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 280, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CTInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTInstituicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTInstituicaoActionPerformed

    private void CTInstituicao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTInstituicao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTInstituicao1ActionPerformed

    private void CTInstituicao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTInstituicao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTInstituicao2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CTInstituicao;
    private javax.swing.JTextField CTInstituicao1;
    private javax.swing.JTextField CTInstituicao2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBoxCurso;
    private javax.swing.JComboBox<String> jComboBoxCurso1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpHeader;
    // End of variables declaration//GEN-END:variables
}
