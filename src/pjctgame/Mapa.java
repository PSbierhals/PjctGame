
package pjctgame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static pjctgame.MenuInicial.player;

public class Mapa extends javax.swing.JFrame {

    /**
     * Creates new form Mapa
     */
    public Mapa() {
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

        goblin = new javax.swing.JButton();
        hobglobin = new javax.swing.JButton();
        ratazana = new javax.swing.JButton();
        goblinarc = new javax.swing.JButton();
        shaman = new javax.swing.JButton();
        ratao = new javax.swing.JButton();
        abrirPlayer = new javax.swing.JToggleButton();
        abrirMochila = new javax.swing.JToggleButton();
        fechar = new javax.swing.JButton();
        esqueleto = new javax.swing.JButton();
        pedra = new javax.swing.JButton();
        soldadoanao = new javax.swing.JButton();
        orc = new javax.swing.JButton();
        golem = new javax.swing.JButton();
        kraken = new javax.swing.JButton();
        witch = new javax.swing.JButton();
        wyvern = new javax.swing.JButton();
        lizardman = new javax.swing.JButton();
        cerberus = new javax.swing.JButton();
        evilbishop = new javax.swing.JButton();
        chaosdragon = new javax.swing.JButton();
        fechar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAPA");
        setMaximumSize(new java.awt.Dimension(810, 810));
        setMinimumSize(new java.awt.Dimension(810, 810));
        setPreferredSize(new java.awt.Dimension(810, 810));
        setResizable(false);
        getContentPane().setLayout(null);

        goblin.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        goblin.setForeground(new java.awt.Color(255, 255, 255));
        goblin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/goblin_icon.png"))); // NOI18N
        goblin.setText("Goblin");
        goblin.setBorder(null);
        goblin.setBorderPainted(false);
        goblin.setContentAreaFilled(false);
        goblin.setFocusPainted(false);
        goblin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        goblin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        goblin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goblinActionPerformed(evt);
            }
        });
        getContentPane().add(goblin);
        goblin.setBounds(710, 570, 60, 80);

        hobglobin.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        hobglobin.setForeground(new java.awt.Color(255, 255, 255));
        hobglobin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hobglobin.png"))); // NOI18N
        hobglobin.setText("Duende");
        hobglobin.setBorder(null);
        hobglobin.setBorderPainted(false);
        hobglobin.setContentAreaFilled(false);
        hobglobin.setFocusPainted(false);
        hobglobin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hobglobin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        hobglobin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hobglobinActionPerformed(evt);
            }
        });
        getContentPane().add(hobglobin);
        hobglobin.setBounds(520, 400, 60, 100);

        ratazana.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ratazana.setForeground(new java.awt.Color(255, 255, 255));
        ratazana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ratazana.png"))); // NOI18N
        ratazana.setText("Ratazana");
        ratazana.setBorder(null);
        ratazana.setBorderPainted(false);
        ratazana.setContentAreaFilled(false);
        ratazana.setFocusPainted(false);
        ratazana.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ratazana.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ratazana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratazanaActionPerformed(evt);
            }
        });
        getContentPane().add(ratazana);
        ratazana.setBounds(510, 680, 70, 70);

        goblinarc.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        goblinarc.setForeground(new java.awt.Color(255, 255, 255));
        goblinarc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/goblin_archer.png"))); // NOI18N
        goblinarc.setText("Goblin Arqueiro");
        goblinarc.setBorder(null);
        goblinarc.setBorderPainted(false);
        goblinarc.setContentAreaFilled(false);
        goblinarc.setFocusPainted(false);
        goblinarc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        goblinarc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        goblinarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goblinarcActionPerformed(evt);
            }
        });
        getContentPane().add(goblinarc);
        goblinarc.setBounds(680, 380, 110, 80);

        shaman.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        shaman.setForeground(new java.awt.Color(255, 255, 255));
        shaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shaman.png"))); // NOI18N
        shaman.setText("Shamã");
        shaman.setBorder(null);
        shaman.setBorderPainted(false);
        shaman.setContentAreaFilled(false);
        shaman.setFocusPainted(false);
        shaman.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        shaman.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        shaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shamanActionPerformed(evt);
            }
        });
        getContentPane().add(shaman);
        shaman.setBounds(520, 270, 60, 100);

        ratao.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ratao.setForeground(new java.awt.Color(255, 255, 255));
        ratao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ratman.png"))); // NOI18N
        ratao.setText("Ratão");
        ratao.setBorder(null);
        ratao.setBorderPainted(false);
        ratao.setContentAreaFilled(false);
        ratao.setFocusPainted(false);
        ratao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ratao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ratao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rataoActionPerformed(evt);
            }
        });
        getContentPane().add(ratao);
        ratao.setBounds(510, 554, 60, 80);

        abrirPlayer.setBackground(new java.awt.Color(255, 255, 255));
        abrirPlayer.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        abrirPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/player_icon.png"))); // NOI18N
        abrirPlayer.setText("Jogador");
        abrirPlayer.setToolTipText("Abre o menu do jogador.");
        abrirPlayer.setBorder(null);
        abrirPlayer.setFocusPainted(false);
        abrirPlayer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        abrirPlayer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        abrirPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirPlayerMouseClicked(evt);
            }
        });
        abrirPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirPlayerActionPerformed(evt);
            }
        });
        getContentPane().add(abrirPlayer);
        abrirPlayer.setBounds(10, 710, 70, 50);

        abrirMochila.setBackground(new java.awt.Color(255, 255, 255));
        abrirMochila.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        abrirMochila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mochila_icon.png"))); // NOI18N
        abrirMochila.setText("Invetário");
        abrirMochila.setToolTipText("Abre o inventário.");
        abrirMochila.setBorder(null);
        abrirMochila.setFocusPainted(false);
        abrirMochila.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        abrirMochila.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        abrirMochila.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirMochilaMouseClicked(evt);
            }
        });
        abrirMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirMochilaActionPerformed(evt);
            }
        });
        getContentPane().add(abrirMochila);
        abrirMochila.setBounds(100, 710, 70, 50);

        fechar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        fechar.setText("SAIR");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });
        getContentPane().add(fechar);
        fechar.setBounds(330, 720, 90, 30);

        esqueleto.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        esqueleto.setForeground(new java.awt.Color(255, 255, 255));
        esqueleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esqueleto.png"))); // NOI18N
        esqueleto.setText("Esqueleto");
        esqueleto.setBorder(null);
        esqueleto.setBorderPainted(false);
        esqueleto.setContentAreaFilled(false);
        esqueleto.setFocusPainted(false);
        esqueleto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        esqueleto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        esqueleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esqueletoActionPerformed(evt);
            }
        });
        getContentPane().add(esqueleto);
        esqueleto.setBounds(710, 80, 70, 100);

        pedra.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        pedra.setForeground(new java.awt.Color(255, 255, 255));
        pedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pedra.png"))); // NOI18N
        pedra.setText("Pedra");
        pedra.setBorder(null);
        pedra.setBorderPainted(false);
        pedra.setContentAreaFilled(false);
        pedra.setFocusPainted(false);
        pedra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pedra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedraActionPerformed(evt);
            }
        });
        getContentPane().add(pedra);
        pedra.setBounds(600, 170, 60, 78);

        soldadoanao.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        soldadoanao.setForeground(new java.awt.Color(255, 255, 255));
        soldadoanao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/soldado_anao.png"))); // NOI18N
        soldadoanao.setText("Anão");
        soldadoanao.setBorder(null);
        soldadoanao.setBorderPainted(false);
        soldadoanao.setContentAreaFilled(false);
        soldadoanao.setFocusPainted(false);
        soldadoanao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        soldadoanao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        soldadoanao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldadoanaoActionPerformed(evt);
            }
        });
        getContentPane().add(soldadoanao);
        soldadoanao.setBounds(560, 80, 70, 80);

        orc.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        orc.setForeground(new java.awt.Color(255, 255, 255));
        orc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/orc.png"))); // NOI18N
        orc.setText("Orc");
        orc.setBorder(null);
        orc.setBorderPainted(false);
        orc.setContentAreaFilled(false);
        orc.setFocusPainted(false);
        orc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        orc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        orc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orcActionPerformed(evt);
            }
        });
        getContentPane().add(orc);
        orc.setBounds(460, 70, 70, 90);

        golem.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        golem.setForeground(new java.awt.Color(255, 255, 255));
        golem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/golem.png"))); // NOI18N
        golem.setText("Golem");
        golem.setBorder(null);
        golem.setBorderPainted(false);
        golem.setContentAreaFilled(false);
        golem.setFocusPainted(false);
        golem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        golem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        golem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golemActionPerformed(evt);
            }
        });
        getContentPane().add(golem);
        golem.setBounds(340, 80, 80, 100);

        kraken.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        kraken.setForeground(new java.awt.Color(255, 255, 255));
        kraken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kraken.png"))); // NOI18N
        kraken.setText("Kraken");
        kraken.setBorder(null);
        kraken.setBorderPainted(false);
        kraken.setContentAreaFilled(false);
        kraken.setFocusPainted(false);
        kraken.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kraken.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kraken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krakenActionPerformed(evt);
            }
        });
        getContentPane().add(kraken);
        kraken.setBounds(0, 560, 70, 100);

        witch.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        witch.setForeground(new java.awt.Color(255, 255, 255));
        witch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/witch.png"))); // NOI18N
        witch.setText("Bruxa");
        witch.setBorder(null);
        witch.setBorderPainted(false);
        witch.setContentAreaFilled(false);
        witch.setFocusPainted(false);
        witch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        witch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        witch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                witchActionPerformed(evt);
            }
        });
        getContentPane().add(witch);
        witch.setBounds(250, 550, 50, 80);

        wyvern.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        wyvern.setForeground(new java.awt.Color(255, 255, 255));
        wyvern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wyvern.png"))); // NOI18N
        wyvern.setText("Wyvern");
        wyvern.setBorder(null);
        wyvern.setBorderPainted(false);
        wyvern.setContentAreaFilled(false);
        wyvern.setFocusPainted(false);
        wyvern.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        wyvern.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        wyvern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyvernActionPerformed(evt);
            }
        });
        getContentPane().add(wyvern);
        wyvern.setBounds(130, 440, 90, 90);

        lizardman.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lizardman.setForeground(new java.awt.Color(255, 255, 255));
        lizardman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lizardman.png"))); // NOI18N
        lizardman.setText("Homem Lagarto");
        lizardman.setBorder(null);
        lizardman.setBorderPainted(false);
        lizardman.setContentAreaFilled(false);
        lizardman.setFocusPainted(false);
        lizardman.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lizardman.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lizardman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lizardmanActionPerformed(evt);
            }
        });
        getContentPane().add(lizardman);
        lizardman.setBounds(240, 430, 110, 100);

        cerberus.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cerberus.setForeground(new java.awt.Color(255, 255, 255));
        cerberus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerberus.png"))); // NOI18N
        cerberus.setText("Wyvern");
        cerberus.setBorder(null);
        cerberus.setBorderPainted(false);
        cerberus.setContentAreaFilled(false);
        cerberus.setFocusPainted(false);
        cerberus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerberus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cerberus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerberusActionPerformed(evt);
            }
        });
        getContentPane().add(cerberus);
        cerberus.setBounds(10, 190, 90, 90);

        evilbishop.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        evilbishop.setForeground(new java.awt.Color(255, 255, 255));
        evilbishop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/evil_bishop.png"))); // NOI18N
        evilbishop.setText("Bispo Maligno");
        evilbishop.setBorder(null);
        evilbishop.setBorderPainted(false);
        evilbishop.setContentAreaFilled(false);
        evilbishop.setFocusPainted(false);
        evilbishop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        evilbishop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        evilbishop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evilbishopActionPerformed(evt);
            }
        });
        getContentPane().add(evilbishop);
        evilbishop.setBounds(140, 170, 100, 90);

        chaosdragon.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        chaosdragon.setForeground(new java.awt.Color(255, 255, 255));
        chaosdragon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chaos_dragon.png"))); // NOI18N
        chaosdragon.setText("Dragão do Caos");
        chaosdragon.setBorder(null);
        chaosdragon.setBorderPainted(false);
        chaosdragon.setContentAreaFilled(false);
        chaosdragon.setFocusPainted(false);
        chaosdragon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chaosdragon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        chaosdragon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaosdragonActionPerformed(evt);
            }
        });
        getContentPane().add(chaosdragon);
        chaosdragon.setBounds(50, 20, 130, 120);

        fechar1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        fechar1.setText("?");
        fechar1.setToolTipText("Como jogar?");
        fechar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar1ActionPerformed(evt);
            }
        });
        getContentPane().add(fechar1);
        fechar1.setBounds(270, 720, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mapa.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//Chama e preenche os métodos com as informações de cada mob clicado.
    private void hobglobinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hobglobinActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("DUENDE");
        batalha.mudarIcone("/img/hobglobin.png");
        batalha.abrirBatalha("hobglobin");
    }//GEN-LAST:event_hobglobinActionPerformed

    private void ratazanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratazanaActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("RATAZANA");
        batalha.mudarIcone("/img/ratazana.png");
        batalha.abrirBatalha("ratazana");
    }//GEN-LAST:event_ratazanaActionPerformed

    private void goblinarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goblinarcActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("GOBLIN ARQUEIRO");
        batalha.mudarIcone("/img/goblin_archer.png");
        batalha.abrirBatalha("goblinarc");
    }//GEN-LAST:event_goblinarcActionPerformed

    private void shamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shamanActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("SHAMAN");
        batalha.mudarIcone("/img/shaman.png");
        batalha.abrirBatalha("shaman");
    }//GEN-LAST:event_shamanActionPerformed

    private void rataoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rataoActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("RATÃO");
        batalha.mudarIcone("/img/ratman.png");
        batalha.abrirBatalha("ratao");
    }//GEN-LAST:event_rataoActionPerformed

    private void abrirPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirPlayerActionPerformed
        Jogador jogador = new Jogador();
        jogador.abrirMenu(); //Chamar metodo do menu do jogador.
    }//GEN-LAST:event_abrirPlayerActionPerformed

    private void abrirPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirPlayerMouseClicked

    }//GEN-LAST:event_abrirPlayerMouseClicked

    private void abrirMochilaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirMochilaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_abrirMochilaMouseClicked

    private void abrirMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirMochilaActionPerformed
        Mochila mochila = new Mochila();
        mochila.abrirMochila();
    }//GEN-LAST:event_abrirMochilaActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fecharActionPerformed

    private void goblinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goblinActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("GOBLIN");
        batalha.mudarIcone("/img/goblin_icon.png");
        batalha.abrirBatalha("goblin");
    }//GEN-LAST:event_goblinActionPerformed

    private void esqueletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqueletoActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("ESQUELETO");
        batalha.mudarIcone("/img/esqueleto.png");
        batalha.abrirBatalha("esqueleto");
    }//GEN-LAST:event_esqueletoActionPerformed

    private void pedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedraActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("PEDRA");
        batalha.mudarIcone("/img/pedra.png");
        batalha.abrirBatalha("pedra");
    }//GEN-LAST:event_pedraActionPerformed

    private void soldadoanaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldadoanaoActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("ANÃO");
        batalha.mudarIcone("/img/soldado_anao.png");
        batalha.abrirBatalha("anao");
    }//GEN-LAST:event_soldadoanaoActionPerformed

    private void orcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orcActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("ORC");
        batalha.mudarIcone("/img/orc.png");
        batalha.abrirBatalha("orc");
    }//GEN-LAST:event_orcActionPerformed

    private void golemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golemActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("GOLEM");
        batalha.mudarIcone("/img/golem.png");
        batalha.abrirBatalha("golem");
    }//GEN-LAST:event_golemActionPerformed

    private void krakenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krakenActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("KRAKEN");
        batalha.mudarIcone("/img/kraken.png");
        batalha.abrirBatalha("kraken");
    }//GEN-LAST:event_krakenActionPerformed

    private void witchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_witchActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("BRUXA");
        batalha.mudarIcone("/img/witch.png");
        batalha.abrirBatalha("bruxa");
    }//GEN-LAST:event_witchActionPerformed

    private void wyvernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyvernActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("WYVERN");
        batalha.mudarIcone("/img/wyvern.png");
        batalha.abrirBatalha("wyvern");
    }//GEN-LAST:event_wyvernActionPerformed

    private void lizardmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lizardmanActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("HOMEM LAGARTO");
        batalha.mudarIcone("/img/lizardman.png");
        batalha.abrirBatalha("lizardman");
    }//GEN-LAST:event_lizardmanActionPerformed

    private void cerberusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerberusActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("CERBERUS");
        batalha.mudarIcone("/img/cerberus.png");
        batalha.abrirBatalha("cerberus");
    }//GEN-LAST:event_cerberusActionPerformed

    private void evilbishopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evilbishopActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("BISPO MALIGNO");
        batalha.mudarIcone("/img/evil_bishop.png");
        batalha.abrirBatalha("bispo");
    }//GEN-LAST:event_evilbishopActionPerformed

    private void chaosdragonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaosdragonActionPerformed
        TelaBatalha batalha = new TelaBatalha();
        batalha.nomeBatalha("DRAGÃO DO CAOS");
        batalha.mudarIcone("/img/chaos_dragon.png");
        batalha.abrirBatalha("chaos");
    }//GEN-LAST:event_chaosdragonActionPerformed

    private void fechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar1ActionPerformed
        JOptionPane.showMessageDialog(null, "1. Selecione um inimigo do mapa para batalhar. O mais fraco é a Ratazana, e segue o caminho até o Dragão do Caos."
                + "\n2. O objetivo do jogo é matar o Dragão do Caos."
                + "\n3. Se sua vida chegar a zero, você perde e o jogo acaba."
                + "\n4. Ao clicar em um inimigo, você abre a tela de batalha, com as informações de vida, ataque e defesa dele, e a informação dos seus atributos atuais."
                + "\n5. Você tem a opção de batalhar, ou fugir, caso ele seja muito forte ou você tenha pouca vida."
                + "\n6. Você avança de nível conforme derrota inimigos. Pode conferir sua experiência e atributos no botão Jogador."
                + "\n7. Avançar de nível recupera todos os seus pontos de vida."
                + "\n8. Você tem uma chance aleatória de ganhar itens no final de uma batalha."
                + "\n9. Pode acessar seu inventário no botão Inventário."
                + "\n10. Na aba itens do inventário, você pode selecionar algum equipamento que ganhou em batalha e vender para acumular moedas."
                + "\n11. Na aba poções do inventário, você pode usar a poção de vida para recuperar sua vida, e usar as moedas para comprar mais poções.");
    }//GEN-LAST:event_fechar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton abrirMochila;
    private javax.swing.JToggleButton abrirPlayer;
    private javax.swing.JButton cerberus;
    private javax.swing.JButton chaosdragon;
    private javax.swing.JButton esqueleto;
    private javax.swing.JButton evilbishop;
    private javax.swing.JButton fechar;
    private javax.swing.JButton fechar1;
    private javax.swing.JButton goblin;
    private javax.swing.JButton goblinarc;
    private javax.swing.JButton golem;
    private javax.swing.JButton hobglobin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kraken;
    private javax.swing.JButton lizardman;
    private javax.swing.JButton orc;
    private javax.swing.JButton pedra;
    private javax.swing.JButton ratao;
    private javax.swing.JButton ratazana;
    private javax.swing.JButton shaman;
    private javax.swing.JButton soldadoanao;
    private javax.swing.JButton witch;
    private javax.swing.JButton wyvern;
    // End of variables declaration//GEN-END:variables
}