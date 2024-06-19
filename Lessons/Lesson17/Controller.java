package Lessons.Lesson17;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private Slider mySlider;

    int myTemperature;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // 在后台自动调用，并且可以执行在添加根元素之后找到的任何代码
        // 因为目前还没有将一个方法链接到Slider，因此需要手动向滑块添加一个更改侦听器

        myTemperature = (int) mySlider.getValue();
        myLabel.setText("Temperature: " + Integer.toString(myTemperature) + "°C");

        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                myTemperature = (int) mySlider.getValue();
                myLabel.setText("Temperature: " + Integer.toString(myTemperature) + "°C");
            }
        });
    }
}