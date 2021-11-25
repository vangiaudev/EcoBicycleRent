package vangiau.example.ecobicyclerent.activity;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


import java.text.DecimalFormat;

import java.util.Objects;

import me.relex.circleindicator.CircleIndicator;


public class ThueXeActivity extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    String ten = "", giaThueXe = "", moTa ="", hinhAnh ="", id = "", soLuong = "";
    private String mParam1;
    private String mParam2;


    public ThueXeActivity() {
        // Required empty public constructor
    }
    public ThueXeActivity(String ten, String soLuong, String giaThueXe, String moTa, String hinhAnh, String id) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.giaThueXe = giaThueXe;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
        this.id = id;
    }


    public static ThueXeActivity newInstance(String param1, String param2) {
        ThueXeActivity fragment = new ThueXeActivity();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_thue_xe, container, false);
        TextView txtTenXeCanThueHolder    = view.findViewById(R.id.txtTenXeCanThue);
        TextView txtGiaXeCanThueHolder    = view.findViewById(R.id.txtGiaXeCanThue);
        ImageView imgChiTietXeThueHolder  = view.findViewById(R.id.imgChiTietXeThue);
        AppCompatButton btnXacNhanThueXe  = view.findViewById(R.id.btnXacNhanThueXe);
        RadioButton radThueTheTraSau      = view.findViewById(R.id.radThueTheTraSau);
        RadioButton radThueTheTraTruoc    = view.findViewById(R.id.radThueTheTraTruoc);


        txtTenXeCanThueHolder.setText(ToUpper(ten));
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        txtGiaXeCanThueHolder.setText("Giá : " + decimalFormat.format(Integer.parseInt(giaThueXe)) + " ₫");
        Picasso.with(getContext()).load(hinhAnh).placeholder(R.drawable.ic_loading).error(R.drawable.logo_home).into(imgChiTietXeThueHolder);

        radThueTheTraSau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radThueTheTraTruoc.setChecked(false);
            }
        });
        radThueTheTraTruoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radThueTheTraSau.setChecked(false);
            }
        });
        btnXacNhanThueXe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), ThueXeThanhCongActivity.class);
                startActivity(i);
            }
        });
        return  view;
    }

    public void onBackPressed()
    {
        AppCompatActivity activity=(AppCompatActivity)getContext();
        Objects.requireNonNull(activity).getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new TimKiemFragment()).addToBackStack(null).commit();

    }

    public String ToUpper(String message) {
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        message = String.valueOf(charArray);
        return message;
    }


}