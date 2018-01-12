package com.example.user.weekoneday4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.user.weekoneday4.Person;

import java.util.ArrayList;

/**
 * Created by user on 1/12/2018.
 */

public class CustomAdapter extends ArrayAdapter<Person> {


    public CustomAdapter( Context context, ArrayList<Person> data) {
        super(context, R.layout.row_item, data);


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater myinflator = LayoutInflater.from(getContext());
        View customView = myinflator.inflate(R.layout.row_item,parent, false);
        Person singleperson = getItem(position);

        TextView  txtName= (TextView)customView.findViewById(R.id.txtName);
        TextView  txtAge= (TextView)customView.findViewById(R.id.txtAge);
        TextView  txtGender= (TextView)customView.findViewById(R.id.txtGender);
        txtName.setText(singleperson.getName());
        txtAge.setText(singleperson.getAge());
        txtGender.setText(singleperson.getGender());


        return customView;
    }
}