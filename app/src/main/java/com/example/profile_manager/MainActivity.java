package com.example.profile_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button OpenInGoogleMaps;
    ImageView Avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OpenInGoogleMaps=(Button) findViewById(R.id.maps);

        OpenInGoogleMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                EditText teamAdress = (EditText) findViewById(R.id.ZipCode);
                Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q="+teamAdress.getText());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        Avatar= (ImageView) findViewById(R.id.imageView);
        Avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),avatarActivity.class);
                startActivityForResult(intent,0);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_CANCELED) return;
//Getting the Avatar Image we show to our users
        ImageView avatarImage = (ImageView) findViewById(R.id.imageView);
//Figuring out the correct image
        String drawableName = "ic_logo_00";
        switch (data.getIntExtra("imageID", R.id.imageView)) {
            case R.id.img3:
                drawableName = "ic_logo_00";
                break;
            case R.id.img2:
                drawableName = "ic_logo_01";
                break;
            case R.id.img1:
                drawableName = "ic_logo_02";
                break;
            case R.id.img6:
                drawableName = "ic_logo_03";
                break;
            case R.id.img5:
                drawableName = "ic_logo_04";
                break;
            case R.id.img4:
                drawableName = "ic_logo_05";
                break;
            default:
                drawableName = "ic_logo_00";
                break;
        }
        int resID = getResources().getIdentifier(drawableName, "drawable", getPackageName());
        avatarImage.setImageResource(resID);
    }


}
