package cs245.hughes;

public class Main {

    public static void main(String[] args) {
        Time t = new Time(4, 59, 58);
        System.out.println(t);
        t.tick();
        System.out.println(t);
        t.tick();
        System.out.println(t);
        Date d = new Date(2000, 2, 29 );
        System.out.println(d);

        try {
            t.setSeconds(444445);
        } catch (IllegalArgumentException e) {
            System.out.println("Ooops");
        }

    }
}
