package com.example.dishylicious;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.ebanx.swipebtn.OnStateChangeListener;
import com.ebanx.swipebtn.SwipeButton;

public class dishyLiciousMain extends AppCompatActivity {

    TextView dishyLiciousRegistrationBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        SwipeButton swipeButton =(SwipeButton)findViewById(R.id.swipe_enter_btn);
        swipeButton.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                Toast.makeText(dishyLiciousMain.this, "Welcome :"+ active, Toast.LENGTH_SHORT).show();
            }
        });

        dishyLiciousRegistrationBtn = (TextView) findViewById(R.id.join_btn);

        dishyLiciousRegistrationBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openRegistrationPage();
            }
        }));
    }

    private void openRegistrationPage(){
        Intent registration = new Intent(this, registationPage.class);
        startActivity(registration);
        // hello
    }
}
