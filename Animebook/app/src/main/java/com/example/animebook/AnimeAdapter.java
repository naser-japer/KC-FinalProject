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

public class AnimeAdapter extends ArrayAdapter {
    List<Anime> animeList;
    public AnimeAdapter(@NonNull Context context, int resource, @NonNull List objects) {
      super(context,resource,objects);
      animeList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view1 = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        Anime currentAnime2 = animeList.get(position);
        ImageView AnimeImg = view1.findViewById(R.id.imageView2);
        TextView animeName = view1.findViewById(R.id.textView7);
        TextView animeEp = view1.findViewById(R.id.textView8);


        AnimeImg.setImageResource(currentAnime2.getAnimeImg());
        animeName.setText(currentAnime2.getAnimeName());
        animeEp.setText(currentAnime2.getAnimeEpisodes());
      return view1;

    }
}
