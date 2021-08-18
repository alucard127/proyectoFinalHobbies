package com.company;

public class Music extends Hobbies {
    String typeMusic;
    String nameSinger;
    String nameSong;

    public Music(String typeMusic, String nameSinger, String nameSong) {
        this.typeMusic = typeMusic;
        this.nameSinger = nameSinger;
        this.nameSong = nameSong;
    }

    public Music(String nameHobbies, String typeMusic, String nameSinger, String nameSong) {
        super(nameHobbies);
        this.typeMusic = typeMusic;
        this.nameSinger = nameSinger;
        this.nameSong = nameSong;
    }

    public String getTypeMusic() {
        return typeMusic;
    }

    public String getNameSinger() {
        return nameSinger;
    }
    public String getNameSong(){
        return nameSong;
    }
    public String displayData(){
        return "the user is listening to the song : "+getTypeMusic()+ " the user is listening to the singer: "+getNameSinger()
                + " the user is listening the song :"+getNameSong();

    }
}

