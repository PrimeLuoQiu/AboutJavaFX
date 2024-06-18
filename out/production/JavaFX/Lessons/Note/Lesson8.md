关于登出和退出的按钮

正常创建一个AnchorPane并命名为scenePane，然后创建一个Button id为logoutButton来进行退出。



首先我们要将FXML注入到Controller类中，所以需要在顶部添加注释

~~~ java
@FXML
private Button logoutButton;
private AnchorPane scenePane;

Stage stage;
~~~

接下来是写注销的方法,获取当前的stage以便关闭它

~~~ java
public void logout(ActionEvent event) {
    stage = (Stage) scenePane.getScene().getWindow(); //这样之后我们正在使用的就是当前你阶段了。
    System.out.println(""); //尝试输出试试
	stage.close();
}
~~~

如果在关闭之前还需要一些操作的话，例如弹出一个提示框，那么

~~~ java
Alert alert = new Alert(AlterType.CONFIRMATION);
alert.setTitle("Logout");
alert.setHeaderText("You're about to logout");
alert.setContentText("Do you want to save before exit?");
~~~

然后将剩下的操作存放在if语句当中，最后看下来就是这样的

~~~ java
    public void logout(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout");
        alert.setContentText("Do you want to save before exiting?");

        if(alert.showAndWait().get() == ButtonType.OK) {

            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("You successfully logged out");
            stage.close();
        }
    }
~~~

那么除了点击关闭之外，我们还有可以在最外面的左上角的红×那里进行关闭，那么如何能够让我们点击红×关闭的时候也可以弹出来这么一个提示框呢？

进入Main.java

~~~ java
public void logout(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout");
        alert.setContentText("Do you want to save before exiting?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("You successfully logged out");
            stage.close();
        }
    }
}
~~~

去掉了stage是因为不需要再实例化一个阶段，上面已经有了，然后就是把ActionEvent修改成Stage stage 是因为目前函数内是无法识别的

接下来，在start函数当中添加

~~~ java
primaryStage.setOnCloseRequest(event -> { //可以在实际关闭之前创建事件和方法。
            event.consume(); //如果我们消耗掉这个事件的话，那么页面就不会关闭，可以阻止程序在点X时关闭，除非确认他
            logout(primaryStage);
        });
~~~

