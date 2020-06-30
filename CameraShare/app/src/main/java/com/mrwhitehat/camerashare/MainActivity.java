package com.mrwhitehat.camerashare;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final int pic_id = 123;

    Button launchcamera;
    ImageView cameraview;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        MainActivity prevActivity = (MainActivity) getLastNonConfigurationInstance();

        if(prevActivity!= null) {
            this.bitmap = prevActivity.bitmap;
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launchcamera = (Button) findViewById(R.id.launchcamera);
        cameraview = (ImageView) findViewById(R.id.cameraview);

        launchcamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camera_int = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camera_int, pic_id);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == pic_id) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");

            cameraview.setImageBitmap(photo);
        }
    }
}