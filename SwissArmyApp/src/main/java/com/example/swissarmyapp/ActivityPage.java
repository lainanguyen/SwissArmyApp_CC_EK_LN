package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
public class ActivityPage {
    @FXML
    public void theNextButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("activitypage.fxml")); //change to file name connecting to
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790); //size of the window
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Activities");
        stage.setScene(scene);
        stage.show();
    }

}

