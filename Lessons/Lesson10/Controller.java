package Lessons.Lesson10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML
    private Button myButton;

    int age;
    public void submit(ActionEvent event) {

        try {
            age = Integer.parseInt(myTextField.getText());
            if(age >= 18) {
                myLabel.setText("You are regist successfully!~");
            } else {
                myLabel.setText("Make sure your age is >= 18");
            }
        } catch(NumberFormatException e) {
            myLabel.setText("Please enter a number");
        } catch(Exception e) {
            myLabel.setText("ERROR");
        }
    }
}
