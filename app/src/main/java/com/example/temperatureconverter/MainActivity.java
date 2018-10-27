package com.example.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button c2f = findViewById(R.id.button);
        c2f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView showText = findViewById(R.id.textView2);
                EditText e = findViewById(R.id.editText2);
                int temp = Integer.parseInt(e.getText().toString());
                Temperature t = new Temperature(temp);
                String fahrenheit = String.format("%.2f", t.CtoF());
                showText.setText(fahrenheit);
            }
        });
        Button f2c = findViewById(R.id.button2);
        f2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView showText = findViewById(R.id.textView2);
                EditText e = findViewById(R.id.editText2);
                int temp = Integer.parseInt(e.getText().toString());
                Temperature t = new Temperature(temp);
                String celsius = String.format("%.2f", t.Ftoc());

                showText.setText(celsius);
            }
        });
    }
}
