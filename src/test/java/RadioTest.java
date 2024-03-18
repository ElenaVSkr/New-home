import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setCurrentRadioStationNext() {
        Radio rad = new Radio();
        rad.currentRadioStation = 6;
        int expected = 7;
        int actual = rad.setCurrentRadioStationNext();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationNextMore() {
        Radio rad = new Radio();
        rad.currentRadioStation = 10;
        int expected = 0;
        int actual = rad.setCurrentRadioStationNext();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationPrev() {
        Radio rad = new Radio();
        rad.currentRadioStation = 8;
        int expected = 7;
        int actual = rad.setCurrentRadioStationPrev();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationPrevZero() {
        Radio rad = new Radio();
        rad.currentRadioStation = 0;
        int expected = 9;
        int actual = rad.setCurrentRadioStationPrev();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeAdd() {
        Radio rad = new Radio();
        rad.currentVolume = 20;
        int expected = 21;
        int actual = rad.setCurrentVolumeAdd();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeReduce() {
        Radio rad = new Radio();
        rad.currentVolume = 20;
        int expected = 19;
        int actual = rad.setCurrentVolumeReduce();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeMax() {
        Radio rad = new Radio();
        rad.currentVolume = 100;
        int expected = rad.setCurrentVolumeMax();
        int actual = rad.setCurrentVolumeMax();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeMin() {
        Radio rad = new Radio();
        rad.currentVolume = 0;
        int expected = rad.setCurrentVolumeMin();
        int actual = rad.setCurrentVolumeMin();
        Assertions.assertEquals(expected, actual);
    }
}