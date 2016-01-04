package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by KL on 2016/1/4.
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}


