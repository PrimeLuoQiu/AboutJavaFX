package Lessons.Lesson11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private CheckBox myCheckBox;
    @FXML
    private Label myLabel;
    @FXML
    private ImageView myimageView;

    Image myImage1 = new Image(getClass().getResourceAsStream("lightbulb.png"));
    Image myImage2 = new Image(getClass().getResourceAsStream("NLT.jpg"));
    public void change(ActionEvent event) {
        if(myCheckBox.isSelected()) {
            myLabel.setText("ON");
            myimageView.setImage(myImage1);
        } else {
            myLabel.setText("OFF");
            myimageView.setImage(myImage2);
        }
    }
}
