package com.kpi.lab7;

/**
 * Created by vlad on 02.04.17.
 */
public abstract class Ammo {

    private String itemName;
    private int itemWeight;
    private int itemPrice;

    public Ammo(String itemName, int itemWeight, int itemPrice) {
        this.itemName = itemName;
        this.itemWeight = itemWeight;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}
