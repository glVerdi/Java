import java.io.IOException;
import java.util.Scanner;

public class forca {

    public static void printCabecalho() {
        System.out.println("\f     |                        |        ____|                    | \r\n" + //
        "     |  _ \\   _` |  _ \\    _` |  _` |  |    _ \\   __| __|  _` | | \r\n" + //
        " \\   | (   | (   | (   |  (   | (   |  __| (   | |   (    (   |_| \r\n" + //
        "\\___/ \\___/ \\__, |\\___/  \\__,_|\\__,_| _|  \\___/ _|  \\___|\\__,_|_) \r\n" + //
        "            |___/                                                 \r\n" + //
        "\n");
    }

    public static void printtJogoDaForca(int e) {
        System.out.println("\n  +----");
            if (e == 0) {
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
            } else if (e == 1) {
                System.out.println("  |   O");
                System.out.println("  |    ");
                System.out.println("  |    ");
                System.out.println("  |    ");
            } else if (e == 2) {
                System.out.println("  |   O ");
                System.out.println("  |   | ");
                System.out.println("  |     ");
                System.out.println("  |     ");
            } else if (e == 3) {
                System.out.println("  |   O");
                System.out.println("  |  /|");
                System.out.println("  |    ");
                System.out.println("  |    ");
            } else if (e == 4) {
                System.out.println("  |   O   ");
                System.out.println("  |  /|\\ ");
                System.out.println("  |       ");
                System.out.println("  |       ");
            } else if (e == 5) {
                System.out.println("  |   O  ");
                System.out.println("  |  /|\\");
                System.out.println("  |  /   ");
                System.out.println("  |      ");
            } else {
                System.out.println("  |   O  ");
                System.out.println("  |  /|\\");
                System.out.println("  |  /\\ ");
                System.out.println("  |      ");
            }
        System.out.println(" / \\");
    }

    public static String geradorPalavra(String s) {
        int size = s.length();
        int i = 1; // 1, 2, 3, ... size
        String p = "";
        while (i <= size) {
            p = p + "-";
            i++;
        }
        return p;
    }

    public static String updatePalavra(String segredo, String palavra, String tentativa) {
        /* System.out.println("ACERTOU");
        * i 0123456
        * segredo hangman
        * palavra -------
        * tentativa a
        * w -a---a-
        */
        int i = 0;
        int size = segredo.length();
        String p = "";
        while (i < size) {
            if (segredo.charAt(i) == tentativa.charAt(0)) {
                p = p + segredo.charAt(i);
            } else {
                p = p + palavra.charAt(i);
            }
            i++;
        }
        return p;
    }

    public static String updateChutesErrados(String chutesErrados, String tentativa) {
        String cE = chutesErrados;
        if (cE.length() == 0) {
            cE = tentativa;
        } else {
            cE = cE + ", " + tentativa;
        }
        return cE;
    }

    public static void printRodape(String p, String s, String cE, int e) {
        System.out.println("\nRESULTADO DO JOGO\n");

        System.out.println("Palavra acertada: " + p);
        System.out.println("Segredo: " + s);
        System.out.println("Chutes Errados: " + cE);

        if (e >= 6) {
            System.out.println("PERDEU!");
        } else {
            System.out.println("GANHOU!");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String segredo; // hangman
        String palavra; // -------
        String tentativa; // E
        String chutesErrados; // e, t
        int erros;

        printCabecalho();

        System.out.println("                    Pressione ENTER para começar                                ");
        sc.nextLine();

        System.out.println("Informe a palavra secreta: ");
        segredo = sc.next();

        palavra = geradorPalavra(segredo);

        System.out.println("\f");

        erros = 0;
        chutesErrados = "";
        while (erros < 6 && !segredo.equals(palavra)) {
            printtJogoDaForca(erros);

            System.out.printf("Erros: %d\n", erros);
            System.out.printf("Chutes Errados: %s\n", chutesErrados);

            System.out.println("Palavra: " + palavra);

            System.out.print("Tentativa: ");
            tentativa = sc.next();

            // descobrir se tentativa aparece dentro do segredo
            if(segredo.contains(tentativa)) {
                palavra = updatePalavra(segredo, palavra, tentativa);
            } else {
                chutesErrados = updateChutesErrados(chutesErrados, tentativa);
                erros++;
            }
        }

        printRodape(palavra, segredo, chutesErrados, erros);

        System.out.println("FIM");
        sc.close();
    }
}