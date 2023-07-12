module com.example.hwl5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hwl5 to javafx.fxml;
    exports com.example.hwl5;
}