package com.tdd.time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Today {

    public DayOfWeek getDayOfWeek() {
        return LocalDateTime.now().getDayOfWeek();
    }
}
