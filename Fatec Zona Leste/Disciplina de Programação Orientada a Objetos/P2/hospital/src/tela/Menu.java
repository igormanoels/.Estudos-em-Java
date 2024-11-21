package tela;
import igor.consulta.ConsultaBoundary;
import igor.especialidade.EspecialidadeBoundary;
import thiago.cruds.gestaoPedidos.estoque.EstoqueBoundary;
import thiago.cruds.receita.ReceitaBoundary;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Menu {

    private ConsultaBoundary csBoundary = new ConsultaBoundary();
    private EspecialidadeBoundary espBoundary = new EspecialidadeBoundary();
    private EstoqueBoundary estBoundary = new EstoqueBoundary();
    private ReceitaBoundary recBoundary = new ReceitaBoundary();

    public Scene telaPrincipal(Stage stage) {
        GridPane grid = new GridPane();
        Scene principal = new Scene(grid, 800, 600);


        Button btnCadFuncionario = new Button("Cadastrar novo Funcionário");
        grid.add(btnCadFuncionario, 0, 0);


        Button btnCadMedico = new Button("Cadastrar novo Médico");
        grid.add(btnCadMedico, 0, 1);


        Button btnCadEspecialidade = new Button("Cadastrar nova Especialidade");
        grid.add(btnCadEspecialidade, 0, 2);
        btnCadEspecialidade.setOnAction(e -> stage.setScene(espBoundary.cadastrarEspecialidade(stage, this)));

        
        Button btnCadMedicamento = new Button("Cadastrar novo Medicamento");
        grid.add(btnCadMedicamento, 0, 3);
        btnCadMedicamento.setOnAction(e -> stage.setScene(estBoundary.telaEstoque(stage, this)));


        
        Button btnCadDoador = new Button("Cadastrar Doador de Sangue");
        grid.add(btnCadDoador, 0, 4);
        
        
        Button btnCadPaciente = new Button("Cadastrar novo Paciente");
        grid.add(btnCadPaciente, 0, 5);


        Button btnAgendarConsulta = new Button("Agendar nova Consulta");
        grid.add(btnAgendarConsulta, 0, 6);
        btnAgendarConsulta.setOnAction(e -> stage.setScene(csBoundary.cadastrarConsulta(stage, this)));


        Button btnAgendarExame = new Button("Agendar novo Exame");
        grid.add(btnAgendarExame, 0, 7);

        
        Button btnAgendarDoacao = new Button("Agendar Doação de Sangue");
        grid.add(btnAgendarDoacao, 0, 8);

        
        Button btnSolicitarCompra = new Button("Abrir Solicitação de Compra");
        grid.add(btnSolicitarCompra, 0, 9);
        
        Button btnReceitar = new Button("Abrir Solicitação de Receita");
        grid.add(btnReceitar, 0, 10);
        btnReceitar.setOnAction(e -> stage.setScene(recBoundary.telaReceita(stage, this)));

        

        stage.setTitle("Sistema Hospitalar: Menu");
        return principal;
    }
}
