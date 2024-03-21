public class Radio {
    private int currentRadioStation;
    private int currentVolume;


    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStationNext(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 9) {
            newCurrentRadioStation = newCurrentRadioStation + 1;
        } else {
            newCurrentRadioStation = 0;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentRadioStationPrev(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 0)
            newCurrentRadioStation = newCurrentRadioStation - 1;
        else {
            newCurrentRadioStation = 9;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentMinMaxRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolumeAdd(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            newCurrentVolume = newCurrentVolume + 1;
        } else {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentVolumeReduce(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            newCurrentVolume = newCurrentVolume - 1;
        } else {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }
}















