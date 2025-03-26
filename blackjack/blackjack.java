import java.io.IOException;

public class blackjack {
    public static int getNovaCarta() {
        return (int)(Math.random() * 13) + 1;
    }

    public static String getCaraDaCarta(int c) {
        String cara = "*";
        switch (c) {
            case 13:
                cara = "K";
                break;
            case 12:
                cara = "Q";
                break;
            case 11:
                cara = "J";
                break;
            case 1:
                cara = "A";
                break;
            default:
                cara = "" + c;
                break;
        }
        return cara;
    }

    public static int getValorDaCarta(int c) {
        int valor = 0;
        switch (c) {
            case 13:
            case 12:
            case 11:
                valor = 10;
                break;
            case 1:
                valor = 11;
                break;
            default:
                valor = c;
                break;
        }
        return valor;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Blackjack");

        int carta1 = getNovaCarta();
        int carta2 = getNovaCarta();

        System.out.println(carta1);
        System.out.println(carta2);

        System.out.printf("Ela é: %s Valor no jogo: %d Valor da carta: %d\n", getCaraDaCarta(carta1), getValorDaCarta(carta1), carta1);
        System.out.printf("Ela é: %s Valor no jogo: %d Valor da carta: %d\n", getCaraDaCarta(carta2), getValorDaCarta(carta2), carta2);

        if (getValorDaCarta(carta1) + getValorDaCarta(carta2) > 21) {
            System.out.println("PERDEU");
        } else {
            System.out.println("GANHOU");
        }
    }
}
