
package pjctgame;

import static pjctgame.MenuInicial.player; //Importa variavel do frame MenuInicial.

public class Jogador extends Mapa {

    // Criar variaveis para os dados do jogador.
    static String jogadornomeglobal = player.getText(); // Nome do player para utilizar em outras classes.
    static int nivel = 1;
    static int dinheiro = 100;
    static int ataque = 10;
    static int defesa = 10;
    static int vida = 10;
    static int maxvida = 10;
    static int exp = 0;
    static int maxexp = 100; // Exp necessário para subir de nível.

    static void sumdinheiro(int adin) { // Metodo que adiciona dinheiro ao jogador.
        dinheiro = dinheiro + adin;
    }

    static void subdinheiro(int sdin) { // Metodo que subtrai dinheiro.
        dinheiro = dinheiro - sdin;
    }

    static void ganharexp(int expganho) { // Ganha Exp ao derrotar um inimigo.
        exp = exp + expganho;
        if (exp >= maxexp) { // Verifica se Exp passou o Exp máximo.
            ganharnivel();
        }
    }

    static void ganharnivel() { // Método se Exp passar o necessário para upar.
        nivel = nivel + 1;
        ataque = (int) (ataque + ataque * 0.25); // Aumenta o ataque em 25% a cada novo nível.
        defesa = (int) (defesa + defesa * 0.25); // Aumenta a defesa em 25% a cada novo nível.
        maxvida = maxvida + 5; // Aumenta vida max. a cada nível.
        maxexp = (int) (maxexp + maxexp * 0.30); // Aumenta Exp necessária para cada novo nível.
        vida = maxvida; // Recupera HP ao upar.
        exp = 0; // Zera o Exp para o próximo nível.
    }

    void abrirMenu() { // Metodo para abrir MenuJogador, preenchendo os campos de texto com os valores atualizados.
        MenuJogador mjogador = new MenuJogador(new javax.swing.JFrame(), true);
        MenuJogador.nomejogador.setText(player.getText());
        MenuJogador.txtnivel.setText(String.valueOf(nivel));
        MenuJogador.txtdinheiro.setText(String.valueOf(dinheiro));
        MenuJogador.txtataque.setText(String.valueOf(ataque));
        MenuJogador.txtdefesa.setText(String.valueOf(defesa));
        MenuJogador.txtvigor.setText(String.valueOf(vida));
        MenuJogador.txtexpatual.setText(String.valueOf(exp));
        MenuJogador.txtexpprox.setText(String.valueOf(maxexp));
        MenuJogador.exp_progress.setMaximum(maxexp); // Preenche o valor max. da barra de Exp.
        MenuJogador.exp_progress.setValue(exp); // Preenche o valor da barra de Exp. com a relação Exp/Exp max.
        mjogador.setVisible(true);
    }

}
