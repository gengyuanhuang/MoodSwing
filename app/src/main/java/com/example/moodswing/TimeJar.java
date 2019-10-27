package com.example.moodswing;

/**
 * This class creates an Time object
 *      int hr
 *      int min
 */
public class TimeJar {
    private int hr;
    private int min;

    public TimeJar(int hr, int min) {
        this.setTime(hr, min);
    }

    public int getHr() {
        return hr;
    }

    public int getMin() {
        return min;
    }

    // ignore individual setters for now

    public void setTime(int hr, int min) {
        this.hr = hr;
        this.min = min;
    }

}