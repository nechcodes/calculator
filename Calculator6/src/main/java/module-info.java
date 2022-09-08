module com.example.calculator6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator6 to javafx.fxml;
    exports com.example.calculator6;
}