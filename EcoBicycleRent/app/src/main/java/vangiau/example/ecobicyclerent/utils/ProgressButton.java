package vangiau.example.ecobicyclerent.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import vangiau.example.ecobicyclerent.activity.R;


public class ProgressButton {
    private final CardView cardView;

    private final ConstraintLayout constraintLayout;

    private final ProgressBar progressBar;

    private final TextView textView;


    public ProgressButton(Context context, View view){
        cardView = view.findViewById(R.id.cvProgress);
        constraintLayout = view.findViewById(R.id.clProgress);
        progressBar = view.findViewById(R.id.pbDangKy);
        textView = view.findViewById(R.id.textView);

    }
    @SuppressLint("SetTextI18n")
    public void buttonActivatedSignUp(){
        progressBar.setVisibility(View.VISIBLE);
        textView.setText("HỆ THỐNG KIỂM TRA...");

    }

    @SuppressLint("SetTextI18n")
    public void buttonFinishedSignUp(){
        progressBar.setVisibility(View.GONE);
        constraintLayout.setBackgroundColor(ContextCompat.getColor(cardView.getContext(), R.color.colorGreenDrank));
        textView.setText("ĐĂNG KÝ HOÀN TẤT");
    }

    @SuppressLint("SetTextI18n")
    public void buttonFinishedNapTien(){
        progressBar.setVisibility(View.GONE);
        constraintLayout.setBackgroundColor(ContextCompat.getColor(cardView.getContext(), R.color.colorGreenDrank));
        textView.setText("NẠP TIỀN THÀNH CÔNG");
    }


}
