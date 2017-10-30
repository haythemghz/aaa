package com.example.mayar.dialogfargmentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DialogFragment.OnFragmentInteractionListener {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textview);
        textView.setOnClickListener(new MyOnClickListener());
    }
    public void onFragmentInteraction(String text){
        textView.setText(""+text);
    };
    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            DialogFragment newFragment = new DialogFragment();
            newFragment.show(getFragmentManager(), "dialog");
        }
    }
}
