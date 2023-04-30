package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.controlsfx.control.ListActionView;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ActivityPage {



    @FXML
    private Label nameLabel;
    @FXML
    public static String userName;
    @FXML
    Label theTime;
    @FXML //if left blank will display 'user'
    public void setUserName(String name) {
        if (!name.isEmpty()){
        ActivityPage.userName = name;
        nameLabel.setText(ActivityPage.userName);
        }else{
            ActivityPage.userName = "user";
            nameLabel.setText("user");
        }
        startTime();
    }
    @FXML
    public void startTime(){
        updateTime();
    }
    private void updateTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = now.format(format);
        theTime.setText(formattedTime);
    }

    @FXML
    public void loveButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("lovecalculator.fxml")); //change to file name connecting to
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790); //size of the window
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Love Calculator");
        scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());
        scene.getStylesheets().addAll(SettingsSingleton.getBackgroundColor(), SettingsSingleton.getFont());

        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void tipButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("tipcalc.fxml")); //change to file name connecting to
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790); //size of the window
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Tip Calculator");
        scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());
        scene.getStylesheets().addAll(SettingsSingleton.getBackgroundColor(), SettingsSingleton.getFont());

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void madButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("madlibs.fxml")); //change to file name connecting to
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790); //size of the window
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Mad Libs");
        scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());
        scene.getStylesheets().addAll(SettingsSingleton.getBackgroundColor(), SettingsSingleton.getFont());

        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void verseButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("verseoftheday.fxml")); //change to file name connecting to
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790); //size of the window
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Verse of the Day");
        scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());
        scene.getStylesheets().addAll(SettingsSingleton.getBackgroundColor(), SettingsSingleton.getFont());

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void setButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("setting1.fxml")); //change to file name connecting to
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790); //size of the window
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Settings");
        scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());
        scene.getStylesheets().addAll(SettingsSingleton.getBackgroundColor(), SettingsSingleton.getFont());

        stage.setScene(scene);
        stage.show();

    }


    public void onBack() {
        setUserName(userName);
    }


}

