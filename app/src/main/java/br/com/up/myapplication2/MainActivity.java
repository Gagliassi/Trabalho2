package br.com.up.myapplication2;

import android.content.Intent;
import android.service.controls.actions.FloatAction;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton buttonAddGift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAddGift = findViewById(R.id.button_add);


        buttonAddGift.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        getApplicationContext(),
                        AddGifActivity.class
                );
                startActivity(intent);

            }
        });

    }
}