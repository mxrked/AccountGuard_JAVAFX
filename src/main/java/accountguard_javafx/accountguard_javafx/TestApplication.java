package accountguard_javafx.accountguard_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class TestApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TestApplication.class.getResource("test-window.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("AccountGuard - Test Window");

        // Setting the size
        stage.setMaxWidth(600);
        stage.setMaxHeight(800);
        stage.setMinWidth(600);
        stage.setMinHeight(800);

        // Disabling maximize btn
        stage.initStyle(StageStyle.UTILITY);

        stage.setScene(scene);



        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
