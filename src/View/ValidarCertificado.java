/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author sergio-ramos
 */
public class ValidarCertificado extends javax.swing.JInternalFrame {

    /**
     * Creates new form HomeInicio
     */
    public ValidarCertificado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableCertificados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCurso = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(1065, 580));
        setMinimumSize(new java.awt.Dimension(1065, 580));
        setPreferredSize(new java.awt.Dimension(1065, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCertificados.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        tableCertificados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Teste", "Teste", "Teste", "Teste", "Teste"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Certificado", "Horas", "Data", "Status"
            }
        ));
        tableCertificados.setColumnSelectionAllowed(true);
        tableCertificados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableCertificados.setEditingColumn(2);
        tableCertificados.setMaximumSize(new java.awt.Dimension(1070, 330));
        tableCertificados.setMinimumSize(new java.awt.Dimension(1070, 330));
        tableCertificados.setPreferredSize(new java.awt.Dimension(1070, 330));
        tableCertificados.setRowHeight(33);
        tableCertificados.setRowMargin(2);
        jScrollPane1.setViewportView(tableCertificados);
        tableCertificados.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tableCertificados.getColumnModel().getColumnCount() > 0) {
            tableCertificados.getColumnModel().getColumn(0).setMinWidth(100);
            tableCertificados.getColumnModel().getColumn(0).setPreferredWidth(100);
            tableCertificados.getColumnModel().getColumn(0).setMaxWidth(100);
            tableCertificados.getColumnModel().getColumn(1).setMinWidth(450);
            tableCertificados.getColumnModel().getColumn(1).setPreferredWidth(450);
            tableCertificados.getColumnModel().getColumn(1).setMaxWidth(450);
            tableCertificados.getColumnModel().getColumn(2).setMinWidth(150);
            tableCertificados.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableCertificados.getColumnModel().getColumn(2).setMaxWidth(150);
            tableCertificados.getColumnModel().getColumn(3).setMinWidth(150);
            tableCertificados.getColumnModel().getColumn(3).setPreferredWidth(150);
            tableCertificados.getColumnModel().getColumn(3).setMaxWidth(150);
            tableCertificados.getColumnModel().getColumn(4).setMinWidth(250);
            tableCertificados.getColumnModel().getColumn(4).setPreferredWidth(250);
            tableCertificados.getColumnModel().getColumn(4).setMaxWidth(250);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1030, 358));

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("Ultimo");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, 130, 40));

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setText("2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 60, 40));

        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton3.setText("Primeira");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 130, 40));

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton4.setText("Anterior");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 130, 40));

        jButton5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton5.setText("Próximo");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 130, 40));

        jButton6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton6.setText("1");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 60, 40));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Pesquisar por nome:");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 420, 40));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 420, 50));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Status:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 200, 40));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 230, 50));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Pesquisar por codigo:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 200, 40));

        jComboBoxCurso.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jComboBoxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceito", "Negado" }));
        jComboBoxCurso.setAlignmentX(3.0F);
        jComboBoxCurso.setMaximumSize(new java.awt.Dimension(105, 31));
        getContentPane().add(jComboBoxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 230, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBoxCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tableCertificados;
    // End of variables declaration//GEN-END:variables
}