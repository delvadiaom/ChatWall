package com.developerom.chatgloballllllly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.developerom.chatgloballllllly.databinding.ActivityPhoneNumberBinding;
import com.google.firebase.auth.FirebaseAuth;

public class ActivityPhoneNumberActivity extends AppCompatActivity {

    ActivityPhoneNumberBinding binding;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPhoneNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        auth = FirebaseAuth.getInstance();
        binding.phonebox.requestFocus();

        if(auth.getCurrentUser() != null){
            Intent intent = new Intent(ActivityPhoneNumberActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }

        binding.continuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = binding.phonebox.getText().toString();
                if (phone.isEmpty() || phone.length() < 10 || phone.length() == 10){
                    binding.phonebox.setError("Please enter a number with country code");
                    binding.phonebox.requestFocus();
                    return;
                }
                Intent intent = new Intent(ActivityPhoneNumberActivity.this,OTPActivity.class);
                intent.putExtra("phoneNumber",phone);
                startActivity(intent);
            }
        });

    }
}