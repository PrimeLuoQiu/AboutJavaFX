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

