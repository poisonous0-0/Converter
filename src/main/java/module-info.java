module com.example.converter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.converter to javafx.fxml;
    exports com.example.converter;
}