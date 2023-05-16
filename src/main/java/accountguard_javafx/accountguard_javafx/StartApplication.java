package accountguard_javafx.accountguard_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class StartApplication extends Application {

    private double xOffset = 0;
    private double yOffset = 0;

    private String topBtnsBGColor = "#79B600";
    private String topBtnsHoverBGColor = "#527C00";

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("start-window.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("AccountGuard - Start Window");

        // Adding icon
        String iconPath = "https://raw.githubusercontent.com/mxrked/AccountGuard_JAVAFX/master/src/assets/imgs/lock-logo.png";
        Image icon = new Image(iconPath);
        stage.getIcons().add(icon);

        // Setting the size
        stage.setMaxWidth(600);
        stage.setMaxHeight(800);
        stage.setMinWidth(600);
        stage.setMinHeight(800);

        // Disabling maximize btn
        stage.initStyle(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.setResizable(false);

        // Applying resize bug fix
        setWindowDragListeners(stage);

        // Showing the window
        stage.show();
    }

    // This fixes the launch window resize issue
    private void setWindowDragListeners(Stage stage) {
        stage.getScene().setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        stage.getScene().setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        });
    }

    public static void main(String[] args) {
        launch();
    }
}
