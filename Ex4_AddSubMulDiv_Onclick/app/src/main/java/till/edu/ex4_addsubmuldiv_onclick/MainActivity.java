package till.edu.ex4_addsubmuldiv_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void XuLyCong(View view){
        //tìm tham chiếu
        EditText edtSO1 = findViewById(R.id.edtSO1);
        EditText edtSO2 = findViewById(R.id.edtSO2);
        EditText edtKQ = findViewById(R.id.edtKQ);
        //lấy dữ liệu về
        String strSO1 = edtSO1.getText().toString();
        String strSO2 = edtSO2.getText().toString();
        //chuyển kiểu dữ liệu
        Integer SO1 =Integer.parseInt(strSO1);
        Integer SO2 =Integer.parseInt(strSO2);
        //tính toán
        Integer Tong = SO1 + SO2;
        String strTong = String.valueOf(Tong);
        //In ra
        edtKQ.setText(strTong);
    }
    public void XuLyTru(View view){
        //tìm tham chiếu
        EditText edtSO1 = findViewById(R.id.edtSO1);
        EditText edtSO2 = findViewById(R.id.edtSO2);
        EditText edtKQ = findViewById(R.id.edtKQ);
        //lấy dữ liệu về
        String strSO1 = edtSO1.getText().toString();
        String strSO2 = edtSO2.getText().toString();
        //chuyển kiểu dữ liệu
        double SO1 =Integer.parseInt(strSO1);
        double SO2 =Integer.parseInt(strSO2);
        //tính toán
        double Hieu = SO1 - SO2;
        String strHieu = String.valueOf(Hieu);
        //In ra
        edtKQ.setText(strHieu);
    }
    public void XuLyNhan(View view){
        //tìm tham chiếu
        EditText edtSO1 = findViewById(R.id.edtSO1);
        EditText edtSO2 = findViewById(R.id.edtSO2);
        EditText edtKQ = findViewById(R.id.edtKQ);
        //lấy dữ liệu về
        String strSO1 = edtSO1.getText().toString();
        String strSO2 = edtSO2.getText().toString();
        //chuyển kiểu dữ liệu
        double SO1 =Integer.parseInt(strSO1);
        double SO2 =Integer.parseInt(strSO2);
        //tính toán
        double Tich = SO1 * SO2;
        String strTich = String.valueOf(Tich);
        //In ra
        edtKQ.setText(strTich);
    }
    public void XuLyChia(View view){
        //tìm tham chiếu
        EditText edtSO1 = findViewById(R.id.edtSO1);
        EditText edtSO2 = findViewById(R.id.edtSO2);
        EditText edtKQ = findViewById(R.id.edtKQ);
        //lấy dữ liệu về
        String strSO1 = edtSO1.getText().toString();
        String strSO2 = edtSO2.getText().toString();
        //chuyển kiểu dữ liệu
        double SO1 =Integer.parseInt(strSO1);
        double SO2 =Integer.parseInt(strSO2);
        //tính toán
        double Thuong = SO1 / SO2;
        String strThuong = String.valueOf(Thuong);
        //In ra
        edtKQ.setText(strThuong);
    }
}
