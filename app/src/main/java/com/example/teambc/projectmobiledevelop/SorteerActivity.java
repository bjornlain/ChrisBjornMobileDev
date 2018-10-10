package com.example.teambc.projectmobiledevelop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SorteerActivity extends AppCompatActivity {

    Button terugButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sorteer_scherm);

        terugButton = (Button) findViewById(R.id.terug_button);
        terugButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
