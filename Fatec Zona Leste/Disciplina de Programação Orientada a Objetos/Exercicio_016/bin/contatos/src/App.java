import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            // Layout principal
            GridPane grid = new GridPane();
            grid.setPadding(new Insets(10));
            grid.setHgap(10);
            grid.setVgap(10);

            // Componentes
            Label lbId = new Label("Id:");
            TextField txtId = new TextField();

            Label lbNome = new Label("Nome:");
            TextField txtNome = new TextField();

            Label lbTelefone = new Label("Telefone:");
            TextField txtTelefone = new TextField();

            Button btnSalvar = new Button("Salvar");
            Button btnPesquisar = new Button("Pesquisar");

            // Ações dos botões
            btnSalvar.setOnAction(event -> {
                String id = txtId.getText();
                String nome = txtNome.getText();
                String telefone = txtTelefone.getText();
                System.out.printf("Contato Salvo - Id: %s, Nome: %s, Telefone: %s%n", id, nome, telefone);
            });

            btnPesquisar.setOnAction(event -> {
                String id = txtId.getText();
                System.out.printf("Pesquisar Contato - Id: %s%n", id);
            });

            // Adicionando componentes ao layout
            grid.add(lbId, 0, 0);
            grid.add(txtId, 1, 0);

            grid.add(lbNome, 0, 1);
            grid.add(txtNome, 1, 1);

            grid.add(lbTelefone, 0, 2);
            grid.add(txtTelefone, 1, 2);

            grid.add(btnSalvar, 0, 3);
            grid.add(btnPesquisar, 1, 3);

            // Cena e estágio
            Scene scene = new Scene(grid, 400, 200);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Agenda de Contatos");
            primaryStage.centerOnScreen();
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
