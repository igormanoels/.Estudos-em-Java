package igor.consulta;

public interface ConsultaDAO {
    String gravar(Consulta c);
    Consulta atualizar(Consulta c);
    String remover(Consulta c);
    Consulta procurar(Consulta c);
}
