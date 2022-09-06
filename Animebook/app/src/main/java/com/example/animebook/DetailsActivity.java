package com.example.animebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.details);super.onCreate(savedInstanceState);


        Bundle bundle = getIntent().getExtras();
        Anime deliverAnime = (Anime) bundle.getSerializable("Anime");


        TextView Name = findViewById(R.id.AnimeNameText2);
        TextView category = findViewById(R.id.Category1);
        ImageView IMG = findViewById(R.id.photo);
        TextView AnimeEpisodes = findViewById(R.id.AnimeEpisodes1);
        TextView EpisodesDuration = findViewById(R.id.Episodesduration1);
        TextView Rate = findViewById(R.id.AnimeRate1);
        TextView TheStory = findViewById(R.id.TheStory1);
        ImageView star = findViewById(R.id.Starimg1);


        Name.setText(deliverAnime.getAnimeName());
        IMG.setImageResource(deliverAnime.getAnimeImg());
        AnimeEpisodes.setText(deliverAnime.getAnimeEpisodes());
        EpisodesDuration.setText(deliverAnime.getEpisodesdertion());
        category.setText(deliverAnime.getCategory());
        Rate.setText(deliverAnime.getRate());
        TheStory.setText(deliverAnime.getTheStory());
        star.setImageResource(deliverAnime.getStarsIMG());




    }
}