module com.mycompany.calulatorgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.calulatorgui to javafx.fxml;
    exports com.mycompany.calulatorgui;
}
