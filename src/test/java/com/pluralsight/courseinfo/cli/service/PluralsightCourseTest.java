package com.pluralsight.courseinfo.cli.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PluralsightCourseTest {

    @ParameterizedTest
    @CsvSource({
            "00:05:37, 5",
            "01:08:54.9613330, 68",
            "00:00:00, 0"
    })
    void durationInMinutes(String input, long expected) {
        PluralsightCourse course = new PluralsightCourse("id", "Test Course", input, "url", false);
        assertEquals(expected, course.durationInMinutes());
    }

    /*
    @Test
    void durationInMinutes() {
        PluralsightCourse course = new PluralsightCourse("id", "Test Course", "00:05:37", "url", false);
        assertEquals(5, course.durationInMinutes());
    }

    @Test
    void durationInMinutesOverHour() {
        PluralsightCourse course = new PluralsightCourse("id", "Test Course", "01:08:54.9613330", "url", false);
        assertEquals(68, course.durationInMinutes());
    }

    @Test
    void durationInMinutesZero() {
        PluralsightCourse course = new PluralsightCourse("id", "Test Course", "00:00:00", "url", false);
        assertEquals(0, course.durationInMinutes());
    }
     */
}