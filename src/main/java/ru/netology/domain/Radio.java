package ru.netology.domain;

public class  Radio {
    private String name;
    private final int maxVolume=10;
    private final int minVolume=0;
    private int currentVolume;
    private final int stationNumberMax=9;
    private final int stationNumberMin=0;
    private int stationNumberCurrent;

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
        if(currentVolume>maxVolume){
            return;
        }
        if(currentVolume<minVolume){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void pressNextStation(){
        if(stationNumberCurrent==stationNumberMax){
            setStationNumberCurrent(stationNumberMin);
        }else{
            setStationNumberCurrent(++stationNumberCurrent);
        }
    }

    public void pressPrevStation(){
        if(stationNumberCurrent==stationNumberMin){
            setStationNumberCurrent(stationNumberMax);
        }else{
            setStationNumberCurrent(--stationNumberCurrent);
        }
    }

    public void pressPlusVolume(){
        setCurrentVolume(currentVolume++);
    }

    public void pressMinusVolume(){
        setCurrentVolume(currentVolume--);
    }


}

