package com.kpi.lab3;

/**
 * Created by vlad on 09.03.17.
 */
public class MAddress {
    private String index;
    private String city;
    private String street;
    private String numberHouse;
    private String numberFlat;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(String numberFlat) {
        this.numberFlat = numberFlat;
    }

    @Override
    public String toString(){
        return this.index + " " + this.city + " " + this.street + " " + this.numberHouse + " " + this.numberFlat;
    }
}
