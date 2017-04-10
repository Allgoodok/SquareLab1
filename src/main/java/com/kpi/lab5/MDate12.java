package com.kpi.lab5;

/**
 * Created by vlad on 25.03.17.
 */
public class MDate12 extends Date {

    private String daytime;

    public MDate12(String hour, String minute, String second, String daytime) {
        super(hour, minute, second);
        this.daytime=daytime;
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
        if (!MDate12.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final MDate12 other = (MDate12) obj;
        if ((this.getHour() == null) ? (other.getHour() != null) : !this.getHour().equals(other.getHour())) {
            return false;
        }
        if (this.getMinute() != other.getMinute()) {
            return false;
        }
        if (this.getSecond() != other.getSecond()) {
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
        hash = 53 * hash + (this.getHour() != null ? this.getHour().hashCode() : 0);
        hash = 53 * hash + Integer.parseInt(this.getMinute());
        return hash;
    }

    @Override
    public String toString() {
            return this.getHour() + ":" + this.getMinute() + ":" + this.getSecond() + " " + this.getDaytime();

    }

}
