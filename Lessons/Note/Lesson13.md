Date的方式

如果需要添加日历选项的话，可以添加日历相关的组件进行操作。

一样进行配置选择器之后

获取日期

`LocalData myDate = myDataPicker.getValue();`

如果要换输出格式的话

`String myFormatedDate = myDate.format(DateTimeFormatter.ofPattern("MMM/dd/yyyy"));`



剩下的和之前一样