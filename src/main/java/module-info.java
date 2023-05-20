module com.example.practicegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicegame to javafx.fxml;
    exports com.example.practicegame;
}