module com.example.autos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.autos to javafx.fxml;
    exports com.example.autos;
}