package com.kpi.lab4;

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

        MDate date = dateController.convertToModel(DateView.inputTime(s));

        MDate result = dateController.cloneData(date);
        System.out.println(dateController.incrementSecond(result));
        System.out.println(dateController.incrementMinute(result));
        System.out.println(dateController.incrementHour(result));
    }
}
