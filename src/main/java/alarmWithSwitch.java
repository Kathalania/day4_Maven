public class alarmWithSwitch {
    public static void main(String[] args) {

        int i = 3;

        switch (i) {
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("anderer Wert");
        }
        //alarm(32);
        System.out.println(alarm(-2));

    }

    public static String alarm(int people) {

        if (people > 60) {
            return "Zu viele Personen" + " / rot";
        } else if (people > 30 && people <= 60) {
            return "Zu viele Personen" + " / gelb";
        } else if (people >= 0 && people <= 30) {
            return "Maximale Personenanzahl nicht überschritten" + " / grün";
        } else {
            return "Personenanzahl konnte nicht ermittelt werden";
        }

    }
}
