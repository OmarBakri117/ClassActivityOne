package edu.cs.birzeit.classactivityone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText weigh ;
    private EditText height ;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupValues();
    }

    private void setupValues() {
        weigh = findViewById(R.id.weigh);
        height = findViewById(R.id.height);
        result = findViewById(R.id.result);
    }


    public void findBMI(View view) {
        String temp= weigh.getText().toString();
        int value=0;
        if (!"".equals(temp)){
            value =Integer.parseInt(temp);
        }
        String temp2= height.getText().toString();
        int value2=0;
        if (!"".equals(temp2)){
            value2 =Integer.parseInt(temp2);
        }
        float value2inmeter = value2/(float)100 ;
        float v2 = value2inmeter*value2inmeter;
        float bmi = value/v2;
        String myres = "";
        if (bmi>=25) {
             myres = "Your BMI is "+bmi+" And its OverHealth ";
        }else{
             myres = "Your BMI is "+bmi+" And its healthy";
        }
        result.setText(myres);
        result.setVisibility(View.VISIBLE);
    }

}