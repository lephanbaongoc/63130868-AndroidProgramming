package till.edu.simplesumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Gắn view tương ứng với file này
        setContentView(R.layout.activity_main);
    }
    //Đây là bộ lắng nghe xử lý sự kiện click lên nút Tính Tổng
    public void XuLyCong(View view){
        //Tìm tham chiếu đến điều khiển trên XML
            EditText editTextSoA = findViewById(R.id.edtA);
            EditText editTextSoB = findViewById(R.id.edtB);
            EditText editTextKQ = findViewById(R.id.edtKQ);
        //Lấy dữ liệu về ở điều khiển số a
            String strA = editTextSoA.getText().toString();
        //Lấy dữ liệu về ở điều khiển số a
            String strB = editTextSoB.getText().toString();

        //Chuyển dữ liệu sang dạng số
            Integer SoA = Integer.parseInt(strA);
            Integer SoB = Integer.parseInt(strB);

        //Tính toán theo yêu cầu
            Integer tong = SoA + SoB;
            String strtong = String.valueOf(tong);

        //Hiện ra màn hình
            editTextKQ.setText(strtong);
    }
}