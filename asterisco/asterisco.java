
import java.io.IOException;
import java.util.Scanner;

public class asterisco {
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    int j;
    while (i <= n) {
        j = 1;
        while (j <= i) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }
    sc.close();
    }
}