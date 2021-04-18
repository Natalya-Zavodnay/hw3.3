package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.RadioTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    void pressNextStationTest() {
        Radio radio = new Radio("V", 8);
        radio.pressNextStation();
        assertEquals(9, radio.getStationNumberCurrent());
    }

    @Test
    void pressNextStationEqualStationNumberMinTest() {
        Radio radio = new Radio("V", 10);
        radio.pressNextStation();
        assertEquals(0, radio.getStationNumberCurrent());
    }

    @Test
    void pressPrevStationTest() {
        Radio radio = new Radio("V", 0);
        radio.pressPrevStation();
        assertEquals(10, radio.getStationNumberCurrent());
    }

    @Test
    void pressPrevStationEqualStationNumberMaxTest() {
        Radio radio = new Radio("V", 10);
        radio.pressPrevStation();
        assertEquals(9, radio.getStationNumberCurrent());
    }

    @Test
    void CurrentVolumeMaxTest() {
        Radio radio = new Radio();
        radio.CurrentVolume(100);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void pressPlusVolumeTest() {
        Radio radio = new Radio();
        radio.CurrentVolume(5);
        radio.pressPlusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void pressMinusVolumeTest() {
        Radio radio = new Radio();
        radio.CurrentVolume(99);
        radio.pressMinusVolume();
        assertEquals(98, radio.getCurrentVolume());
    }


    @Test
    void CurrentVolumeMinTest() {
        Radio radio = new Radio();
        radio.CurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }


}















