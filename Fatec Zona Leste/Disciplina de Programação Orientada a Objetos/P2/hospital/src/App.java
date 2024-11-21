import javafx.application.Application;
import javafx.stage.Stage;
import tela.Menu;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Menu menu = new Menu();
        stage.setScene(menu.telaPrincipal(stage));
        stage.show();
    }
}
