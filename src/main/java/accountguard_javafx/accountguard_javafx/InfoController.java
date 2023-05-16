package accountguard_javafx.accountguard_javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class InfoController {

    @FXML
    private Button closeBtn;

    @FXML
    protected void closeInfoDialog() throws IOException {

        // Adding the FXML file to loader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/accountguard_javafx/accountguard_javafx/start-window.fxml"));

        // Setting the new scene
        StartApplication startApplication = new StartApplication();
        Stage newStage = new Stage();
        startApplication.start(newStage);
        Stage currentStage = (Stage) closeBtn.getScene().getWindow();

        newStage.setX(currentStage.getX());
        newStage.setY(currentStage.getY());

        // Hiding/Showing windows
        currentStage.hide();

    }
}
