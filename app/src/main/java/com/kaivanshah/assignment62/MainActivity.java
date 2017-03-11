package com.kaivanshah.assignment62;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  com.kaivanshah.assignment62.Fragements.ListFragment.OnCustomItemSelectedListener{

    TextView tv_Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onCustomItemSelected(String posValue) {

        tv_Value = (TextView)this.findViewById(R.id.tv_Value);
        tv_Value.setText(posValue);

    }
}
