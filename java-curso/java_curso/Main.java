package java_curso;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
/*        int minhaIdade = 24;
        var meuNome = "Gabriel";

        byte b = 100;
        short s = 10000;
        //int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Gabriel";
        boolean bool = true;

        int[] colecaoDeInteiros = {1, 2, 3, 4, 5};

        System.out.println("Arrays");
        System.out.println(colecaoDeInteiros[4]);
        System.out.println();

        int[] meusNumeros = new int[4];

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Maria");
        nomes.add("Edenilson");

        System.out.println("ArrayList");
        System.out.println(nomes.get(0));

        nomes.remove(0);
        nomes.remove("Maria");

        System.out.println(nomes.get(0));
        System.out.println();


        System.out.println("if - else");
        if (str.isBlank()) {
            System.out.println("Verdadeiro");
        } else if (str == "Gabriel") {
            System.out.println("Gabriel");
        } else {
            System.out.println("Falso"); 
        }
        System.out.println();

        System.out.println("For");
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println();

        System.out.println("Whilw");
        int contador = 0;
        while(contador < 10) {
            System.out.println("Estou no while");
            contador++;
        }
        System.out.println();

        System.out.println("Casting Explícitdo de um double para int");
        double resultado = 0.0;
        System.out.println(resultado);
        int resultadoInt = (int)resultado;
        System.out.println(resultadoInt);

        System.out.println("Casting Implicido de um int para double");
        int meuInt = 10;
        System.out.println(meuInt);
        double meuDouble  = meuInt;
        System.out.println(meuDouble);

        System.out.println("Casting Explícitdo de uma string para int");
        String minhaString = "20";
        System.out.println(minhaString);
        int meuInt2 = Integer.parseInt(minhaString);
        System.out.println(meuInt2);
        System.out.println("Casting Explícitdo de um int para string");
        String meuString = String.valueOf(meuInt2);
        System.out.println(meuString);
        System.out.println();*/

        Carro /*variável tipo java_curso.Carro*/ meuCarro = new Sandero();
        Carro meuCarro2 = new Mobi();

        SerVivo meuSer = new Humano();
        meuSer.respirar();

        meuCarro.acelerar();
        meuCarro2.acelerar();

        Carro meuCarroFurado = null;

        try {
            meuCarroFurado.acelerar();
        } catch (NullPointerException exception) {
            System.out.println("Vender carro furado");
        }



/*      Carro meuCarro1 = new Carro("Fusca");//novo objeto
        Carro meuCarro2 = new Carro("BMW");

        String result = meuCarro1.acelerar();
        meuCarro2.acelerar();
        meuCarro.acelerar();

        System.out.println(result);*/
    }
}
