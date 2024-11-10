package com.example.virtualgnom;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView textView = (TextView)findViewById(R.id.gnomView);
        ImageView imageView = (ImageView)findViewById(R.id.gnomImage);
        RadioButton radioButton = (RadioButton) findViewById(R.id.gnomRadio);
        RadioButton radioButton2 = (RadioButton)findViewById(R.id.gnomRadio2);
        Button button = (Button) findViewById(R.id.gnomButton);
        Button button2 = (Button) findViewById(R.id.gnomButton2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(radioButton.isChecked()){
                    textView.setText("is it hentai?");
                    button.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.VISIBLE);
                }
                else{
                    System.exit(0);
                }
            }
        }
        );
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(radioButton.isChecked()){
                    textView.setVisibility(View.INVISIBLE);
                    radioButton.setVisibility(View.INVISIBLE);
                    radioButton2.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                }
                else{
                    System.exit(0);
                }
            }
        }
        );
    }
}