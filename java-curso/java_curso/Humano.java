package java_curso;

public class Humano extends SerVivo{

    public String nome;

    public Humano(){
        super(42);
        this.nome = "Gabriel";
    }

    @Override
    public void respirar() {
        System.out.println("transformando em oxigênio)");
    }

    //@Override

}
