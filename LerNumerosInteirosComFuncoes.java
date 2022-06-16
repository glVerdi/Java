import java.util.Scanner;
public class LerNumerosInteirosComFuncoes {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números: ");
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int maior  = max(n, n1, n2);
        showResult(maior);
        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        }
        else if (y > z){
            aux = y;
        }
        else{
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("O maior é: " + value);
    }
}
