package com.example.yuricesar.collective.data;

import java.util.*;

public class UserInfo{

    private String id;
    private String name;
    private String email;
    private String picture;

    private List<String> movies;
    private List<String> books;
    private List<String> games;
    private List<String> music;
    private List<String> tv;

    public UserInfo(String id, String name, String email, String picture){
        this.id = id;
        this.name = name;
        this.email = email;
        this.picture = picture;

    }

    public UserInfo(){}


    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getURLPicture(){
        return picture;
    }

    public List<String> getMovies(){
        if (movies == null){
            return new ArrayList<String>();
        }
        return movies;
    }

    public List<String> getBooks(){
        if (books == null){
            return new ArrayList<String>();
        }
        return books;
    }

    public List<String> getGames(){
        if (games == null){
            return new ArrayList<String>();
        }
        return games;
    }

    public List<String> getMusic(){
        if (music == null){
            return new ArrayList<String>();
        }
        return music;
    }

    public List<String> getTv(){
        if (tv == null){
            return new ArrayList<String>();
        }
        return tv;
    }

    public void setId(String id){ this.id = id; }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPicture(String picture){
        this.picture = picture;
    }

    public void addUserMovies(List<String> movies){
        this.movies = new ArrayList<String>(movies);
    }

    public void addUserGames(List<String> games){
        this.games = new ArrayList<String>(games);
    }

    public void addUserBooks(List<String> books){
        this.books = new ArrayList<String>(books);
    }

    public void addUserMusic(List<String> music){
        this.music = new ArrayList<String>(music);
    }

    public void addUserTv(List<String> tv){
        this.tv = new ArrayList<String>(tv);
    }


}
