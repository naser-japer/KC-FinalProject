package com.example.animebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AnimeAdaper2 extends AnimeAdapter{
    List<Anime2> AnimeList2;
    public AnimeAdaper2(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        AnimeList2 = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view4 = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        Anime2 currenAnime4 = AnimeList2.get(position);
        ImageView AnimeImg = view4.findViewById(R.id.imageView2);
        TextView animeName = view4.findViewById(R.id.textView7);
        TextView animeEp = view4.findViewById(R.id.textView8);


        AnimeImg.setImageResource(currenAnime4.getAnimeImg2());
        animeName.setText(currenAnime4.getAnimeName2());
        animeEp.setText(currenAnime4.getAnimeEpisodes2());
        return view4;

    }
}
