package com.example.user.weekoneday4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnemu;
    private Button btnform;
    private Button btncamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onEmu(View view)
    {
        Intent intent = new Intent(MainActivity.this, emu.class);
        startActivity(intent);
    }

    public void onForm(View view) {
        Intent intent = new Intent(MainActivity.this, form.class);
        startActivity(intent);
    }

    public void onCamera(View view)
    {
        Intent intent = new Intent(MainActivity.this, camera.class);
        startActivity(intent);

    }
}
