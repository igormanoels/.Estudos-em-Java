package igor.especialidade;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tela.Menu;

public class EspecialidadeBoundary {

    protected TextField txtEspecialidade = new TextField();
    protected TextField txtId = new TextField();
    private EspecialidadeControl control = new EspecialidadeControl(this); // Passa a referência da boundary

    public Scene cadastrarEspecialidade(Stage stage, Menu menu) {
        GridPane grid = new GridPane();
        Scene especialidade = new Scene(grid, 800, 600);

        grid.add(new Label("ID Especialidade: "), 0, 0);
        grid.add(txtId, 1, 0);
        grid.add(new Label("Especialidade: "), 0, 1);
        grid.add(txtEspecialidade, 1, 1);

        Button btnGravar = new Button("Gravar");
        btnGravar.setOnAction(e -> control.inserirEspecialidade());
        grid.add(btnGravar, 0, 3);

        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.setOnAction(e -> control.buscarEspecialidade());
        grid.add(btnPesquisar, 1, 3);

        Button btnAlterar = new Button("Alterar");
        // btnAlterar.setOnAction(e -> control.alterarEspecialidade());
        grid.add(btnAlterar, 2, 3);

        Button btnRemover = new Button("Remover");
        // btnRemover.setOnAction(e -> control.removerEspecialidade());
        grid.add(btnRemover, 3, 3);

        Button btnVoltar = new Button("Voltar ao Menu");
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        grid.add(btnVoltar, 0, 4);

        Button btnLimpar = new Button("Limpar");
        btnLimpar.setOnAction(e -> limparTela());
        grid.add(btnLimpar, 1, 4);

        stage.setTitle("Sistema Hospitalar: Cadastrar uma nova Especialidade");
        return especialidade;
    }

    public void AlertaTela(String msg) {
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle("Aviso:");
        alerta.setHeaderText("Atenção!");
        alerta.setContentText(msg); 
        alerta.show();
    }

    public void limparTela() {
        this.txtEspecialidade.setText("");
        this.txtId.setText("");
    }
}
