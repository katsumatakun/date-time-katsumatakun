package cs245.hughes;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;


    public Time(int hour, int minute, int second) {
       try {
           setSeconds(second);
       }
       catch (IllegalArgumentException e){
           minute += second/ 60;
           this.seconds = second %60;
       }

        try {
            setMinutes(minute);
        }
        catch (IllegalArgumentException e){
            hour += minute/ 60;
            this.minutes = minute %60;
        }
        try {
            setHours(hour);
        }
        catch (IllegalArgumentException e){
            this.hours = hour %24;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours >= 24){
            throw new IllegalArgumentException("Bad Hours");
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes >= 60){
            throw new IllegalArgumentException("Bad Minutes");
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds >= 60){
            throw new IllegalArgumentException("Bad Seconds");
        }
        this.seconds = seconds;
    }

    public void tick(){
        try {
            setSeconds(seconds+1);
        }
        catch (IllegalArgumentException e){
            minutes += (seconds+1)/ 60;
            seconds = (seconds+1) %60;
        }
        try {
            setMinutes(minutes);
        }
        catch (IllegalArgumentException e){
            hours += minutes/ 60;
            this.minutes = minutes %60;
        }
        try {
            setHours(hours);
        }
        catch (IllegalArgumentException e){
            this.hours = hours %24;
        }
    }

    @Override
    public String toString() {
        return hours +":" + minutes + ":"+ seconds;
    }
}
