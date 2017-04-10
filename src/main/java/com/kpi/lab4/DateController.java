package com.kpi.lab4;

/**
 * Created by vlad on 25.03.17.
 */
public class DateController {

    public MDate convertToModel(String[] input) {
        if (input.length == 4) {

            return new MDate(input[0], input[1], input[2], input[3]);
        } else {
            return new MDate(input[0], input[1], input[2]);
        }
    }

    public MDate cloneData(MDate mDate) throws CloneNotSupportedException {
        return (MDate) mDate.clone();
    }

    public MDate setPmAm(MDate mDate) {
        if (mDate.getDaytime().equals(  "A.M")) {
            mDate.setDaytime("P.M");
        } else {
            mDate.setDaytime("A.M");
        }

        return mDate;
    }

    public MDate incrementHour(MDate mDate) throws CloneNotSupportedException {

        if (!mDate.getDaytime().equals("empty")) {
            if (Integer.parseInt(mDate.getHour()) == 12) {
                mDate.setHour(makePretty("1"));
            } else {
                if (Integer.parseInt(mDate.getHour()) == 11) {
                    setPmAm(mDate);
                }
                mDate.setHour(makePretty(Integer.toString(Integer.parseInt(mDate.getHour()) + 1)));
            }
        } else {
            if (Integer.parseInt(mDate.getHour()) == 23) {
                mDate.setHour(makePretty("0"));
            } else {
                mDate.setHour(makePretty(Integer.toString(Integer.parseInt(mDate.getHour()) + 1)));
            }
        }



        return mDate;
    }

    public MDate decrementHour(MDate mDate) throws CloneNotSupportedException {


        if (!mDate.getDaytime().equals("empty")) {
            if (Integer.parseInt(mDate.getHour()) == 1) {
                mDate.setHour(makePretty("12"));
            } else {
                if (Integer.parseInt(mDate.getHour()) == 12) {
                    setPmAm(mDate);
                }
                mDate.setHour(makePretty(Integer.toString(Integer.parseInt(mDate.getHour()) - 1)));
            }
        } else {
            if (Integer.parseInt(mDate.getHour()) == 0) {
                mDate.setHour(makePretty("23"));
            } else {
                mDate.setHour(makePretty(Integer.toString(Integer.parseInt(mDate.getHour()) - 1)));
            }
        }

        return mDate;
    }

    public MDate incrementMinute(MDate mDate) throws CloneNotSupportedException {
        

        if (Integer.parseInt(mDate.getMinute()) == 59) {
            incrementHour(mDate);
            mDate.setMinute(makePretty("0"));
        } else {
            mDate.setMinute(makePretty(Integer.toString(Integer.parseInt(mDate.getMinute()) + 1)));
        }

        return mDate;
    }

    public MDate decrementMinute(MDate mDate) throws CloneNotSupportedException {

        if (Integer.parseInt(mDate.getMinute()) == 0) {
            decrementHour(mDate);
            mDate.setMinute(makePretty("59"));
        } else {
            mDate.setMinute(makePretty(Integer.toString(Integer.parseInt(mDate.getMinute()) - 1)));
        }

        return mDate;
    }

    public MDate incrementSecond(MDate mDate) throws CloneNotSupportedException {

        if (Integer.parseInt(mDate.getSecond()) == 59) {
            incrementMinute(mDate);
            mDate.setSecond(makePretty("0"));
        } else {
            mDate.setMinute(makePretty(Integer.toString(Integer.parseInt(mDate.getSecond()) + 1)));
        }

        return mDate;
    }

    public MDate decrementSecond(MDate mDate) throws CloneNotSupportedException {

        if (Integer.parseInt(mDate.getSecond()) == 0) {
            decrementMinute(mDate);
            mDate.setSecond(makePretty("59"));
        } else {
            mDate.setSecond(makePretty(Integer.toString(Integer.parseInt(mDate.getSecond()) - 1)));
        }

        return mDate;
    }

    public String makePretty(String input) {
        if (input.length() == 1) {
            input = "0" + input;
        }

        return input;
    }

}
