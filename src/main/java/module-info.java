module accountguard_javafx.accountguard_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens accountguard_javafx.accountguard_javafx to javafx.fxml;
    exports accountguard_javafx.accountguard_javafx;
}