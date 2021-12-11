module com.mycompany.gui2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.desktop;
    requires java.logging;

    opens com.mycompany.gui2 to javafx.fxml;
    exports com.mycompany.gui2;
    requires json.simple;
}
