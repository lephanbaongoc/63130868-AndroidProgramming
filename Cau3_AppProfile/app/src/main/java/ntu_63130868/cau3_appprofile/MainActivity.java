package ntu_63130868.cau3_appprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        ArrayAdapter<String> adapterTT;
        adapterTT = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,dsKynang);

        ListView lvKyNang = findViewById(R.id.lvDanhSachKyNang);
        lvKyNang.setAdapter(adapterTT);
        lvKyNang.setOnItemClickListener(BoLangNgheVaXL);
    }

    AdapterView.OnItemClickListener BoLangNgheVaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //Hiện lên màn hình thông báo nhanh về giá trị của phần tử vừa chọn
            String StrTenKyNangChon = dsKynang.get(i);
            Toast.makeText(MainActivity.this,"Bạn vừa chọn "+StrTenKyNangChon,Toast.LENGTH_LONG).show();
        }
    };
}