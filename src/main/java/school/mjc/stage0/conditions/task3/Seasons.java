package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month >= 1 && month <= 12) {
            if (month >= 3 && month <= 5) {
                System.out.println("Spring");
            } else if (month >= 6 && month <= 8) {
                System.out.println("Summer");
            } else if (month >= 9 && month <= 11) {
                System.out.println("Fall");
            } else {
                System.out.println("Winter");
            }
        } else {
            System.out.println("wrong number!");
        }
    }
}
