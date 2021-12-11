package com.mycompany.gui2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/*
* The coachSignIn class is used to inlcude textfileds that consits of 
* sign up, the first and last name, username, password as well as the check boxes
* of different functions for the coaches to sign up.
* @version 12.4
* @since 2021
*/


public class coachSignIn {

    //Creating private textfields, buttons and checkboxes.
    @FXML
    private TextField signUpDayFieldCoach;
    @FXML
    private TextField createCoachFirstName;
    @FXML
    private TextField createCoachLastName;
    @FXML
    private TextField createCoachID;
    @FXML
    private TextField createCoachUserName;
    @FXML
    private TextField createCoachPassword;
    @FXML
    private TextField createCoachPassword2;
    @FXML
    private Button createCoachAccountButton;
    @FXML
    private CheckBox signUpCheck1C;
    @FXML
    private CheckBox signUpCheck2C;
    @FXML
    private CheckBox signUpCheck3C;
    @FXML
    private CheckBox signUpCheck4C;
    @FXML
    private CheckBox signUpCheck5C;
    @FXML
    private CheckBox signUpCheck6C;
    @FXML
    private CheckBox signUpCheck7C;
    @FXML
    private CheckBox signUpCheck8C;
    @FXML
    private CheckBox signUpCheck9C;
    @FXML
    private CheckBox signUpCheck10C;
    @FXML
    private CheckBox signUpCheck11C;
    @FXML
    private CheckBox signUpCheck12C;
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void writeToTxt(ActionEvent event) {
    }// writes the files to the textfile

    

}