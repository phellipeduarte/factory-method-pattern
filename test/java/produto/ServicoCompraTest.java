package produto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoCompraTest {

    @Test
    void deveExecutarCompra(){
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra feita", servico.executar());
    }

    @Test
    void deveCancelarCompra(){
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra cancelada", servico.cancelar());
    }

}
