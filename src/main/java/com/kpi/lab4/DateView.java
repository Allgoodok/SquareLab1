package com.kpi.lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vlad on 25.03.17.
 */
public class DateView {

    public static String[] inputTime(String s) throws IOException {



        Pattern p1 = Pattern.compile("^(0?[0-9]|1[0-1]):[0-5][0-9]:[0-5][0-9]\\s[AP]\\.[M]$");
        Pattern p2 = Pattern.compile("^(0?[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$");
        Matcher m = p1.matcher(s);
        boolean b = m.matches();
        m = p2.matcher(s);
        boolean c = m.matches();

        System.out.println(b);
        System.out.println(c);


        if (b) {
            String[] col;
            String[] sub;
            sub = s.split("\\s");
            col = sub[0].split(":");
            String[] result = {col[0], col[1], col[2], sub[1]};
            return result;

        } else if (c) {
            String[] result;
            result = s.split(":");
            return result;
        } else {
            System.out.println("Wrong string");
            System.exit(0);

        }

        return null;
    }
}
