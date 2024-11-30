package fabio.view;

import javafx.util.Callback;
import java.time.LocalDate;
import fabio.controll.DoadorControll;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;
import tela.Menu;
import fabio.model.Doador;
import fabio.service.GenericException;

public class CadastroDoadoresSangue {

	private TextField txtCpf = new TextField("");
	private TextField txtNome = new TextField("");
	private DatePicker txtNascimento = new DatePicker(LocalDate.now());
	private TextField txtEmail = new TextField("");
	private TextField txtTelefone = new TextField("");
	private ComboBox<String> txtTSanguinio = new ComboBox<>();

	private TableView<Doador> tabDoadores = new TableView<>();

	private DoadorControll controll;

	public Scene telaDoadorSangue(Stage stage, Menu menu) {

		try {
			controll = new DoadorControll();
		} catch (GenericException e) {
			e.printStackTrace();
		}

		BorderPane telaCadastroDoadoresSangue = new BorderPane();
		GridPane telaCampos = new GridPane();
		telaCampos.getStyleClass().add("grid-pane");
		Scene doador = new Scene(telaCampos, 1000, 600);



		Button bntGravar = new Button("Gravar");
		bntGravar.setOnAction(e -> {
			try {
				controll.gravar();
				tabDoadores.refresh();
			} catch (GenericException e1) {
				e1.printStackTrace();
			}
		});

		Button bntPesquisar = new Button("Pesquisar");
		bntPesquisar.setOnAction(e -> {
			try {
				controll.pesquisarPorNome();
			} catch (GenericException e1) {
				e1.printStackTrace();
			}
		});

		Button bntLimpar = new Button("Limpar");
		bntLimpar.setOnAction(e -> controll.limparCampos());

		telaCampos.setVgap(5);
		telaCampos.setHgap(15);
		telaCampos.setPadding(new Insets(15));

		txtTSanguinio.getItems().addAll("A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-");

		telaCampos.add(new Label("CPF: "), 0, 0);
		telaCampos.add(txtCpf, 1, 0);

		telaCampos.add(new Label("Nome: "), 0, 1);
		telaCampos.add(txtNome, 1, 1);

		telaCampos.add(new Label("Data de Nascimento: "), 0, 2);
		telaCampos.add(txtNascimento, 1, 2);

		telaCampos.add(new Label("Email: "), 0, 3);
		telaCampos.add(txtEmail, 1, 3);

		telaCampos.add(new Label("Telefone: "), 0, 4);
		telaCampos.add(txtTelefone, 1, 4);

		telaCampos.add(new Label("Tipo Sanguineo: "), 0, 5);
		telaCampos.add(txtTSanguinio, 1, 5);

		Button btnVoltar = new Button("Voltar ao menu");
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        
		telaCampos.add(btnVoltar, 0, 6);		
		telaCampos.add(bntGravar, 1, 6);
		telaCampos.add(bntPesquisar, 2, 6);
		telaCampos.add(bntLimpar, 3, 6);

		gerarColunas();
		vincularPropriedades();

		telaCadastroDoadoresSangue.setTop(telaCampos);
		telaCadastroDoadoresSangue.setCenter(tabDoadores);

		try {
			controll.pesquisarTodos();
		} catch (GenericException e) {
			e.printStackTrace();
		}

		telaCampos.getStylesheets().add(getClass().getResource("/css/estiloConsulta.css").toExternalForm());
        stage.setTitle("Sistema Hospitalar: Cadastro de Doador de Sangue");
        return doador;  
	}

	@SuppressWarnings("unchecked")
	public void gerarColunas() {
		TableColumn<Doador, Integer> coluna1 = new TableColumn<>("CPF");
		coluna1.setCellValueFactory(new PropertyValueFactory<Doador, Integer>("CPF"));

		TableColumn<Doador, Integer> coluna2 = new TableColumn<>("Nome");
		coluna2.setCellValueFactory(new PropertyValueFactory<Doador, Integer>("Nome"));

		TableColumn<Doador, Integer> coluna3 = new TableColumn<>("Data de Nascimento");
		coluna3.setCellValueFactory(new PropertyValueFactory<Doador, Integer>("Data de Nascimento"));

		TableColumn<Doador, Integer> coluna4 = new TableColumn<>("Email");
		coluna4.setCellValueFactory(new PropertyValueFactory<Doador, Integer>("Email"));

		TableColumn<Doador, Integer> coluna5 = new TableColumn<>("Telefone");
		coluna5.setCellValueFactory(new PropertyValueFactory<Doador, Integer>("Telefone"));

		TableColumn<Doador, Integer> coluna6 = new TableColumn<>("Tipo Sanguineo");
		coluna6.setCellValueFactory(new PropertyValueFactory<Doador, Integer>("Tipo Sanguineo"));

		// Fabricante? enteder isso melhor...

		Callback<TableColumn<Doador, Void>, TableCell<Doador, Void>> callback = new Callback<>() {

			@Override
			public TableCell<Doador, Void> call(TableColumn<Doador, Void> param) {
				TableCell<Doador, Void> tableCell = new TableCell<>() {
					
					final Button bntExcluir = new Button("Exluir");{
						bntExcluir.setOnAction(e -> {
							try {
								Doador d = tabDoadores.getItems().get(getIndex());
								controll.excluir(d);
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						});
					}

					@Override
					public void updateItem(Void item, boolean isEmpty) {
						super.updateItem(item, isEmpty);
						if (isEmpty) {
							setGraphic(null);
						} else {
							setGraphic(bntExcluir);
						}

					}
				};
				return tableCell;
			}

		};
		
		TableColumn<Doador, Void> coluna7 = new TableColumn<>();
		coluna7.setCellFactory(callback);
		
		tabDoadores.getColumns().addAll(coluna1, coluna2, coluna3, coluna4, coluna5, coluna6, coluna7);
		tabDoadores.setItems(controll.getLista());
		
		tabDoadores.getSelectionModel().selectedItemProperty().addListener( (observador, antigo, novo) -> {
			System.out.println("Doador => " + novo);
			controll.entidadeParaTela(novo);
		} );

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void vincularPropriedades() {
		Bindings.bindBidirectional(txtCpf.textProperty(), controll.getCpf(),
				(StringConverter) new IntegerStringConverter());

		Bindings.bindBidirectional(txtNome.textProperty(), controll.getNome());

		Bindings.bindBidirectional(txtNascimento.valueProperty(), controll.getNascimento());

		Bindings.bindBidirectional(txtEmail.textProperty(), controll.getEmail());

		Bindings.bindBidirectional(txtTelefone.textProperty(), controll.getTelefone(),
				(StringConverter) new IntegerStringConverter());

		Bindings.bindBidirectional(txtTSanguinio.valueProperty(), controll.getTipoSanguinio());
	}

}
