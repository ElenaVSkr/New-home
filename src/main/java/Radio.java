public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStation;

    public Radio(int numStation) {
        maxStation = numStation - 1;

    }

    public Radio() {
        maxStation = 9;
    }

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
        if (newCurrentRadioStation > maxStation) {
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
        if (currentRadioStation != maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void Prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
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















