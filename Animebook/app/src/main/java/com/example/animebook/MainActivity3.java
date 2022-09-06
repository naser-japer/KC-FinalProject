package com.example.animebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    ArrayList<Anime2> AnimeArraylist2 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView home = findViewById(R.id.homelist);
        ImageView popular = findViewById(R.id.popularAnime);
        ImageView NewAnime = findViewById(R.id.NewAnime);


        NewAnime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent2);
            }
        });

        Anime2 anime1 = new Anime2("Fullmetal Alchemist",R.drawable.ca,"Anime Episodes: "+64,"Episodes duration : "+24,"Two brothers search for a Philosopher's Stone after an attempt to revive their deceased mother goes awry and leaves them in damaged physical forms."," Category : Action, Adventure, Drama, Fantasy","Rate : " +9.1,R.drawable.star,"Status: Finished");
        Anime2 anime2 = new Anime2("Kaguya-sama: Love is War",R.drawable.kl,"Anime Episodes: "+12,"Episodes duration: "+24,"The proudly privileged top two students of an elite school each makes it their mission to be the first to extract a confession of love from the othere.","Category : Psychological, Romantic,comedy, School","Rate :" +8.7,R.drawable.star,"Status: ongoing");
        Anime2 anime3 = new Anime2("Demon Slayer",R.drawable.demon,"Anime Episodes: "+26,"Episodes duration: "+24,"A family is attacked by demons and only two members survive - Tanjiro and his sister Nezuko, who is turning into a demon slowly. Tanjiro sets out to become a demon slayer to avenge his family and cure his sister","Category : Animation, Action, Adventure,Drama","Rate : " +8.7,R.drawable.star,"Status: Finished");
        Anime2 anime4 = new Anime2("Dragon ball",R.drawable.dragon," Anime Episodes: "+360,"Episodes duration: "+24,"Son Gokû, a fighter with a monkey tail, goes on a quest with an assortment of odd characters in search of the Dragon Balls, a set of crystals that can give its bearer anything they desire","Category : Animation, Action, Adventure","Rate: " +8.8,R.drawable.star,"Status: Finished");
        Anime2 anime5 = new Anime2("Hajime no Ippo",R.drawable.hni,"Anime Episodes: "+75,"Episodes duration: "+24,"Ippo, a teenage boy with a pure heart and unrelenting determination, discovers a passion for boxing after veteran fighter Takamura saves him from bullies."," Category : Sports, Action, Sport,comedy","Rate: " +8.6,R.drawable.star,"Status: ongoing");
        Anime2 anime6 = new Anime2("One Piece",R.drawable.onepiec,"Anime Episodes: "+1000,"Episodes duration: "+24,"Follows the adventures of Monkey D. Luffy and his pirate crew in order to find the greatest treasure ever left by the legendary Pirate, Gold Roger. The famous mystery treasure named One Piece","Category : Animation, Action, Adventure","Rate :" +8.9,R.drawable.star,"Status: Finished");
        Anime2 anime7 = new Anime2("Bleach",R.drawable.ball," Anime Episodes: "+369,"Episodes duration : "+24,"High school student Ichigo Kurosaki, who has the ability to see ghosts, gains soul reaper powers from Rukia Kuchiki and sets out to save the world from Hollows.","Category : Animation, Action, Adventure,Drama","Rate: " +8.2,R.drawable.star,"Status: Finished");
        Anime2 anime8 = new Anime2("Death Note",R.drawable.note," Anime Episodes: "+37,"Episodes duration : "+24,"An intelligent high school student goes on a secret crusade to eliminate criminals from the world after discovering a notebook capable of killing anyone whose name is written into it.","Category : crime, Action, ,Drama, Psychological  ","Rate: " +9.0,R.drawable.star,"Status: ongoing");
        Anime2 anime9 = new Anime2("Attack on Titan",R.drawable.an," Anime Episodes: "+97,"Episodes duration : "+24,"After his hometown is destroyed and his mother is killed, young Eren Jaeger vows to cleanse the earth of the giant humanoid Titans that have brought humanity to the brink of extinction."," Category : Adventure, Action, ,Drama, Military, Survival","Rate: " +8.1,R.drawable.star,"Status: finished");
        Anime2 anime10 = new Anime2("Naruto Shippuden",R.drawable.naruto,"Anime Episodes: "+500,"Episodes duration : "+24,"Naruto Uzumaki, a mischievous adolescent ninja, struggles as he searches for recognition and dreams of becoming the Hokage, the village's leader and strongest ninja","Category : Animation, Action, Adventure,Drama, Fantasy","Rate : " +8.7,R.drawable.star,"Status: Finished");


        AnimeArraylist2.add(anime1);
        AnimeArraylist2.add(anime2);
        AnimeArraylist2.add(anime3);
        AnimeArraylist2.add(anime4);
        AnimeArraylist2.add(anime5);
        AnimeArraylist2.add(anime6);
        AnimeArraylist2.add(anime7);
        AnimeArraylist2.add(anime8);
        AnimeArraylist2.add(anime9);
        AnimeArraylist2.add(anime10);

        AnimeAdaper2 animeAdaper2 = new AnimeAdaper2(this,0,AnimeArraylist2);

        ListView listView2 = findViewById(R.id.listview2);
        listView2.setAdapter(animeAdaper2);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Anime2 currentsanime4 = AnimeArraylist2.get(i);
                Intent intent3 = new Intent(MainActivity3.this,DetailsActivity2.class);
                intent3.putExtra("Anime2",currentsanime4);
                startActivity(intent3);




            }
        });
    }
}