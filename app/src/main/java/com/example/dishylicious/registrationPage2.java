package com.example.dishylicious;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class registrationPage2 extends AppCompatActivity {

    ImageView back2Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page2);

        back2Btn = (ImageView) findViewById(R.id.back2Btn);

        back2Btn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrationPage();
            }
        }));
    }
    private void openRegistrationPage(){
        Intent openRegistrationPage = new Intent(this, registationPage.class);
        startActivity(openRegistrationPage);
    }
}