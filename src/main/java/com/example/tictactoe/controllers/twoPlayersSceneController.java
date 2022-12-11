package com.example.tictactoe.controllers;

import com.example.tictactoe.SwitchScenesController;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

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
    @FXML
    private Pane resultPane;
    @FXML
    private Label resultLabel;
    @FXML
    private Button escapeButton;
    @FXML
    private Button playAgainButton;


    // for storing status of all Panes in grid
    ArrayList<Pane> grid = new ArrayList<Pane>();

    // for imitating the checks panes
    int intGrid[] = {0,0,0,0,0,0,0,0,0};

    // count of all steps(moves)
    private int counter = 1;


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
            checkGrid(firstPane,0);

        }else if(event.getSource().equals(secondPane)){
            checkGrid(secondPane,1);

        }else if(event.getSource().equals(thirdPane)){
            checkGrid(thirdPane,2);

        }else if(event.getSource().equals(fourthPane)){
            checkGrid(fourthPane,3);

        }else if(event.getSource().equals(fifthPane)){
            checkGrid(fifthPane,4);

        }else if(event.getSource().equals(sixthPane)){
            checkGrid(sixthPane,5);

        }else if(event.getSource().equals(seventhPane)){
            checkGrid(seventhPane,6);

        }else if(event.getSource().equals(eighthPane)){
            checkGrid(eighthPane,7);

        }else if(event.getSource().equals(ninthPane)){
            checkGrid(ninthPane,8);

        }

    }

    private void checkGrid(Pane pane, int Index){
        if(grid.remove(pane)==true){
            System.out.println(true);
            setPaneIntegers(Index);
            setPaneImage(pane);

        }else{
            System.out.println(false);
        }
    }

    private void setPaneImage(Pane pane){

        ImageView imageView = new ImageView();
        Image image;

        if(this.counter%2==0){
            // circle sign
            image = new Image("C:\\my\\JProject\\src\\main\\resources\\com\\example\\tictactoe\\assets\\image\\circle.png");
            checkForCircle();
        }else{
            // cross sign
            image = new Image("C:\\my\\JProject\\src\\main\\resources\\com\\example\\tictactoe\\assets\\image\\cross.png");
            checkForCross();
        }


        imageView.setImage(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        pane.getChildren().add(imageView);


        this.counter++;

        if(this.counter==10){
            resultLoading("There is no winner");
        }

    }

    private void setPaneIntegers(int Index){
        if(intGrid[Index]==0){

            if(this.counter%2==0){
                // circle sign (-1)

                intGrid[Index]=-1;

            }else{
                // cross sign (1)

                intGrid[Index]=1;

            }
        }
    }

    private void checkForCross(){
        if(this.counter>=5){

            if(intGrid[0]==1 && intGrid[1]==1 && intGrid[2]==1){
                resultLoading("1 Player Wins");

            }else if(intGrid[3]==1 && intGrid[4]==1 && intGrid[5]==1){
                resultLoading("1 Player Wins");

            }else if(intGrid[6]==1 && intGrid[7]==1 && intGrid[8]==1){
                resultLoading("1 Player Wins");

            }else if(intGrid[0]==1 && intGrid[3]==1 && intGrid[6]==1){
                resultLoading("1 Player Wins");

            }else if(intGrid[1]==1 && intGrid[4]==1 && intGrid[7]==1){
                resultLoading("1 Player Wins");

            }else if(intGrid[2]==1 && intGrid[5]==1 && intGrid[8]==1){
                resultLoading("1 Player Wins");

            }else if(intGrid[0]==1 && intGrid[4]==1 && intGrid[8]==1){
                resultLoading("1 Player Wins");

            }else if(intGrid[2]==1 && intGrid[4]==1 && intGrid[6]==1){
                resultLoading("1 Player Wins");

            }
        }
    }

    private void checkForCircle(){
        if(this.counter>=6){

            if(intGrid[0]==-1 && intGrid[1]==-1 && intGrid[2]==-1){
                resultLoading("2 Player Wins");

            }else if(intGrid[3]==-1 && intGrid[4]==-1 && intGrid[5]==-1){
                resultLoading("2 Player Wins");

            }else if(intGrid[6]==-1 && intGrid[7]==-1 && intGrid[8]==-1){
                resultLoading("2 Player Wins");

            }else if(intGrid[0]==-1 && intGrid[3]==-1 && intGrid[6]==-1){
                resultLoading("2 Player Wins");

            }else if(intGrid[1]==-1 && intGrid[4]==-1 && intGrid[7]==-1){
                resultLoading("2 Player Wins");

            }else if(intGrid[2]==-1 && intGrid[5]==-1 && intGrid[8]==-1){
                resultLoading("2 Player Wins");

            }else if(intGrid[0]==-1 && intGrid[4]==-1 && intGrid[8]==-1){
                resultLoading("2 Player Wins");

            }else if(intGrid[2]==-1 && intGrid[4]==-1 && intGrid[6]==-1){
                resultLoading("2 Player Wins");

            }
        }
    }

    private void resultLoading(String message){
        resultLabel.setText(message);
        resultPane.setVisible(true);
    }
    @FXML
    private void escapeButtonOnAction(ActionEvent event){
        SwitchScenesController scene = new SwitchScenesController();
        scene.switchToMainScene(event);
    }
    @FXML
    private void playAgainButtonOnAction(ActionEvent event){
        SwitchScenesController scene = new SwitchScenesController();
        scene.switchTo2PlayersScene(event);
    }


}