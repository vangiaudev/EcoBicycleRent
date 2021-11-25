package vangiau.example.ecobicyclerent.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.shashank.sony.fancytoastlib.FancyToast;

import vangiau.example.ecobicyclerent.utils.ProgressButton;

public class TheTraTruocActivity extends AppCompatActivity {
    View pbtnDangKy;
    EditText edtHoTen, edtSoCMND, edtSoDienThoai, edtSoTienNapVaoThe;
    CheckBox cbCamKet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_tra_truoc);
        addControls();
        addEvent();
    }

    private void addEvent() {
        pbtnDangKy.setOnClickListener(view ->{
            String ten    = edtHoTen.getText().toString().trim();
            String sdt    = edtSoDienThoai.getText().toString().trim();
            String cmnd = edtSoCMND.getText().toString().trim();
            String tien = edtSoTienNapVaoThe.getText().toString().trim();
            if(ten.length() > 0 && sdt.length() > 0 && cmnd.length() > 0 && tien.length() > 0){
                if(Integer.parseInt(tien) >= 1000000){
                    ProgressButton progressButton = new ProgressButton(TheTraTruocActivity.this, pbtnDangKy);
                    progressButton.buttonActivatedSignUp();
                    Handler handler = new Handler();
                    handler.postDelayed(() -> {
                        progressButton.buttonFinishedSignUp();
                        Intent i = new Intent(TheTraTruocActivity.this, DangKyThanhCongActivity.class);
                        startActivity(i);
                    }, 3000);
                }
                else {
                    FancyToast.makeText(this, "Số tiền nạp tối thiểu là 1.000.000 VNĐ", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
                }

            }
            else {
                FancyToast.makeText(this, "Bạn vui lòng nhập đầy đủ thông tin", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show();
            }
        });
    }

    private void addControls() {
        pbtnDangKy          = findViewById(R.id.pbtnDangKy);
        edtHoTen            = findViewById(R.id.edtHoTen);
        edtSoCMND           = findViewById(R.id.edtSoCMND);
        edtSoDienThoai      = findViewById(R.id.edtSoDienThoai);
        edtSoTienNapVaoThe  = findViewById(R.id.edtSoTienNapVaoThe);
        cbCamKet            = findViewById(R.id.cbCamKet);
    }
}