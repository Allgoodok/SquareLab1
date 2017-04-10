package com.kpi.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vlad on 09.03.17.
 */
public class App {

    public static ParseUtils utils = new ParseUtils();


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MContactBuilder mContactBuilder = new MContactBuilder();
        MAddress mAddress = new MAddress();
        MContact mContact;


        String[] questions = {
                "Enter Surname: ",
                "Enter Name: ",
                "Enter Middle Name: ",
                "Enter Nickname: ",
                "Enter Comments: ",
                "Enter Contact Group. Separate with coma if more than one (FAMILY,WORK,FRIENDS): ",
                "Enter Home Number. Got to be like 044-XXX-XX-XX: ",
                "Enter Mobile Number. Got to be like +380xx-xxx-xx-xx: ",
                "Enter Mobile Number 2(optional): ",
                "Enter E-mail: ",
                "Enter Skype name: ",
                "Enter Adress. Press ENTER: ",
                "Enter Index. Consits of 5 digits: ",
                "Enter City: ",
                "Enter Street: ",
                "Enter House number: ",
                "Enter App number: ",
                "Enter Creation Date. yyyy-mm-dd: ",
                "Enter Last Modified Date. yyyy-mm-dd: "

        };

        System.out.println("Getting information about contact. To exit write !quit");



        int index = 0;

        while (index < questions.length) {
            System.out.println(questions[index]);
            String input = br.readLine();

            if (input.equals("!quit")) {
                System.exit(0);
            }

            switch (index) {
                case 0:
                    if (utils.parseNameSurnameMiddleName(input)) {
                        mContactBuilder.setLastName(input);
                        index++;
                    } else {
                        System.out.println("Must consists of letters only: ");
                    }
                    break;
                case 1:
                    if (utils.parseNameSurnameMiddleName(input)) {
                        mContactBuilder.setFirstName(input);
                        index++;
                    } else {
                        System.out.println("Must consists of letters only: ");
                    }
                    break;
                case 2:
                    if (utils.parseNameSurnameMiddleName(input)) {
                        mContactBuilder.setMiddleName(input);
                        index++;
                    } else {
                        System.out.println("Must consists of letters only: ");
                    }
                    break;
                case 3:
                    if (utils.parseNickName(input)) {
                        mContactBuilder.setNickName(input);
                        index++;
                    } else {
                        System.out.println("Must consists of letters or numbers only: ");
                        break;
                    }
                    break;
                case 4:
                    if (utils.parseComments(input)) {
                        mContactBuilder.setComments(input);
                    }
                    index++;
                    break;
                case 5:
                    if (utils.parseGroup(input)) {
                        mContactBuilder.setGroup(utils.inputToGroup(input));
                        index++;
                    } else {
                        System.out.println("List of values (WORK, FAMILY, FRIENDS) separated by comma");
                    }
                    break;
                case 6:
                    if (utils.parseHomeNumber(input)) {
                        mContactBuilder.setHomeNumber(input);
                        index++;
                    } else {
                        System.out.println("Template is 044-xxx-xx-xx");
                    }
                    break;
                case 7:
                    if (utils.parseMobileNumber1(input)) {
                        mContactBuilder.setMobileNumber1(input);
                        index++;
                    } else {
                        System.out.println("Template is +380xx-xxx-xx-xx");
                    }
                    break;
                case 8:
                    if (utils.parseMobileNumber2(input)) {
                        mContactBuilder.setMobileNumber2(input);
                        index++;
                    } else {
                        System.out.println("Template is +380xx-xxx-xx-xx or nothing");
                    }

                    break;
                case 9:
                    if (utils.parseEmail(input)) {
                        mContactBuilder.setEmail(input);
                        index++;
                    } else {
                        System.out.println("Must <name>@<domain name>.<domain>");
                    }
                    break;
                case 10:
                    if (utils.parseNickName(input)) {
                        mContactBuilder.setSkype(input);
                        index++;
                    } else {
                        System.out.println("Must consists of letters or numbers only. ");
                    }
                    break;
                case 11:
                    index++;
                    break;
                case 12:
                    if (utils.parseIndex(input)) {
                        mAddress.setIndex(input);
                        index++;
                    } else {
                        System.out.println("Consists of 5 digits. ");
                    }

                    break;
                case 13:
                    if (utils.parseCity(input)) {
                        mAddress.setCity(input);
                        index++;
                    } else {
                        System.out.println("Word or set of words(spaces and - are allowed). ");
                    }

                    break;
                case 14:
                    if (utils.parseStreet(input)) {
                        mAddress.setStreet(input);
                        index++;
                    } else {
                        System.out.println("Word or set of words(spaces and - are allowed) and type of street(concatenated: st., bld., etc. ) ");
                    }
                    break;
                case 15:
                    if (utils.parseHouseNumber(input)) {
                        mAddress.setNumberHouse(input);
                        index++;
                    } else {
                        System.out.println("Number or letter or both / is allowed. ");
                    }
                    break;
                case 16:
                    if (utils.parseAppNumber(input)) {
                        mAddress.setNumberFlat(input);
                        index++;
                    } else {
                        System.out.println("Number or letter or both: ");
                    }

                    break;
                case 17:
                    if (utils.parseDate(input)) {
                        mContactBuilder.setInputDate(input);
                        index++;
                    } else {
                        System.out.println("Must be yyyy-mm-dd ");
                    }
                    break;
                case 18:
                    if (utils.parseDate(input)) {
                        mContactBuilder.setLastModifiedDate(input);
                        index++;
                    } else {
                        System.out.println("Must be yyyy-mm-dd ");
                    }
                    break;
                default:
            }


        }

        mContactBuilder.setAdress(mAddress);
        mContactBuilder.setFullAdress(mAddress.toString());
        mContact = mContactBuilder.createMContact();
    }
}
