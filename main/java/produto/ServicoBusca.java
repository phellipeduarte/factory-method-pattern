package produto;

public class ServicoBusca implements IServico {
    public String executar(){ return "Produto encontrado"; }

    public String cancelar(){ return "Busca cancelada"; }
}
