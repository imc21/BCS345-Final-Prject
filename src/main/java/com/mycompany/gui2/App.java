package com.mycompany.gui2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/*
 * JavaFX creates an application thread for running the application start method, 
 * processing input events, and running animation timelines. 
 * Creation of JavaFX Scene and Stage objects as well as modification of scene graph operations to 
 * live objects (those objects already attached to a scene) must be done on the JavaFX application thread.
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 1000, 600);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    /*
    *The Java launcher loads and initializes the specified Application class on the JavaFX Application Thread. 
    *If there is no main method in the Application class, or if the main method calls Application.launch(),
    *then an instance of the Application is then constructed on the JavaFX Application Thread.
    */

    public static void main(String[] args) {
        launch();
    }

}