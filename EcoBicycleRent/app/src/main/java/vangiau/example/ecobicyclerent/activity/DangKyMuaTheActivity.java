package vangiau.example.ecobicyclerent.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.shashank.sony.fancytoastlib.FancyToast;


public class DangKyMuaTheActivity extends AppCompatActivity {
    RadioButton radTheTraTruoc, radTheTraSau;
    AppCompatButton btnXacNhanChonThe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky_mua_the);
        addControls();
        addEvent();
    }

    private void addEvent() {
        btnXacNhanChonThe.setOnClickListener(view -> {
         if(radTheTraTruoc.isChecked()){
             Intent i = new Intent(DangKyMuaTheActivity.this, TheTraTruocActivity.class);
             startActivity(i);
         }
         else if(radTheTraSau.isChecked()){
             Intent i = new Intent(DangKyMuaTheActivity.this, TheTraSauActivity.class);
             startActivity(i);
         }
         else {
             FancyToast.makeText(this, "Vui lòng chọn loại thẻ", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
         }
        });
        radTheTraSau.setOnClickListener(view -> radTheTraTruoc.setChecked(false));
        radTheTraTruoc.setOnClickListener(view -> radTheTraSau.setChecked(false));
    }

    private void addControls() {
        btnXacNhanChonThe = findViewById(R.id.btnXacNhanChonThe);
        radTheTraSau = findViewById(R.id.radTheTraSau);
        radTheTraTruoc = findViewById(R.id.radTheTraTruoc);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}