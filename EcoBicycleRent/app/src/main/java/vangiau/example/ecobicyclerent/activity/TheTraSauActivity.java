package vangiau.example.ecobicyclerent.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalPayment;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentActivity;
import com.paypal.android.sdk.payments.PaymentConfirmation;
import com.shashank.sony.fancytoastlib.FancyToast;

import org.json.JSONException;

import java.math.BigDecimal;
import java.util.Objects;


public class TheTraSauActivity extends AppCompatActivity {
    public static final int PAYPAL_REQUEST_CODE = 7171;

    private static final PayPalConfiguration config = new PayPalConfiguration()
            .environment(PayPalConfiguration.ENVIRONMENT_SANDBOX)
            .clientId("AZFUEUXqi7DGZ5rjgCauAMK7IY4QT626w1DtAlkEAbPGzF-ewaaYBx5Pu-DZOx3K62N4obV0wLBY9XAX");
    AppCompatButton btnPayNow;
    EditText edtAmount;

    String amount = "";

    @Override
    protected void onDestroy() {
        stopService(new Intent(this, PayPalService.class));
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_tra_sau);

        Intent intent = new Intent(this, PayPalService.class);
        intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, config);
        startService(intent);
        btnPayNow = findViewById(R.id.btnLienKet);
        edtAmount = findViewById(R.id.edtAmount);
        btnPayNow.setOnClickListener(view -> processPayment());
    }

    private void processPayment() {
        amount = edtAmount.getText().toString();
        PayPalPayment payPalPayment = new PayPalPayment(new BigDecimal(amount),
                "USD","Pay for ECO Bicycle", PayPalPayment.PAYMENT_INTENT_SALE);
        Intent intent = new Intent(this, PaymentActivity.class);
        intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, config);
        intent.putExtra(PaymentActivity.EXTRA_PAYMENT, payPalPayment);
        startActivityForResult(intent, PAYPAL_REQUEST_CODE);
    }

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == PAYPAL_REQUEST_CODE)
        {
            if(resultCode == RESULT_OK)
            {
                PaymentConfirmation confirmation = Objects.requireNonNull(data).getParcelableExtra(PaymentActivity.EXTRA_RESULT_CONFIRMATION);
                if(confirmation != null)
                {
                    try
                    {
                        String paymentDetails = confirmation.toJSONObject().toString(4);
                        startActivity(new Intent(this, PaymentDetails.class)
                                .putExtra("PaymentDetails", paymentDetails)
                                .putExtra("PaymentAmount", amount)
                        );

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            else if (resultCode == Activity.RESULT_CANCELED){
                FancyToast.makeText(getApplicationContext(), "Cancel", Toast.LENGTH_SHORT, FancyToast.ERROR,false).show();
            }
        }
        else if (resultCode == PaymentActivity.RESULT_EXTRAS_INVALID){
            FancyToast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_SHORT, FancyToast.ERROR,false).show();
        }
    }
}