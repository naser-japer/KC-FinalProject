package com.example.animebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AnimeAdapter3 extends ArrayAdapter{
    List<Anime3> AnimeList3;
    public AnimeAdapter3(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        AnimeList3 = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view2 = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        Anime3 currenAnime3 = AnimeList3.get(position);
        ImageView AnimeImg = view2.findViewById(R.id.imageView2);
        TextView animeName = view2.findViewById(R.id.textView7);
        TextView animeEp = view2.findViewById(R.id.textView8);


        AnimeImg.setImageResource(currenAnime3.getAnimeImg3());
        animeName.setText(currenAnime3.getAnimeName3());
        animeEp.setText(currenAnime3.getAnimeEpisodes3());
        return view2;

    }
}
