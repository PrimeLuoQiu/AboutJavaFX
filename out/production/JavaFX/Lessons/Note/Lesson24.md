Use JavaFX KeyEvent

这段代码是一个简单的 JavaFX 应用程序，它加载了一个FXML文件作为界面，并在按键事件（键盘事件）发生时调用控制器类中的方法来响应这些事件。让我们逐步解释这段代码的每个部分：

### 1. 导入语句
```java
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
```
- 这些是标准的 JavaFX 和 Java 导入语句，用于处理 JavaFX 应用程序、FXML加载、场景管理、事件处理以及舞台操作等。

### 2. `Main` 类定义
```java
public class Main extends Application {
```
- `Main` 类继承自 `Application` 类，这是 JavaFX 应用程序的入口点。

### 3. `main` 方法
```java
public static void main(String[] args) {
    launch(args);
}
```
- `main` 方法是应用程序的入口方法，其中调用 `launch(args)` 启动 JavaFX 应用程序。

### 4. `start` 方法
```java
public void start(Stage primaryStage) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene.fxml"));
    Parent root = loader.load();

    Controller controller = loader.getController();
```
- `start` 方法是 JavaFX 应用程序的启动方法，它被继承自 `Application` 类。在这里：
  - 创建一个 `FXMLLoader` 对象 `loader`，用来加载 `Scene.fxml` 文件。
  - 使用 `loader.load()` 方法加载FXML文件，并将其作为根节点 `root` 的实例返回。
  - 通过 `loader.getController()` 获取加载的FXML文件所关联的控制器类实例 `controller`。

### 5. 键盘事件处理
```java
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
```
- 创建一个新的 `Scene` 对象 `scene`，并将加载的根节点 `root` 设置为场景的根节点。
- 通过 `scene.setOnKeyPressed(...)` 方法设置键盘事件监听器，该监听器使用匿名内部类实现 `EventHandler<KeyEvent>` 接口，并重写 `handle` 方法来处理键盘事件。
- 在 `handle` 方法中，使用 `switch` 语句根据不同的按键（如 UP、DOWN、LEFT、RIGHT）调用控制器类 `Controller` 中相应的方法，例如 `controller.moveUP()`。

### 6. 设置舞台并显示
```java
primaryStage.setScene(scene);
primaryStage.show();
```
- 将设置好的 `scene` 场景对象设置为主舞台 `primaryStage` 的场景。
- 调用 `primaryStage.show()` 方法显示主舞台。

### 总结
这段代码展示了一个简单的JavaFX应用程序，它加载了一个FXML文件作为界面，然后根据用户的键盘输入来调用控制器类中的相应方法。通过这种方式，你可以实现基本的交互功能，例如在按键事件发生时更新界面或执行其他操作。