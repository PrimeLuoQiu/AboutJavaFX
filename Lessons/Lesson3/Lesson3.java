package Lessons;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Lesson3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/aboutfxml/sample.fxml"));
        primaryStage.setTitle("About");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
