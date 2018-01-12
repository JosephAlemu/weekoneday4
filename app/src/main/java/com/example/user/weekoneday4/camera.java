package com.example.user.weekoneday4;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class camera extends AppCompatActivity {

    static final  int REQUEST_IMAGE_CAPTURE =0;
    ImageView imageView ;
    Button btntakeimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        btntakeimage= (Button) findViewById(R.id.btntakeimage);
        imageView= (ImageView) findViewById(R.id.imageView);
//
        if(!hasCamera())
            btntakeimage.setEnabled(false);
    }

    private boolean hasCamera() {

        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {


            Bitmap photo = (Bitmap) data.getExtras().get("data");

            imageView.setImageBitmap(photo);

    }

    public void lauchCamera(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        startActivityForResult(intent,REQUEST_IMAGE_CAPTURE);
    }
}
