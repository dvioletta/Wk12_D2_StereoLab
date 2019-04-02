import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer(0,false);
    }

    @Test
    public void checkVolumeExists(){
        assertEquals(0, cdPlayer.getVolume());
    }

    @Test
    public void crankTheVolume(){
        cdPlayer.setVolume(5);
        assertEquals(5, cdPlayer.getVolume());
    }

    @Test
    public void turnItDown(){
        cdPlayer.setVolume(25);
        cdPlayer.setVolume(10);
        assertEquals(10, cdPlayer.getVolume());
    }

    @Test
    public void canTurnOn(){
        cdPlayer.setToOn();
        assertEquals(true,cdPlayer.state());
    }

    @Test
    public void canTurnOff(){
        cdPlayer.setToOn();
        cdPlayer.setToOff();
        assertEquals(false,cdPlayer.state());
    }

    @Test
    public void canAddCd(){
        cdPlayer.addCd("Sting fields of gold");
        assertEquals(1,cdPlayer.countCds());
    }

    @Test
    public void canRemoveCd(){
        cdPlayer.addCd("Sum41 All Killer No Filler");
        cdPlayer.addCd("Blue Blue");
        cdPlayer.addCd("Seal Kiss From A Rose");
        cdPlayer.eject();
        assertEquals(2,cdPlayer.countCds());
    }

}
