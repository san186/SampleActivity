package com.livestock.sampleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button Btn1;
    Button Btn;


    Button Btn1s;
    Button Btns;

    EditText Edt1s;
    EditText Edt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btns=findViewById(R.id.button);
    }
}
