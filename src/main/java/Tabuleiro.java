public class Tabuleiro {

    private String[][] casas = new String[8][8];

    public Tabuleiro() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casas[i][j] = "   ";
            }
        }

        colocarPecas();

        mostrar();
    }

    public boolean casaLivre(String casa) {

        char coluna = casa.charAt(0);
        char linha = casa.charAt(1);

        int colunaMatriz = coluna - 'a';
        int linhaMatriz = 8 - (linha - '0');

        if (casas[linhaMatriz][colunaMatriz].equals("   ")) {
            return true;
        }

        return false;
    }

    public boolean moverPeca(String nomeDaPeca, String casa) {

        char coluna = casa.charAt(0);
        char linha = casa.charAt(1);

        int colunaMatriz = coluna - 'a';
        int linhaMatriz = 8 - (linha - '0');

        if (!casaLivre(casa)) {
            System.out.println("Nao pode mover a peça, ja existe outra peça nessa casa.");
            return false;
        }

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                if (casas[i][j].equals(nomeDaPeca)) {

                    casas[linhaMatriz][colunaMatriz] = nomeDaPeca;
                    casas[i][j] = "   ";

                    mostrar();

                    return true;
                }

            }

        }

        System.out.println("Peça não encontrada.");

        return false;
    }

    public void colocarPecas() {

        Rei k0b = new Rei("K0b");
        Rei k0p = new Rei("K0p");

        Rainha q0b = new Rainha("Q0b");
        Rainha q0p = new Rainha("Q0p");

        Torre t1b = new Torre("T1b");
        Torre t2b = new Torre("T2b");
        Torre t1p = new Torre("T1p");
        Torre t2p = new Torre("T2p");

        Bispo b1b = new Bispo("B1b");
        Bispo b2b = new Bispo("B2b");
        Bispo b1p = new Bispo("B1p");
        Bispo b2p = new Bispo("B2p");

        Cavalo h1b = new Cavalo("H1b");
        Cavalo h2b = new Cavalo("H2b");
        Cavalo h1p = new Cavalo("H1p");
        Cavalo h2p = new Cavalo("H2p");

        Peao p1b = new Peao("P1b");
        Peao p2b = new Peao("P2b");
        Peao p3b = new Peao("P3b");
        Peao p4b = new Peao("P4b");
        Peao p5b = new Peao("P5b");
        Peao p6b = new Peao("P6b");
        Peao p7b = new Peao("P7b");
        Peao p8b = new Peao("P8b");

        Peao p1p = new Peao("P1p");
        Peao p2p = new Peao("P2p");
        Peao p3p = new Peao("P3p");
        Peao p4p = new Peao("P4p");
        Peao p5p = new Peao("P5p");
        Peao p6p = new Peao("P6p");
        Peao p7p = new Peao("P7p");
        Peao p8p = new Peao("P8p");

        casas[0][0] = t1p.nome;
        casas[0][1] = h1p.nome;
        casas[0][2] = b1p.nome;
        casas[0][3] = q0p.nome;
        casas[0][4] = k0p.nome;
        casas[0][5] = b2p.nome;
        casas[0][6] = h2p.nome;
        casas[0][7] = t2p.nome;

        casas[1][0] = p1p.nome;
        casas[1][1] = p2p.nome;
        casas[1][2] = p3p.nome;
        casas[1][3] = p4p.nome;
        casas[1][4] = p5p.nome;
        casas[1][5] = p6p.nome;
        casas[1][6] = p7p.nome;
        casas[1][7] = p8p.nome;

        casas[6][0] = p1b.nome;
        casas[6][1] = p2b.nome;
        casas[6][2] = p3b.nome;
        casas[6][3] = p4b.nome;
        casas[6][4] = p5b.nome;
        casas[6][5] = p6b.nome;
        casas[6][6] = p7b.nome;
        casas[6][7] = p8b.nome;

        casas[7][0] = t1b.nome;
        casas[7][1] = h1b.nome;
        casas[7][2] = b1b.nome;
        casas[7][3] = q0b.nome;
        casas[7][4] = k0b.nome;
        casas[7][5] = b2b.nome;
        casas[7][6] = h2b.nome;
        casas[7][7] = t2b.nome;
    }

    public void mostrar() {

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                System.out.print("[" + casas[i][j] + "]");
            }

            System.out.println();
        }
    }

    public boolean acabouOJogo() {
        return false;
    }

}