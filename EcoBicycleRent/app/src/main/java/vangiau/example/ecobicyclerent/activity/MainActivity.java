package vangiau.example.ecobicyclerent.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btnDangKyMuaThe, btnThueXe, btnNapTienVaoThe, btnTraXe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvent();
    }

    private void addEvent() {
        btnDangKyMuaThe.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, DangKyMuaTheActivity.class);
            startActivity(i);
        });
        btnNapTienVaoThe.setOnClickListener(view ->{
            Intent i = new Intent(MainActivity.this, NapTienVaoTheActivity.class);
            startActivity(i);
        });
        btnThueXe.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, TimKiemActivity.class);
            startActivity(i);
        });
    }

    private void addControls() {
        btnDangKyMuaThe     = findViewById(R.id.btnDangKyMuaThe);
        btnNapTienVaoThe    = findViewById(R.id.btnNapTienVaoThe);
        btnThueXe           = findViewById(R.id.btnThueXe);
        btnTraXe            = findViewById(R.id.btnTraXe);
    }
}