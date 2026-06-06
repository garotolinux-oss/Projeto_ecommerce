import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Cria um componente de texto (Label)
        Label label = new Label("Hello World");

        // Cria um painel de layout e centraliza o texto
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Cria a cena com o layout e define o tamanho da janela (largura x altura)
        Scene scene = new Scene(root, 400, 250);

        // Configura e exibe a janela principal (Stage)
        primaryStage.setTitle("Minha Primeira Janela JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Inicia a aplicação JavaFX
        launch(args);
    }
}
