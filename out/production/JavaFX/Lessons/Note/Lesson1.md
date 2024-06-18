fx包含一个Stage，一个Scene 一个Scene-Graph 包含一个rootNode和下面的branchNode以及leaf Node

Stage就是window

Scene就是图形内容的绘图表面

Graph是一个节点的分层树，用于保存和排列节点，而节点是指添加到场景中的所有不同组件，可以是按钮，框，图像之类的

**我们至少需要一个根节点来创建一个场景**

然后像舞台增加一个场景

因为Application类是父类，而Main类是子类，所以需要继承并重写一个抽象方法，也就是添加一个未实现的方法即start

实际上也就是把start这个函数传入到args中

如果需要创建一个新的Stage，那么

~~~ java
Stage stage = new Stage();
~~~



那么既然知道了流程之后，整个创建的流程实际上就是

~~~ java
Group root = new Group();
Scene scene = new Scene(root); //传入

stage.setScene(sceme);
stage.show(); //保证start最后肯定是这个语句
~~~

如果要给Scene设置颜色的话，那么，只需要在root后加入

`(root, Color.BLACK)`

~~~java
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

~~~



