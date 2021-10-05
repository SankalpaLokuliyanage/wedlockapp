package com.example.wedlock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.List;

public class SignupAdvertiser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_advertiser);

        List<String> service = Arrays.asList("Hotel", "Decors", "Cars", "Salon", "Wedding Cakes", "DJ", "Dance Group");

        Spinner spinner = findViewById(R.id.selectedService);

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), R.layout.signup_selected_item, service);
        adapter.setDropDownViewResource(R.layout.signup_dropdown_item);

        spinner.setAdapter(adapter);

        findViewById(R.id.signInDirect).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });
    }
}
