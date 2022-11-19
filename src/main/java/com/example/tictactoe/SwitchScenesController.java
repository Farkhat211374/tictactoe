package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class SwitchScenesController {
    public static SwitchScenesController uniqueSceneController;
    public SwitchScenesController(){}
    public static SwitchScenesController getInstance(){
        if(uniqueSceneController==null){
            uniqueSceneController = new SwitchScenesController();
        }
        return uniqueSceneController;
    }
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchTo2PlayersScene(ActionEvent event){

        try{
            root = FXMLLoader.load(getClass().getResource("twoPlayersScene.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root, 500, 500);
            stage.setTitle("3Gis");
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();

        }
    }

    public void switchToSettingsScene(ActionEvent event){

        try{
            root = FXMLLoader.load(getClass().getResource("settingsScene.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root, 500, 500);
            stage.setTitle("3Gis");
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();

        }
    }



}
