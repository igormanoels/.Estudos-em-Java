package fabio.view;

import java.time.LocalDate;

import fabio.controll.AgendamentoControll;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.util.Callback;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;
import fabio.model.Agendamento;
import fabio.service.GenericException;

public class AgendamentoDoacaoSangue {

	private Label txtId = new Label("");
	private DatePicker txtData = new DatePicker(LocalDate.now());
	private TextField txtHorario = new TextField("");
	private TextField txtSala = new TextField("");
	private TextField txtCpf = new TextField("");
	private TextField txtFuncionarioRegistro = new TextField("");

	private AgendamentoControll controll;

	private TableView<Agendamento> tabAgendamento = new TableView<>();

	public AgendamentoDoacaoSangue() {
		try {
			controll = new AgendamentoControll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public BorderPane getTela() {

		BorderPane telaAgendamentoDoacaoSangue = new BorderPane();
		GridPane telaCampos = new GridPane();
		
		Button bntGravar = new Button("Gravar");
		bntGravar.setOnAction(e -> {
			try {
				controll.gravar();
				tabAgendamento.refresh();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		Button bntPesquisar = new Button("Pesquisar");
		bntPesquisar.setOnAction(e -> {
			try {
				controll.pesquisarPorNome();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		Button bntLimpar = new Button("Limpar");
		bntLimpar.setOnAction(e -> controll.limparCampos());
		
		telaCampos.setVgap(5);
		telaCampos.setHgap(15);
		telaCampos.setPadding(new Insets(15));

		telaCampos.add(new Label("ID: "), 0, 0);
		telaCampos.add(txtId, 1, 0);

		telaCampos.add(new Label("Data agendada: "), 0, 1);
		telaCampos.add(txtData, 1, 1);

		telaCampos.add(new Label("Horario agendado: "), 0, 2);
		telaCampos.add(txtHorario, 1, 2);

		telaCampos.add(new Label("Sala: "), 0, 3);
		telaCampos.add(txtSala, 1, 3);

		telaCampos.add(new Label("CPF do doador: "), 0, 4);
		telaCampos.add(txtCpf, 1, 4);

		telaCampos.add(new Label("Registro do funcionario: "), 0, 5);
		telaCampos.add(txtFuncionarioRegistro, 1, 5);
		
		telaCampos.add(bntGravar, 0, 6);
		telaCampos.add(bntPesquisar, 1, 6);
		telaCampos.add(bntLimpar, 2, 6);

		gerarColunas();
		vincularPropriedades();

		telaAgendamentoDoacaoSangue.setTop(telaCampos);
		telaAgendamentoDoacaoSangue.setCenter(tabAgendamento);
		
		try {
			controll.pesquisarTodos();
		} catch (GenericException e) {
			e.printStackTrace();
		}

		return telaAgendamentoDoacaoSangue;
	}

	@SuppressWarnings("unchecked")
	public void gerarColunas() {
		TableColumn<Agendamento, Integer> coluna1 = new TableColumn<>("ID");
		coluna1.setCellValueFactory(new PropertyValueFactory<Agendamento, Integer>("ID"));

		TableColumn<Agendamento, LocalDate> coluna2 = new TableColumn<>("Data");
		coluna2.setCellValueFactory(new PropertyValueFactory<Agendamento, LocalDate>("Data"));

		TableColumn<Agendamento, String> coluna3 = new TableColumn<>("Horario");
		coluna3.setCellValueFactory(new PropertyValueFactory<Agendamento, String>("Horario"));

		TableColumn<Agendamento, Integer> coluna4 = new TableColumn<>("Sala");
		coluna4.setCellValueFactory(new PropertyValueFactory<Agendamento, Integer>("Sala"));

		TableColumn<Agendamento, Integer> coluna5 = new TableColumn<>("CPF");
		coluna5.setCellValueFactory(new PropertyValueFactory<Agendamento, Integer>("CPF"));

		TableColumn<Agendamento, Integer> coluna6 = new TableColumn<>("Registro do funcionario");
		coluna6.setCellValueFactory(new PropertyValueFactory<Agendamento, Integer>("Registro do funcionario"));
		
		Callback<TableColumn<Agendamento, Void>, TableCell<Agendamento, Void>> callback = new Callback<>() {
			
			@Override
			public TableCell<Agendamento, Void> call(TableColumn<Agendamento, Void> param) {
				TableCell<Agendamento, Void> tableCell = new TableCell<>() {
					
					final Button bntExcluir = new Button("Excluir");{
						bntExcluir.setOnAction(e -> {
							try {
								Agendamento a = tabAgendamento.getItems().get(getIndex());
								controll.excluir(a);
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						});
					}
					
					@Override
					public void updateItem(Void item, boolean isEmpty) {
						super.updateItem(item, isEmpty);
						if(isEmpty) {
							setGraphic(null);
						} else {
							setGraphic(bntExcluir);
						}
					}
					
				};
				return tableCell;
			}

		};
		
		TableColumn<Agendamento, Void> coluna7 = new TableColumn<>();
		coluna7.setCellFactory(callback);
		
		tabAgendamento.getColumns().addAll(coluna1, coluna2, coluna3, coluna4, coluna5, coluna6, coluna7);
		tabAgendamento.setItems(controll.getLista());
		
		tabAgendamento.getSelectionModel().selectedItemProperty().addListener( (observador, antigo, novo) -> {
			System.out.println("Agendamento => " + novo);
			controll.entidadeParaTela(novo);
		});
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void vincularPropriedades() {

		Bindings.bindBidirectional(txtId.textProperty(), controll.getId(),
				(StringConverter) new IntegerStringConverter());

		Bindings.bindBidirectional(txtData.valueProperty(), controll.getData());

		Bindings.bindBidirectional(txtHorario.textProperty(), controll.getHorario());

		Bindings.bindBidirectional(txtSala.textProperty(), controll.getSala(),
				(StringConverter) new IntegerStringConverter());

		Bindings.bindBidirectional(txtCpf.textProperty(), controll.getPessoaCPF(),
				(StringConverter) new IntegerStringConverter());

		Bindings.bindBidirectional(txtFuncionarioRegistro.textProperty(), controll.getFuncionarioRegistro(),
				(StringConverter) new IntegerStringConverter());

	}

}
