package com.example.tictactoe.Controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import org.w3c.dom.events.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class twoPlayersSceneController implements Initializable {

    @FXML
    private Label errorLabel;
    @FXML
    private Pane firstPane;
    @FXML
    private Pane secondPane;
    @FXML
    private Pane thirdPane;
    @FXML
    private Pane fourthPane;
    @FXML
    private Pane fifthPane;
    @FXML
    private Pane sixthPane;
    @FXML
    private Pane seventhPane;
    @FXML
    private Pane eighthPane;
    @FXML
    private Pane ninthPane;

    // for storing status of all Panes in grid
    ArrayList<Pane> grid = new ArrayList<Pane>();

    // count of all steps(moves)
    private int counter = 0;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        puttingPanes();
    }


    private void puttingPanes() {
        grid.add(firstPane);
        grid.add(secondPane);
        grid.add(thirdPane);
        grid.add(fourthPane);
        grid.add(fifthPane);
        grid.add(sixthPane);
        grid.add(seventhPane);
        grid.add(eighthPane);
        grid.add(ninthPane);
    }

    public void paneOnClicked(Event event) {

        if(event.getSource().equals(firstPane)){
            checkGrid(firstPane);

        }else if(event.getSource().equals(secondPane)){
            checkGrid(secondPane);

        }else if(event.getSource().equals(thirdPane)){
            checkGrid(thirdPane);

        }else if(event.getSource().equals(fourthPane)){
            checkGrid(fourthPane);

        }else if(event.getSource().equals(fifthPane)){
            checkGrid(fifthPane);

        }else if(event.getSource().equals(sixthPane)){
            checkGrid(sixthPane);

        }else if(event.getSource().equals(seventhPane)){
            checkGrid(seventhPane);

        }else if(event.getSource().equals(eighthPane)){
            checkGrid(eighthPane);

        }else if(event.getSource().equals(ninthPane)){
            checkGrid(ninthPane);

        }

    }

    private void checkGrid(Pane pane){
        if(grid.remove(pane)==true){
            System.out.println(true);
            setPaneImage(pane);
        }else{
            System.out.println(false);
        }
    }

    private void setPaneImage(Pane pane){
        ImageView imageView = new ImageView();
        Image image = new Image("C:\\my\\JProject\\src\\main\\resources\\com\\example\\tictactoe\\assets\\image\\cross.png");
        imageView.setImage(image);

        pane.getChildren().add(imageView);
    }

}