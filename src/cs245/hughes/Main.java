package cs245.hughes;

public class Main {

    public static void main(String[] args) {
        Time t = new Time(23, 59, 60);
        System.out.println(t);

        try {
            t.setSeconds(444445);
        } catch (IllegalArgumentException e) {
            System.out.println("Ooops");
        }

    }
}
