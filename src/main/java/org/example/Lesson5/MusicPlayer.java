package org.example.Lesson5;

public class MusicPlayer {
    private Music music;

    //Инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
