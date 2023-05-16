package accountguard_javafx.accountguard_javafx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class InfoDialog extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InfoDialog.class.getResource("info-dialog.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("AccountGuard - Info Dialog");

        // Adding icon
        String iconPath = "https://raw.githubusercontent.com/mxrked/AccountGuard_JAVAFX/master/src/assets/imgs/lock-logo.png";
        Image icon = new Image(iconPath);
        stage.getIcons().add(icon);

        // Setting the size
        stage.setMaxWidth(500);
        stage.setMaxHeight(400);
        stage.setMinWidth(500);
        stage.setMinHeight(400);

        // Disabling maximize btn
        stage.initStyle(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.setResizable(false);

        // Handle the close request event
        stage.setOnCloseRequest(event -> {
            enterStartWindow(stage);
        });

        // Showing the window
        stage.show();
    }


    private void enterStartWindow(Stage currentStage) {
        // Create a new instance of StartApplication
        StartApplication startApplication = new StartApplication();

        double currentX = currentStage.getX();
        double currentY = currentStage.getY();

        try {
            // Start the StartApplication
            Stage startStage = new Stage();
            startApplication.start(startStage);

            startStage.setX(currentX);
            startStage.setY(currentY);

            // Close the current AddAccountApplication window
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
