package Lessons;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Lesson1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        stage.setTitle("Stage Lesson 1");
        Image icon = new Image("Lessons/icon.jpg");
        stage.getIcons().add(icon);

        // Set size of the stage (About the Window)
        stage.setWidth(800);
        stage.setHeight(600);
        // Set the Border Can/n't 拖拽 size
        stage.setResizable(false);
        // set the position of the window
//        stage.setX(50);
//        stage.setY(50);
        // Set whether FullScreen ?
        stage.setFullScreen(true);
        // Set the Text on the FullScreen and press what to exit it.
        stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setScene(scene);
        stage.show();


    }
}
