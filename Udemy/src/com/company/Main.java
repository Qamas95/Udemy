package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer","Deep purple");
        album.addSong("Stormbringer",4.6);
        album.addSong("Love don't mean a thing",4.3);
        album.addSong("Holy man",5.6);
        album.addSong("Hold on",3.21);
        album.addSong("Lady can't do it right",6.23);
        album.addSong("High ball shooter",4.27);
        album.addSong("The gypsy",4.2);
        album.addSong("Soldier of fortune",3.13);
        albums.add(album);

        album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock",5.44);
        album.addSong("I put the finger on you",3.25);
        album.addSong("Let's go",3.45);
        album.addSong("Inject the venom",3.33);
        album.addSong("Snowballed",4.51);
        album.addSong("Evil walks",3.45);
        album.addSong("C.O.D",5.25);
        album.addSong("Breaking the rules",5.32);
        album.addSong("Night of the long knives",5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Lady can't do it right",playList);
        albums.get(0).addToPlayList("Holy man",playList);
        albums.get(0).addToPlayList("997",playList); //does not exist
        albums.get(0).addToPlayList(9,playList);
        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(24,playList); // there is no track 24

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
            if(playList.size() == 0){
                System.out.println("No songs in playlist");
                return;
            } else {
                System.out.println("Now playing " + listIterator.next().toString());
            }

            while (!quit){
                int action = scanner.nextInt();
                scanner.nextLine();

                switch (action) {
                    case 0:
                        System.out.println("Playlist complete");
                        break;
                    case 1:
                        if(!forward){
                            if(listIterator.hasNext()){
                                listIterator.next();
                            }
                            forward = true;
                        }
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing" + listIterator.next().toString());
                        } else {
                            System.out.println("We have reached the end of the playlist");
                            forward = false;
                        }
                        break;
                    case 2:
                        if(forward) {
                            if(listIterator.hasPrevious()){
                                listIterator.previous();
                            }
                            forward = false;
                        }
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                        } else {
                            System.out.println("We are at the start of the playlist");
                            forward = true;
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                       // printList(playList);
                        break;
                    case 5:
                    //    printMenu();
                        break;
                }

            }

    }





}