package com.kpi.lab6;

/**
 * Created by vlad on 02.04.17.
 */
public class AddressValue {
    private String city;
    private String street;
    private String building;
    private int flat;

    public AddressValue(String city, String street, String building, int flat) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.flat = flat;
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

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
}
