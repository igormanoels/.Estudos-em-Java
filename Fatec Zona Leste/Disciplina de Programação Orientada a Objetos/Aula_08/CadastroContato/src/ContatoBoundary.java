import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContatoBoundary extends Application {
    
    private TextField txtNome = new TextField();
    private TextField txtTelefone = new TextField();
    private TextField txtEmail = new TextField();
    private ContatoControll controll = new ContatoControll();

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setHgap(10); // Espaçamento horizontal
        grid.setVgap(10); // Espaçamento vertical
        
        Scene scene = new Scene(grid, 300, 200);
        // Cria objetos para definiar o quanto da tela será ocupado
        ColumnConstraints colLabels = new ColumnConstraints();
        colLabels.setPercentWidth(20);
        ColumnConstraints colTextFields = new ColumnConstraints();
        colTextFields.setPercentWidth(80);
        RowConstraints linhaConstraint = new RowConstraints();
        linhaConstraint.setPercentHeight(25.0);
        
        // Adciona os objetos na tela
        grid.getColumnConstraints().addAll(colLabels, colTextFields);
        grid.getRowConstraints().addAll(linhaConstraint, linhaConstraint,
                    linhaConstraint, linhaConstraint);
        
        stage.setScene(scene);
        stage.setTitle("Agenda de Contatos");
        stage.show();

        Label lbNome = new Label("Nome:");
        Label lbTelefone = new Label("Telefone:");
        Label lbEmail = new Label("Email:");
        Button btnPesquisar = new Button("Pesquisar");
        Button btnGravar = new Button("Gravar");

        // Adiciona os componentes ao GridPane
        grid.add(lbNome, 0, 0);
        grid.add(txtNome, 1, 0);
        grid.add(lbTelefone, 0, 1);
        grid.add(txtTelefone, 1, 1);
        grid.add(lbEmail, 0, 2);
        grid.add(txtEmail, 1, 2);
        grid.add(btnPesquisar, 1, 3);
        grid.add(btnGravar, 0, 3);

        // Funcões da tela
        btnGravar.setOnAction(e -> {
            controll.gravar(boundaryToEntity());
            txtNome.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");
            Alert alerta = new Alert(AlertType.CONFIRMATION);
            alerta.setTitle("Sucesso!");
            alerta.setHeaderText("O contato foi gravado com sucesso.");
            alerta.setContentText("clique em ok para continuar.");
            alerta.show();
        });

        btnPesquisar.setOnAction(e -> {
            Contato contatoBuscado = controll.pesquisar(boundaryToEntity());
            if (contatoBuscado != null ) {
                entityToBoundary(contatoBuscado);                
            } else {
                Alert alerta = new Alert(AlertType.WARNING);
                alerta.setTitle("Aviso!");
                alerta.setHeaderText("Contato não localizado");
                alerta.setContentText("Tente novamente.");
                alerta.show();
            }
        });

    }

    public static void main(String[] args) {
        Application.launch(ContatoBoundary.class, args);
    }
    
    public Contato boundaryToEntity() {
        Contato c = new Contato();
        c.setNome(txtNome.getText());
        c.setTelefone(txtTelefone.getText());
        c.setEmail(txtEmail.getText());
        return c;
    }

    public void entityToBoundary(Contato c) {
        txtNome.setText(c.getNome());
        txtTelefone.setText(c.getTelefone());
        txtEmail.setText(c.getEmail());
    }
}
