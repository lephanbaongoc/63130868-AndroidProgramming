package ntu_63130868.cau2_appgiaipt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

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
        TextView tvSOC = findViewById(R.id.textView3);

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
            if (SOA == 0) {
                if (SOB == 0) {
                    edtKQ.setText("PT vô số nghiệm");
                }
                else {
                edtKQ.setText("PT vô nghiệm.");
                }
            }
            else {
                double x = -SOB / SOA;
                edtKQ.setText("x = " + x);
            }
        }

        if(rbtnBac2.isChecked() == true){
            double delta = SOB*SOB - 4*SOA*SOC;
            double x1;
            double x2;
            // tính nghiệm
            if (delta > 0) {
                x1 = ((-SOB + Math.sqrt(delta)) / (2*SOA));
                x2 = ((-SOB - Math.sqrt(delta)) / (2*SOA));
                edtKQ.setText("PT có 2 nghiệm "+ "x1=" + x1 + "; x2=" + x2);
            }
            else if (delta == 0) {
                x1 = (-SOB / (2 * SOA));
                edtKQ.setText("PT có nghiệm kép: " + "x1 = x2 = " + x1);
            }
            else {
                System.out.println("PT vô nghiệm");
            }
        }
    }
}