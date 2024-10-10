import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CursoBoundary extends Application {
    
    private TextField txtId = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtCodigo = new TextField();
    private TextField txtCoordenador = new TextField();
    private TextField txtQuantAlunos = new TextField();
    private CursoController controller = new CursoController();

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        stage.setTitle("Gestão de Cursos");
        stage.setScene(new Scene(grid, 400, 250));
        stage.show();
        grid.setHgap(10);
        grid.setVgap(10);

        // Componentes
        Label lbId = new Label("ID");
        Label lbNome = new Label("NOME");
        Label lbCodigo = new Label("CODIGO");
        Label lbCoordenador = new Label("COORDENADOR");
        Label lbquantidadeAlunos = new Label("QUANTIDADE DE ALUNOS");
        Button adcionar = new Button("Adcionar");
        Button pesquisar = new Button("Pesquisar");

        // Posição
        grid.add(lbId, 0, 0);
        grid.add(lbNome, 0, 1);
        grid.add(lbCodigo, 0, 2);
        grid.add(lbCoordenador, 0, 3);
        grid.add(lbquantidadeAlunos, 0, 4);
        grid.add(txtId, 1, 0);
        grid.add(txtNome, 1, 1);
        grid.add(txtCodigo, 1, 2);
        grid.add(txtCoordenador, 1, 3);
        grid.add(txtQuantAlunos, 1, 4);
        grid.add(adcionar, 0, 5);
        grid.add(pesquisar, 1, 5);

        // Funções
        adcionar.setOnAction(e -> {
            Curso novoCurso = fromToBoundary();
            controller.adcionar(novoCurso);

            txtId.setText("");
            txtNome.setText("");
            txtCodigo.setText("");
            txtCoordenador.setText("");
            txtQuantAlunos.setText("");

        });

        pesquisar.setOnAction(e -> {
            String nomeCurso = txtNome.getText();
            Curso cursoPesquisado = controller.pesquisar(nomeCurso);
            if (cursoPesquisado != null) {
                toEntity(cursoPesquisado);
            } else {
                Alert alerta = new Alert(AlertType.WARNING);
                alerta.setTitle("Aviso!!!");
                alerta.setHeaderText("O curso não foi localizado.");
                alerta.setContentText("O curso de " + nomeCurso + " não consta em nossa lista.");
                alerta.show();
            } 
        });
    }

    public void toEntity(Curso c) {
        txtId.setText(String.valueOf(c.getId()));
        txtNome.setText(c.getNome());
        txtCodigo.setText(c.getCodigo());
        txtCoordenador.setText(c.getCoordenador());
        txtQuantAlunos.setText(String.valueOf(c.getQuantidadeAlunos()));
    }

    public Curso fromToBoundary() {
        Curso novoCurso = new Curso();
        novoCurso.setId(Integer.parseInt(txtId.getText()));
        novoCurso.setNome(txtNome.getText());
        novoCurso.setCodigo(txtCodigo.getText());
        novoCurso.setCoordenador(txtCoordenador.getText());
        novoCurso.setQuantidadeAlunos(Integer.parseInt(txtQuantAlunos.getText()));
        return novoCurso;
    }
}
