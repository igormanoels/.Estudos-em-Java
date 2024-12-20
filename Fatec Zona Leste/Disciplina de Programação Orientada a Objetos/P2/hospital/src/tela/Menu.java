package tela;
import fabio.view.CadastroDoadoresSangue;
import felype.agendamento.AgendamentoBoundary;
import felype.paciente.PacienteBoundary;
import igor.consulta.ConsultaBoundary;
import igor.especialidade.EspecialidadeBoundary;
import thiago.cruds.gestaoPedidos.estoque.EstoqueBoundary;
import thiago.cruds.receita.ReceitaBoundary;
import vitoria.funcionarios.FuncionarioBoundary;
import vitoria.medicos.MedicoBoundary;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;    
import javafx.stage.Stage;


public class Menu {

    private FuncionarioBoundary funcBoundary = new FuncionarioBoundary();
    private MedicoBoundary mdcBoundary = new MedicoBoundary();
    private CadastroDoadoresSangue cdSangue = new CadastroDoadoresSangue();
    private ConsultaBoundary csBoundary = new ConsultaBoundary();
    private EspecialidadeBoundary espBoundary = new EspecialidadeBoundary();
    private EstoqueBoundary estBoundary = new EstoqueBoundary();
    private ReceitaBoundary recBoundary = new ReceitaBoundary();
    private AgendamentoBoundary agdBoundary = new AgendamentoBoundary();
    //private PacienteBoundary pacBoundary = new PacienteBoundary();
    private PacienteBoundary pacBoundary = new PacienteBoundary();    

    public Scene telaPrincipal(Stage stage) {
        GridPane grid = new GridPane();
        grid.getStyleClass().add("grid-pane");
        Scene principal = new Scene(grid, 1000, 600);


        Button btnCadFuncionario = new Button("Cadastrar novo Funcionário");
        grid.add(btnCadFuncionario, 0, 0);
        btnCadFuncionario.setOnAction(e -> stage.setScene(funcBoundary.telaFuncionario(stage, this)));

        Button btnCadMedico = new Button("Cadastrar novo Médico");
        grid.add(btnCadMedico, 0, 1);
        btnCadMedico.setOnAction(e -> stage.setScene(mdcBoundary.telaMedico(stage, this)));

        Button btnCadEspecialidade = new Button("Cadastrar nova Especialidade");
        grid.add(btnCadEspecialidade, 0, 2);
        btnCadEspecialidade.setOnAction(e -> stage.setScene(espBoundary.cadastrarEspecialidade(stage, this)));
        
        Button btnCadMedicamento = new Button("Cadastrar novo Medicamento");
        grid.add(btnCadMedicamento, 0, 3);
        btnCadMedicamento.setOnAction(e -> stage.setScene(estBoundary.telaEstoque(stage, this)));

        Button btnCadDoador = new Button("Cadastrar Doador de Sangue");
        grid.add(btnCadDoador, 0, 4);
        btnCadDoador.setOnAction(e -> stage.setScene(cdSangue.telaDoadorSangue(stage, this)));

        Button btnCadPaciente = new Button("Cadastrar novo Paciente");
        grid.add(btnCadPaciente, 0, 5);
        btnCadPaciente.setOnAction(e -> stage.setScene(pacBoundary.telaPaciente(stage, this)));



        Button btnAgendarConsulta = new Button("Agendar nova Consulta");
        grid.add(btnAgendarConsulta, 0, 6);
        btnAgendarConsulta.setOnAction(e -> stage.setScene(csBoundary.telaConsulta(stage, this)));


        Button btnAgendarExame = new Button("Agendar novo Exame");
        grid.add(btnAgendarExame, 0, 7);
        btnAgendarExame.setOnAction(e -> stage.setScene(agdBoundary.agendamentoConsulta(stage, this)));


        
        Button btnAgendarDoacao = new Button("Agendar Doação de Sangue");
        grid.add(btnAgendarDoacao, 0, 8);

        
        Button btnSolicitarCompra = new Button("Abrir Solicitação de Compra");
        grid.add(btnSolicitarCompra, 0, 9);
        
        Button btnReceitar = new Button("Abrir Solicitação de Receita");
        grid.add(btnReceitar, 0, 10);
        btnReceitar.setOnAction(e -> stage.setScene(recBoundary.telaReceita(stage, this)));

        
        principal.getStylesheets().add(getClass().getResource("/css/estiloMenu.css").toExternalForm());
        stage.setTitle("Sistema Hospitalar: Menu");
        return principal;
    }
}
