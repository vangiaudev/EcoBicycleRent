package vangiau.example.ecobicyclerent.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;

import com.shashank.sony.fancytoastlib.FancyToast;

import vangiau.example.ecobicyclerent.utils.ProgressButton;


public class NapTienVaoTheActivity extends AppCompatActivity {
    View pbtnXacNhanNapTien;
    EditText edtNapTien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nap_tien_vao_the);
        addControls();
        addEvent();
    }

    private void addEvent() {
        pbtnXacNhanNapTien.setOnClickListener(view -> {
            if(edtNapTien.getText().toString().trim().length() > 0){
                ProgressButton progressButton = new ProgressButton(NapTienVaoTheActivity.this, pbtnXacNhanNapTien);
                progressButton.buttonActivatedSignUp();
                Handler handler = new Handler();
                handler.postDelayed(() -> {
                    progressButton.buttonFinishedNapTien();
                    FancyToast.makeText(this, "Số tiền bạn nạp là " + edtNapTien.getText().toString() + " VNĐ", FancyToast.LENGTH_LONG, FancyToast.SUCCESS, false).show();
                }, 3000);
            }
        });
    }

    private void addControls() {
        pbtnXacNhanNapTien = findViewById(R.id.pbtnXacNhanNapTien);
        edtNapTien = findViewById(R.id.edtNapTien);

    }
}