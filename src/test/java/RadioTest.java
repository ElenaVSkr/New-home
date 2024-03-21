import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setCurrentRadioStationN() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNext(6);
        int expected = 7;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationN9() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNext(9);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationP() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationPrev(8);
        int expected = 7;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationP0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationPrev(0);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeAdd() {
        Radio rad = new Radio();
        rad.setCurrentVolumeAdd(6);
        int expected = 7;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeAddM() {
        Radio rad = new Radio();
        rad.setCurrentVolumeAdd(101);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeReduce() {
        Radio rad = new Radio();
        rad.setCurrentVolumeReduce(8);
        int expected = 7;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeReduceM() {
        Radio rad = new Radio();
        rad.setCurrentVolumeReduce(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}