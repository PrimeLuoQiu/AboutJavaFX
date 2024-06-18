本次内容是有关做一个小球然后有四个up down left和right的四个按键。



对于每个事件，我们都有一个相应的方法，但是可以将所有的事件方法保留在一个地方，所以创建一个单独的Java文件包含这些



如果将根节点设置成fxml的话，它就会控制我们所有的事件，

![image-20240617163736769](C:\Users\LuoQiu\AppData\Roaming\Typora\typora-user-images\image-20240617163736769.png)

添加这些，然后就在controller中为每个按钮来创建一个方法

~~~java
package Lessons;

import javafx.event.ActionEvent;

public class l4Controller {
    public void up(ActionEvent e) {
        System.out.println("UP");
    }
    public void down(ActionEvent e) {
        System.out.println("DOWN");
    }
    public void left(ActionEvent e) {
        System.out.println("LEFT");
    }
    public void right(ActionEvent e) {
        System.out.println("RIGHT");
    }
}

~~~

添加并创建好之后，我们可以将相应的按钮关联起来

关联方法就是打开Scene Builder 然后点击左边的Controller 然后选中文件内的Controller文件，然后在右侧选中code，在fxid上添加自己创建的变量。创建之后就进行了对应的绑定。



接下来就是创建一个圆圈，一样的道理进行绑定，在Controller中修改对应的函数来让它进行位移。



接下来就是对应的Controller的Code

~~~ java
~~~

更多可以参见该项目