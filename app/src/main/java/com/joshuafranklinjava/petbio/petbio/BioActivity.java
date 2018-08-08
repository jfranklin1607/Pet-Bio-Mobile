package com.joshuafranklinjava.petbio.petbio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

  private ImageView petImageView;
  private TextView petName;
  private TextView petBio;
  private Bundle extras;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bio);

    petImageView = (ImageView)findViewById(R.id.petImageViewID);
    petName = (TextView)findViewById(R.id.nameID);
    petBio = (TextView)findViewById(R.id.bioTextID);

    extras = getIntent().getExtras();

    if (extras != null){
        String name = extras.getString("name");
        String bio =  extras.getString("bio");

        setUp(name, bio);
    }

  }
  public void setUp(String name, String bio){

//        We show dog stuff
    if (name.equals("Rocky")){
      petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_dog));
      petName.setText(name);
      petBio.setText(bio);
//        We show cat stuff
    }else if (name.equals("Jarvis")){
      petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_cat));
      petName.setText(name);
      petBio.setText(bio);
      }
  }
}
