module com.example.hwl5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.hwl5 to javafx.fxml;
    exports com.example.hwl5;
}