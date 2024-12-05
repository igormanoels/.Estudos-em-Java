package especialidade;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class EspecialidadeControl {

    private EspecialidadeBoundary boundary;
    EspecialidadeDAOImpl dao = new EspecialidadeDAOImpl();

    public EspecialidadeControl(EspecialidadeBoundary boundary) {
        this.boundary = boundary;
    }

    public void inserirEspecialidade() {
        Especialidade novaEspecialidade = new Especialidade(boundary.txtEspecialidade.getText().trim());
        String mensagem = dao.gravar(novaEspecialidade);
        AlertaTela(mensagem);
        boundary.limparTela();
    }

    public void alterarEspecialidade() {
        Especialidade novaEspecialidade = new Especialidade(
                boundary.txtEspecialidade.getText().trim(),
                Integer.parseInt(boundary.txtId.getText().trim())
        );
        Especialidade especialidadeAtualizada = dao.atualizar(novaEspecialidade);
        if (especialidadeAtualizada != null) {
            boundary.txtId.setText(String.valueOf(especialidadeAtualizada.getId()));
            boundary.txtEspecialidade.setText(especialidadeAtualizada.getEspecialidade());
        }
    }

    public void removerEspecialidade() {
        Especialidade novaEspecialidade = new Especialidade(
                null,
                Integer.parseInt(boundary.txtId.getText().trim())
        );
        String mensagem = dao.remover(novaEspecialidade);
        AlertaTela(mensagem);
    }

    public void buscarEspecialidade() {
        Especialidade novaEspecialidade = new Especialidade(
                null,
                Integer.parseInt(boundary.txtId.getText().trim())
        );
        Especialidade resultado = dao.procurar(novaEspecialidade);
        if (resultado != null) {
            boundary.txtId.setText(String.valueOf(resultado.getId()));
            boundary.txtEspecialidade.setText(resultado.getEspecialidade());
        }
    }

    public void AlertaTela(String msg) {
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle("Aviso:");
        alerta.setHeaderText("Atenção!");
        alerta.setContentText(msg);
        alerta.show();
    }
}
