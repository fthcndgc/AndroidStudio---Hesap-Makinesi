package com.example.x.hesapmakinesi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hesapla extends AppCompatActivity {

    Button geri;

    public void geridon()
    {
        Intent ıntent = new Intent(this,MainActivity.class);
        startActivity(ıntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesapla);

        geri = (Button)findViewById(R.id.button20);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                geridon();
            }
        });
    }
}
