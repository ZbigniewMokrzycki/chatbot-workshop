package com.tdd.examples;

/*

import com.tdd.time.Today;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Example03MockitoWhen {

    // Uwaga - to jest testowana klasa
    // Normalnie powinna być to osobna klasa w osobnym pliku w katalogu z kodem produkcyjnym (src/main/java)
    // Dla łatwiejszego podglądu wyjątkowo znajduje się ona w tym samym pliku co test
    private static class WeekendChecker {

        private final Today today;

        private WeekendChecker(Today today) {
            this.today = today;
        }

        boolean isItWeekend() {
            DayOfWeek dayOfWeek = today.getDayOfWeek();
            if (dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY)) {
                return true;
            }
            return false;
        }
    }

    // Poniżej właściwa zawartość testu:
    @Test
    void itIsNotWeekendOnTuesday() {
        Today today = mock(Today.class);
        when(today.getDayOfWeek()).thenReturn(DayOfWeek.TUESDAY);
        WeekendChecker weekendChecker = new WeekendChecker(today);

        boolean isWeekend = weekendChecker.isItWeekend();

        assertThat(isWeekend).isFalse();
    }

    @Test
    void itIsWeekendOnSaturday() {
        Today today = mock(Today.class);
        when(today.getDayOfWeek()).thenReturn(DayOfWeek.SATURDAY);
        WeekendChecker weekendChecker = new WeekendChecker(today);

        boolean isWeekend = weekendChecker.isItWeekend();

        assertThat(isWeekend).isTrue();
    }
}

*/