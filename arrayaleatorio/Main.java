import java.util.Random;

public class Main {
   public static void mostrar(int[] v) {
      int t = v.length;
      System.out.print("[");
      for(int i = 0; i < t - 1; i++) {
         System.out.print(v[i] + ", ");
      }
      if (v[0] != 0) {
         System.out.print(v[t - 1]);
      }
      System.out.println("]");
   }

   public static void mostrarPares(int[] v) {
      int t = v.length;
      System.out.print("[");
      for(int i = 0; i < t - 1; i++) {
         System.out.print(v[i]);
      }
      if (v[0] != 0) {
         System.out.print(v[t - 1]);
      }
      System.out.println("]");
   }

   public static void preencher(int[] v) {
      Random r = new Random();
      for(int i = 0; i < v.length; i++) {
         v[i] = r.nextInt(100);
      }

   }

   public static int menor(int[] v) {
      if (v == null) {
         throw new IllegalArgumentException("v não pode ser nulo");
      }
      if (v.length == 0) {
         throw new IllegalArgumentException("v deve ter tamanho 1 ou maior");
      }
      int m = v[0];
      for(int i = 0; i < v.length; i++) {
         if (v[i] < m) {
            m = v[i];
         }
      }
      return m;
   }

   public static int maior(int[] v) {
      int m = v[0];
      for(int i = 0; i < v.length; i++) {
         if (v[i] > m) {
            m = v[i];
         }
      }
      return m;
   }

   public static int soma(int[] v) {
      if (v == null) {
         throw new IllegalArgumentException("v não pode ser nulo");
      }
      int s = 0;
      for(int i = 0; i < v.length; i++) {
         s = s + v[i];
      }
      return s;
   }

   public static void main(String[] v) {
      System.out.println("Números");
      int[] valores = new int[5];
      System.out.println("Preenchendo o vetor com valores aleatórios");
      mostrar(valores);
      preencher(valores);
      mostrar(valores);
      System.out.println("Menos valor:");
      System.out.println(menor(valores));
      System.out.println("Maior valor:");
      System.out.println(maior(valores));
      System.out.println("Soma:");
      System.out.println(soma(valores));
      System.out.println("Pares:");
      mostrarPares(valores);
   }
}
