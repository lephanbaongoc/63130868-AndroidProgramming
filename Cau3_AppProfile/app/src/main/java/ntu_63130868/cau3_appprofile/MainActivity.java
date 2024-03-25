package ntu_63130868.cau3_appprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> dsKynang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dsKynang = new ArrayList<String>();

        dsKynang.add("Lập trình C/C++");
        dsKynang.add("Lập trình C#");
        dsKynang.add("Lập trình Java");
        dsKynang.add("Lập trình Python");
        dsKynang.add("Thông thạo bộ công cụ office");
        dsKynang.add("Kỹ năng mềm tốt");
        dsKynang.add("Kỹ năng làm việc nhóm");
        dsKynang.add("Kỹ năng quản lý thời gian");

}