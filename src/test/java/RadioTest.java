import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setNextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNext(6);
        int expected = 7;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setOverNextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNext(9);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationPrev(8);
        int expected = 7;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setOverPrevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationPrev(0);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentMinMaxRadioStation(0);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentMinMaxRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentMinMaxRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationNormal() {
        Radio rad = new Radio();
        rad.setCurrentMinMaxRadioStation(4);
        int expected = 4;
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
    public void setCurrentVolumeAddMax() {
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
    public void setCurrentVolumeReduceMin() {
        Radio rad = new Radio();
        rad.setCurrentVolumeReduce(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}