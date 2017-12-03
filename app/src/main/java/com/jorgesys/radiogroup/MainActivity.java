package com.jorgesys.radiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

              String myOption = "";

                if (checkedId == R.id.radio1) {
                    myOption = "Music";
                } else  if (checkedId == R.id.radio2) {
                    myOption = "Sports";
                } else  if (checkedId == R.id.radio3) {
                    myOption = "Movies";
                }

                Toast.makeText(getApplicationContext(), "You have selected: " + myOption, Toast.LENGTH_SHORT).show();

            }
        });


    }


}
