
package pjctgame;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaBatalha extends Mapa {

    static MenuBatalha batalha = new MenuBatalha(new javax.swing.JFrame(), true);
    static String nomemob;

    void nomeBatalha(String nome) { // Constrói textos do menu de batalha de acordo com a String informada no Mapa.
        nomemob = nome;
        batalha.txtbatalhax.setText("Batalha X " + nome);
        batalha.txtinfo.setText("Você encontrou " + nome + " selvagem!");
    }

    void mudarIcone(String icone) { // Muda ícone do inimigo.
        batalha.mobicon.setIcon(new ImageIcon(getClass().getResource(icone)));
    }

    void abrirBatalha(String mob) { // Gera os valores do mob e informa nos campos de texto.
        Monstro monstro = new Monstro();
        monstro.estatisticas(mob);
        batalha.mobAtaque.setText(String.valueOf(Monstro.mobataque));
        batalha.mobDefesa.setText(String.valueOf(Monstro.mobdefesa));
        batalha.mobVida.setText(String.valueOf(Monstro.mobvida));
        batalha.txtpatk.setText(String.valueOf(Jogador.ataque));
        batalha.txtpdef.setText(String.valueOf(Jogador.defesa));
        batalha.txtpvida.setText(String.valueOf(Jogador.vida));
        batalha.batalhaok.setVisible(false); // Desativa visibilidade do botão de fechar batalha após vencer.
        batalha.txtdanoinimigo.setVisible(false); // Desativa visibilidade dos textos informativos sem ocorrer batalha.
        batalha.txtrecebeudano.setVisible(false); // Desativa visibilidade dos textos informativos sem ocorrer batalha.
        batalha.setVisible(true); // Abre janela de batalha.
    }

    void relatorioBatalha() { // Método de relatório do estado da batalha.
        batalha.mobAtaque.setText(String.valueOf(Monstro.mobataque)); // Atualiza os textos de acordo com o pós round de batalha.
        batalha.mobDefesa.setText(String.valueOf(Monstro.mobdefesa));
        batalha.mobVida.setText(String.valueOf(Monstro.mobvida));
        if (Monstro.mobvida <= 0) { // Verifica se o mob ou jogador morreu.
            if (Jogador.vida <= 0) { //Faz a verificação se player não morreu junto com mob.
                batalha.mobVida.setText("0"); // Muda texto se mob morrer para não ficar negativo.
                gameover(); // Chama método game over se jogador morreu.
            } else { // Se jogador não morreu com mob...
                if ("DRAGÃO DO CAOS".equals(nomemob)) { // Verifica se o mob é o inimigo final.
                    batalha.mobVida.setText("0");
                    gameganho(); // Chama método de ganhar jogo se derrotar Dragão do Caos.
                } else {
                    batalha.mobVida.setText("0"); // Muda texto se mob morrer para não ficar negativo.
                    fimbatalha(); // Chama o método de fim da batalha ganha.
                }
            }
        } else {
            if (Jogador.vida <= 0) { // Chama método game over se jogador morreu.
                gameover();
            }
        }
    }

    void fimbatalha() { // Método de fim da batalha.
        int expganho = (Monstro.mobataque * 2); // Exp ganho equivale a ataque do inimigo * 2.
        Jogador.ganharexp(expganho); // Chama o método para adicionar Exp no jogador.
        batalha.txtinfo.setText(" Voce derrotou " + nomemob + "!");
        Random ganhouitem = new Random(); // Variável aleatória para ganhar item.
        if ((ganhouitem.nextInt(10)) >= 6) { // Se valor gerado for igual ou maior que 6, ganha item.
            Random qualitem = new Random(); // Variável aleatória para verificar qual item ganhou.
            int x = qualitem.nextInt(Mochila.itens.size()); // Gera um item de acordo com a lista de itens cadastrada.
            Mochila mochila = new Mochila();
            mochila.addItem(x); // Chama método add item e mostra informativo no campo de texto central.
            batalha.txtinfo.setText((batalha.txtinfo.getText()) + "\n" + (" Você ganhou " + mochila.itens.get(x) + " pela vitória!"));
            batalha.txtinfo.setText((batalha.txtinfo.getText()) + "\n" + (" Ganhou " + expganho + " de EXP!"));
        } else { // Se não ganhou item, só gera informação do Exp ganho.
            batalha.txtinfo.setText((batalha.txtinfo.getText()) + "\n" + (" Ganhou " + expganho + " de EXP!"));
        }
        batalha.btBatalhar.setVisible(false); // Tira visibilidade dos botões de batalha e deixa o de fechar visível.
        batalha.btFugir.setVisible(false);
        batalha.batalhaok.setVisible(true);
    }

    void gameover() { // Gera mensagem de game over.
        JOptionPane.showMessageDialog(null, "Você cai diante do seu inimigo, sem forças para continuar. Game Over!");
        System.exit(0);
    }

    void gameganho() { // Gera mensagem de vitória do game.
        JOptionPane.showMessageDialog(null, "O mundo festeja sua vitória, grande guerreiro! Você matou o Dragão do Caos!");
        System.exit(0);
    }

}
