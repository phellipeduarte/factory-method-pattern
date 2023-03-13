package produto;

public class ServicoFactory {
    public static IServico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("produto.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Servico inexistente");
        }
        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Servico invalido");
        }
        return (IServico) objeto;
    }
}
