package com.kpi.lab3;

/**
 * Created by vlad on 09.03.17.
 */
public class ParseUtils {

    public static boolean parseNameSurnameMiddleName(String input) {
        if (input.matches("(^[a-zA-Z]+$)")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean parseNickName(String input) {
        if (input.matches("^[a-zA-Z0-9]+$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean parseComments(String input) {
        if (input.matches("^.*$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean parseGroup(String input) {
        if (input.matches("^(((?i)family(?-i))|((?i)work(?-i))|((?i)friends(?-i)))([,]((?i)family(?-i))|[,]((?i)work(?-i))|[,]((?i)friends(?-i))){0,2}$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean parseHomeNumber(String input) {
        if (input.matches("^044-[0-9]{3}-[0-9]{2}-[0-9]{2}$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean parseMobileNumber1(String input) {
        if (input.matches("^[+]380[0-9]{2}-[0-9]{3}-[0-9]{2}-[0-9]{2}$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean parseMobileNumber2(String input) {
        if (input.matches("(^[+]380[0-9]{2}-[0-9]{3}-[0-9]{2}-[0-9]{2}$|^$)")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean parseEmail(String input) {
        if (input.matches("^[a-zA-Z0-9]+[@][a-z]+[.][a-z]+$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean parseIndex(String input) {
        if (input.matches("^[0-9]{5}$")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean parseCity(String input) {
        if (input.matches("^[\\w-\\s]+$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean parseStreet(String input) {
        if (input.matches("^[\\w-\\s]+[\\s][\\w]+[.]$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean parseHouseNumber(String input) {
        if (input.matches("^[\\w/\\s]+$")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean parseAppNumber(String input) {
        if (input.matches("^[\\w\\d]+$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean parseDate(String input) {
        if (input.matches("^^[0-9]{4}-(((0[13578]|(10|12))-(0[1-9]|[1-2][0-9]|3[0-1]))|(02-(0[1-9]|[1-2][0-9]))|((0[469]|11)-(0[1-9]|[1-2][0-9]|30)))$")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(ParseUtils.parseDate("2014-12-12"));
    }

    public Group[] inputToGroup(String input) {
        String[] tmp = input.toUpperCase().split(",");
        boolean repFr = false;
        boolean repFa = false;
        boolean repWo = false;
        Group[] result = new Group[tmp.length];
        int index = 0;
        for (String i : tmp) {
            if (i.equals("FRIENDS") && !repFr) {
                result[index] = Group.FRIENDS;
                repFr = true;
                index++;
            } else if (i.equals("FAMILY") && !repFa) {
                result[index] = Group.FAMILY;
                repFa = true;
                index++;
            } else if (i.equals("WORK") && !repWo) {
                result[index] = Group.WORK;
                repWo = true;
                index++;
            }
        }

        return result;
    }


}
