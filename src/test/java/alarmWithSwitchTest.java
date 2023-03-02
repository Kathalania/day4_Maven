import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class alarmWithSwitchTest {

    @Test
    void alarmWhenMoreThanThirty() {
        //GIVEN
        int people = 31;
        String expected = "Zu viele Personen";

        //WHEN
        String actual = alarmWithSwitch.alarm(people);

        //THEN
        assertEquals(expected,actual);

    }

    @Test
    void noAlarmUpToThirtyPeople(){
        //GIVEN
        int people = 1;
        String expected = "Maximale Personenanzahl nicht überschritten";

        //WHEN
        String actual = alarmWithSwitch.alarm(people);

        //THEN
        assertEquals(expected,actual);

    }

    @Test
    void alarmRed(){
        //GIVEN
        int people = 61;
        String expected = "Zu viele Personen / rot";

        //WHEN
        String actual = alarmWithSwitch.alarm(people);

        //THEN
        assertEquals(expected,actual);

    }

    @Test
    void alarmAmber(){
        //GIVEN
        int people = 32;
        String expected = "Zu viele Personen / gelb";

        //WHEN
        String actual = alarmWithSwitch.alarm(people);

        //THEN
        assertEquals(expected,actual);

    }

    @Test
    void alarmGreen(){
        //GIVEN
        int people = 2;
        String expected = "Maximale Personenanzahl nicht überschritten / grün";

        //WHEN
        String actual = alarmWithSwitch.alarm(people);

        //THEN
        assertEquals(expected,actual);
    }

    @Test
    void errorWhenPeopleHasNegativeInt(){
        //GIVEN
        int people = -5;
        String expected = "Personenanzahl konnte nicht ermittelt werden";

        //WHEN
        String actual = alarmWithSwitch.alarm(people);

        //THEN
        assertEquals(expected,actual);
    }
}