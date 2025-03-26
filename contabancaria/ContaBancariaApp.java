public class ContaBancariaApp
{
    public static void main(String[] args)
    {
        System.out.println("Bank Account Aplication");

        ContaBancaria[] contas;
        contas = new ContaBancaria[5];

        contas[0] = new ContaBancaria (1020.00);
        contas[1] = new ContaBancaria (3000.00);
        contas[2] = new ContaBancaria (35000.00);
        //contas[3] = new ContaBancaria (350.00);
        //contas[4] = new ContaBancaria (35.00);

        contas[0].deposita(20);
        contas[1].deposita(10);
        contas[1].saque(5);

        // mostrar todas as contas
        int i = 0;
        while (i < contas.length) 
        {
            if (contas[i] != null)
            {
                System.out.println(contas[i].getSaldo());
            }
            else
            {
                System.out.println("conta vazia");
            }
            i = i + 1;
        }
        System.out.println();
    }
}
