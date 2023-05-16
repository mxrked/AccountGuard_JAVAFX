package accountguard_javafx.accountguard_javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class StartController {

    @FXML
    private Button addAccountWindowBtn;
    @FXML
    private Button removeAccountWindowBtn;
    @FXML
    private Button viewAccountsWindowBtn;

    @FXML
    private Button exitCloseBtn;

    @FXML
    private Button infoBtn;

    @FXML
    protected void exitClose() throws IOException {
        System.exit(0);
    }
    @FXML
    protected void openAddAccountWindow() throws IOException {

        // Adding the FXML file to loader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/accountguard_javafx/accountguard_javafx/add-account-window.fxml"));

        // Setting the new scene
        AddAccountApplication addAccountApplication = new AddAccountApplication();
        Stage newStage = new Stage();
        addAccountApplication.start(newStage);
        Stage currentStage = (Stage) addAccountWindowBtn.getScene().getWindow();

        newStage.setX(currentStage.getX());
        newStage.setY(currentStage.getY());

        // Hiding/Showing windows
        currentStage.hide();

    }
    @FXML
    protected void openRemoveAccountWindow() throws IOException {

        // Adding the FXML file to loader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/accountguard_javafx/accountguard_javafx/remove-account-window.fxml"));

        // Setting the new scene
        RemoveAccountApplication removeAccountApplication = new RemoveAccountApplication();
        Stage newStage = new Stage();
        removeAccountApplication.start(newStage);
        Stage currentStage = (Stage) removeAccountWindowBtn.getScene().getWindow();

        newStage.setX(currentStage.getX());
        newStage.setY(currentStage.getY());

        // Hiding/Showing windows
        currentStage.hide();

    }
    @FXML
    protected void openViewAccountsWindow() throws IOException {

        // Adding the FXML file to loader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/accountguard_javafx/accountguard_javafx/view-accounts-window.fxml"));

        // Setting the new scene
        ViewAccountsApplication viewAccountsApplication = new ViewAccountsApplication();
        Stage newStage = new Stage();
        viewAccountsApplication.start(newStage);
        Stage currentStage = (Stage) viewAccountsWindowBtn.getScene().getWindow();

        newStage.setX(currentStage.getX());
        newStage.setY(currentStage.getY());

        // Hiding/Showing windows
        currentStage.hide();

    }
    @FXML
    protected void openInfoDialog() throws IOException {
        // Adding the FXML file to loader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/accountguard_javafx/accountguard_javafx/info-dialog.fxml"));

        // Setting the new scene
        InfoDialog infoDialog = new InfoDialog();
        Stage newStage = new Stage();
        infoDialog.start(newStage);
        Stage currentStage = (Stage) infoBtn.getScene().getWindow();

        newStage.setX(currentStage.getX());
        newStage.setY(currentStage.getY());

        // Hiding/Showing windows
        currentStage.hide();
    }

}
