package ru.netology.domain;

public class Radio {
    private String name;
    private final int maxVolume = 100;
    private final int minVolume = 0;
    private int currentVolume;
    private final int stationNumberMax = 10;
    private final int stationNumberMin = 0;
    private int stationNumberCurrent;

//  constructor volume

    public Radio(int currentVolume, String name) {
        this.currentVolume = currentVolume;
        this.name = name;

    }

//    constructor station

    public Radio(String name, int stationNumberCurrent) {
        this.name = name;
        this.stationNumberCurrent = stationNumberCurrent;
    }

    public int getStationNumberCurrent() {
        return stationNumberCurrent;
    }

    public void setStationNumberCurrent(int stationNumberCurrent) {

        this.stationNumberCurrent = stationNumberCurrent;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            return;
        }
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public void pressPlusVolume() {

        setCurrentVolume(currentVolume + 1);
    }

    public void pressMinusVolume() {

        setCurrentVolume(currentVolume - 1);
    }

    public void pressNextStation() {
        if (stationNumberCurrent == stationNumberMax) {
            setStationNumberCurrent(stationNumberMin);
        } else {
            setStationNumberCurrent(stationNumberCurrent + 1);
        }
    }

    public void pressPrevStation() {
        if (stationNumberCurrent == stationNumberMin) {
            setStationNumberCurrent(stationNumberMax);
        } else {
            setStationNumberCurrent(stationNumberCurrent - 1);
        }
    }


}

