package produto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente(){
        try{
            IServico servico = ServicoFactory.obterServico("Setor");
            fail();
        } catch (IllegalArgumentException exception){
            assertEquals("Servico inexistente", exception.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido(){
        try{
            IServico servico = ServicoFactory.obterServico("Fornecedor");
            fail();
        } catch (IllegalArgumentException exception){
            assertEquals("Servico invalido", exception.getMessage());
        }
    }
}
