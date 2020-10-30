package com.example.calculateyourtip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView rs;
    EditText n1,n2;

    float num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);

        rs = findViewById(R.id.txtAns);

        n1 = findViewById(R.id.number1);
        n2 = findViewById(R.id.number2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Float.parseFloat(n1.getText().toString());
                num2 = Float.parseFloat(n2.getText().toString());

                result = num1*(num2/100);

                rs.setText(String.valueOf(result));

            }
        });

        n1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    n1.setHint("");
                else
                    n1.setHint("Bill");
            }
        });

        n2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    n2.setHint("");
                else
                    n2.setHint("Bill");
            }
        });
    }
}