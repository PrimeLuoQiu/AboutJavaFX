JavaFXSlider

目的在于进行随时滑动随时得到对应值的内容

前面内容大致一样，重点在于

~~~ java
public class Controller implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private Slider mySlider;

    int myTemperature;


   @Override
	public void initialize(URL location, ResourceBundle resources) {
    myTemperature = (int) mySlider.getValue(); // 获取Slider的当前值作为初始温度
    myLabel.setText("Temperature: " + Integer.toString(myTemperature) + "°C"); // 设置初始温度的文本显示

    // 为Slider添加值变化的监听器
    mySlider.valueProperty().addListener(new ChangeListener<Number>() {
        @Override
        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
            // 当Slider的值变化时，更新温度值和标签显示
            myTemperature = (int) mySlider.getValue();
            myLabel.setText("Temperature: " + Integer.toString(myTemperature) + "°C");
        }
    });
}

}
~~~



在这段代码中，添加值变化的监听器（`ChangeListener`）是为了实现以下几个重要的功能和目的：

1. **实时更新界面显示**：
   - 当用户拖动或点击`Slider`时，其值会发生变化。为了反映这些变化并及时更新UI，需要监听`Slider`的值变化事件。
   - 使用监听器可以在`Slider`的值发生变化时立即捕获到新的值，并据此更新相关的UI组件，如`Label`上显示的温度值。

2. **保持数据和UI的同步**：
   - `myTemperature`变量用于保存当前的温度值，而`myLabel`用于显示该温度值的文本。
   - 通过监听`Slider`的值变化，可以确保`myTemperature`始终与`mySlider`的当前值保持同步，这样可以避免数据和UI显示之间的不一致。

3. **响应用户交互**：
   - 监听器使得应用程序能够实时响应用户的交互动作。当用户调节`Slider`时，即使没有手动点击确认按钮或其他触发动作，界面也能立即更新，提升了用户体验和互动性。

4. **事件驱动的编程模型**：
   - JavaFX采用事件驱动的编程模型，监听器正是其核心机制之一。通过注册监听器，可以轻松地响应各种用户操作和界面事件，而不需要显式的轮询或其他复杂的手动更新方式。

综上所述，添加值变化的监听器是为了在用户操作`Slider`时能够实时更新相关的UI显示，并确保数据和界面的一致性，同时也是符合JavaFX应用程序开发的事件驱动编程模型的良好实践。