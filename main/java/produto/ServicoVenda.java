package produto;

public class ServicoVenda implements IServico{
    public String executar(){ return "Venda feita"; }

    public String cancelar(){ return "Venda cancelada"; }
}
