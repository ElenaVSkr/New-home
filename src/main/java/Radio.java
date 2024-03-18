public class Radio {
    public int currentRadioStation;
    public int currentVolume;


    public int setCurrentRadioStationNext() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
            return currentRadioStation;
        }
        return currentRadioStation;
    }

    public int setCurrentRadioStationPrev() {
        if (currentRadioStation > 0)
            currentRadioStation = currentRadioStation - 1;
        else {
            currentRadioStation = 9;
            return currentRadioStation;
        }
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolumeAdd() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int setCurrentVolumeReduce() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int setCurrentVolumeMax() {
        if (currentVolume >= 100) {
            currentVolume = getCurrentVolume();
        }
        return currentVolume = getCurrentVolume();
    }

    public int setCurrentVolumeMin() {
        if (currentVolume <= 0) {
            currentVolume = getCurrentVolume();
        }
        return currentVolume = getCurrentVolume();
    }
}















