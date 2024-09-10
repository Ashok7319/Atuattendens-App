package com.example.autoatendancesystemaplication;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashLogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_logo);


            Thread thread = new Thread(){
                public void run(){
                    try{
                        sleep(4000);
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                    finally {
                        Intent intent = new Intent(SplashLogoActivity.this , ChooseActivity.class);
                        startActivity(intent);
                    }
                }
            };thread.start();
    }
}