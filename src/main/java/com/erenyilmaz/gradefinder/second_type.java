package com.erenyilmaz.gradefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class second_type extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_type);
    }

    public void type1_calculate(View view) {
        Double pass = 0.0;
        Double midterm = 0.0;
        Double final_grade = 0.0;
        Double percMid = 0.0;
        Double percFin = 0.0;
        Double mean = 0.0;
        Double midterm2 = 0.0;
        Double percMid2 = 0.0;

        String spass = ((EditText) findViewById(R.id.PassGrade1)).getText().toString();
        if (TextUtils.isEmpty(spass)) {
            ((EditText) findViewById(R.id.PassGrade1)).setError("Please enter a number or decimal");
            return;
        } else
            pass = Double.parseDouble(spass);

        String smidterm = ((EditText) findViewById(R.id.Midterm1)).getText().toString();
        if (TextUtils.isEmpty(smidterm)) {
            ((EditText) findViewById(R.id.Midterm1)).setError("Please enter a number or decimal");
            return;
        } else
            midterm = Double.parseDouble(smidterm);

        String sfinal = ((EditText) findViewById(R.id.Final1)).getText().toString();
        if (TextUtils.isEmpty(sfinal)) {
            ((EditText) findViewById(R.id.Final1)).setError("Please enter a number or decimal");
            return;
        } else
            final_grade = Double.parseDouble(sfinal);

        String smidterm2 = ((EditText) findViewById(R.id.Midterm2)).getText().toString();
        if (TextUtils.isEmpty(smidterm2)) {
            ((EditText) findViewById(R.id.Midterm2)).setError("Please enter a number or decimal");
            return;
        } else
            midterm2 = Double.parseDouble(smidterm2);

        String spercMid = ((EditText) findViewById(R.id.MidtermPer1)).getText().toString();
        if (TextUtils.isEmpty(spercMid)) {
            ((EditText) findViewById(R.id.MidtermPer1)).setError("Please enter a percentile");
            return;
        } else {
            percMid = Double.parseDouble(spercMid);
            percMid = percMid * 0.01;
        }

        String spercMid2 = ((EditText) findViewById(R.id.MidtermPer2)).getText().toString();
        if (TextUtils.isEmpty(spercMid2)) {
            ((EditText) findViewById(R.id.MidtermPer2)).setError("Please enter a percentile");
            return;
        } else {
            percMid2 = Double.parseDouble(spercMid2);
            percMid2 = percMid2 * 0.01;
        }

        String spercFin = ((EditText) findViewById(R.id.FinalPer1)).getText().toString();
        if (TextUtils.isEmpty(spass)) {
            ((EditText) findViewById(R.id.FinalPer1)).setError("Please enter a percentile");
            return;
        }
        else {
            percFin = Double.parseDouble(spercFin);
            percFin = percFin * 0.01;
        }


        mean = (midterm * percMid) + (final_grade * percFin) + (midterm2 * percMid2);
        BigDecimal bd = new BigDecimal(mean).setScale(2, RoundingMode.HALF_UP);
        mean = bd.doubleValue();

        if (mean >= pass) {
            String fmean = Double.toString(mean);
            ((TextView) findViewById(R.id.textView4)).setText("You pass the class!\nYour general grade is : " + fmean);
            ((TextView) findViewById(R.id.textView4)).setTextColor(getColor(R.color.green));
        }
        else {
            String fmean = Double.toString(mean);
            ((TextView) findViewById(R.id.textView4)).setText("You can't pass the class!\nYour general grade is : " + fmean);
            ((TextView) findViewById(R.id.textView4)).setTextColor(getColor(R.color.red));
        }
    }


    public void go_back(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}