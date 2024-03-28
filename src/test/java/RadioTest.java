import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void setRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStation(2);
        int expected = 2;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationLess() {
        Radio rad = new Radio();
        rad.setRadioStation(-2);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationMore() {
        Radio rad = new Radio();
        rad.setRadioStation(101);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);
        int expected = 3;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeLess() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeMore() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Next() {
        Radio rad = new Radio();
        rad.setRadioStation(7);
        rad.Next();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderNext() {
        Radio rad = new Radio();
        rad.setRadioStation(9);
        rad.Next();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Prev() {
        Radio rad = new Radio();
        rad.setRadioStation(8);
        rad.Prev();

        int expected = 7;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderPrev() {
        Radio rad = new Radio();
        rad.setRadioStation(0);
        rad.Prev();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeAdd() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.volumeAdd();

        int expected = 8;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeOneHundred() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.volumeAdd();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeReduce() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.volumeReduce();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.volumeReduce();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}