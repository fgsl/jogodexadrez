import java.util.Scanner;

public class JogoDeXadrez implements Jogo {

    @Override
    public void iniciar() {

        Scanner scanner = new Scanner(System.in);

        Tabuleiro tabuleiro = new Tabuleiro();

        Jogador jogador1 = new JogadorHumano('b');
        Jogador jogador2 = new JogadorSintetico('p');

        while (!tabuleiro.acabouOJogo()) {

            while (!jogador1.jogar(tabuleiro, "", "")) {

            }

            jogador2.jogar(tabuleiro, "", "");

            System.out.println("Deseja continuar jogando? (S/N)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("N")) {
                break;
            }

        }
    }

    private static void main(String[] args) {

        JogoDeXadrez jogo = new JogoDeXadrez();

        jogo.iniciar();

        System.out.println("Flávio Lisboa   x");
    }

}
