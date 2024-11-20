package igor.consulta;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tela.Menu;

public class ConsultaBoundary {

//     private ConsultaControl control = new ConsultaControl();
    protected TextField txtCpf = new TextField();
    protected TextField txtRegistro = new TextField();
    protected TextField txtAgendamento = new TextField();
    protected TextField txtHorario = new TextField();
    protected TextField txtSala = new TextField();
    protected TextField txtEspecialidade = new TextField();
    protected TextField txtDescricao = new TextField();


    public Scene cadastrarConsulta(Stage stage, Menu menu){
        GridPane grid = new GridPane();
        Scene consulta = new Scene(grid, 800, 600);

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


        Button btnGravar = new Button("Gravar");
//        btnGravar.setOnAction(e -> control.);
        grid.add(btnGravar, 0, 7);

        Button btnPesquisar = new Button("Pesquisar");
//        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        grid.add(btnPesquisar, 1, 7);

        Button btnAlterar = new Button("Alterar");
//        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        grid.add(btnAlterar, 2, 7);

        Button btnRemover = new Button("Remover");
//        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        grid.add(btnRemover, 3, 7);


        Button btnVoltar = new Button("Voltar ao menu");
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        grid.add(btnVoltar, 0, 8);


        stage.setTitle("Sistema Hospitalar: Agendamento de Consulta");
        return consulta;    
    }
    
}
