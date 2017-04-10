package com.kpi.lab5;

/**
 * Created by vlad on 02.04.17.
 */
public abstract class Date implements Cloneable {

    private String hour;
    private String minute;
    private String second;
    private String daytime;

    public Date(String hour, String minute, String second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
