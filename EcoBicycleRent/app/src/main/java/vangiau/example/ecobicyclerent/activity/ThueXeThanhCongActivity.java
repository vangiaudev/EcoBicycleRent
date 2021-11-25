package vangiau.example.ecobicyclerent.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;

public class ThueXeThanhCongActivity extends AppCompatActivity {
    TextView txtNgayThue, txtThoiGianThue, txtHinhThucThanhToan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thue_xe_thanh_cong);
        addControls();
        GetData();
    }

    private void GetData() {
        String currentDate = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        String currentTime = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        txtNgayThue.setText(currentDate);
        txtThoiGianThue.setText(currentTime);
    }

    private void addControls() {
        txtNgayThue              = findViewById(R.id.txtNgayThue);
        txtThoiGianThue          = findViewById(R.id.txtThoiGianThue);
        txtHinhThucThanhToan     = findViewById(R.id.txtHinhThucThanhToan);
    }
}