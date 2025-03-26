public class ContaBancaria {
    private double saldo;
    public ContaBancaria (double b) {
        if ( b <= 0.0) {
            throw new IllegalArgumentException("valor b deve ser maior que zero!");
        }
        saldo = b;
    }
    public double getSaldo() {
        return saldo;
    }
    public void deposita(double v) {
        if ( v <= 0.0) {
            throw new IllegalArgumentException("valor v deve ser maior que zero!");
        }
        saldo = saldo + v;
    }

    /*
     * Retira o valor v da conta bancária
     * @param v o valor a ser retirado
     */
    public void saque(double v) {
        if ( v <= 0.0) {
            throw new IllegalArgumentException("valor v deve ser maior que zero!");
        }
        saldo = saldo - v;
    }
}
