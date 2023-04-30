package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleButton;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Settings implements Initializable {
    //change name
    @FXML
    private Label showName;

    @FXML
    private TextField changeName;

    //SETTING TO CHANGE NAME
    @FXML
    public void changeNameButton() {
        String name = changeName.getText();
        ActivityPage.userName = name;
        showName.setText("your name is set as: " + name);
    }
    @FXML
    CheckBox colorBox;

    @FXML
    CheckBox fontBox;

    String backgroundColor = HelloApplication.class.getResource("/whitemode.css").toExternalForm();
    String font = HelloApplication.class.getResource("/systemfont.css").toExternalForm();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colorBox.setSelected(SettingsSingleton.getColorChecked());
    }

    public void colorBoxFlipped() {
        //reverse the boolean variable
        SettingsSingleton.setColorChecked(!SettingsSingleton.getColorChecked());

    }

    @FXML
    public void changeColor(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("setting1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (colorBox.isSelected()) {
            //scene.getStylesheets().remove(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
            backgroundColor = HelloApplication.class.getResource("/redmode.css").toExternalForm();

            //scene.getStylesheets().addAll(backgroundColor, font);
        } else {
            // scene.getStylesheets().remove(HelloApplication.class.getResource("/redmode.css").toExternalForm());
            backgroundColor = HelloApplication.class.getResource("/whitemode.css").toExternalForm();
            // scene.getStylesheets().addAll(backgroundColor, font);
        }
        if (fontBox.isSelected()) {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
            //scene.getStylesheets().add(HelloApplication.class.getResource("/raleway.css").toExternalForm());
            font = HelloApplication.class.getResource("/raleway.css").toExternalForm();

//            scene.getStylesheets().addAll(backgroundColor, font);

        } else {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/raleway.css").toExternalForm());
            //scene.getStylesheets().add(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
            font = HelloApplication.class.getResource("/systemfont.css").toExternalForm();
//            scene.getStylesheets().addAll(backgroundColor, font);
        }
        scene.getStylesheets().addAll(backgroundColor, font);
        stage.setTitle("Settings");
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    public void changeFont(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("setting1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (fontBox.isSelected()) {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
            //scene.getStylesheets().add(HelloApplication.class.getResource("/raleway.css").toExternalForm());
            font = HelloApplication.class.getResource("/raleway.css").toExternalForm();

            scene.getStylesheets().addAll(backgroundColor, font);

        } else {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/raleway.css").toExternalForm());
            //scene.getStylesheets().add(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
            font = HelloApplication.class.getResource("/systemfont.css").toExternalForm();
            scene.getStylesheets().addAll(backgroundColor, font);
        }
        stage.setTitle("Settings");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void backToActivities (ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LandingPage.class.getResource("activitypage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        ActivityPage activityPage = fxmlLoader.getController();
        activityPage.onBack();

        if (colorBox.isSelected()) {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/redmode.css").toExternalForm());
        } else {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/redmode.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
        }
        if (fontBox.isSelected()) {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/raleway.css").toExternalForm());
        } else {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/raleway.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
        }
        //settingsChecker(scene);
        stage.setTitle("ActivityPage");
        stage.setScene(scene);
        stage.show();
    }



//    public void settingsChecker(Scene scene) {
//        if (redMode) {
//            scene.getStylesheets().remove(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
//            scene.getStylesheets().add(HelloApplication.class.getResource("/redmode.css").toExternalForm());
//        } else {
//            scene.getStylesheets().remove(HelloApplication.class.getResource("/redmode.css").toExternalForm());
//            scene.getStylesheets().add(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
//        }
//        if (fontType) {
//            scene.getStylesheets().remove(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
//            scene.getStylesheets().add(HelloApplication.class.getResource("/raleway.css").toExternalForm());
//        } else {
//            scene.getStylesheets().remove(HelloApplication.class.getResource("/raleway.css").toExternalForm());
//            scene.getStylesheets().add(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
//        }
//
//    }


//    @FXML
//    public void changeColor(ActionEvent event) throws IOException {
//        redMode = !redMode;
//        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("setting1.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        if (redMode) {
//            //scene.getStylesheets().add(HelloApplication.class.getResource("/redmode.css").toExternalForm());
//            scene.getStylesheets().add("/redmode.css");
//        } else {
//            //scene.getStylesheets().remove(HelloApplication.class.getResource("/redmode.css").toExternalForm());
//            //scene.getStylesheets().add(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
//            scene.getStylesheets().remove("/redmode.css");
//            scene.getStylesheets().add("/whitemode.css");
//        }
//        stage.setTitle("Settings");
//        stage.setScene(scene);
//        stage.show();
//    }

//    @FXML
//    public void backToActivities (ActionEvent event) throws IOException {
//        redMode = !redMode;
//        FXMLLoader fxmlLoader = new FXMLLoader(LandingPage.class.getResource("activitypage.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        if (redMode) {
//            //scene.getStylesheets().add(HelloApplication.class.getResource("/redmode.css").toExternalForm());
//            scene.getStylesheets().add("/redmode.css");
//        } else {
//            //scene.getStylesheets().remove(HelloApplication.class.getResource("/redmode.css").toExternalForm());
//            //scene.getStylesheets().add(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
//            scene.getStylesheets().remove("/redmode.css");
//        }
//            //settingsChecker(scene);
//            stage.setTitle("ActivityPage");
//            stage.setScene(scene);
//            stage.show();
//        }

}