package com.example.animebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    ArrayList<Anime3> AnimeArraylist3 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView home = findViewById(R.id.homelist);
        ImageView popular = findViewById(R.id.popularAnime);
        ImageView NewAnime = findViewById(R.id.NewAnime);


        popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this,MainActivity3.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity4.this,MainActivity2.class);
                startActivity(intent2);
            }
        });

        Anime3 anime1 = new Anime3("SPY×FAMILY",R.drawable.spy,"Anime Episodes: "+12,"Episodes duration : "+24,"A spy on an undercover mission gets married and adopts a child as part of his cover. His wife and daughter have secrets of their own, and all three must strive to keep together."," Category : Action, ,comedy","Rate : " +8.6,R.drawable.star,"Status: ongoing");
        Anime3 anime2 = new Anime3("Ao Ashi",R.drawable.as,"Anime Episodes: "+24,"Episodes duration: "+24,"Ashito Aoi, who lives in Ehime prefecture. Ashito has a strong talent in soccer, but he tries to hide it. Due to his very straightforward personality, he causes a disaster that serves as a huge setback for him","Category : Animation, Action, Adventure","Rate :" +8.8,R.drawable.star,"Status: ongoing");
        Anime3 anime3 = new Anime3("Shikimori's Not Just a Cutie",R.drawable.sh,"Anime Episodes: "+12,"Episodes duration: "+24,"Shikimori seems like the perfect girlfriend. But she has a cool dark side that comes out under the right circumstances. And her boyfriend Izumi loves to be around when that happens.","Category : Animation, Action, Adventure,Drama","Rate : " +6.8,R.drawable.star,"Status: Finished");
        Anime3 anime4 = new Anime3("Yofukashi no Uta",R.drawable.yo," Anime Episodes: "+12,"Episodes duration: "+24,"Ko, a restless human boy, walks around at night. One night he meets Nanakusa, a vampire girl, and falls in love with her.","comedy,Vampire, fantasy,Romance","Rate: " +7.8,R.drawable.star,"Status: ongoing");
        Anime3 anime5 = new Anime3("Shikkakumon no Saikyou Kenja",R.drawable.my,"Anime Episodes: "+12,"Episodes duration: "+24,"His strength limited by the magical crest with which he was born, Mathias, the world's most powerful sage, decides reincarnation is necessary to become the strongest of all. ","Category : Animation, fantasy, Adventure,Action","Rate: " +6.2,R.drawable.star,"Status: Finished");
        Anime3 anime6 = new Anime3("Sono Bisque Doll wa Koi wo Suru",R.drawable.so," Anime Episodes: "+12,"Episodes duration : "+24,"Traumatized by a childhood incident with a friend who took exception to his love of traditional dolls, doll-artisan hopeful Wakana Gojou passes his days as a loner, finding solace in a room at his high school.","Category : Romance,Slice of Life,romance,comedy","Rate: " +8.1,R.drawable.star,"Status: Finished");
        Anime3 anime7 = new Anime3("The Greatest Demon Lord Is Reborn",R.drawable.de," Anime Episodes: "+12,"Episodes duration : "+24,"As the most powerful entity of all time, the Demon Lord Varvatos thinks life is a big fat snore. When he takes matters into his own hands and decides to reincarnate, he calibrates his magical strength to be perfectly average.","Category : Adventure, School, Action, Fantasy","Rate: " +6.1,R.drawable.star,"Status: Finished");
        Anime3 anime8 = new Anime3("I'm Quitting Heroing",R.drawable.im," Anime Episodes: "+12,"Episodes duration : "+24,"A hero saves the world from an invading demon army. But when he is feared and alienated for his work, he can only get employment from the same army he fought.","Category : Action,comedy,fantasy,Adventure","Rate: " +6.8,R.drawable.star,"Status: Finished");
        Anime3 anime9 = new Anime3("Komi-san wa, Komyushou Desu.",R.drawable.ko," Anime Episodes: "+24,"Episodes duration : "+24,"An elite and aloof schoolgirl is in fact severely withdrawn and anxious about communicating with others. An ordinary schoolboy befriends her and helps her to open up and talk with people.","Category : drama,Comedy,Romantic,School","Rate: " +8.0,R.drawable.star,"Status: Finished");
        Anime3 anime10 = new Anime3("The Last Summoner",R.drawable.la," Anime Episodes: "+12,"Episodes duration : "+24,"A talented young cook's encounter with a hungry girl who popped up in his kitchen changes his ordinary life forever. Dora, a summoned spirit and a truly cute goddess, now calls him master. However, he is not interested at all and tries everything he could to get away from the ghostly figure.","Category : Animation, Action, Adventure, Drama, Fantasy","Rate: " +7.3,R.drawable.star,"Status: Finished");


        AnimeArraylist3.add(anime1);
        AnimeArraylist3.add(anime2);
        AnimeArraylist3.add(anime3);
        AnimeArraylist3.add(anime4);
        AnimeArraylist3.add(anime5);
        AnimeArraylist3.add(anime6);
        AnimeArraylist3.add(anime7);
        AnimeArraylist3.add(anime8);
        AnimeArraylist3.add(anime9);
        AnimeArraylist3.add(anime10);

AnimeAdapter3 animeAdapter3 = new AnimeAdapter3(this,0,AnimeArraylist3);
        ListView listView = findViewById(R.id.listview3);
        listView.setAdapter(animeAdapter3);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Anime3 currentsanime3 = AnimeArraylist3.get(i);
                Intent intent = new Intent(MainActivity4.this, Details2.class);
                intent.putExtra("Anime3",currentsanime3);
                startActivity(intent);





            }
        });
    }
}





