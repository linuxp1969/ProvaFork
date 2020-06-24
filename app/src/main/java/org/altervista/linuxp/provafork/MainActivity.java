package org.altervista.linuxp.provafork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText textPersonName;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        textPersonName = findViewById(R.id.editTextTextPersonName);
        textview = findViewById(R.id.textview);


    }

    public void funziona(View view) {
        textview.setText(textPersonName.getText());
    }
}