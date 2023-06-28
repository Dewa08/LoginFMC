package com.dewa202102309.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity2 extends AppCompatActivity {

    private Button _tampilMahasiswaButton, _tampilForexButton, _tampilCuacaButton, _tampilimplisitButton;
    private Intent _tampilMahasiswaIntent, _tampilForexIntent, _tampilCuacaIntent, _tampilimplisitIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        initTampilMahasiswaButton();
        initTampilForexButton();
        initTampilCuacaButton();
//        initTampilimplisitButton();
    }

    private void initTampilMahasiswaButton()
    {
        _tampilMahasiswaButton = (Button) findViewById(R.id.btnTampilMahasiswa);

        _tampilMahasiswaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _tampilMahasiswaIntent = new Intent(getApplicationContext(), TampilMahasiswaActivity.class);
                startActivity(_tampilMahasiswaIntent);
            }
        });
    }

    private void initTampilForexButton()
    {
        _tampilForexButton = (Button) findViewById(R.id.tampilForexButton);

        _tampilForexButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _tampilForexIntent = new Intent(getApplicationContext(), ForexMainActivity.class);
                startActivity(_tampilForexIntent);
            }
        });
    }

    private void initTampilCuacaButton()
    {
        _tampilCuacaButton = findViewById(R.id.tampilCuacaButton);

        _tampilCuacaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _tampilCuacaIntent = new Intent(getApplicationContext(), CuacaMainActivity.class);
                startActivity(_tampilCuacaIntent);

            }
        });
    }

//    private void initTampilimplisitButton()
//    {
//        _tampilimplisitButton = findViewById(R.id.tampilimplisitButton);
//
//        _tampilimplisitButton.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                _tampilimplisitIntent = new Intent(getApplicationContext(), ImplisitIntentActivity.class);
//                startActivity(_tampilimplisitIntent);
//
//            }
//        });
//    }
}