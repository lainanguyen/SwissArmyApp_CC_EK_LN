package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

// switches to madlibs scene to test if it's working
//    @FXML
//    public void onHelloButtonClick(ActionEvent event) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("madlibs.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
//        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        stage.setTitle("MadLibs");
//        stage.setScene(scene);
//        stage.show();
//    }
}