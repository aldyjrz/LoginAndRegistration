package com.hayra.mahasiswa;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button LogOut;
    TextView EmailShow;
    String EmailHolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        SharedPreferences prefs = getSharedPreferences("Users", MODE_WORLD_READABLE);
        String a = prefs.getString("Email", "");

        EmailShow = (TextView)findViewById(R.id.EmailShow);
        EmailShow.setText(a);


        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);

                startActivity(intent);

                Toast.makeText(MainActivity.this, "Log Out Successfully", Toast.LENGTH_LONG).show();


            }
        });
    }
}