添加一个ImageView

类似相框的效果，可以通过按钮的点击或者SceneBuilder所附带的一些属性添加一些效果



例如在Controller.java中

重点在于，当需要更换图片时

`Image myImage = new Image(getClass().getResourceAsStream("pic2.jpg"));`



整体如下

```java
public class Controller {
    @FXML
    ImageView myImageView;
    @FXML
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("pic2.jpg"));

    public void displayImage() {
        myImageView.setImage(myImage);

    }
}
```