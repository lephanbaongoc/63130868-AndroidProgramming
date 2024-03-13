package till.edu.ex_6_listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hiển thị dữ liệu lên list view
        //B1: cần có dữ liệu
        ArrayList<String> dsTinhThanh;
        dsTinhThanh = new ArrayList<String>();

        dsTinhThanh.add("Hà Nội");
        dsTinhThanh.add("Thành phố HCM");
        dsTinhThanh.add("Hội An");
        dsTinhThanh.add("Vũng Tàu");
        dsTinhThanh.add("Tuy Hòa");
        dsTinhThanh.add("Phú Yên");
        dsTinhThanh.add("Phú Thọ");
        dsTinhThanh.add("Diên Khánh");
        dsTinhThanh.add("Lâm Đồng");
        dsTinhThanh.add("Đồng Nai");
        dsTinhThanh.add("Bến Tre");
        dsTinhThanh.add("Dắk Lắk");
        dsTinhThanh.add("Hà Tĩnh");
        dsTinhThanh.add("An Giang");

        //B2: tạo adapter
        ArrayAdapter<String> adapterTT;
        adapterTT = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,dsTinhThanh);

        //B3: gắn vào list view
            //B3.1: tìm view
        ListView lvTenTT = findViewById(R.id.lvDanhSachTT);
            //B3.2: Gắn
        lvTenTT.setAdapter(adapterTT);
    }
}