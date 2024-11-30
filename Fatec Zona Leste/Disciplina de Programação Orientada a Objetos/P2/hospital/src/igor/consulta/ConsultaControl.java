package igor.consulta;

public class ConsultaControl {
    private ConsultaBoundary boundary;
    private ConsultaDAO consultaDAO = new ConsultaDAOImpl();

    public ConsultaControl(ConsultaBoundary boundary) {
        this.boundary = boundary;
    }

    public void gravar() {
        try {
            Consulta consulta = boundary.obterDadosDaTela();
            String mensagem = consultaDAO.gravar(consulta);
            boundary.mostrarAlerta(mensagem);
            boundary.limparTela();
        } catch (Exception e) {
            boundary.mostrarAlerta("Erro ao gravar consulta: " + e.getMessage());
        }
    }

    public void pesquisar() {
        try {
            Consulta consulta = boundary.obterDadosDaTela();
            Consulta resultado = consultaDAO.procurar(consulta);
            if (resultado != null) {
                boundary.preencherDadosNaTela(resultado);
            } else {
                boundary.mostrarAlerta("Consulta não encontrada.");
            }
        } catch (Exception e) {
            boundary.mostrarAlerta("Erro ao pesquisar consulta: " + e.getMessage());
        }
    }

    public void alterar() {
        try {
            Consulta consulta = boundary.obterDadosDaTela();
            Consulta consultaAtualizada = consultaDAO.atualizar(consulta);
            if (consultaAtualizada != null) {
                boundary.mostrarAlerta("Consulta atualizada com sucesso!");
                boundary.limparTela();
            } else {
                boundary.mostrarAlerta("Consulta não encontrada.");
            }
        } catch (Exception e) {
            boundary.mostrarAlerta("Erro ao atualizar consulta: " + e.getMessage());
        }
    }

    public void remover() {
        try {
            Consulta consulta = boundary.obterDadosDaTela();
            String mensagem = consultaDAO.remover(consulta);
            boundary.mostrarAlerta(mensagem);
            boundary.limparTela();
        } catch (Exception e) {
            boundary.mostrarAlerta("Erro ao remover consulta: " + e.getMessage());
        }
    }
}
