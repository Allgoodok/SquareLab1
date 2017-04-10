package com.kpi.lab3;

/**
 * Created by vlad on 09.03.17.
 */
public class MContact {

    private String lastName;
    private String firstName;
    private String middleName;
    private String fullName;
    private String nickName;
    private String comments;
    private Group[] group;
    private String homeNumber;
    private String mobileNumber1;
    private String mobileNumber2;
    private String email;
    private String skype;
    private MAddress adress;
    private String fullAddress;
    private String inputDate;
    private String lastModifiedDate;

    public MContact(){}

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getComments() {
        return comments;
    }

    public Group[] getGroup() {
        return group;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getMobileNumber1() {
        return mobileNumber1;
    }

    public String getMobileNumber2() {
        return mobileNumber2;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public MAddress getAdress() {
        return adress;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public String getInputDate() {
        return inputDate;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public MContact(String lastName, String firstName, String middleName, String nickName, String comments, Group[] group, String homeNumber, String mobileNumber1, String mobileNumber2, String email, String skype, MAddress adress, String fullAddress, String inputDate, String lastModifiedDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.fullName = createFullName();
        this.nickName = nickName;
        this.comments = comments;
        this.group = group;
        this.homeNumber = homeNumber;
        this.mobileNumber1 = mobileNumber1;
        this.mobileNumber2 = mobileNumber2;
        this.email = email;
        this.skype = skype;
        this.adress = adress;
        this.fullAddress = fullAddress;

        this.inputDate = inputDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    public String createFullName() {
        return this.lastName + " " + this.firstName + " " + this.middleName;
    }
}
