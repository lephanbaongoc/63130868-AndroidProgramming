package ntu_63130868.cau2_appgiaipt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TimX(View view){
        //tìm tham chiếu
        EditText edtSOA = findViewById(R.id.edtSoA);
        EditText edtSOB = findViewById(R.id.edtSoB);
        EditText edtSOC = findViewById(R.id.edtSoC);
        EditText edtKQ = findViewById(R.id.edtKQ);
        RadioButton rbtnBac1 = findViewById(R.id.rbtnB1);
        RadioButton rbtnBac2 = findViewById(R.id.rbtnB2);

        //lấy dữ liệu về
        String strSOA = edtSOA.getText().toString();
        String strSOB = edtSOB.getText().toString();
        String strSOC = edtSOC.getText().toString();

        //chuyển kiểu dữ liệu
        double SOA =Integer.parseInt(strSOA);
        double SOB =Integer.parseInt(strSOB);
        double SOC =Integer.parseInt(strSOC);

        //tính toán
        if(rbtnBac1.isChecked() == true){

        }
        if(rbtnBac2.isChecked() == true){

        }
    }
}