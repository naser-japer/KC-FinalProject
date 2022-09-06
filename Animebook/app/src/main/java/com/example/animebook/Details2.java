package com.example.animebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.details1);super.onCreate(savedInstanceState);

        Bundle bundle3 = getIntent().getExtras();
        Anime3 deliverAnime3 = (Anime3) bundle3.getSerializable("Anime3");


        TextView name3 = findViewById(R.id.Boruto);
        TextView Category3 = findViewById(R.id.greng);
        ImageView iMG3 = findViewById(R.id.photo);
        TextView Episodes3 = findViewById(R.id.epesod);
        TextView Episode3 = findViewById(R.id.duration);
        TextView rate3 = findViewById(R.id.rate);
        TextView Story3 = findViewById(R.id.store);
        ImageView Star3 = findViewById(R.id.str);
        TextView Stats3 = findViewById(R.id.ongoing);


        name3.setText(deliverAnime3.getAnimeName3());
        iMG3.setImageResource(deliverAnime3.getAnimeImg3());
        Episodes3.setText(deliverAnime3.getAnimeEpisodes3());
        Episode3.setText(deliverAnime3.getEpisodesdertion3());
        Category3.setText(deliverAnime3.getCategory3());
        rate3.setText(deliverAnime3.getRate3());
        Story3.setText(deliverAnime3.getTheStory3());
        Star3.setImageResource(deliverAnime3.getStarsIMG3());
        Stats3.setText(deliverAnime3.getStatus3());








    }
}