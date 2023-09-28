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
//        FXMLLoader fxmlLoader = new FXMLLoader(ParkingLotApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}