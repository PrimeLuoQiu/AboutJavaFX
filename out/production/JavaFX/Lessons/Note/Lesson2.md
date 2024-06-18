此外，我们主要是对root下面的其他节点进行配置和设置

在创建scene的时候，可以在后面跟随很多选项，例如

`Scene scene = new Scene(root, 600, 600, Color.SKYBULR)`

然后接下来是有关根节点下面的一些枝干节点和叶子节点的相关配置



要知道，文本是一种节点，因此我们需要将此节点加入到根节点当中，并且根节点也要添加到场景中

也就是

~~~ java
root.getChildren.add(text);
~~~

对于除了矩形之外的多边形，例如三角形，需要为每一个点添加一组坐标

~~~ java
package Lessons;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Lesson2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.SKYBLUE);

        Text text = new Text();
        text.setText("Hello World");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.LIGHTGREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5); //透明度
        line.setRotate(45); //旋转角度

       Rectangle rectangle = new Rectangle();
       rectangle.setX(100);
       rectangle.setY(100);
       rectangle.setWidth(100);
       rectangle.setHeight(100);
       rectangle.setFill(Color.BLUE);
       rectangle.setStrokeWidth(5);
       rectangle.setStroke(Color.RED);

       Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0, 200.0,
                300.0, 300.0,
                200.0, 300.0
                );
        triangle.setFill(Color.YELLOW);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(20);
        circle.setFill(Color.ORANGE);

        Image image = new Image("./icon.jpg");
        //添加图像使用这种方法，先创建一个image的对象，然后将对象放进ImageView当中
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);
        
        stage.setScene(scene);
        stage.show();
    }
}

~~~

