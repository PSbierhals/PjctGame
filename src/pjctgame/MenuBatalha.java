
package pjctgame;

public class MenuBatalha extends javax.swing.JDialog {

    /**
     * Creates new form MenuBatalha
     */
    static String txtbkp;

    public MenuBatalha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); //Centraliza a tela ao abrir.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtbatalhax = new javax.swing.JLabel();
        mobicon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mobAtaque = new javax.swing.JLabel();
        mobDefesa = new javax.swing.JLabel();
        mobVida = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtpatk = new javax.swing.JLabel();
        txtpdef = new javax.swing.JLabel();
        txtpvida = new javax.swing.JLabel();
        btBatalhar = new javax.swing.JButton();
        btFugir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtdanoinimigo = new javax.swing.JLabel();
        txtrecebeudano = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        batalhaok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BATALHA");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(340, 655));
        setMinimumSize(new java.awt.Dimension(340, 655));
        setPreferredSize(new java.awt.Dimension(340, 655));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtbatalhax.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtbatalhax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbatalhax.setText("Batalha X ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbatalhax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbatalhax, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 300, -1));

        mobicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mobicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hobglobin.png"))); // NOI18N
        mobicon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mobicon.setMaximumSize(new java.awt.Dimension(90, 90));
        mobicon.setMinimumSize(new java.awt.Dimension(90, 90));
        mobicon.setPreferredSize(new java.awt.Dimension(90, 90));
        getContentPane().add(mobicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 300, 86));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ATAQUE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DEFESA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VIDA");

        mobAtaque.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mobAtaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mobAtaque.setText("mobatk");

        mobDefesa.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mobDefesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mobDefesa.setText("mobdef");

        mobVida.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mobVida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mobVida.setText("mobvida");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(mobAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(mobDefesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobVida, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobAtaque)
                    .addComponent(mobDefesa)
                    .addComponent(mobVida))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, 300, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ATAQUE");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DEFESA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("VIDA");

        txtpatk.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtpatk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtpatk.setText("patk");

        txtpdef.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtpdef.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtpdef.setText("pdef");

        txtpvida.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtpvida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtpvida.setText("pvida");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txtpatk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txtpdef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpvida, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpatk)
                    .addComponent(txtpdef)
                    .addComponent(txtpvida))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 419, 300, -1));

        btBatalhar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btBatalhar.setText("BATALHAR");
        btBatalhar.setPreferredSize(new java.awt.Dimension(85, 30));
        btBatalhar.setRequestFocusEnabled(false);
        btBatalhar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btBatalharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btBatalharMouseExited(evt);
            }
        });
        btBatalhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBatalharActionPerformed(evt);
            }
        });
        getContentPane().add(btBatalhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 576, 100, -1));

        btFugir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btFugir.setText("FUGIR");
        btFugir.setPreferredSize(new java.awt.Dimension(85, 30));
        btFugir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btFugirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btFugirMouseExited(evt);
            }
        });
        btFugir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFugirActionPerformed(evt);
            }
        });
        getContentPane().add(btFugir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 576, 100, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/player_back.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 321, 300, -1));

        txtdanoinimigo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtdanoinimigo.setForeground(new java.awt.Color(0, 153, 0));
        txtdanoinimigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdanoinimigo.setText("Texto dano no inimigo");
        getContentPane().add(txtdanoinimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 502, 300, 25));

        txtrecebeudano.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtrecebeudano.setForeground(new java.awt.Color(255, 0, 0));
        txtrecebeudano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtrecebeudano.setText("texto recebeu dano");
        getContentPane().add(txtrecebeudano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 533, 300, 25));

        txtinfo.setEditable(false);
        txtinfo.setColumns(20);
        txtinfo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtinfo.setRows(1);
        txtinfo.setText("texto de batalha");
        txtinfo.setAutoscrolls(false);
        txtinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtinfo.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtinfo.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(txtinfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 300, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        batalhaok.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        batalhaok.setText("FECHAR");
        batalhaok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalhaokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(batalhaok)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(576, Short.MAX_VALUE)
                .addComponent(batalhaok)
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBatalharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBatalharMouseEntered
        if (Monstro.mobvida > 0) { //Verifica se mob ainda tem HP e muda texto central quando ponteiro está sobre botão.
            txtbkp = txtinfo.getText();
            txtinfo.setText("Batalhar ate a morte!!!");
        } else {
        }
    }//GEN-LAST:event_btBatalharMouseEntered

    private void btBatalharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBatalharMouseExited
        if (Monstro.mobvida > 0) { //Volta texto centra ao ponteiro sair de botão.
            txtinfo.setText(txtbkp);
        } else {
        }
    }//GEN-LAST:event_btBatalharMouseExited

    private void btFugirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFugirMouseEntered
        if (Monstro.mobvida > 0) { //Muda texto central quando ponteiro está sobre botão.
            txtbkp = txtinfo.getText();
            txtinfo.setText("Fugir agora!!!");
        } else {
        }
    }//GEN-LAST:event_btFugirMouseEntered

    private void btFugirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFugirMouseExited
        if (Monstro.mobvida > 0) { //Volta texto centra ao ponteiro sair de botão.
            txtinfo.setText(txtbkp);
        } else {
        }
    }//GEN-LAST:event_btFugirMouseExited

    private void btBatalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalharActionPerformed
        Monstro monstro = new Monstro(); //Chama a classe monstro e usa o método de batalha.
        monstro.batalhar();
    }//GEN-LAST:event_btBatalharActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        btBatalhar.setVisible(true); //Retorna visibilidade dos botões quando fechar janela após vencer batalha.
        btFugir.setVisible(true); //Retorna visibilidade dos botões quando fechar janela após vencer batalha.
    }//GEN-LAST:event_formWindowClosed

    private void btFugirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFugirActionPerformed
        this.dispose(); //Fecha janela de batalha.
    }//GEN-LAST:event_btFugirActionPerformed

    private void batalhaokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalhaokActionPerformed
        this.dispose(); //Fecha janela de batalha.
    }//GEN-LAST:event_batalhaokActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuBatalha dialog = new MenuBatalha(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton batalhaok;
    public javax.swing.JButton btBatalhar;
    public javax.swing.JButton btFugir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel mobAtaque;
    public javax.swing.JLabel mobDefesa;
    public javax.swing.JLabel mobVida;
    public javax.swing.JLabel mobicon;
    public javax.swing.JLabel txtbatalhax;
    public static javax.swing.JLabel txtdanoinimigo;
    public javax.swing.JTextArea txtinfo;
    public javax.swing.JLabel txtpatk;
    public javax.swing.JLabel txtpdef;
    public static javax.swing.JLabel txtpvida;
    public static javax.swing.JLabel txtrecebeudano;
    // End of variables declaration//GEN-END:variables
}
