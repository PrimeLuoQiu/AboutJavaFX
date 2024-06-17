package Lessons.Lesson5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lesson5 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Lessons/Lesson5/lesson5.fxml"));

        Scene scene = new Scene(root);
        String css = this.getClass().getResource("Lesson5.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }
}
