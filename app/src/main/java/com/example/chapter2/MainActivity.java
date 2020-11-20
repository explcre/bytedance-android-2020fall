package com.example.chapter2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chapter2.search.SearchActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent intent = new Intent(MainActivity.this, MyActivity.class);
//                intent.putExtra("extra", "from MainActivity");
//                startActivity(intent);


//                Intent intent = new Intent("com.example.chapter2.ACTION_START");
//                startActivity(intent);


//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
//                startActivity(intent);

                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);

            }
        });

    }
}