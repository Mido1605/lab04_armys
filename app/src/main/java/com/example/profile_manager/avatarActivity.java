package com.example.profile_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class avatarActivity extends AppCompatActivity {
    ImageButton avatar1,avatar2,avatar3,avatar4,avatar5,avatar6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);
        avatar1= (ImageButton) findViewById(R.id.img1);
        avatar2= (ImageButton) findViewById(R.id.img2);
        avatar3= (ImageButton) findViewById(R.id.img3);
        avatar4= (ImageButton) findViewById(R.id.img4);
        avatar5= (ImageButton) findViewById(R.id.img5);
        avatar6= (ImageButton) findViewById(R.id.img6);



        avatar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retournIntent = new Intent();
                ImageView selectedImage = (ImageView) v;
                retournIntent.putExtra("imageID",selectedImage.getId());
                setResult(RESULT_OK,retournIntent);
                finish();
            }
        });

        avatar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retournIntent = new Intent();
                ImageView selectedImage = (ImageView) v;
                retournIntent.putExtra("imageID",selectedImage.getId());
                setResult(RESULT_OK,retournIntent);
                finish();
            }
        });

        avatar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retournIntent = new Intent();
                ImageView selectedImage = (ImageView) v;
                retournIntent.putExtra("imageID",selectedImage.getId());
                setResult(RESULT_OK,retournIntent);
                finish();
            }
        });

        avatar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retournIntent = new Intent();
                ImageView selectedImage = (ImageView) v;
                retournIntent.putExtra("imageID",selectedImage.getId());
                setResult(RESULT_OK,retournIntent);
                finish();
            }
        });

        avatar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retournIntent = new Intent();
                ImageView selectedImage = (ImageView) v;
                retournIntent.putExtra("imageID",selectedImage.getId());
                setResult(RESULT_OK,retournIntent);
                finish();
            }
        });

        avatar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retournIntent = new Intent();
                ImageView selectedImage = (ImageView) v;
                retournIntent.putExtra("imageID",selectedImage.getId());
                setResult(RESULT_OK,retournIntent);
                finish();
            }
        });


    }
}