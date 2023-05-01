package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
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

    @FXML
    CheckBox buttonBox;

    @FXML
    CheckBox weightBox;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colorBox.setSelected(SettingsSingleton.getColorChecked());
        fontBox.setSelected(SettingsSingleton.getFontChecked());
        buttonBox.setSelected(SettingsSingleton.getButtonChecked());
        weightBox.setSelected(SettingsSingleton.getWeightChecked());
    }

    public void colorBoxFlipped(ActionEvent event) throws IOException {
        //reverse the boolean variable
        SettingsSingleton.setColorChecked(!SettingsSingleton.getColorChecked());
        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("setting1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (SettingsSingleton.getColorChecked()) {
            //scene.getStylesheets().remove(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());
            SettingsSingleton.setBackgroundColor(HelloApplication.class.getResource("/redmode.css").toExternalForm());

            //scene.getStylesheets().addAll(backgroundColor, font);
        } else {
            // scene.getStylesheets().remove(HelloApplication.class.getResource("/redmode.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());
            SettingsSingleton.setBackgroundColor(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
            // scene.getStylesheets().addAll(backgroundColor, font);

        }

        scene.getStylesheets().addAll(SettingsSingleton.getBackgroundColor(), SettingsSingleton.getFont(), SettingsSingleton.getButton(), SettingsSingleton.getWeight());
        stage.setTitle("Settings");
        stage.setScene(scene);
        stage.show();

    }
    public void fontBoxFlipped(ActionEvent event) throws IOException {
        SettingsSingleton.setFontChecked(!SettingsSingleton.getFontChecked());
        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("setting1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (SettingsSingleton.getFontChecked()) {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
            //scene.getStylesheets().add(HelloApplication.class.getResource("/raleway.css").toExternalForm());
            SettingsSingleton.setFont(HelloApplication.class.getResource("/raleway.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());


        } else {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/raleway.css").toExternalForm());
            //scene.getStylesheets().add(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
            SettingsSingleton.setFont(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());

        }
        scene.getStylesheets().addAll(SettingsSingleton.getBackgroundColor(), SettingsSingleton.getFont(), SettingsSingleton.getButton(), SettingsSingleton.getWeight());

        stage.setTitle("Settings");
        stage.setScene(scene);
        stage.show();
    }

    public void buttonBoxFlipped(ActionEvent event) throws IOException {
        SettingsSingleton.setButtonChecked(!SettingsSingleton.getButtonChecked());

        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("setting1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (SettingsSingleton.getButtonChecked()) {
            SettingsSingleton.setButton(HelloApplication.class.getResource("/buttoncolor.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());

        } else {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/buttoncolor.css").toExternalForm());
            SettingsSingleton.setButton(HelloApplication.class.getResource("/land.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());

        }

        scene.getStylesheets().addAll(SettingsSingleton.getBackgroundColor(), SettingsSingleton.getFont(), SettingsSingleton.getButton(), SettingsSingleton.getWeight());
        stage.setTitle("Settings");
        stage.setScene(scene);
        stage.show();

    }
    public void weightBoxFlipped(ActionEvent event) throws IOException {
        //reverse the boolean variable
        SettingsSingleton.setWeightChecked(!SettingsSingleton.getWeightChecked());
        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("setting1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (SettingsSingleton.getWeightChecked()) {
           scene.getStylesheets().remove(HelloApplication.class.getResource("/radiusdefault.css").toExternalForm());
//            scene.getStylesheets().add(HelloApplication.class.getResource("/textweight.css").toExternalForm());
            SettingsSingleton.setWeight(HelloApplication.class.getResource("/textweight.css").toExternalForm());

            //scene.getStylesheets().addAll(backgroundColor, font);
        } else {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/textweight.css").toExternalForm());
//            scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());
            SettingsSingleton.setWeight(HelloApplication.class.getResource("/radiusdefault.css").toExternalForm());
            // scene.getStylesheets().addAll(backgroundColor, font);

        }

        scene.getStylesheets().addAll(SettingsSingleton.getBackgroundColor(), SettingsSingleton.getFont(), SettingsSingleton.getButton(),SettingsSingleton.getWeight());
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
        scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());
        scene.getStylesheets().addAll(SettingsSingleton.getBackgroundColor(), SettingsSingleton.getFont(), SettingsSingleton.getButton(), SettingsSingleton.getWeight());

        //settingsChecker(scene);
        stage.setTitle("ActivityPage");
        //
        stage.setScene(scene);
        stage.show();
    }


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