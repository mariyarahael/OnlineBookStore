package com.example.onlinebookstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginPage extends AppCompatActivity {
AppCompatButton bnl1,bnl2,bnl3,bnl4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);

        bnl1=(AppCompatButton) findViewById(R.id.profbut);
        bnl2=(AppCompatButton) findViewById(R.id.ppbut);
        bnl3=(AppCompatButton) findViewById(R.id.favbut);
        bnl4=(AppCompatButton) findViewById(R.id.srchbut);

       bnl4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              Intent srch = new Intent(getApplicationContext(),SearchBkPage.class);
              startActivity(srch);
           }
       });
    }
}