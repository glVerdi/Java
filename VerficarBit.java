import java.util.Scanner;
public class VerficarBit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mask = 0b00100000;
        int n = sc.nextInt();
        if((n & mask) != 0){
            System.out.println("O sexto bit é verdadeiro");
        }
        else{
            System.out.println("O sexto bit é falso");
        }
        sc.close();
    }
}