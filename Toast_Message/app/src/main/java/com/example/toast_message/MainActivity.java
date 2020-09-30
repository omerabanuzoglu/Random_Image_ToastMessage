package com.example.toast_message;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        islevVer();

    }

    public void tanimla() {
        button = (Button) findViewById(R.id.btn);
        imageView = (ImageView) findViewById(R.id.img);
    }

    public void islevVer() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rnd = (int) (Math.random() * 4 + 1);
                degistir(rnd);
                Toast.makeText(getApplicationContext(),""+rnd+" Numaralı Resim Değiştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void degistir(int rnd) {
        if (rnd == 1) {
            imageView.setImageResource(R.drawable.bir);
        } else if (rnd == 2) {
            imageView.setImageResource(R.drawable.iki);
        } else if (rnd == 3) {
            imageView.setImageResource(R.drawable.uc);
        } else if (rnd == 4) {
            imageView.setImageResource(R.drawable.dort);
        } else {
            imageView.setImageResource(R.drawable.bir);
        }
    }
}
