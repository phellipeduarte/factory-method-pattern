package produto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoBuscaTest {
    @Test
    void deveExecutarBusca(){
        IServico servico = ServicoFactory.obterServico("Busca");
        assertEquals("Produto encontrado", servico.executar());
    }

    @Test
    void deveCancelarBusca(){
        IServico servico = ServicoFactory.obterServico("Busca");
        assertEquals("Busca cancelada", servico.cancelar());
    }
}
