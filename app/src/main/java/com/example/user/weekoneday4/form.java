package com.example.user.weekoneday4;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.weekoneday4.Person;

import java.util.ArrayList;


public class form extends AppCompatActivity {

    private EditText txteditage;
    private EditText txteditname;
    private EditText txteditgender;
    private Button addbtn;
    private Button listbtn;
    private TextView tvMain;

    private String age;
    private String name;
    private String gender;
    private Person person;

    ArrayList<Person> list = new ArrayList<>();
//
//    private static final String TAG = MainActivity.class.getSimpleName();
//    private EditText etMain;
//    private TextView tvMain;
//    private EditText etPersonName;
//    private EditText etPersonAge;
//    private EditText etPersonGender;
//    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        txteditage= (EditText) findViewById(R.id.txteditage);
        txteditname= (EditText) findViewById(R.id.txteditname);

        txteditgender=(EditText) findViewById(R.id.txteditgender);
        
        
        
        listbtn=(Button) findViewById(R.id.listbtn);
        addbtn=(Button) findViewById(R.id.addbtn);

        
    }

    
    
    

    public void onAdd(View view) {



        name = txteditname.getText().toString();
        age = txteditage.getText().toString();
        gender= txteditgender.getText().toString();


        person = new Person(name, age, gender);

        list.add(person);
        Toast.makeText(this, name+" has been added to the list", Toast.LENGTH_SHORT).show();
        
        txteditgender.setText("");
        txteditname.setText("");
        txteditage.setText("");




    }



    public void onList(View view) {

        Intent intent = new Intent(getApplicationContext(), ListPerson.class);
        intent.setAction("viewList");


        intent.putExtra("datalist", list);

        startActivity(intent);
    }



}
