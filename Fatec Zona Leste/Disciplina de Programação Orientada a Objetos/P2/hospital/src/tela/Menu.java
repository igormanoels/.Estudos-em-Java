package tela;
import igor.consulta.ConsultaBoundary;
import igor.especialidade.EspecialidadeBoundary;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Menu {

    private ConsultaBoundary csBoundary = new ConsultaBoundary();
    private EspecialidadeBoundary espBoundary = new EspecialidadeBoundary();

    public Scene telaPrincipal(Stage stage) {
        GridPane grid = new GridPane();
        Scene principal = new Scene(grid, 800, 600);


        Button btnCadFuncionario = new Button("Cadastrar Funcionário");
        Button btnCadMedico = new Button("Cadastrar Médico");
        Button btnCadEspecialidade = new Button("Cadastrar nova Especialidade");
        Button btnCadMedicamento = new Button("Cadastrar Medicamentos");
        Button btnCadDoador = new Button("Cadastrar Doador de Sangue");
        Button btnCadPaciente = new Button("Cadastrar Paciente");

        Button btnAgendarConsulta = new Button("Agendar Consulta");
        Button btnAgendarExame = new Button("Agendar Exame");
        Button btnAgendarDoacao = new Button("Agendar Doação de Sangue");

        Button btnSolicitarCompra = new Button("Abrir Solicitação de Compra");

        
        btnCadEspecialidade.setOnAction(e -> stage.setScene(espBoundary.cadastrarEspecialidade(stage, this)));
        btnAgendarConsulta.setOnAction(e -> stage.setScene(csBoundary.cadastrarConsulta(stage, this)));

        grid.add(btnCadEspecialidade, 0, 0);
        grid.add(btnAgendarConsulta, 0, 1);

        stage.setTitle("Sistema Hospitalar: Menu");
        return principal;
    }
}
