package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


public class Madlibs {
    @FXML
    private TextField story1Noun;
//    @FXML
//    private Text story1Noun;
//    String noun = story1Noun.getText();

    @FXML
    private TextField story1MU;
    @FXML
    private TextField story1Place;
    @FXML
    private TextField story1PTV;
    @FXML
    private TextField story1Adverb;
    @FXML
    private Label story1;

    @FXML
    protected void generateStory1() {
        String noun = story1Noun.getText();
        story1.setText("I shall be telling this with a " + noun +
                "\nSomewhere " + story1MU + " and " + story1MU + " hence: \n" +
                "Two roads diverged in a " + story1Place + ", and I - \n" +
                "I took the one less " + story1PTV + " by,\n" +
                "And that has made " + story1Adverb + " the difference.");
    }
    @FXML
    protected void generateStory2() {
    }

    @FXML
    public void backToActivities(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LandingPage.class.getResource("landingpage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("LandingPage");
        stage.setScene(scene);
        stage.show();
    }
}
