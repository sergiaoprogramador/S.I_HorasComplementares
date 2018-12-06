package View;

import Model.Aluno;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    
    private final Aluno aluno;
    EnviarCertificado enviarCertificado = new EnviarCertificado();
    PesquisarCertificado pesquisarCertificado = new PesquisarCertificado();
    public int tela = 0;
    
    public Home(Aluno aluno) {
        this.aluno = aluno;
        initComponents();
        lblNome.setText(aluno.getCadastro().getNome());
        lblMatricula.setText(aluno.getMatricula());
        lblCampus.setText(aluno.getCadastro().getCampus());
        lblCurso.setText(aluno.getCadastro().getCurso());
        System.out.println("Esta é a tela Home");
        System.out.println("================================================");
    }

    private Home() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpHeader = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPMenu = new javax.swing.JPanel();
        jpPesquisarCertificado = new javax.swing.JPanel();
        lblPesquisarCertificado = new javax.swing.JButton();
        btnPesquisarCertificado = new javax.swing.JLabel();
        jpEnviarCertificado = new javax.swing.JPanel();
        btnEnviarCertificado = new javax.swing.JButton();
        lblEnviarCertificado = new javax.swing.JLabel();
        lblIconSistemas = new javax.swing.JLabel();
        jDesktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblM = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblCampus = new javax.swing.JLabel();
        lblC1 = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpHeader.setBackground(new java.awt.Color(172, 196, 220));
        jpHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Home");
        jpHeader.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 204, 40));

        lblNome.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        lblNome.setForeground(new java.awt.Color(1, 1, 1));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNome.setText("Usuario");
        jpHeader.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 490, 40));

        btnSair.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jpHeader.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 157, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Perfil.png"))); // NOI18N
        jpHeader.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 70, 60));

        getContentPane().add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        jPMenu.setBackground(new java.awt.Color(224, 224, 224));
        jPMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPesquisarCertificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        lblPesquisarCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPesquisarCertificadoActionPerformed(evt);
            }
        });

        btnPesquisarCertificado.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnPesquisarCertificado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPesquisarCertificado.setText("Pesquisar Certificado");

        javax.swing.GroupLayout jpPesquisarCertificadoLayout = new javax.swing.GroupLayout(jpPesquisarCertificado);
        jpPesquisarCertificado.setLayout(jpPesquisarCertificadoLayout);
        jpPesquisarCertificadoLayout.setHorizontalGroup(
            jpPesquisarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPesquisarCertificadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPesquisarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPesquisarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jpPesquisarCertificadoLayout.setVerticalGroup(
            jpPesquisarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPesquisarCertificadoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblPesquisarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPMenu.add(jpPesquisarCertificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 280, 330));

        btnEnviarCertificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/enviar-certificado.png.png"))); // NOI18N
        btnEnviarCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCertificadoActionPerformed(evt);
            }
        });

        lblEnviarCertificado.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblEnviarCertificado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnviarCertificado.setText("Enviar Certificado");

        javax.swing.GroupLayout jpEnviarCertificadoLayout = new javax.swing.GroupLayout(jpEnviarCertificado);
        jpEnviarCertificado.setLayout(jpEnviarCertificadoLayout);
        jpEnviarCertificadoLayout.setHorizontalGroup(
            jpEnviarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnviarCertificadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEnviarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnviarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jpEnviarCertificadoLayout.setVerticalGroup(
            jpEnviarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEnviarCertificadoLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(btnEnviarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnviarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPMenu.add(jpEnviarCertificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 330));

        getContentPane().add(jPMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 660));

        lblIconSistemas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconSistemas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sistemas de Informação.png"))); // NOI18N
        getContentPane().add(lblIconSistemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 118, 1070, 590));
        getContentPane().add(jDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 1070, 600));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblM.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        lblM.setText("Matricula:");
        jPanel1.add(lblM, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 30));

        lblMatricula.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jPanel1.add(lblMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 150, 30));

        lblC.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        lblC.setText("Campus:");
        jPanel1.add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 70, 30));

        lblCampus.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jPanel1.add(lblCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 170, 30));

        lblC1.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        lblC1.setText("Curso:");
        jPanel1.add(lblC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 50, 30));

        lblCurso.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jPanel1.add(lblCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 220, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 1070, 50));

        setSize(new java.awt.Dimension(1376, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
        Login tela = new Login();
        tela.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEnviarCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCertificadoActionPerformed
        if(tela == 2 || tela == 0) {
            jDesktop.add(enviarCertificado);        
            enviarCertificado.setVisible(true);
            tela = 1;
            pesquisarCertificado.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "A Tela de Enviar Certificado já está habilitada", "Você não pode executar está ação!", WIDTH);
        }
    }//GEN-LAST:event_btnEnviarCertificadoActionPerformed

    private void lblPesquisarCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPesquisarCertificadoActionPerformed
        if(tela == 1 || tela == 0) {
            jDesktop.add(pesquisarCertificado);
            pesquisarCertificado.setVisible(true);
            tela = 2;
            enviarCertificado.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "A Tela de Pesquisar Certificado já está habilitada", "Você não pode executar está ação!", WIDTH);
        }
    }//GEN-LAST:event_lblPesquisarCertificadoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
        
    }
    
    public void listarAluno() {
        if(aluno == null) {
            System.out.println("Aluno é null!");
        } else {
            System.out.println("Id: " + aluno.getIdAluno());
            System.out.println("Nome: " + aluno.getCadastro().getNome());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Cpf: " + aluno.getCadastro().getCpf());
            System.out.println("Email: " + aluno.getCadastro().getEmail());
            System.out.println("Senha: " + aluno.getCadastro().getSenha());
            System.out.println("Data de nascimento: " + aluno.getCadastro().getData_nascimento());
            System.out.println("Campus: " + aluno.getCadastro().getCampus());
            System.out.println("Curso: " + aluno.getCadastro().getCurso());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarCertificado;
    private javax.swing.JLabel btnPesquisarCertificado;
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpEnviarCertificado;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpPesquisarCertificado;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblC1;
    private javax.swing.JLabel lblCampus;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblEnviarCertificado;
    private javax.swing.JLabel lblIconSistemas;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JButton lblPesquisarCertificado;
    // End of variables declaration//GEN-END:variables
}
