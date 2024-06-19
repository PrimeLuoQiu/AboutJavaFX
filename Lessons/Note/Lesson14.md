About ChangeColor

如果选择颜色的话，使用的话

~~~ java
    private Pane myPane;
    public void changeColor (ActionEvent event){
        Color myColor = myColorPicker.getValue(); //这里传入的是对应的颜色
        myPane.setBackground(new Background(new BackgroundFill(myColor, null, null))); //这里是对背景颜色进行设置。
    }
~~~

