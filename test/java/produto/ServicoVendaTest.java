package produto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoVendaTest {

    @Test
    void deveExecutarVenda(){
        IServico servico = ServicoFactory.obterServico("Venda");
        assertEquals("Venda feita", servico.executar());
    }

    @Test
    void deveCancelarVenda(){
        IServico servico = ServicoFactory.obterServico("Venda");
        assertEquals("Venda cancelada", servico.cancelar());
    }

}