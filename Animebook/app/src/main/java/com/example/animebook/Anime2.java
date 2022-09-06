package com.example.animebook;

import java.io.Serializable;

public class Anime2 implements Serializable {
    private String animeName2;
    private int animeImg2;
    private String animeEpisodes2;
    private String Episodesdertion2;
    private String theStory2;
    private String category2;
    private String Rate2;
    private int StarsIMG2;
    private String Status;

    public Anime2(String animeName2, int animeImg2, String animeEpisodes2, String episodesdertion2, String theStory2, String category2, String rate2, int starsIMG2, String status) {
        this.animeName2 = animeName2;
        this.animeImg2 = animeImg2;
        this.animeEpisodes2 = animeEpisodes2;
        Episodesdertion2 = episodesdertion2;
        this.theStory2 = theStory2;
        this.category2 = category2;
        Rate2 = rate2;
        StarsIMG2 = starsIMG2;
        Status = status;
    }

    public String getAnimeName2() {
        return animeName2;
    }

    public void setAnimeName2(String animeName2) {
        this.animeName2 = animeName2;
    }

    public int getAnimeImg2() {
        return animeImg2;
    }

    public void setAnimeImg2(int animeImg2) {
        this.animeImg2 = animeImg2;
    }

    public String getAnimeEpisodes2() {
        return animeEpisodes2;
    }

    public void setAnimeEpisodes2(String animeEpisodes2) {
        this.animeEpisodes2 = animeEpisodes2;
    }

    public String getEpisodesdertion2() {
        return Episodesdertion2;
    }

    public void setEpisodesdertion2(String episodesdertion2) {
        Episodesdertion2 = episodesdertion2;
    }

    public String getTheStory2() {
        return theStory2;
    }

    public void setTheStory2(String theStory2) {
        this.theStory2 = theStory2;
    }

    public String getCategory2() {
        return category2;
    }

    public void setCategory2(String category2) {
        this.category2 = category2;
    }

    public String getRate2() {
        return Rate2;
    }

    public void setRate2(String rate2) {
        Rate2 = rate2;
    }

    public int getStarsIMG2() {
        return StarsIMG2;
    }

    public void setStarsIMG2(int starsIMG2) {
        StarsIMG2 = starsIMG2;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}





