package redipae.ppms.com.framex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import redipae.ppms.com.redipae.MainRedipaeActivity;

public class MainActivity extends AppCompatActivity {

    Button clicki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clicki= findViewById(R.id.button);

        clicki.setOnClickListener((v)->{
            Intent re = new Intent(this, MainRedipaeActivity.class);
            startActivity(re);

        });

    }
}