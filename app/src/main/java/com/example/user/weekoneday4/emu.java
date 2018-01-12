package com.example.user.weekoneday4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class emu extends AppCompatActivity {


    private static SeekBar seek_bar;
    private static TextView txtView;
    private TextView txtemi;

    private EditText editTextloan;
    private EditText editTxtloanMonth;
    float numberofmonths = 0;
    float loan = 0;
    float rate = 0;
    float emi = 0;
    float first =0;
    float second =0;
    float x = 0;
    float y = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emu);
        seekbarr();
    }

    public void seekbarr() {

        txtView = (TextView)findViewById(R.id.txtView);
        txtemi = (TextView)findViewById(R.id.txtemi);
        seek_bar = (SeekBar) findViewById(R.id.seekBar);
        editTextloan = (EditText) findViewById(R.id.editTextloan);
        editTxtloanMonth = (EditText) findViewById(R.id.editTxtloanMonth);


        txtView.setText( + seek_bar.getProgress() + "%");

        //seek_bar.getMax()



        seek_bar.setOnSeekBarChangeListener(

                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value;
                    String str = editTxtloanMonth.getText().toString();




                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        progress_value = i;
                        txtView.setText(i + "%");

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {


                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                       rate = progress_value;
                        txtView.setText(progress_value+"%");


                    }
                }

        );

// EMI = [P x R x (1+R)^N]/[(1+R)^N-1]
    }


    public void onclaculate(View view) {


        float loan = Float.valueOf(editTextloan.getText().toString());
        numberofmonths = Float.valueOf(editTxtloanMonth.getText().toString());
       x = 1+rate;
       y = numberofmonths;
      first =(float)  Math.pow(x,y);

      y = numberofmonths-1;
      second = (float)  Math.pow(x,y);

       emi = ((loan * rate *first) /(second));
        txtemi.setText(emi+"");


    }
}
