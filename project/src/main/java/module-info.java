module JavaFXPracticeProject.JavaFXPracticeProject {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.desktop;
    requires java.logging;


    opens controller to javafx.fxml, com.google.gson;
    opens dto to javafx.fxml, com.google.gson;
    opens model to javafx.fxml, com.google.gson;
    opens system to javafx.fxml, com.google.gson;
    opens table to javafx.fxml, com.google.gson;

    exports table;
    exports model;
    exports system;
    exports controller;
    exports dto;
}