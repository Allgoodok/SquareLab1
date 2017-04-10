package com.kpi.lab4;

/**
 * Created by vlad on 25.03.17.
 */
public class MDate implements Cloneable {

    private String hour;
    private String minute;
    private String second;
    private String daytime;

    public MDate(String hour, String minute, String second, String daytime) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.daytime = daytime;
    }

    public MDate(String hour, String minute, String second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.daytime = "empty";

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

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!MDate.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final MDate other = (MDate) obj;
        if ((this.hour == null) ? (other.hour != null) : !this.hour.equals(other.hour)) {
            return false;
        }
        if (this.minute != other.minute) {
            return false;
        }
        if (this.second != other.second) {
            return false;
        }
        if (this.daytime != other.daytime) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.hour != null ? this.hour.hashCode() : 0);
        hash = 53 * hash + Integer.parseInt(this.minute);
        return hash;
    }

    @Override
    public String toString() {
        if (!(this.daytime.equals("empty"))) {
            return this.hour + ":" + this.minute + ":" + this.second + " " + this.daytime;
        } else {
            return this.hour + ":" + this.minute + ":" + this.second;
        }
    }

}
