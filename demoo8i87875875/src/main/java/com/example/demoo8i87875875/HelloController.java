package com.example.demoo8i87875875;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import java.util.Random;

public class HelloController {
    @FXML
    private Label welcomeText;
    private int chosenOne = 0;

    public int getChosenOne() {
        return chosenOne;
    }

    public void setChosenOne(int chosenOne) {
        this.chosenOne = chosenOne;
    }

    @FXML

    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    void changeText(MouseEvent event) {
    }
    @FXML
    void nameChange(MouseEvent event) {
        welcomeText.setText("Wybrano: kamień");
        setChosenOne(1);
    }
    @FXML
    void nameChangen(MouseEvent event) {
        welcomeText.setText("Wybrano: nożyce");
        setChosenOne(2);
    }
    @FXML
    void nameChangep(MouseEvent event) {
        welcomeText.setText("Wybrano: papier");
        setChosenOne(3);
    }
    @FXML
    void exit(MouseEvent event) {
        Platform.exit();
    }
    @FXML
    void startGame(MouseEvent event) {
         Random random = new Random();
         int computerChoice = random.nextInt(3)+1;
         if(getChosenOne()!=0){
            switch (getChosenOne()){
                case  1:
                    if(1 == computerChoice){
                        welcomeText.setText("Wynik remis");
                    }
                    if(2 == computerChoice){
                        welcomeText.setText("Wynik przegrana");
                    }
                    if(3 == computerChoice){
                        welcomeText.setText("Wynik wygrana");
                    }
                case  2:
                    if(1 == computerChoice){
                        welcomeText.setText("Wynik wygrana");
                    }
                    if(2 == computerChoice){
                        welcomeText.setText("Wynik remis");
                    }
                    if(3 == computerChoice){
                        welcomeText.setText("Wynik przegrana");
                    }
                case  3:
                    if(1 == computerChoice){
                        welcomeText.setText("Wynik wygrana");
                    }
                    if(2 == computerChoice){
                        welcomeText.setText("Wynik przegrana");
                    }
                    if(3 == computerChoice){
                        welcomeText.setText("Wynik remis");
                    }
            }
        }
         else{
             welcomeText.setText("Wynik wybierz coś");
         }

        setChosenOne(3);
    }
}

