package com.example.tictactoe.controllers;

import com.example.tictactoe.SwitchScenesController;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class mainSceneController implements Initializable {

    @FXML private Button twoPlayersButton;
    @FXML private Button multiplayerButton;
    @FXML private Button settingsButton;
    @FXML private Button escapeButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}


    public void twoPlayersButtonONAction(ActionEvent event){
        SwitchScenesController scene = new SwitchScenesController();
        scene.switchTo2PlayersScene(event);
    }


    public void multiplayerButtonONAction(ActionEvent event){
        //nothing yet!
    }


    public void settingsButtonONAction(ActionEvent event){
        SwitchScenesController scene = new SwitchScenesController();
        scene.switchToSettingsScene(event);
    }


    public void escapeButtonONAction(ActionEvent event){
        Stage stage = (Stage) escapeButton.getScene().getWindow();
        stage.close();
        Platform.exit();
    }

}
