package Lessons.Lesson25;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene.fxml"));
        Parent root = loader.load();

        Controller controller = loader.getController();

        //检测关键方法
        Scene scene = new Scene(root);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

                switch (event.getCode()) {
                    case UP:
                        controller.moveUP();
                        break;
                    case DOWN:
                        controller.moveDown();
                        break;
                        case LEFT:
                            controller.moveLeft();
                            break;
                            case RIGHT:
                                controller.moveRight();
                                break;
                    default:
                        System.out.print("You pressed" + event.getCode());
                }

            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
