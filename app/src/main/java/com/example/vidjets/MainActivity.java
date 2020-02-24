package com.example.vidjets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    final RadioGroup group = (RadioGroup) findViewById(R.id.group);
    final RadioButton Lonon = (RadioButton) findViewById(R.id.buttonLondon);
    final RadioButton Moscow = (RadioButton) findViewById(R.id.buttonMoscow);
    final RadioButton Dubai = (RadioButton) findViewById(R.id.buttonDubai);
    final RadioButton LA = (RadioButton) findViewById(R.id.buttonLA);
    final ImageView imageView=(ImageView) findViewById(R.id.imageView);
    final CheckBox resize =(CheckBox)findViewById(R.id.Resize);
    final CheckBox tint = (CheckBox) findViewById(R.id.Tint);
    final CheckBox transparency = (CheckBox) findViewById(R.id.transparency);
    final TextView textView = (TextView)findViewById(R.id.text) ;
    final TextClock textClock=(TextClock)findViewById(R.id.textClock);
    final Switch aSwitch=(Switch)findViewById(R.id.switch1);
}
