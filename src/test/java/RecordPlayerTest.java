import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {

    RecordPlayer recordPlayer;

    @Before
    public void before(){
        recordPlayer = new RecordPlayer(0, false, 45);
    }

    @Test
    public void checkVolumeExists(){
        assertEquals(0, recordPlayer.getVolume());
    }

    @Test
    public void crankTheVolume(){
        recordPlayer.setVolume(5);
        assertEquals(5, recordPlayer.getVolume());
    }

    @Test
    public void turnItDown(){
        recordPlayer.setVolume(25);
        recordPlayer.setVolume(10);
        assertEquals(10, recordPlayer.getVolume());
    }

    @Test
    public void canTurnOn(){
        recordPlayer.setToOn();
        assertEquals(true,recordPlayer.state());
    }

    @Test
    public void canTurnOff(){
        recordPlayer.setToOn();
        recordPlayer.setToOff();
        assertEquals(false,recordPlayer.state());
    }

    @Test
    public void checkSpeed(){
        assertEquals(45,recordPlayer.getSpeed());
    }

    @Test
    public void changeSpeed(){
        recordPlayer.setSpeed(35);
        assertEquals(35,recordPlayer.getSpeed());
    }
}
