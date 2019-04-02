import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;


    @Before
    public void before(){
        radio = new Radio(0,false,"Radio 1");
    }

    @Test
    public void checkVolumeExists(){
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void crankTheVolume(){
        radio.setVolume(5);
        assertEquals(5, radio.getVolume());
    }

    @Test
    public void turnItDown(){
        radio.setVolume(25);
        radio.setVolume(10);
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void canTurnOn(){
        radio.setToOn();
        assertEquals(true,radio.state());
    }

    @Test
    public void canTurnOff(){
        radio.setToOn();
        radio.setToOff();
        assertEquals(false,radio.state());
    }

    @Test
    public void findStation(){
        assertEquals("Radio 1",radio.getTune());
    }

    @Test
    public void changeStation(){
        radio.setTune("Radio 4");
        assertEquals("Radio 4", radio.getTune());

    }


}
