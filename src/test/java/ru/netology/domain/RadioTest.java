package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test


    void pressNextStationTest() {
        Radio radio=new Radio();
        radio.setStationNumberCurrent(8);
        radio.pressNextStation();
        assertEquals(9, radio.getStationNumberCurrent());
    }
    @Test


    void pressNextStationEqualStationNumberMinTest() {
        Radio radio=new Radio();
        radio.setStationNumberCurrent(9);
        radio.pressNextStation();
        assertEquals(0, radio.getStationNumberCurrent());
    }

    @Test
    void pressPrevStationTest() {
        Radio radio=new Radio();
        radio.setStationNumberCurrent(0);
        radio.pressPrevStation();
        assertEquals(9, radio.getStationNumberCurrent());
    }
    @Test
    void pressPrevStationEqualStationNumberMaxTest() {
        Radio radio=new Radio();
        radio.setStationNumberCurrent(9);
        radio.pressPrevStation();
        assertEquals(8, radio.getStationNumberCurrent());
    }
    @Test
    void pressPlusVolumeMoreMaxTest() {
        Radio radio=new Radio();
        radio.setCurrentVolume(10);
        radio.pressPlusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    void pressPlusVolumeLessMinTest() {
        Radio radio=new Radio();
        radio.setCurrentVolume(0);
        radio.pressPlusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void pressMinusVolumeTest() {
        Radio radio=new Radio();
        radio.setCurrentVolume(0);
        radio.pressMinusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void setCurrentVolumeMoreMaxTest(){
        Radio radio=new Radio();
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void setCurrentVolumeLessMinTest(){
        Radio radio=new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}















