package com.example.parkinglot;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
// The controller has a constructor which receives the ParkingLot and ParkingLotView and sets up handlers
public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}