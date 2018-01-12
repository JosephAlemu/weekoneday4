package com.example.user.weekoneday4;
import com.example.user.weekoneday4.CustomAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListPerson extends AppCompatActivity {


    private static final String TAG = ListPerson.class.getSimpleName();
    private TextView tvSecond;
    ArrayList<Person> list ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_person);

        Log.d(TAG, "onCreate: ");

       // tvSecond = findViewById(R.id.tvSecond);

        String action = getIntent().getAction();

        switch (action) {


            case "viewList":
                list=(ArrayList<Person>)getIntent().getSerializableExtra( "datalist");


                break;

        }

        CustomAdapter adapter = new CustomAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }



}
