package com.example.iuca_lab_5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    private TextView fName;
    private Button btn;
    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn = findViewById(R.id.btn);
        backBtn = findViewById(R.id.backBtn);
        fName = findViewById(R.id.lName);
        String fname = getIntent().getStringExtra("keyname");
        fName.setText(fname);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText secondName = (EditText) findViewById(R.id.lName);
                String stringToPassBack = secondName.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("keyName", stringToPassBack);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.imgSource);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int res_image = bundle.getInt("image1");
            imageView.setImageResource(res_image);
        }


    }


}