package com.example.abdis.imgbtnproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Submit;
    EditText  Name;
    TextView Display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText)findViewById(R.id.textName);
        Display=(TextView) findViewById(R.id.textDisplay);
        Submit=(Button)findViewById(R.id.btnSubmit);
        btnClick();
    }

    private void btnClick(){
        Submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Display.setText(Name.getText().toString());
            }
        });
    }
}
