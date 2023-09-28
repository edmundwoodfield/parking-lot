package com.example.parkinglot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
//
public class ParkingLotApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        ParkingLotView parkingLotView = new ParkingLotView(stage);
        IParkingLot parkingLot;
        ParkingLotFactory parkingLotFactory = new ParkingLotFactory();
        parkingLot = parkingLotFactory.createParkingLot(selectedParkingLot);
        Controller controller = new Controller(parkingLot,parkingLotView);

    }

    public static void main(String[] args) {
        launch();
    }
}