package com.joshuafranklinjava.petbio.petbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

  private ImageView catView;
  private ImageView dogView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    catView = (ImageView)findViewById(R.id.catID);
    dogView = (ImageView)findViewById(R.id.dogID);

    catView.setOnClickListener(this);
    dogView.setOnClickListener(this);

  }

  @Override
  public void onClick(View view) {
    switch (view.getId()){
      case R.id.catID:
//        Go to second activity
        Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
        catIntent.putExtra("name", "Jarvis");
        catIntent.putExtra("bio", "Great cat. Loves people and meows a lot.");
        startActivity(catIntent);

//        Toast.makeText(MainActivity.this, "Cat", Toast.LENGTH_LONG).show();
        break;

      case R.id.dogID:
        Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
        dogIntent.putExtra("name", "Rocky");
        dogIntent.putExtra("bio", "Great dog. Loves to lick people and bark at other dogs");
        startActivity(dogIntent);
//        Toast.makeText(MainActivity.this, "Dog", Toast.LENGTH_LONG).show();
        break;
    }

  }
}
