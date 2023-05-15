package accountguard_javafx.accountguard_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class AddAccountApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AddAccountApplication.class.getResource("add-account-window.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("AccountGuard - Add Account Window");

        // Adding icon
        String iconPath = "https://raw.githubusercontent.com/mxrked/AccountGuard_JAVAFX/master/src/assets/imgs/lock-logo.png";
        Image icon = new Image(iconPath);
        stage.getIcons().add(icon);

        // Setting the size
//        stage.setMaxWidth(600);
//        stage.setMaxHeight(800);
//        stage.setMinWidth(600);
//        stage.setMinHeight(800);

        // Disabling maximize btn
        stage.initStyle(StageStyle.DECORATED);

        stage.setScene(scene);

        // Handle the close request event
        stage.setOnCloseRequest(event -> {
            enterStartWindow(stage);
        });

        stage.show();
    }

    private void enterStartWindow(Stage currentStage) {
        // Create a new instance of StartApplication
        StartApplication startApplication = new StartApplication();
        try {
            // Start the StartApplication
            startApplication.start(new Stage());

            // Close the current AddAccountApplication window
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
