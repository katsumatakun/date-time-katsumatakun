package cs245.hughes;

import sun.awt.util.IdentityLinkedList;

public class Date {

    private int year;
    private int day;
    private int month;

    public Date(int year, int month, int day){
        try
        {
            setYear(year);
        }
        catch (IllegalArgumentException e)
        {

        }

        try
        {
            setMonth(month);
        }
        catch (IllegalArgumentException e)
        {

        }
        try
        {
            setDay(day);
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    public int getYear(){return year;}

    public void setYear(int year ){
        if (year <= 0){
            throw new IllegalArgumentException("Bad years");
        }

        this.year = year;
    }

    public int getMonth(){return month;}

    public void setMonth(int month){
        if (month <= 0 || month > 12){
            throw new IllegalArgumentException("Bad month");
        }

        this.month = month;
    }

    public int getDay(){return day;}

    public void setDay(int day){
        if (day <= 0 || day > 31){
            throw new IllegalArgumentException("Bad day");
        }

       else if (!Has31Days() && day == 31){
           throw new IllegalArgumentException("Bad day");
        }
       else if (month == 2)
        {
            if((IsLeapYear() && day >= 30) || (!IsLeapYear() && day >= 29))
                throw new IllegalArgumentException("Bad day");
            else
                {
                    this.day = day;
                }

        }
       else{
           this.day = day;
        }
    }

    private boolean IsLeapYear() {

        if (year % 4 == 0) {
            if (year % 100 != 0)
                return true;
            else if (year % 400 == 0)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    private boolean Has31Days(){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
                month== 10 || month == 12)
            return true;
        else
            return false;
    }
    @Override
    public String toString() {
        return year +":" + month + ":"+ day;
    }
}



