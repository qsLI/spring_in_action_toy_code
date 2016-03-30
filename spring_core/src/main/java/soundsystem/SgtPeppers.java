package soundsystem;

/**
 * Created by KL on 2016/1/4.
 */


public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    public void playTrack(int trackId) {
        System.out.println("Playing " + title + " by " + artist + "Id" + trackId);
    }
}
