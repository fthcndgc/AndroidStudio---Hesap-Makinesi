package com.example.x.hesapmakinesi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    public void temizleipucu()
    {
        Intent ıntent = new Intent(this,temizle.class);
        startActivity(ıntent);
    }

    public void sayilaripucu()
    {
        Intent ıntent = new Intent(this,Bir.class);
        startActivity(ıntent);
    }

    public void islemleripucu()
    {
        Intent ıntent = new Intent(this,Topla.class);
        startActivity(ıntent);
    }

    public void hesaplaipucu()
    {
        Intent ıntent = new Intent(this,Hesapla.class);
        startActivity(ıntent);
    }

    Switch swwitch;
    Button bir, iki, uc, dort, bes, alti, yedi, sekiz, dokuz, sifir, topla, cikar, carp, bol, hesapla, temizle;
    EditText console;
    float sayi1,sonuc = 0,sayi2;
    String sayi = "0";
    String islem = "";
    boolean tiklandi = false;

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reklamiyukle();

        swwitch = (Switch)findViewById(R.id.simpleSwitch);
        bir = (Button)findViewById(R.id.button);
        iki = (Button)findViewById(R.id.button2);
        uc = (Button)findViewById(R.id.button3);
        dort = (Button)findViewById(R.id.button4);
        bes = (Button)findViewById(R.id.button5);
        alti = (Button)findViewById(R.id.button6);
        yedi = (Button)findViewById(R.id.button7);
        sekiz = (Button)findViewById(R.id.button8);
        dokuz = (Button)findViewById(R.id.button9);
        sifir = (Button)findViewById(R.id.button10);
        topla = (Button)findViewById(R.id.button11);
        cikar = (Button)findViewById(R.id.button12);
        carp = (Button)findViewById(R.id.button13);
        bol = (Button)findViewById(R.id.button14);
        hesapla = (Button)findViewById(R.id.button15);
        temizle = (Button)findViewById(R.id.button16);
        console = (EditText)findViewById(R.id.editText);

        console.setText(sayi);

            temizle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swwitch.isChecked() != true) {
                        sayi = "0";
                        sayi2 = 0;
                        sayi1 = 0;
                        sonuc = 0;
                        tiklandi = false;
                        console.setText(sayi);
                    }
                    else
                    {
                        temizleipucu();
                    }
                }
            });

            bir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swwitch.isChecked() != true) {
                        if (sayi == "0")
                            sayi = "1";
                        else
                            sayi = sayi + "1";
                        console.setText(sayi);
                    }
                    else
                    {
                        sayilaripucu();
                    }
                }
            });
            iki.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swwitch.isChecked() != true) {
                        if (sayi == "0")
                            sayi = "2";
                        else
                            sayi = sayi + "2";
                        console.setText(sayi);
                    }
                    else
                    {
                        sayilaripucu();
                    }
                }
            });
            uc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swwitch.isChecked() != true) {
                        if (sayi == "0")
                            sayi = "3";
                        else
                            sayi = sayi + "3";
                        console.setText(sayi);
                    }
                    else
                    {
                        sayilaripucu();
                    }
                }
            });
            dort.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swwitch.isChecked() != true) {
                        if (sayi == "0")
                            sayi = "4";
                        else
                            sayi = sayi + "4";
                        console.setText(sayi);
                    }
                    else
                    {
                        sayilaripucu();
                    }
                }
            });
            bes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swwitch.isChecked() != true) {
                        if (sayi == "0")
                            sayi = "5";
                        else
                            sayi = sayi + "5";
                        console.setText(sayi);
                    }
                    else
                    {
                        sayilaripucu();
                    }
                }
            });
            alti.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swwitch.isChecked() != true) {
                        if (sayi == "0")
                            sayi = "6";
                        else
                            sayi = sayi + "6";
                        console.setText(sayi);
                    }
                    else
                    {
                        sayilaripucu();
                    }
                }
            });
            yedi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swwitch.isChecked() != true) {
                        if (sayi == "0")
                            sayi = "7";
                        else
                            sayi = sayi + "7";
                        console.setText(sayi);
                    }
                    else
                    {
                        sayilaripucu();
                    }
                }
            });
            sekiz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swwitch.isChecked() != true) {
                        if (sayi == "0")
                            sayi = "8";
                        else
                            sayi = sayi + "8";
                        console.setText(sayi);
                    }
                    else
                    {
                        sayilaripucu();
                    }
                }
            });
            dokuz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swwitch.isChecked() != true) {
                        if (sayi == "0")
                            sayi = "9";
                        else
                            sayi = sayi + "9";
                        console.setText(sayi);
                    }
                    else
                    {
                        sayilaripucu();
                    }
                }
            });
            sifir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swwitch.isChecked() != true) {
                        if (sayi == "0")
                            sayi = "0";
                        else
                            sayi = sayi + "0";
                        console.setText(sayi);
                    }
                    else
                    {
                        sayilaripucu();
                    }
                }
            });
            topla.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swwitch.isChecked() != true) {
                        if (tiklandi != true)
                            sayi1 = Integer.parseInt(sayi);
                        else
                            sayi1 = 0;
                        console.setText("0");
                        sayi = "0";
                        islem = "+";
                        sonuc = sonuc + sayi1;
                    }
                    else
                    {
                        islemleripucu();
                    }
                }
            });
        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (swwitch.isChecked() != true) {
                    if (tiklandi != true)
                        sayi1 = Integer.parseInt(sayi);
                    else
                        sayi1 = 0;
                    console.setText("0");
                    sayi = "0";
                    islem = "-";
                    if (sonuc == 0)
                        sonuc = sayi1;
                    else
                        sonuc = sonuc - sayi1;
                }
                else
                {
                    islemleripucu();
                }
            }
        });
        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (swwitch.isChecked() != true) {
                    if (tiklandi != true)
                        sayi1 = Integer.parseInt(sayi);
                    else
                        sayi1 = 1;
                    console.setText("0");
                    sayi = "0";
                    islem = "*";
                    if (sonuc != 0)
                        sonuc = sonuc * sayi1;
                    else
                        sonuc = sayi1;
                }
                else
                {
                    islemleripucu();
                }
            }
        });
        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (swwitch.isChecked() != true) {
                    if (tiklandi != true)
                        sayi1 = Integer.parseInt(sayi);
                    else
                        sayi1 = 1;
                    console.setText("0");
                    sayi = "0";
                    islem = "/";
                    if (sonuc != 0)
                        sonuc = sonuc / sayi1;
                    else
                        sonuc = sayi1;
                }
                else
                {
                    islemleripucu();
                }
            }
        });
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (swwitch.isChecked() != true) {
                    sayi2 = Integer.parseInt(sayi);
                    if (islem == "+")
                        sonuc = sonuc + sayi2;
                    if (islem == "-")
                        sonuc = sonuc - sayi2;
                    if (islem == "*")
                        sonuc = sonuc * sayi2;
                    if (islem == "/")
                        sonuc = sonuc / sayi2;
                    console.setText(String.valueOf(sonuc));
                    tiklandi = true;
                }
                else
                {
                    hesaplaipucu();
                }
            }
        });
    }

    private void reklamiyukle() {
        adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId(getString(R.string.reklam_kimligi));
        LinearLayout layout = (LinearLayout) findViewById(R.id.reklam);
        layout.addView(adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        adView.loadAd(adRequest);
    }

}
