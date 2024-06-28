package com.example.onlinebookstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterPage extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6;
AppCompatButton bn1,bn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register_page);

        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.mail);
        ed3=(EditText) findViewById(R.id.mob);
        ed4=(EditText) findViewById(R.id.username);
        ed5=(EditText) findViewById(R.id.passw);
        ed6=(EditText) findViewById(R.id.cpassw);
        bn1=(AppCompatButton) findViewById(R.id.regsbut);
        bn2=(AppCompatButton) findViewById(R.id.backbut);

        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Resgistered",Toast.LENGTH_LONG).show();
            }
        });

        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}