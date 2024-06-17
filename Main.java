import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Simple Calculator"); //title
        Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("./src/calculator.fxml")));
        Scene scene = new Scene((Parent) root); //里面是一个contenter 可以吧xml转换
        primaryStage.setScene(scene); //场景
        primaryStage.show(); //会显示出来
    }
}
