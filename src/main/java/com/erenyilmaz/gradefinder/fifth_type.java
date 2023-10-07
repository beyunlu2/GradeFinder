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

public class fifth_type extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_type);
    }

    public void type1_calculate(View view) {
        Double pass = 0.0;
        Double midterm = 0.0;
        Double final_grade = 0.0;
        Double percMid = 0.0;
        Double percFin = 0.0;
        Double mean = 0.0;
        Double percPro = 0.0;
        Double project = 0.0;
        Double project2 = 0.0;
        Double percPro2 = 0.0;
        Double project3 = 0.0;
        Double percPro3 = 0.0;

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

        String sproject = ((EditText) findViewById(R.id.Project1)).getText().toString();
        if (TextUtils.isEmpty(sproject)) {
            ((EditText) findViewById(R.id.Project1)).setError("Please enter a number or decimal");
            return;
        } else
            project = Double.parseDouble(sproject);

        String spercPro = ((EditText) findViewById(R.id.ProjectPer1)).getText().toString();
        if (TextUtils.isEmpty(spercPro)) {
            ((EditText) findViewById(R.id.ProjectPer1)).setError("Please enter a percentile");
            return;
        } else {
            percPro = Double.parseDouble(spercPro);
            percPro = percPro * 0.01;
        }

        String sproject2 = ((EditText) findViewById(R.id.Project2)).getText().toString();
        if (TextUtils.isEmpty(sproject2)) {
            ((EditText) findViewById(R.id.Project2)).setError("Please enter a number or decimal");
            return;
        } else
            project2 = Double.parseDouble(sproject2);

        String spercPro2 = ((EditText) findViewById(R.id.ProjectPer2)).getText().toString();
        if (TextUtils.isEmpty(spercPro2)) {
            ((EditText) findViewById(R.id.ProjectPer2)).setError("Please enter a percentile");
            return;
        } else {
            percPro2 = Double.parseDouble(spercPro2);
            percPro2 = percPro2 * 0.01;
        }

        String sproject3 = ((EditText) findViewById(R.id.Project3)).getText().toString();
        if (TextUtils.isEmpty(sproject3)) {
            ((EditText) findViewById(R.id.Project3)).setError("Please enter a number or decimal");
            return;
        } else
            project3 = Double.parseDouble(sproject3);

        String spercPro3 = ((EditText) findViewById(R.id.ProjectPer3)).getText().toString();
        if (TextUtils.isEmpty(spercPro3)) {
            ((EditText) findViewById(R.id.ProjectPer3)).setError("Please enter a percentile");
            return;
        } else {
            percPro3 = Double.parseDouble(spercPro3);
            percPro3 = percPro3 * 0.01;
        }

        String spercMid = ((EditText) findViewById(R.id.MidtermPer1)).getText().toString();
        if (TextUtils.isEmpty(spercMid)) {
            ((EditText) findViewById(R.id.MidtermPer1)).setError("Please enter a percentile");
            return;
        } else {
            percMid = Double.parseDouble(spercMid);
            percMid = percMid * 0.01;
        }

        String spercFin = ((EditText) findViewById(R.id.FinalPer1)).getText().toString();
        if (TextUtils.isEmpty(spass)) {
            ((EditText) findViewById(R.id.FinalPer1)).setError("Please enter a percentile");
            return;
        } else {
            percFin = Double.parseDouble(spercFin);
            percFin = percFin * 0.01;
        }

        mean = (midterm * percMid) + (final_grade * percFin) + (project * percPro) + (project2 * percPro2) + (project3 * percPro3);
        BigDecimal bd = new BigDecimal(mean).setScale(2, RoundingMode.HALF_UP);
        mean = bd.doubleValue();

        if (mean >= pass) {
            String fmean = Double.toString(mean);
            ((TextView) findViewById(R.id.textView4)).setText("You pass the class!\nYour general grade is : " + fmean);
            ((TextView) findViewById(R.id.textView4)).setTextColor(getColor(R.color.green));
        } else {
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