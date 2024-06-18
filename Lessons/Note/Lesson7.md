Communication Between Controllers

如何在Javafx中的控制器之间发送数据

在第一个页面当中写入的username会传入到第二个场景当中的Hello后面



进入第二个页面

~~~ java
@FXML //通过添加这个来注入fxml文档
Label nameLabel;

public void displayName(String username) {
    nameLabel.setText("Hello:" + username);
}
~~~

重点在于下面几行，也就是位于Scene1Controller中的一些操作

~~~ java
public void login(ActionEvent event) throws IOException{
    String username = nameTextField.getText();
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
    root = loader.load();
    
    Scene2Controller scene2Controller = loader.getController();
    scene2Controller.displayName(username);
    
    ...
}
~~~

那句root = loader.load是指

在这段代码中，`root = loader.load()` 这句话的作用是将 `Scene2.fxml` 文件加载成一个 `Parent` 对象，并将其赋给 `root` 变量。让我们逐步解释这段代码以及为什么不能删除这句话：

1. **FXMLLoader 的创建和资源加载**：
   ```java
   FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
   ```
   这行代码创建了一个 `FXMLLoader` 对象，并通过 `getClass().getResource("Scene2.fxml")` 方法加载名为 `Scene2.fxml` 的FXML文件。这个文件通常包含了界面的布局和控件信息。

2. **加载FXML文件**：
   ```java
   root = loader.load();
   ```
   这行代码实际上将 `Scene2.fxml` 文件加载成一个 `Parent` 类型的对象，并将其赋给了 `root` 变量。在这个过程中，FXMLLoader会将FXML文件解析成Java对象的层次结构，其中根元素通常是 `AnchorPane`、`Pane` 或者其他布局容器类的实例。

3. **获取Controller并调用方法**：
   ```java
   Scene2Controller scene2Controller = loader.getController();
   scene2Controller.displayName(username);
   ```
   通过 `loader.getController()` 方法获取到了 `Scene2.fxml` 中定义的 `Scene2Controller` 对象，并调用其 `displayName` 方法，将 `username` 传递给该方法。这个步骤通常用于在不同界面之间传递数据或进行界面的初始化工作。

4. **获取当前窗口的Stage和设置新的Scene**：
   ```java
   stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
   scene = new Scene(root);
   stage.setScene(scene);
   stage.show();
   ```
   这部分代码用于获取当前事件源所属的窗口（`Stage`），并创建一个新的 `Scene` 对象，并将刚才加载的 `root` 设置为新 `Scene` 的根节点。最后，通过 `stage.setScene(scene)` 和 `stage.show()` 将新的 `Scene` 显示在舞台上。

### 为什么不能删除 `root = loader.load()` 这句话？

在JavaFX中，通过 `FXMLLoader` 加载FXML文件是将界面的布局结构和控制器关联起来的重要步骤。删除 `root = loader.load()` 将导致以下问题：

- **NullPointerException**：如果删除了这句代码，那么 `root` 变量将保持为 `null`，后续对 `root` 的任何操作都会触发空指针异常。
  
- **无法获取FXML文件中的控件和控制器**：加载FXML文件后，通过 `loader.getController()` 才能获取到FXML文件中定义的控制器对象，从而在需要时调用其方法或者传递数据。

因此，`root = loader.load()` 这句代码的作用是确保FXML文件正确加载，并将其表示的用户界面作为 `root` 对象保存，以便后续操作。
