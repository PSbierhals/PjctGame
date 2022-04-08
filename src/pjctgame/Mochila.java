
package pjctgame;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import static pjctgame.MenuMochila.invLista;
import static pjctgame.Jogador.dinheiro;
import static pjctgame.MenuMochila.invPocoes;

public class Mochila extends Mapa {

    public static ArrayList<String> itens = new ArrayList<String>(Arrays.asList("ESPADA", "ESCUDO", "ADAGA", "ARCO", "LANÇA", "MACHADO")); // Array de itens.
    public static ArrayList<Integer> quant = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0)); // Array de quantidade de cada item da posição correspondente.
    public static ArrayList<String> itenspoc = new ArrayList<String>(Arrays.asList("POÇÃO DE CURA")); // Array de poções.
    public static ArrayList<Integer> quantpoc = new ArrayList<Integer>(Arrays.asList(1)); // Array da quantidade de poções de cada indíce correspondente.
    DefaultListModel itenslista = new DefaultListModel(); // Troca modelo de listas para Default do Java.
    DefaultListModel pocoeslista = new DefaultListModel();

    void addItem(int add) { // Método que adiciona um item no inventário.
        quant.set(add, (quant.get(add) + 1));
    }

    void subItem(int sub) { // Método que subtrai um item no inventario..
        quant.set(sub, (quant.get(sub) - 1));
    }

    void venderItem() { // Método para venda de itens.
        String index = String.valueOf(invLista.getSelectedValue()); // Pega a String da seleção na lista.
        for (int x = 0; x < quant.size(); x++) { // Verificação de quantidades do item.
            if (index.contains(itens.get(x))) { // Verifica nome do item selecionado.
                subItem(x); // Chama o método para subtrair item.
                listarItens(); // Refaz a listagem dos itens no inventário.
                MenuMochila.txtmov.setText("Vendeu " + itens.get(x) + " por 50 moedas."); // Troca texto informativo de movimentação.
                Jogador.sumdinheiro(50); // Adiciona moedas pelo método de soma do jogador.
            }
        }
        atualizarDinheiro(); // Chama o método para atualizar o dinheiro atual no menu de inventário.
    }

    void checarItens() { // Método que faz a checagem dos items para atualizar lista da mochila. Se valor do item correspondete na quant. > 0, ele aparecerá.
        for (int x = 0; x < quant.size(); x++) { // Listagem de itens com quant > 0.
            if (quant.get(x) > 0) {
                itenslista.addElement(quant.get(x) + " X " + itens.get(x));
            }
        }
        for (int x = 0; x < quantpoc.size(); x++) { // Listagem de poções.
            pocoeslista.addElement(quantpoc.get(x) + " X " + itenspoc.get(x));
        }
    }

    void listarItens() { // Método que atualiza a lista de itens na mochila.
        checarItens();
        invLista.setModel(itenslista);
        invPocoes.setModel(pocoeslista);
    }

    void atualizarDinheiro() { // Atualiza texto do dinheiro inventário.
        MenuMochila.txtdinheiromochila.setText(String.valueOf(dinheiro));
    }

    void abrirMochila() { // Método que chama o jDialog MenuMochila.
        MenuMochila mochila = new MenuMochila(new javax.swing.JFrame(), true);
        MenuMochila.txtdinheiromochila.setText(String.valueOf(dinheiro));
        listarItens();
        mochila.setVisible(true);
    }

    void usarcura() { // Método para usar poção e recuperar vida.
        String index = String.valueOf(invPocoes.getSelectedValue()); // Verifica qual nome do item pela String selecionada na lista.
        if (index.contains("POÇÃO DE CURA")) { // Se a nome dela for Poção de Cura...
            if (quantpoc.get(0) > 0) { // Como a lista de poções é fixa no momento, verifica se o jogador tem poções de vida.
                if (Jogador.vida < Jogador.maxvida) { // Verifica se a vida do jogador não está no máximo.
                    Jogador.vida = Jogador.maxvida; // Recupera toda vida.
                    quantpoc.set(0, (quantpoc.get(0) - 1)); // Diminui uma poção.
                    MenuMochila.txtmov.setText("Usou " + itenspoc.get(0) + " e recuperou vida.");
                    listarItens(); // Refaz a listagem dos itens no inventário.
                } else {
                    MenuMochila.txtmov.setText("Você está com a vida cheia."); // Informa que a vida está cheia se vida = vida max.
                }
            } else {
                MenuMochila.txtmov.setText("Você está sem " + itenspoc.get(0) + "."); // Informa se estiver sem poções.
            }
        }
    }

    void comprarpocao(int pocao) { // Método para comprar poções.
        if (Jogador.dinheiro >= 100) { // Verifica se dinheiro é suficiente.
            quantpoc.set(pocao, (quantpoc.get(pocao) + 1)); // Adiciona uma poção.
            MenuMochila.txtmov.setText("Comprou " + itenspoc.get(pocao) + ".");
            Jogador.subdinheiro(100); // Subtraí moedas do jogador.
            atualizarDinheiro(); // Atualiza informação do dinheiro.
            listarItens(); // Refaz a listagem de itens.
        } else {
            MenuMochila.txtmov.setText("Sem dinheiro suficiente."); // Informa se não tiver moedas suficientes.
        }

    }
}

/*        
    Sistema de comercio teste. Não utilizado na versão.

    String index = String.valueOf(invLista.getSelectedValue());
        if (index.contains("ESPADA")){
            Mochila teste = new Mochila();
            teste.subItem(0);
            teste.listarItens();
            Jogador teste1 = new Jogador();
            teste1.adddinheiro(100);
        }
 */
