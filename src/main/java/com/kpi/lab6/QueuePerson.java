package com.kpi.lab6;

/**
 * Created by vlad on 02.04.17.
 */
public class QueuePerson implements Comparable<QueuePerson> {

    private String surname;

    private String name;
    private String middlename;
    private AddressValue address;
    private int priority;

    public QueuePerson(String surname, String name, String middlename, AddressValue address, int priority) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.address = address;
        this.priority = priority;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public AddressValue getAddress() {
        return address;
    }

    public void setAddress(AddressValue address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    @Override
    public String toString() {
        return this.name + this.middlename + this.surname;
    }

    public int compareTo(QueuePerson that) {
        if (this.surname.compareTo(that.surname) < 0) {
            return -1;
        } else if (this.surname.compareTo(that.surname) > 0) {
            return 1;
        }

        if (this.name.compareTo(that.name) < 0) {
            return -1;
        } else if (this.name.compareTo(that.name) > 0) {
            return 1;
        }

        if (this.middlename.compareTo(that.middlename) < 0) {
            return -1;
        } else if (this.middlename.compareTo(that.middlename) > 0) {
            return 1;
        }
        return 0;
    }
}
