package com.example.swissarmyapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Madlibs {
    @FXML
    private TextField story1Noun;
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
        story1.setText("I shall be telling this with a " + story1Noun +
                "\nSomewhere " + story1MU + " and " + story1MU + " hence: \n" +
                "Two roads diverged in a " + story1Place + ", and I - \n" +
                "I took the one less " + story1PTV + " by,\n" +
                "And that has made " + story1Adverb + " the difference.");
    }
    @FXML
    protected void generateStory2() {
    }
    @FXML
    protected void backToActivities() {
    }
}
