package com.example.passdata2webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSecondActivity(View v){
        EditText inputText = findViewById(R.id.editText);
        String s = inputText.getText().toString();
        inputText.setText("");

        Intent i = new Intent(this, secondAcitivity.class);
        i.putExtra("search",s);
        startActivity(i);
    }
}
