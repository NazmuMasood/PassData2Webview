package com.example.passdata2webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondAcitivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acitivity);

        Intent i = getIntent();
        String searchText = i.getStringExtra("search");
        et = findViewById(R.id.editText2);
        et.setText(searchText);
        et.setCursorVisible(false);
        et.setGravity(Gravity.CENTER_HORIZONTAL);
    }

    public void searchInGoogle(View v){
        String searchText = et.getText().toString();
        Intent i = new Intent(this, thirdActivity.class);
        i.putExtra("search",searchText);
        startActivity(i);
    }
}
