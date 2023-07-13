package com.example.simpleinventory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    Button importBtn;
    Button stockBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        importBtn = (Button) findViewById(R.id.importBtn);
        stockBtn = (Button) findViewById(R.id.stockBtn);

        stockBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), StockActivity.class);
                startActivity(in);
            }
        });
    }
}
