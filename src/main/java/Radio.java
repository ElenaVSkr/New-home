public class Radio {
    private int currentRadioStation;
    private int currentVolume;


    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void Next() {
        if (currentRadioStation != 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void Prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void volumeAdd() {
        if (currentVolume != 100) {
            currentVolume++;
        }
    }

    public void volumeReduce() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }
}
















