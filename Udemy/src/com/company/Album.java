package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

/*    private Song findSong(String title){
        for(int i=0;i<songs.size(); i++){
           Song checkedSong = this.songs.get(i);
           if(checkedSong.getTitle().equals(title));
           return checkedSong;
        }
        return null;
    }*/

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        System.out.println("You can't add twice " + title + " it's already in list.");
        return false;
    }


    private Song findSong(String title) {
        for (Song checkedSong : this.songs) { //alternatywa na findSong skomentowany z funkcja for itd..
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public void printSongs() {
        for (Song printSongs : this.songs) {
            System.out.println(printSongs);
        }
    }


    //Two ways of adding songs:

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("THis album does not have a truck" + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }


}
