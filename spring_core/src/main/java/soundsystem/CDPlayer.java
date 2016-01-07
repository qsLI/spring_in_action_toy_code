package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KL on 2016/1/4.
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired // work on constructor
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    @Autowired // work on setter
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired(required = false)//also fine; to avoid no matching exception just set required to false
    public void insertDisc(CompactDisc cd) {
        this.cd = cd;
    }
}
