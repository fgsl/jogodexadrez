import java.util.Scanner;

public class JogadorHumano extends Jogador {

    public JogadorHumano(char cor) {
        super(cor);
    }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String nomeDaPeca, String casa) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual peça você quer mover?");
        nomeDaPeca = scanner.nextLine();

        System.out.println("Para qual casa você deseja mover?");
        casa = scanner.nextLine();

        return tabuleiro.moverPeca(nomeDaPeca, casa);
    }

}