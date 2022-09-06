package com.example.animebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.details2); super.onCreate(savedInstanceState);

        Bundle bundle2 = getIntent().getExtras();
        Anime2 deliverAnime2 = (Anime2) bundle2.getSerializable("Anime2");


        TextView name2 = findViewById(R.id.Name3);
        TextView Category2 = findViewById(R.id.category3);
        ImageView iMG2 = findViewById(R.id.imageView6);
        TextView Episodes2 = findViewById(R.id.Episodes3);
        TextView Episode2 = findViewById(R.id.EpisodesDuration3);
        TextView rate2 = findViewById(R.id.Rate3);
        TextView Story2 = findViewById(R.id.Story3);
        ImageView Star2 = findViewById(R.id.imageViews6);
        TextView Stats = findViewById(R.id.Status);


        name2.setText(deliverAnime2.getAnimeName2());
        iMG2.setImageResource(deliverAnime2.getAnimeImg2());
        Episodes2.setText(deliverAnime2.getAnimeEpisodes2());
        Episode2.setText(deliverAnime2.getEpisodesdertion2());
        Category2.setText(deliverAnime2.getCategory2());
        rate2.setText(deliverAnime2.getRate2());
        Story2.setText(deliverAnime2.getTheStory2());
        Star2.setImageResource(deliverAnime2.getStarsIMG2());
        Stats.setText(deliverAnime2.getStatus());





    }
}