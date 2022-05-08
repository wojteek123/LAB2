module com.example.lab2fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab22 to javafx.fxml;
    exports com.example.lab22;
}