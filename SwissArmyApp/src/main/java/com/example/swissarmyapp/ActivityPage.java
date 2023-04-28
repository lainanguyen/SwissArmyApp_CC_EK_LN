package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
public class ActivityPage {
    @FXML
    private Label nameLabel;
    public static String userName;

    public void setUserName(String name) {
        ActivityPage.userName = name;
        nameLabel.setText("Hi, " + ActivityPage.userName);
    }
    @FXML
    public void loveButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("lovecalculator.fxml")); //change to file name connecting to
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790); //size of the window
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Love Calculator");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void tipButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("tipcalc.fxml")); //change to file name connecting to
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790); //size of the window
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Tip Calculator");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void madButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("madlibs.fxml")); //change to file name connecting to
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790); //size of the window
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Mad Libs");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void verseButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("verseoftheday.fxml")); //change to file name connecting to
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790); //size of the window
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Verse of the Day");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void setButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("setting1.fxml")); //change to file name connecting to
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790); //size of the window
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Settings");
        stage.setScene(scene);
        stage.show();

    }


    public void onBack() {
        setUserName(userName);
    }
}

