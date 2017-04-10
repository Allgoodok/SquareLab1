package com.kpi.lab5;

/**
 * Created by vlad on 02.04.17.
 */
public class MDate24 extends Date {


    public MDate24(String hour, String minute, String second) {
        super(hour, minute, second);
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
        return this.getHour() + ":" + this.getMinute() + ":" + this.getSecond();
    }
}
