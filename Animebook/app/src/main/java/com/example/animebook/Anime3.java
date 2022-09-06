package com.example.animebook;

import java.io.Serializable;

public class Anime3 implements Serializable {
    private String animeName3;
    private int animeImg3;
    private String animeEpisodes3;
    private String Episodesdertion3;
    private String theStory3;
    private String category3;
    private String Rate3;
    private int StarsIMG3;
    private String status3;

    public Anime3(String animeName3, int animeImg3, String animeEpisodes3, String episodesdertion3, String theStory3, String category3, String rate3, int starsIMG3, String status3) {
        this.animeName3 = animeName3;
        this.animeImg3 = animeImg3;
        this.animeEpisodes3 = animeEpisodes3;
        Episodesdertion3 = episodesdertion3;
        this.theStory3 = theStory3;
        this.category3 = category3;
        Rate3 = rate3;
        StarsIMG3 = starsIMG3;
        this.status3 = status3;
    }

    public String getAnimeName3() {
        return animeName3;
    }

    public void setAnimeName3(String animeName3) {
        this.animeName3 = animeName3;
    }

    public int getAnimeImg3() {
        return animeImg3;
    }

    public void setAnimeImg3(int animeImg3) {
        this.animeImg3 = animeImg3;
    }

    public String getAnimeEpisodes3() {
        return animeEpisodes3;
    }

    public void setAnimeEpisodes3(String animeEpisodes3) {
        this.animeEpisodes3 = animeEpisodes3;
    }

    public String getEpisodesdertion3() {
        return Episodesdertion3;
    }

    public void setEpisodesdertion3(String episodesdertion3) {
        Episodesdertion3 = episodesdertion3;
    }

    public String getTheStory3() {
        return theStory3;
    }

    public void setTheStory3(String theStory3) {
        this.theStory3 = theStory3;
    }

    public String getCategory3() {
        return category3;
    }

    public void setCategory3(String category3) {
        this.category3 = category3;
    }

    public String getRate3() {
        return Rate3;
    }

    public void setRate3(String rate3) {
        Rate3 = rate3;
    }

    public int getStarsIMG3() {
        return StarsIMG3;
    }

    public void setStarsIMG3(int starsIMG3) {
        StarsIMG3 = starsIMG3;
    }

    public String getStatus3() {
        return status3;
    }

    public void setStatus3(String status3) {
        this.status3 = status3;
    }
}