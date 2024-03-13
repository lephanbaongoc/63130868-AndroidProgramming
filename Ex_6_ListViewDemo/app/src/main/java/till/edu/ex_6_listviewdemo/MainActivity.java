package till.edu.ex_6_listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTinhThanh;//khai báo
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hiển thị dữ liệu lên list view
        //B1: cần có dữ liệu

        dsTinhThanh = new ArrayList<String>();//tạo thể hiện cụ thê, xin mới

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
            //B3.3: gắn bộ lắng nghe và sử lý sk user tương tác
        lvTenTT.setOnItemClickListener(BoLangNgheVaXL);
    }

    //Tạo bộ lắng nghe và xử lý sk OneTimeClick, đặt vào 1 biến
    AdapterView.OnItemClickListener BoLangNgheVaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //Hiện lên màn hình thông báo nhanh về vị trí của phần tử vừa chọn
            //Toast.makeText(MainActivity.this,"Bạn vừa chọn "+String.valueOf(i),Toast.LENGTH_LONG).show();

            //Hiện lên màn hình thông báo nhanh về giá trị của phần tử vừa chọn
            String StrTenTinhChon = dsTinhThanh.get(i);
            Toast.makeText(MainActivity.this,"Bạn vừa chọn "+StrTenTinhChon,Toast.LENGTH_LONG).show();
        }
    };

}