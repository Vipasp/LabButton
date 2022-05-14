package com.example.labbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtn(View v){
        final EditText edit =  (EditText) findViewById(R.id.editText);
        final Button btn = (Button) findViewById(R.id.button);
        edit.setText(btn.getText().toString());
        Toast.makeText(this, edit.getText().toString(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Отключили кнопку", Toast.LENGTH_LONG).show();
        btn.setEnabled(false);
    }
}
