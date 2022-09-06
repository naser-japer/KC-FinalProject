package com.example.animebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
ArrayList<Anime> AnimeArraylist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView home = findViewById(R.id.homelist);
        ImageView popular = findViewById(R.id.popularAnime);
        ImageView NewAnime = findViewById(R.id.NewAnime);

        popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });

        NewAnime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent2);
            }
        });






        Anime anime1 = new Anime("Naruto Shippuden",R.drawable.naruto,"Anime Episodes: "+500,"Episodes duration : "+24,"Naruto Uzumaki, a mischievous adolescent ninja, struggles as he searches for recognition and dreams of becoming the Hokage, the village's leader and strongest ninja","Category : Animation, Action, Adventure,Drama","Rate : " +8.7,R.drawable.star);
    Anime anime2 = new Anime("One Piece",R.drawable.onepiec,"Anime Episodes: "+1000,"Episodes duration: "+24,"Follows the adventures of Monkey D. Luffy and his pirate crew in order to find the greatest treasure ever left by the legendary Pirate, Gold Roger. The famous mystery treasure named One Piece","Category : Animation, Action, Adventure","Rate :" +8.9,R.drawable.star);
    Anime anime3 = new Anime("Demon Slayer",R.drawable.demon,"Anime Episodes: "+26,"Episodes duration: "+24,"A family is attacked by demons and only two members survive - Tanjiro and his sister Nezuko, who is turning into a demon slowly. Tanjiro sets out to become a demon slayer to avenge his family and cure his sister","Category : Animation, Action, Adventure,Drama","Rate : " +8.7,R.drawable.star);
    Anime anime4 = new Anime("Dragon ball",R.drawable.dragon," Anime Episodes: "+360,"Episodes duration: "+24,"Son Gokû, a fighter with a monkey tail, goes on a quest with an assortment of odd characters in search of the Dragon Balls, a set of crystals that can give its bearer anything they desire","Category : Animation, Action, Adventure","Rate: " +8.8,R.drawable.star);
    Anime anime5 = new Anime("Assassen Classroom",R.drawable.bader,"Anime Episodes: "+24,"Episodes duration: "+24,"A powerful creature claims that within a year, Earth will be destroyed by him, but he offers mankind a chance by becoming a homeroom teacher where he teaches his students about how to kill him. An assassination classroom begins","Category : Animation, Action, Adventure","Rate: " +8.0,R.drawable.star);
    Anime anime6 = new Anime("Fairy Tail",R.drawable.tall," Anime Episodes: "+220,"Episodes duration : "+24,"Lucy, an aspiring Celestial Wizard, becomes a friend and ally to powerful wizards Natsu, Gray, and Erza, who are part of the infamous wizard guild, Fairy Tail","Category : Animation, Action, Adventure","Rate: " +7.9,R.drawable.star);
    Anime anime7 = new Anime("Bleach",R.drawable.ball," Anime Episodes: "+369,"Episodes duration : "+24,"High school student Ichigo Kurosaki, who has the ability to see ghosts, gains soul reaper powers from Rukia Kuchiki and sets out to save the world from Hollows.","Category : Animation, Action, Adventure,Drama","Rate: " +8.2,R.drawable.star);
    Anime anime8 = new Anime("Death Note",R.drawable.note," Anime Episodes: "+37,"Episodes duration : "+24,"An intelligent high school student goes on a secret crusade to eliminate criminals from the world after discovering a notebook capable of killing anyone whose name is written into it.","Animation, Action, crime,Drama","Rate: " +9.0,R.drawable.star);
    Anime anime9 = new Anime("Dr. Stone",R.drawable.stone," Anime Episodes: "+37,"Episodes duration : "+24,"Awakened into a world where humanity has been petrified, scientific genius Senku and his brawny friend Taiju use their skills to rebuild civilization."," Category : Adventure, Comedy, Sci-Fi","Rate: " +8.1,R.drawable.star);
    Anime anime10 = new Anime("Boruto Next Generations",R.drawable.boruto," Anime Episodes: "+265,"Episodes duration : "+24,"Son of Naruto Uzumaki, Boruto, follows his father's footsteps along with his friends to become great ninja. Throughout all their adventures, Boruto is determined to make his mark in the ninja world and live outside of his father's shadow.","Category : Animation, Action, Adventure,Drama","Rate: " +6.8,R.drawable.star);


    AnimeArraylist.add(anime1);
    AnimeArraylist.add(anime2);
    AnimeArraylist.add(anime3);
    AnimeArraylist.add(anime4);
   AnimeArraylist.add(anime5);
   AnimeArraylist.add(anime6);
   AnimeArraylist.add(anime7);
   AnimeArraylist.add(anime8);
   AnimeArraylist.add(anime9);
   AnimeArraylist.add(anime10);

        AnimeAdapter animeAdapter = new AnimeAdapter(this,0,AnimeArraylist);

ListView listView = findViewById(R.id.listview);
listView.setAdapter(animeAdapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Anime currentsanime2 = AnimeArraylist.get(i);
        Intent intent = new Intent(MainActivity2.this,DetailsActivity.class);
        intent.putExtra("Anime",currentsanime2);
        startActivity(intent);





    }
});
    }
}