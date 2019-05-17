package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class Controller {
    public TextField txtDay;
    public TextField txtMonth;
    public TextField txtYear;
    public TextArea txtKQ;

    public void submit() {
        int year=Integer.parseInt(txtYear.getText());
        int month=Integer.parseInt(txtMonth.getText());
        int day=Integer.parseInt(txtDay.getText());
        if (day <= 0 || day > 30 ){
            txtKQ.setText("Ngày chỉ từ 1-30");
        }else if(month <1 || month >12 ){
            txtKQ.setText("Tháng chỉ từ 1-12");
        }else {
            LocalDate ld = LocalDate.of(year, month, day);
            txtKQ.setText("Ngày trong tuần:"+ld.getDayOfWeek()+"\nNgày trong tháng:"+ld.getDayOfMonth()+"\nNgày trong năm:"+ld.getDayOfYear());
        }

    }
}
