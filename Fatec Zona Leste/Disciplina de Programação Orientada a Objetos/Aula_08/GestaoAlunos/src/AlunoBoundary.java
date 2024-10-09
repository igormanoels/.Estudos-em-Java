import java.time.LocalDate;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AlunoBoundary extends Application {
    
    private TextField txtId = new TextField();
    private TextField txtRa = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtNascimento = new TextField();
    private AlunoControll controlAluno = new AlunoControll();
    private ObservableList<Aluno> tabelaAlunos;


    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        primaryStage.setTitle("Gestão de Alunos");
        primaryStage.setScene(new Scene(grid, 500, 600));
        primaryStage.show();
        grid.setHgap(10);
        grid.setVgap(10);

        // Componentes da tela
        Label lbId = new Label("Id:");
        Label lbRa = new Label("Ra:");
        Label lbNome = new Label("Nome:");
        Label lbNascimento = new Label("Nascimento:");
        Button btnAdcionar = new Button("Adcionar");
        Button btnPesquisar = new Button("Pesquisar");
            // Tabela
        TableView<Aluno> tabela = new TableView<>();
        TableColumn<Aluno, Long> colunaId = new TableColumn<>("ID");
        TableColumn<Aluno, String> colunaRa = new TableColumn<>("RA");
        TableColumn<Aluno, String> colunaNome = new TableColumn<>("NOME");
        TableColumn<Aluno, LocalDate> colunaData = new TableColumn<>("DATA");

        colunaId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colunaRa.setCellValueFactory(new PropertyValueFactory<>("ra"));
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaData.setCellValueFactory(new PropertyValueFactory<>("nascimento"));

        // Posição
        grid.add(lbId, 0, 0);
        grid.add(txtId, 1, 0);
        grid.add(lbRa, 0, 1);
        grid.add(txtRa, 1, 1);
        grid.add(lbNome, 0, 2);
        grid.add(txtNome, 1, 2);
        grid.add(lbNascimento, 0, 3);
        grid.add(txtNascimento, 1, 3);
        grid.add(btnAdcionar, 0, 4);
        grid.add(btnPesquisar, 1, 4);
        grid.add(tabela, 0, 5, 5, 5);
        tabela.getColumns().addAll(colunaId, colunaRa, colunaNome, colunaData);
        tabelaAlunos = FXCollections.observableArrayList();
        tabela.setItems(tabelaAlunos);

        // Funções
        btnAdcionar.setOnAction(e ->{
            Aluno novoAluno = boundaryToEntity();
            controlAluno.adcionarAluno(novoAluno);

            tabelaAlunos.add(novoAluno);

            txtId.clear();
            txtRa.clear();
            txtNome.clear();
            txtNascimento.clear();

        });

        btnPesquisar.setOnAction(e -> {
            Aluno alunoPesquisado = new Aluno();
            alunoPesquisado = controlAluno.pesquisarPorNome(txtNome.getText());
            if (alunoPesquisado != null) {
                entityToBoundary(alunoPesquisado);
            } else {
                Alert alerta = new Alert(AlertType.WARNING);
                alerta.setTitle("Erro");
                alerta.setHeaderText("Contato não localizado!");
                alerta.setContentText("Tente novamente.");
                alerta.show();
            }
        });
    }

    public Aluno boundaryToEntity() {
        Aluno novoAluno = new Aluno();
        novoAluno.setId(txtId.getText());
        novoAluno.setRa(txtRa.getText());
        novoAluno.setNome(txtNome.getText());
        novoAluno.setNascimento(txtNascimento.getText());
        return novoAluno;
    }

    public void entityToBoundary(Aluno aluno) {
        txtId.setText(String.valueOf(aluno.getId()));
        txtRa.setText(aluno.getRa());
        txtNome.setText(aluno.getNome());
        txtNascimento.setText(String.valueOf(aluno.getNascimento()));
    }
}
