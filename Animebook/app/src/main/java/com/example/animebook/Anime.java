package com.example.animebook;

import java.io.Serializable;

public class Anime implements Serializable {
    private String animeName;
    private int animeImg;
    private String animeEpisodes;
    private String Episodesdertion;
    private String theStory;
    private String category;
    private String Rate;
    private int StarsIMG;

    public Anime(String animeName, int animeImg, String animeEpisodes, String episodesdertion, String theStory, String category, String rate, int starsIMG) {
        this.animeName = animeName;
        this.animeImg = animeImg;
        this.animeEpisodes = animeEpisodes;
        Episodesdertion = episodesdertion;
        this.theStory = theStory;
        this.category = category;
        Rate = rate;
        StarsIMG = starsIMG;
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public int getAnimeImg() {
        return animeImg;
    }

    public void setAnimeImg(int animeImg) {
        this.animeImg = animeImg;
    }

    public String getAnimeEpisodes() {
        return animeEpisodes;
    }

    public void setAnimeEpisodes(String animeEpisodes) {
        this.animeEpisodes = animeEpisodes;
    }

    public String getEpisodesdertion() {
        return Episodesdertion;
    }

    public void setEpisodesdertion(String episodesdertion) {
        Episodesdertion = episodesdertion;
    }

    public String getTheStory() {
        return theStory;
    }

    public void setTheStory(String theStory) {
        this.theStory = theStory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRate() {
        return Rate;
    }

    public void setRate(String rate) {
        Rate = rate;
    }

    public int getStarsIMG() {
        return StarsIMG;
    }

    public void setStarsIMG(int starsIMG) {
        StarsIMG = starsIMG;
    }
}





