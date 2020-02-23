package com.example.dishylicious;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class registationPage extends AppCompatActivity {

    TextView nextRegistartionBtn;
    ImageView backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation_page);

        backBtn = (ImageView) findViewById(R.id.backBtn);

        backBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDishyLiciousMain();
            }
        }));
        nextRegistartionBtn = (TextView) findViewById(R.id.join2_btn);
        nextRegistartionBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrationPage2();
            }
        }));
    }
        private void openDishyLiciousMain(){
            Intent dishyLiciousMain = new Intent(this, dishyLiciousMain.class);
            startActivity(dishyLiciousMain);
        }

    private void openRegistrationPage2(){
        Intent openRegistrationPage2 = new Intent(this, registrationPage2.class);
        startActivity(openRegistrationPage2);
    }
}

