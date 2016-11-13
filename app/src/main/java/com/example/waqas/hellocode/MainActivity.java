package com.example.waqas.hellocode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btnYes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnYes = (Button) findViewById(R.id.button2);
        txt = (TextView) findViewById(R.id.text);
    }

    public void clickME(View view) {
        txt.setText("Yes, Welcome! You are in for next code challenges");
        btnYes.setText("challenges have fun");
    }
}
