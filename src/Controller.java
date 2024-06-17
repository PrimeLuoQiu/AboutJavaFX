//package src;
//
//import javafx.event.Event;
//import javafx.event.EventTarget;
//import javafx.event.EventType;
//import javafx.fxml.FXML;
//
//import java.awt.*;
//
//public class Controller {
//    @FXML
//    private Label expression;
//
//    @FXML
//    private Label result;

//    @FXML
//    public void onClicked(Event event) {
//        EventTarget target = event.getTarget();
//        Button button = (Button) target; //转换类型
//        //String text = button.getText();
//        try {
//            int i = Integer.parseInt(text);
//            String resultVal = result.getText();
//            int newVal = Integer.parseInt(resultVal) * 10 + i;
//            result.setText(newVal + "");
//        } catch(Exception ex) {
//
//        }
//    }
//}
