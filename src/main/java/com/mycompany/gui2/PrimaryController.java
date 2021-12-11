package com.mycompany.gui2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class PrimaryController {

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

    @FXML
    private void switchToSignUp() throws IOException{
        App.setRoot("signIn");
    }

    @FXML
    private void switchToCoachSignIn() throws IOException{
        App.setRoot("coachSign");
    }
}
