
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ContaBancariaTeste {
    @Test
    public void testeContaBancariaCriada() {
        ContaBancaria conta = new ContaBancaria(12.0);
        double b = conta.getSaldo();
        assertEquals(12.0, b, 0.01);
    }

    @Test
    public void testeContaBancariaSaque() {
        ContaBancaria conta = new ContaBancaria(12.0);
        conta.saque(1.0);
        double b = conta.getSaldo();
        assertEquals(11.0, b, 0.01);
    }
}
