package Lessons.Lesson13;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller {
    @FXML
    private Label myLabel;
    @FXML
    private DatePicker myDatePicker;

    public void getDate() {
        LocalDate myDate = myDatePicker.getValue();
        String myFormatedDate = myDate.format(DateTimeFormatter.ofPattern("MMM/dd/yyyy"));

        myLabel.setText("The Date your choice is " + myFormatedDate);
        // System.out.println(myDate);
    }
}
