package com.tdd.examples;

/*

import com.tdd.audio.AudioPlayer;
import com.tdd.time.Today;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class Example04MockitoVerify {

    // Uwaga - to jest testowana klasa
    // Normalnie powinna być to osobna klasa w osobnym pliku w katalogu z kodem produkcyjnym (src/main/java)
    // Dla łatwiejszego podglądu wyjątkowo znajduje się ona w tym samym pliku co test
    private static class WeekendChecker {

        private final Today today;
        private final AudioPlayer audioPlayer;

        private WeekendChecker(Today today, AudioPlayer audioPlayer) {
            this.today = today;
            this.audioPlayer = audioPlayer;
        }

        boolean isItWeekend() {
            DayOfWeek dayOfWeek = today.getDayOfWeek();
            if (dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY)) {
                audioPlayer.play(AudioPlayer.FANFARE);
                return true;
            }
            return false;
        }
    }

    // Poniżej właściwa zawartość testu:

    private Today today = mock(Today.class);
    private AudioPlayer audioPlayer = mock(AudioPlayer.class);
    private WeekendChecker weekendChecker = new WeekendChecker(today, audioPlayer);

    @Test
    void playsFanfaresSaturday() {
        when(today.getDayOfWeek()).thenReturn(DayOfWeek.SATURDAY);

        weekendChecker.isItWeekend();

        verify(audioPlayer).play(AudioPlayer.FANFARE);
        // albo inne opcje:
        verify(audioPlayer, times(1)).play(anyString());
        verify(audioPlayer, atLeast(1)).play(anyString());
        verify(audioPlayer, never()).play(AudioPlayer.CAT);
    }

    @Test
    void noFanfaresOnTuesday() {
        when(today.getDayOfWeek()).thenReturn(DayOfWeek.TUESDAY);

        weekendChecker.isItWeekend();

        verify(audioPlayer, never()).play(AudioPlayer.FANFARE);
        // albo inne opcje:
        verify(audioPlayer, never()).play(anyString());
        verify(audioPlayer, times(0)).play(anyString());
        verifyZeroInteractions(audioPlayer);
    }
}

*/