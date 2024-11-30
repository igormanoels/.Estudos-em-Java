package thiago.cruds.receita;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import thiago.cruds.gestaoPedidos.estoque.Estoque;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.util.StringConverter;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.converter.IntegerStringConverter;
import tela.Menu;

public class ReceitaBoundary extends Application {

  private Label lbId = new Label("");
  private DatePicker dateReceita = new DatePicker(LocalDate.now());
  private TextField txtCRM = new TextField("");
  private TextField txtMedicamentos = new TextField("Digite os medicamentos separados por espaço");
  private TableView<Receita> tableView = new TableView<>();
  //private ReceitaControl control = new ReceitaControl();

  public Scene telaReceita(Stage stage, Menu menu) {
    BorderPane panePrincipal = new BorderPane();
    GridPane paneForm = new GridPane();

    paneForm.add(new Label("Id: "), 0, 0);
    paneForm.add(lbId, 1, 0);
    paneForm.add(new Label("Data da Receita: "), 0, 1);
    paneForm.add(dateReceita, 1, 1);
    paneForm.add(new Label("Medicamentos: "), 0, 2);
    paneForm.add(txtMedicamentos, 1, 2);
    paneForm.add(new Label("CRM do Médico: "), 0, 3);
    paneForm.add(txtCRM, 1, 3);

    Button btnGravar = new Button("Gravar");
    // btnGravar.setOnAction(e -> {
    //   try {
    //     control.gravar();
    //     tableView.refresh();
    //   } catch (Exception ex) {
    //     alert(Alert.AlertType.ERROR, "Erro ao gravar: " + ex.getMessage());
    //   }
    // });

    Button btnPesquisar = new Button("Pesquisar");
    // btnPesquisar.setOnAction(e -> {
    //   try {
    //     control.pesquisarPorCrm();
    //   } catch (Exception ex) {
    //     alert(Alert.AlertType.ERROR, "Erro ao pesquisar: " + ex.getMessage());
    //   }
    // });

    Button btnLimpar = new Button("Limpar");
    // btnLimpar.setOnAction(e -> control.limparTudo());

    Button btnVoltar = new Button("Voltar ao Menu");
    btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
    panePrincipal.setBottom(btnVoltar);
    BorderPane.setMargin(btnVoltar, new Insets(10));

    paneForm.add(btnGravar, 2, 0);
    paneForm.add(btnPesquisar, 2, 1);
    paneForm.add(btnLimpar, 2, 2);
    paneForm.add(btnVoltar, 2, 3);

    // vincularPropriedades();

    paneForm.getStylesheets().add(getClass().getResource("/css/estiloEspecialidade.css").toExternalForm());
    panePrincipal.setTop(paneForm);
    panePrincipal.setCenter(tableView);
    return new Scene(panePrincipal, 1000, 600);
  }

  private void alert(Alert.AlertType tipo, String msg) {
    Alert alertWindow = new Alert(tipo);
    alertWindow.setHeaderText("Alerta");
    alertWindow.setContentText(msg);
    alertWindow.showAndWait();
  }

  @SuppressWarnings("unchecked")
  private void generateColumns() {
    TableColumn<Receita, Integer> col1 = new TableColumn<>("Id");
    col1.setCellValueFactory(new PropertyValueFactory<>("id"));
    
    TableColumn<Receita, LocalDate> col2 = new TableColumn<>("DataReceita");
    col2.setCellValueFactory(new PropertyValueFactory<>("dataReceita"));

    TableColumn<Receita, String> col3 = new TableColumn<>("Medicamentos");
    col3.setCellValueFactory(new PropertyValueFactory<>("medicamentos"));

    TableColumn<Receita, String> col4 = new TableColumn<>("CRM");
    col4.setCellValueFactory(new PropertyValueFactory<>("medicoCRM"));

    tableView.getColumns().addAll(col1, col2, col3, col4);
    // tableView.setItems(control.getLista());

    tableView.getSelectionModel().selectedItemProperty()
      .addListener((obs, antigo, novo) -> {
      if (novo != null) {
        // control.entidadeParaTela(novo);
      }
    });
  }

  // private void vincularPropriedades() {
  //   Bindings.bindBidirectional(lbId.textProperty(), control.idProperty(),
  //     (StringConverter) new IntegerStringConverter());
  //   Bindings.bindBidirectional(dateReceita.valueProperty(), control.dataReceitaProperty());
  //   Bindings.bindBidirectional(txtMedicamentos.textProperty(), control.medicamentosProperty());
  //   Bindings.bindBidirectional(txtCRM.textProperty(), control.medicoCRMProperty());
  // }

  @Override
  public void start(Stage arg0) throws Exception {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'start'");
  }
}