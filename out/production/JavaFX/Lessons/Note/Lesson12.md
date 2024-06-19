RadioButton

单选盒子，可以多选一，唯一要记住的就是在SceneBuilder中要为创建的这个选择写一个分类，代表这个类的东西，这样才可以做到，例如

Toggle Group选择成为food，最后这三个选择的Toggle Group都是这个分组



那么initialize是用来干嘛的呢，用于初始化控制器状态和初始化界面元素，以及绑定事件处理和准备数据。总之就是在运行之前先进行一波初始化。



而在这里，它是用来初始化ChoiceBox的选项，然后将food当中的所有内容添加到ChoiceBox中，当界面加载的时候，就会提供这些选项给用户选择

其二是设置ChoiceBox的事件处理器，当用户选择选项后，`getfood`会被调用，然后更新文本



使用的原因是该方法在文件加载并控制器初始化之后立即调用，率先初始化。而该逻辑放在该方法中可以使代码更加清晰和组织化。可以在一个地方管理和查看所有的初始化操作。还符合JFX程序的通用实现模式。



~~~ java
public class Controller implements Initializable {

    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] food = {"pizza", "sushe", "ramen"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myChoiceBox.getItems().addAll(food);
        myChoiceBox.setOnAction(this::getFood);
    }

    public void getFood(ActionEvent event) {
        String myFood = myChoiceBox.getValue();
        myLabel.setText(myFood);
    }
}
~~~

