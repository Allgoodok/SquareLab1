package com.kpi.lab3;

public class MContactBuilder {
    private String lastName;
    private String firstName;
    private String middleName;
    private String nickName;
    private String comments;
    private Group[] group;
    private String homeNumber;
    private String mobileNumber1;
    private String mobileNumber2;
    private String email;
    private String skype;
    private MAddress adress;
    private String fullAdress;
    private String inputDate;
    private String lastModifiedDate;

    public MContactBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public MContactBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public MContactBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public MContactBuilder setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public MContactBuilder setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public MContactBuilder setGroup(Group[] group) {
        this.group = group;
        return this;
    }

    public MContactBuilder setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
        return this;
    }

    public MContactBuilder setMobileNumber1(String mobileNumber1) {
        this.mobileNumber1 = mobileNumber1;
        return this;
    }

    public MContactBuilder setMobileNumber2(String mobileNumber2) {
        this.mobileNumber2 = mobileNumber2;
        return this;
    }

    public MContactBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public MContactBuilder setSkype(String skype) {
        this.skype = skype;
        return this;
    }

    public void setFullAdress(String fullAdress) {
        this.fullAdress = fullAdress;
    }

    public MContactBuilder setAdress(MAddress adress) {
        this.adress = adress;
        return this;

    }

    public MContactBuilder setInputDate(String inputDate) {
        this.inputDate = inputDate;
        return this;
    }

    public MContactBuilder setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    public MContact createMContact() {
        return new MContact(lastName, firstName, middleName, nickName, comments, group, homeNumber, mobileNumber1, mobileNumber2, email, skype, adress, fullAdress, inputDate, lastModifiedDate);
    }
}