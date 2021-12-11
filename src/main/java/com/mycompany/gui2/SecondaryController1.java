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
import javafx.scene.control.TextArea;
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
    private Button createAccountButton;
    @FXML
    private TextField gameName;
    @FXML
    private ImageView ramPNG;
    @FXML
    private TextField createEmailUserName;
    @FXML
    private TextArea scheduleInput;
    
   

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void writeToTxt(ActionEvent event) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(gameName.getText().toString()+ "\n");
        sb.append("Player: " + createFirstName.getText().toString()+ " " + 
                  createLastName.getText().toString()+ "\n");
        sb.append("Coach: " +createCoachName.getText().toString()+ "\n");
        sb.append(createEmailUserName.getText().toString()+ "\n");
        sb.append(scheduleInput.getText().toString()+ "\n");
        sb.append("Practices will be Monday, Wednesday, "
                + "and Thursday from 5-9pm,"
                + "\n" + "and Tuesdays and Fridays from 3-8pm. "
                +"\n"
                + "Contact your coach if you have trouble making these times" + "\n");
        sb.append("\n");
       
        
        File file =new File("./src/main/java/Data/login.txt");
        FileWriter W = new FileWriter(file,true);
        Scanner S = new Scanner(file);
        
        W.write(sb.toString());
        W.close();
        
        //Platform.exit();//closes window
    }


}
