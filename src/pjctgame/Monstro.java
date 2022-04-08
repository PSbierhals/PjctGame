
package pjctgame;

import java.util.Random;

public class Monstro extends TelaBatalha {

    // Declara as váriaveis dos monstros.
    static int mobvida = 1;
    static int mobataque = 1;
    static int mobdefesa = 1;

    void estatisticas(String mobstats) {

        Random gerar = new Random(); // Variável para gerar a função aleatória.

        switch (mobstats) { // Verifica qual inimigo está sendo chamado através da string informada.
            case "ratazana":
                mobataque = gerar.nextInt(3) + 2;
                mobdefesa = gerar.nextInt(3) + 2;
                mobvida = gerar.nextInt(4) + 8;
                break;
            case "goblin":
                mobataque = gerar.nextInt(5) + 4;
                mobdefesa = gerar.nextInt(3) + 3;
                mobvida = gerar.nextInt(6) + 8;
                break;
            case "ratao":
                mobataque = gerar.nextInt(7) + 5;
                mobdefesa = gerar.nextInt(5) + 4;
                mobvida = gerar.nextInt(8) + 8;
                break;
            case "hobglobin":
                mobataque = gerar.nextInt(8) + 7;
                mobdefesa = gerar.nextInt(6) + 6;
                mobvida = gerar.nextInt(10) + 10;
                break;
            case "goblinarc":
                mobataque = gerar.nextInt(8) + 9;
                mobdefesa = gerar.nextInt(8) + 6;
                mobvida = gerar.nextInt(12) + 10;
                break;
            case "shaman":
                mobataque = gerar.nextInt(16) + 10;
                mobdefesa = gerar.nextInt(8) + 4;
                mobvida = gerar.nextInt(14) + 10;
                break;
            case "pedra":
                mobataque = gerar.nextInt(8) + 8;
                mobdefesa = gerar.nextInt(11) + 14;
                mobvida = gerar.nextInt(15) + 15;
                break;
            case "esqueleto":
                mobataque = gerar.nextInt(12) + 14;
                mobdefesa = gerar.nextInt(8) + 8;
                mobvida = gerar.nextInt(16) + 10;
                break;
            case "anao":
                mobataque = gerar.nextInt(14) + 18;
                mobdefesa = gerar.nextInt(12) + 10;
                mobvida = gerar.nextInt(20) + 12;
                break;
            case "orc":
                mobataque = gerar.nextInt(18) + 22;
                mobdefesa = gerar.nextInt(14) + 14;
                mobvida = gerar.nextInt(22) + 16;
                break;
            case "golem":
                mobataque = gerar.nextInt(20) + 26;
                mobdefesa = gerar.nextInt(20) + 20;
                mobvida = gerar.nextInt(26) + 22;
                break;
            case "lizardman":
                mobataque = gerar.nextInt(22) + 30;
                mobdefesa = gerar.nextInt(16) + 16;
                mobvida = gerar.nextInt(24) + 20;
                break;
            case "bruxa":
                mobataque = gerar.nextInt(26) + 34;
                mobdefesa = gerar.nextInt(12) + 14;
                mobvida = gerar.nextInt(26) + 22;
                break;
            case "kraken":
                mobataque = gerar.nextInt(28) + 38;
                mobdefesa = gerar.nextInt(20) + 20;
                mobvida = gerar.nextInt(30) + 26;
                break;
            case "wyvern":
                mobataque = gerar.nextInt(32) + 42;
                mobdefesa = gerar.nextInt(22) + 24;
                mobvida = gerar.nextInt(32) + 30;
                break;
            case "cerberus":
                mobataque = gerar.nextInt(34) + 44;
                mobdefesa = gerar.nextInt(26) + 26;
                mobvida = gerar.nextInt(36) + 32;
                break;
            case "bispo":
                mobataque = gerar.nextInt(42) + 48;
                mobdefesa = gerar.nextInt(22) + 22;
                mobvida = gerar.nextInt(40) + 38;
                break;
            case "chaos":
                mobataque = gerar.nextInt(48) + 52;
                mobdefesa = gerar.nextInt(32) + 32;
                mobvida = gerar.nextInt(48) + 44;
                break;
        }
    }

    void batalhar() { // Chama os métodos para a batalha ocorrer.
        ataque_jogador();
        ataque_mob();
        relatorioBatalha();
    }

    void ataque_jogador() { // Método de ataque do jogador.
        Random ataqueextra = new Random(); // Cria uma variável para gerar ataque alatório.
        int playeratqextra = ataqueextra.nextInt((Jogador.ataque / 2)); // Fórmula para ataque extra do jogador. (Ataque jogador/2)
        int playerataque = (Jogador.ataque / mobdefesa) + playeratqextra; // Fórmula para ataque total. (Ataque Jogador/Defesa inimigo + ataque extra)
        mobvida = mobvida - playerataque; // Subtraí a vida do mob com o ataque total do jogador.
        MenuBatalha.txtdanoinimigo.setVisible(true); // Deixa visível o texto informativo de ataques.
        if (playerataque > 0) {
            MenuBatalha.txtdanoinimigo.setText(Jogador.jogadornomeglobal + " inflingiu " + playerataque + " de dano!");
        } else {
            MenuBatalha.txtdanoinimigo.setText(nomemob + " se esquivou do seu ataque!");
        }
    }

    void ataque_mob() { // Método de ataque do mob.
        Random ataqueextra = new Random(); // Cria uma variável para gerar ataque alatório.
        int mobroundataqueextra = ataqueextra.nextInt((mobataque / 2)); // Fórmula para ataque extra do inimigo. (Ataque inimigo/2)
        int mobroundataque = (mobataque / Jogador.defesa) + mobroundataqueextra; // Fórmula para ataque total. (Ataque mob/Defesa jogador + ataque extra)
        Jogador.vida = Jogador.vida - mobroundataque; // Subtraí a vida do jogador com o ataque total do inimigo.
        MenuBatalha.txtrecebeudano.setVisible(true); // Deixa visível o texto informativo de ataques.
        if (mobroundataque > 0) {
            MenuBatalha.txtrecebeudano.setText(nomemob + " inflingiu " + mobroundataque + " de dano em " + Jogador.jogadornomeglobal + "!");
            MenuBatalha.txtpvida.setText(String.valueOf(Jogador.vida)); // Atualiza texto de vida do jogador.
        } else {
            MenuBatalha.txtrecebeudano.setText("Voce se esquivou do ataque de " + nomemob + "!");
        }
    }
}

