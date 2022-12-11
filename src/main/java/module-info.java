module com.example.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.tictactoe to javafx.fxml;
    opens com.example.tictactoe.controllers to javafx.fxml;
    exports com.example.tictactoe.controllers;
    exports com.example.tictactoe;
}
