### Switch Scene

还是像往常一样写好该有的东西

然后

~~~ java
Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
Scene scene = new Scene(root);
stage.setScene(scene);
stage.show();
~~~

接下来主要配置的是Controller的相关内容

~~~ java
public void switchtoScene2() {
    Parent root = FXMLLoader.load(getClass.getResource("Scene2.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
~~~

`stage = (Stage)((Node)event.getSource()).getScene().getWindow();`这段非常重要

第一步是获取此事件的源并将其转换为节点，第二步是使用后续的一些方法，最后我们需要采取所有这些并将其投射到一个Stage



后面就是常规的进入SceneBuilder然后配置对应的按钮和在Controller事件的点击相绑定了。