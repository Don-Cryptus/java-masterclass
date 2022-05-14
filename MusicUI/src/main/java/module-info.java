module com.musicui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.musicui to javafx.fxml;
    opens com.musicui.model to javafx.fxml;
    exports com.musicui;
    exports com.musicui.model;
}