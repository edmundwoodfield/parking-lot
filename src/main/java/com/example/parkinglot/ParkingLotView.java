package com.example.parkinglot;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//Builds a user interface window where they enter the entry/exit datetime and a button to calculate fee and a display of fee
//We expect the user input to be four strings of e.g. "28/09/2023" "09:56" "29/09/2023" "10:00"
//The button will be triggered here but the controller will pass it on to the Ticket to get duration and ParkingLot to get fee
//The result will be returned from the ParkingLot via the Controller and displayed in a label in this window
public class ParkingLotView {
    private Label startLabel;
    private Label userEntryLabel;
    private Label userExitLabel;
    private TextField entryDate;
    private TextField entryTime;
    private TextField exitDate;
    private TextField exitTime;
    public Button calculateButton;
    private Label feeLabel;

    public ParkingLotView(Stage stage) {
        startLabel = new Label("Please enter below the details of your stay in the parking lot so the fee can be calculated");
        userEntryLabel = new Label("Entry date and time:");
        userExitLabel = new Label("Exit date and time:");
        entryDate = new TextField();
        entryTime = new TextField();
        exitDate = new TextField();
        exitTime = new TextField();

        feeLabel = new Label("Your fee is: ");

        entryTime.setMaxSize(60, 20);
        entryTime.setPromptText("00:00");
        entryDate.setMaxSize(100, 20);
        entryDate.setPromptText("DD-MM-YYYY");
        exitTime.setMaxSize(60, 20);
        exitTime.setPromptText("00:00");
        exitDate.setMaxSize(100, 20);
        exitDate.setPromptText("DD-MM-YYYY");

        HBox entryHbox = new HBox(30, entryDate, entryTime);
        entryHbox.setAlignment(Pos.CENTER);
        HBox exitHBox = new HBox(30, exitDate, exitTime);
        exitHBox.setAlignment(Pos.CENTER);
        calculateButton = createCalculateButton();
        VBox vBox = new VBox(10, startLabel, userEntryLabel, entryHbox, userExitLabel, exitHBox, calculateButton, feeLabel);
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox, 300, 200);
        stage.setTitle("ParkingLot");
        stage.setScene(scene);
        stage.show();
    }

        public String getEntryTime(){
            return entryTime.getText();
        }

        public String getEntryDate(){
        return entryDate.getText();
        }

        public String getExitTime(){
        return exitTime.getText();
        }

        public String getExitDate() {
            return exitDate.getText();
        }

        public void setDisplayFee(String s){
        feeLabel.setText(s);
        }

        public Button createCalculateButton(){
        return new Button("Calculate");
        }
}
