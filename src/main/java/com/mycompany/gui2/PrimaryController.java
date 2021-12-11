package com.mycompany.gui2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

/*
* Primary Controller for the Login Page.
* This page allows the user to either sign in with username and password,
* or sign up as a coach or student. Includes functions to take the user to
* either the student sign up page or coach sign up page.
* @author Amoon, Caleb, Matt, Brett
* @version 12.4
* @since 2021
*/

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
    class datePickerThingy {
  public static void main(String[] args) {
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
   LocalDateTime now = LocalDateTime.now();
   System.out.println(dtf.format(now));
  }
}
/* 
* The PrimaryController class makes the buttons and 
* texfields for the javafx such as loginField, passwordField,
* primaryButton, signUpButton, and coachSignUp
*/


public class PrimaryController {
     //private buttons and fields
    @FXML
    private PasswordField loginField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button primaryButton;
    @FXML
    private Button signUpButton;
    @FXML
    private Button coachSignUp;
    
   

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
        
    }
    
    /*
    * @switchToSignUp takes the user to the student sign in page.
    */
    @FXML
    private void switchToSignUp() throws IOException{
        App.setRoot("signIn");
    }
    
    
    /*
    * @switchToCoachSignIn takes the user to the coach sign in page.
    */
    @FXML
    private void switchToCoachSignIn() throws IOException{
        App.setRoot("coachSign");
    }
}
