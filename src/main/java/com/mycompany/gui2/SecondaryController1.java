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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class SecondaryController1 {

    @FXML
    private TextField createFirstName;
    @FXML
    private TextField createLastName;
    @FXML
    private TextField createCoachName;
    @FXML
    private TextField createUserName;
    @FXML
    private TextField createPassword;
    @FXML
    private TextField createPassword2;
    @FXML
    private Button createAccountButton;
    @FXML
    private CheckBox signUpCheck1;
    @FXML
    private CheckBox signUpCheck2;
    @FXML
    private CheckBox signUpCheck3;
    @FXML
    private CheckBox signUpCheck4;
    @FXML
    private CheckBox signUpCheck5;
    @FXML
    private CheckBox signUpCheck6;
    @FXML
    private CheckBox signUpCheck7;
    @FXML
    private CheckBox signUpCheck8;
    @FXML
    private CheckBox signUpCheck9;
    @FXML
    private CheckBox signUpCheck10;
    @FXML
    private CheckBox signUpCheck11;
    @FXML
    private CheckBox signUpCheck12;
    @FXML
    private TextField signUpDayFieldCoach;
    @FXML
    private Button signUpConfirmButton;
    @FXML
    private TextField gameName;
    @FXML
    private ImageView ramPNG;
    
    @FXML
    private TextField scheduleInput;
   

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void writeToTxt(ActionEvent event) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(createFirstName.getText().toString()+ " " 
                + createLastName.getText().toString() + "\n");
        
        
        File file =new File("./src/main/java/Data/login.txt");
        FileWriter W = new FileWriter(file,true);
        Scanner S = new Scanner(file);
        
        W.write(sb.toString());
        W.close();
        
        //Platform.exit();//closes window
    }
    
    private void writeSchedule(ActionEvent event) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(scheduleInput.getText().toString() + "\n");
        File userSchedules = new File("./src/main/java/Data/Schedules.txt");
        FileWriter w = new FileWriter(userSchedules, true);
        Scanner S = new Scanner(userSchedules);
        
        w.write(sb.toString());
        w.close();
        
        
       
    }


}
