package vangiau.example.ecobicyclerent.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vangiau.example.ecobicyclerent.activity.MainActivity;

public class DangKyThanhCongActivity extends AppCompatActivity {
    AppCompatButton btnQuayVeTrangChu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky_thanh_cong);
        btnQuayVeTrangChu = findViewById(R.id.btnQuayVeTrangChu);
        btnQuayVeTrangChu.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        });
    }
}