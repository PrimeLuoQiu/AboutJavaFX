有关CSS的内容



需要在Main中添加

`scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());`



在Scene Builder中进行创建

创建结束之后进入文件夹当中新建css文件即可

然后对应着文件夹中的css进行样式的修改，但是修改的前提是

在Fx的css修改上

~~~ css
.root{
    -fx-background-color: "black";

}

.label { /*整个项目类别*/
    -fx-font-size: 20pt;
    -fx-font-family: "Lucida Console";
    -fx-text-fill: white;
    -fx-alignment: center;
}

#titleLabel { /*通过id*来定位特定项目*/
    -fx-font-size: 40pt;
}
~~~

每行需要添加`-fx-`来作为前缀，这样即可进行css的修改，详情见Lesson5