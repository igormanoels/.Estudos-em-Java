package igor.especialidade;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tela.Menu;

public class EspecialidadeBoundary {
//        dataAgendamento
//        horario
//        sala
//        especialidade
//        descricao
    private TextField txtCpf = new TextField();
    private TextField txtRegistro = new TextField();
    private TextField txtAgendamento = new TextField();
    private TextField txtHorario = new TextField();
    private TextField txtSala = new TextField();
    private TextField txtEspecialidade = new TextField();
    private TextField txtDescricao = new TextField();


    public Scene cadastrarEspecialidade(Stage stage, Menu menu) {
        GridPane grid = new GridPane();
        Scene especialidade = new Scene(grid, 800, 600);

        grid.add((new Label("CPF: ")), 0, 0);
        grid.add((new Label("Registro: ")), 0, 1);
        grid.add(new Label("Agendamento: "), 0, 2);
        grid.add(new Label("Horario: "), 0, 3);
        grid.add(new Label("Sala: "), 0, 4);
        grid.add(new Label("Especialidade: "), 0, 5);
        grid.add(new Label("Descrição: "), 0, 6);

        grid.add(txtCpf, 1, 0);
        grid.add(txtRegistro, 1, 1);
        grid.add(txtAgendamento, 1, 2);
        grid.add(txtHorario, 1, 3);
        grid.add(txtSala, 1, 4);
        grid.add(txtEspecialidade, 1, 5);
        grid.add(txtDescricao, 1, 6);



        Button btnVoltar = new Button("Voltar ao Menu");
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        grid.add(btnVoltar, 0, 7);

        stage.setTitle("Sistema Hospitalar: Cadastrar uma nova Especialidade");
        return especialidade;
    }
}
