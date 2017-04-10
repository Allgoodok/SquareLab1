package com.kpi.lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vlad on 02.04.17.
 */
public class App {



    public static void main(String[] args) throws IOException, CloneNotSupportedException {

        DateController dateController = new DateController();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        MDate12 date = (MDate12) dateController.convertToModel(DateView.inputTime(s));

        MDate12 result = (MDate12) dateController.cloneData(date);
        System.out.println(dateController.incrementSecond(result));
        System.out.println(dateController.incrementMinute(result));
        System.out.println(dateController.incrementHour(result));
    }
}
